//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.15 at 08:47:18 AM BST 
//

package net.sf.mpxj.primavera.schema;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

@SuppressWarnings("all") public class Adapter2 extends XmlAdapter<String, Date>
{

   public Date unmarshal(String value)
   {
      return (net.sf.mpxj.primavera.DatatypeConverter.parseTime(value));
   }

   public String marshal(Date value)
   {
      return (net.sf.mpxj.primavera.DatatypeConverter.printTime(value));
   }

}
