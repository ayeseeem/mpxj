//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.07.10 at 07:13:59 PM BST
//

package net.sf.mpxj.phoenix.schema;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2 extends XmlAdapter<String, Integer>
{

   @Override public Integer unmarshal(String value)
   {
      return (net.sf.mpxj.phoenix.DatatypeConverter.parseInteger(value));
   }

   @Override public String marshal(Integer value)
   {
      return (net.sf.mpxj.phoenix.DatatypeConverter.printInteger(value));
   }

}
