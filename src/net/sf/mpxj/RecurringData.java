/*
 * file:       RecurringData.java
 * author:     Jon Iles
 * copyright:  (c) Packwood Software 2017
 * date:       20/10/2017
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

package net.sf.mpxj;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.EnumSet;

/**
 * This class provides a description of a recurring event.
 */
public class RecurringData
{
   /**
    * Gets the start date of this recurrence.
    *
    * @return recurrence start date
    */
   public Date getStartDate()
   {
      return m_startDate;
   }

   /**
    * Sets the start date of this recurrence.
    *
    * @param val recurrence start date
    */
   public void setStartDate(Date val)
   {
      m_startDate = val;
   }

   /**
    * Gets the finish date of this recurrence.
    *
    * @return recurrence finish date
    */
   public Date getFinishDate()
   {
      return m_finishDate;
   }

   /**
    * Sets the finish date of this recurrence.
    *
    * @param val recurrence finish date
    */
   public void setFinishDate(Date val)
   {
      m_finishDate = val;
   }

   /**
    * Sets the number of occurrences.
    *
    * @return number of occurrences
    */
   public Integer getOccurrences()
   {
      return m_occurrences;
   }

   /**
    * Retrieves the number of occurrences.
    *
    * @param occurrences number of occurrences
    */
   public void setOccurrences(Integer occurrences)
   {
      m_occurrences = occurrences;
   }

   /**
    * Retrieves the recurrence type.
    *
    * @return RecurrenceType instance
    */
   public RecurrenceType getRecurrenceType()
   {
      return m_recurrenceType;
   }

   /**
    * Sets the recurrence type.
    *
    * @param type recurrence type
    */
   public void setRecurrenceType(RecurrenceType type)
   {
      m_recurrenceType = type;
   }

   /**
    * Retrieves the use end date flag.
    *
    * @return use end date flag
    */
   public boolean getUseEndDate()
   {
      return m_useEndDate;
   }

   /**
    * Sets the use end date flag.
    *
    * @param useEndDate use end date flag
    */
   public void setUseEndDate(boolean useEndDate)
   {
      m_useEndDate = useEndDate;
   }

   /**
    * Returns true if daily recurrence applies to working days only.
    *
    * @return true if daily recurrence applies to working days only
    */
   public boolean isWorkingDaysOnly()
   {
      return m_workingDaysOnly;
   }

   /**
    * Set to true if daily recurrence applies to working days only.
    *
    * @param workingDaysOnly true if daily recurrence applies to working days only
    */
   public void setWorkingDaysOnly(boolean workingDaysOnly)
   {
      m_workingDaysOnly = workingDaysOnly;
   }

   /**
    * Returns true if this day is part of a weekly recurrence.
    *
    * @param day Day instance
    * @return true if this day is included
    */
   public boolean getWeeklyDay(Day day)
   {
      return m_days.contains(day);
   }

   /**
    * Set the state of an individual day in a weekly recurrence.
    *
    * @param day Day instance
    * @param value true if this day is included in the recurrence
    */
   public void setWeeklyDay(Day day, boolean value)
   {
      if (value)
      {
         m_days.add(day);
      }
      else
      {
         m_days.remove(day);
      }
   }

   /**
    * Converts from a bitmap to individual day flags for a weekly recurrence,
    * using the array of masks.
    *
    * @param days bitmap
    * @param masks array of mask values
    */
   public void setWeeklyDaysFromBitmap(Integer days, int[] masks)
   {
      if (days != null)
      {
         int value = days.intValue();
         for (Day day : Day.values())
         {
            setWeeklyDay(day, ((value & masks[day.getValue()]) != 0));
         }
      }
   }

   /**
    * Retrieves the relative flag. This is only relevant for monthly and yearly recurrence.
    *
    * @return boolean flag
    */
   public boolean getRelative()
   {
      return m_relative;
   }

   /**
    * Sets the relative flag. This is only relevant for monthly and yearly recurrence.
    *
    * @param relative boolean flag
    */
   public void setRelative(boolean relative)
   {
      m_relative = relative;
   }

   /**
    * Retrieves the recurrence frequency.
    *
    * @return recurrence frequency
    */
   public Integer getFrequency()
   {
      return m_frequency;
   }

   /**
    * Set the recurrence frequency.
    *
    * @param frequency recurrence frequency
    */
   public void setFrequency(Integer frequency)
   {
      m_frequency = frequency;
   }

   /**
    * Retrieves the monthly or yearly relative day of the week.
    *
    * @return day of the week
    */
   public Day getDayOfWeek()
   {
      Day result = null;
      if (!m_days.isEmpty())
      {
         result = m_days.iterator().next();
      }
      return result;
   }

   /**
    * Sets the monthly or yearly relative day of the week.
    *
    * @param day day of the week
    */
   public void setDayOfWeek(Day day)
   {
      m_days.clear();
      m_days.add(day);
   }

   /**
    * Retrieves the monthly or yearly absolute day number.
    *
    * @return absolute day number.
    */
   public Integer getDayNumber()
   {
      return m_dayNumber;
   }

   /**
    * Sets the monthly or yearly absolute day number.
    *
    * @param day absolute day number
    */
   public void setDayNumber(Integer day)
   {
      m_dayNumber = day;
   }

   /**
    * Retrieves the yearly month number.
    *
    * @return month number
    */
   public Integer getMonthNumber()
   {
      return m_monthNumber;
   }

   /**
    * Sets the yearly month number.
    *
    * @param month month number
    */
   public void setMonthNumber(Integer month)
   {
      m_monthNumber = month;
   }

   /**
    * Sets the yearly absolute date.
    *
    * @param date yearly absolute date
    */
   public void setYearlyAbsoluteFromDate(Date date)
   {
      if (date != null)
      {
         Calendar cal = Calendar.getInstance();
         cal.setTime(date);
         m_dayNumber = Integer.valueOf(cal.get(Calendar.DAY_OF_MONTH));
         m_monthNumber = Integer.valueOf(cal.get(Calendar.MONTH) + 1);
      }
   }

   /**
    * Retrieve the ordinal text for a given integer.
    *
    * @param value integer value
    * @return ordinal text
    */
   private String getOrdinal(Integer value)
   {
      String result;
      int index = value.intValue();
      if (index >= ORDINAL.length)
      {
         result = "every " + index + "th";
      }
      else
      {
         result = ORDINAL[index];
      }
      return result;
   }

   /**
    * {@inheritDoc}
    */
   @Override public String toString()
   {
      DateFormatSymbols dfs = new DateFormatSymbols();
      ByteArrayOutputStream os = new ByteArrayOutputStream();
      PrintWriter pw = new PrintWriter(os);
      pw.print("[RecurringData");
      pw.print(m_recurrenceType);

      switch (m_recurrenceType)
      {
         case DAILY:
         {
            pw.print(" " + getOrdinal(m_frequency));
            pw.print(m_workingDaysOnly ? " Working day" : " Day");
            break;
         }

         case WEEKLY:
         {
            pw.print(" " + getOrdinal(m_frequency));
            pw.print(" week on ");

            StringBuilder sb = new StringBuilder();
            for (Day day : Day.values())
            {
               if (getWeeklyDay(day))
               {
                  if (sb.length() != 0)
                  {
                     sb.append(", ");
                  }
                  sb.append(dfs.getWeekdays()[day.getValue()]);
               }
            }
            pw.print(sb.toString());
            break;
         }

         case MONTHLY:
         {
            if (m_relative)
            {
               pw.print(" on The ");
               pw.print(DAY_ORDINAL[m_dayNumber.intValue()]);
               pw.print(" ");
               pw.print(dfs.getWeekdays()[getDayOfWeek().getValue()]);
               pw.print(" of ");
               pw.print(getOrdinal(m_frequency));
            }
            else
            {
               pw.print(" on Day ");
               pw.print(m_dayNumber);
               pw.print(" of ");
               pw.print(getOrdinal(m_frequency));
            }
            pw.print(" month");
            break;
         }

         case YEARLY:
         {
            pw.print(" on the ");
            if (m_relative)
            {
               pw.print(DAY_ORDINAL[m_dayNumber.intValue()]);
               pw.print(" ");
               pw.print(dfs.getWeekdays()[getDayOfWeek().getValue()]);
               pw.print(" of ");
               pw.print(dfs.getMonths()[m_monthNumber.intValue() - 1]);
            }
            else
            {
               pw.print(m_dayNumber + " " + dfs.getMonths()[m_monthNumber.intValue() - 1]);
            }
            break;
         }
      }

      pw.print(" From " + m_startDate);
      pw.print(" For " + m_occurrences + " occurrences");
      pw.print(" To " + m_finishDate);

      pw.println("]");
      pw.flush();
      return os.toString();
   }

   /**
    * List of ordinal names used to generate debugging output.
    */
   private static final String[] ORDINAL =
   {
      null,
      "every",
      "every other",
      "every 3rd"
   };

   /**
    * List of ordinal names used to generate debugging output.
    */
   private static final String[] DAY_ORDINAL =
   {
      null,
      "First",
      "Second",
      "Third",
      "Fourth",
      "Last"
   };

   //
   // Common attributes
   //
   private Date m_startDate;
   private Date m_finishDate;
   private Integer m_occurrences;
   private RecurrenceType m_recurrenceType;
   private boolean m_relative;
   private boolean m_workingDaysOnly;
   private boolean m_useEndDate;
   private Integer m_frequency;
   private Integer m_dayNumber;
   private Integer m_monthNumber;
   private EnumSet<Day> m_days = EnumSet.noneOf(Day.class);
}