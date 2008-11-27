/*
 * file:       SplitTaskFactory
 * author:     Jon Iles
 * copyright:  (c) Packwood Software Limited 2008
 * date:       25/11/2008
 */

/*
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation; either version 2.1 of the License, or (at your
 * option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */

package net.sf.mpxj.mpp;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import net.sf.mpxj.DateRange;
import net.sf.mpxj.Task;
import net.sf.mpxj.TimephasedResourceAssignment;

/**
 * This class contains methods to create lists of Dates representing
 * task splits.
 */
final class SplitTaskFactory
{
   /**
    * Process the timephased resource assignment data to work out the 
    * split structure of the task.
    * 
    * @param task parent task
    * @param timephasedComplete completed resource assignment work
    * @param timephasedPlanned planned resource assignment work
    */
   public void processSplitData(Task task, List<TimephasedResourceAssignment> timephasedComplete, List<TimephasedResourceAssignment> timephasedPlanned)
   {
      Date splitsComplete = null;
      TimephasedResourceAssignment lastComplete = null;
      TimephasedResourceAssignment firstPlanned = null;
      if (!timephasedComplete.isEmpty())
      {
         lastComplete = timephasedComplete.get(timephasedComplete.size() - 1);
         splitsComplete = lastComplete.getFinish();
      }

      if (!timephasedPlanned.isEmpty())
      {
         firstPlanned = timephasedPlanned.get(0);
      }

      LinkedList<DateRange> splits = new LinkedList<DateRange>();
      for (TimephasedResourceAssignment assignment : timephasedComplete)
      {
         splits.add(new DateRange(assignment.getStart(), assignment.getFinish()));
      }

      //
      // We may not have a split, we may just have a partially
      // complete split.
      //
      Date splitStart = null;
      if (lastComplete != null && firstPlanned != null && lastComplete.getWorkPerDay().getDuration() != 0 && firstPlanned.getWorkPerDay().getDuration() != 0)
      {
         DateRange lastRange = splits.removeLast();
         splitStart = lastRange.getStart();
      }

      for (TimephasedResourceAssignment assignment : timephasedPlanned)
      {
         if (splitStart == null)
         {
            splits.add(new DateRange(assignment.getStart(), assignment.getFinish()));
         }
         else
         {
            splits.add(new DateRange(splitStart, assignment.getFinish()));
         }
         splitStart = null;
      }

      //
      // We must have a minimum of 3 entries for this to be a valid split task
      //
      if (splits.size() > 2)
      {
         task.getSplits().addAll(splits);
         task.setSplitCompleteDuration(splitsComplete);
      }
      else
      {
         task.setSplits(null);
         task.setSplitCompleteDuration(null);
      }
   }

}
