//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.07.10 at 07:13:59 PM BST
//

package net.sf.mpxj.phoenix.schema;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import net.sf.mpxj.TimeUnit;

public class Adapter8 extends XmlAdapter<String, TimeUnit>
{

   @Override public TimeUnit unmarshal(String value)
   {
      return (net.sf.mpxj.phoenix.DatatypeConverter.parseTimeUnits(value));
   }

   @Override public String marshal(TimeUnit value)
   {
      return (net.sf.mpxj.phoenix.DatatypeConverter.printTimeUnits(value));
   }

}
