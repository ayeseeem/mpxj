//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.15 at 08:47:18 AM BST 
//

package net.sf.mpxj.primavera.schema;

import java.util.Date;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ProjectCodeTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectCodeTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsSecureCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Length" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MaxCodeValueWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Weight" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *               &lt;maxInclusive value="999999.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ProjectCodeTypeType", propOrder =
{
   "createDate",
   "createUser",
   "isSecureCode",
   "lastUpdateDate",
   "lastUpdateUser",
   "length",
   "maxCodeValueWeight",
   "name",
   "objectId",
   "sequenceNumber",
   "weight"
}) @SuppressWarnings("all") public class ProjectCodeTypeType
{

   @XmlElementRef(name = "CreateDate", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Date> createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "IsSecureCode") protected Boolean isSecureCode;
   @XmlElementRef(name = "LastUpdateDate", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Date> lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "Length") protected Integer length;
   @XmlElementRef(name = "MaxCodeValueWeight", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Double> maxCodeValueWeight;
   @XmlElement(name = "Name") protected String name;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "SequenceNumber") protected Integer sequenceNumber;
   @XmlElementRef(name = "Weight", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Double> weight;

   /**
    * Gets the value of the createDate property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Date }{@code >}
    *     
    */
   public JAXBElement<Date> getCreateDate()
   {
      return createDate;
   }

   /**
    * Sets the value of the createDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Date }{@code >}
    *     
    */
   public void setCreateDate(JAXBElement<Date> value)
   {
      this.createDate = ((JAXBElement<Date>) value);
   }

   /**
    * Gets the value of the createUser property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getCreateUser()
   {
      return createUser;
   }

   /**
    * Sets the value of the createUser property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setCreateUser(String value)
   {
      this.createUser = value;
   }

   /**
    * Gets the value of the isSecureCode property.
    * 
    * @return
    *     possible object is
    *     {@link Boolean }
    *     
    */
   public Boolean isIsSecureCode()
   {
      return isSecureCode;
   }

   /**
    * Sets the value of the isSecureCode property.
    * 
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *     
    */
   public void setIsSecureCode(Boolean value)
   {
      this.isSecureCode = value;
   }

   /**
    * Gets the value of the lastUpdateDate property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Date }{@code >}
    *     
    */
   public JAXBElement<Date> getLastUpdateDate()
   {
      return lastUpdateDate;
   }

   /**
    * Sets the value of the lastUpdateDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Date }{@code >}
    *     
    */
   public void setLastUpdateDate(JAXBElement<Date> value)
   {
      this.lastUpdateDate = ((JAXBElement<Date>) value);
   }

   /**
    * Gets the value of the lastUpdateUser property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getLastUpdateUser()
   {
      return lastUpdateUser;
   }

   /**
    * Sets the value of the lastUpdateUser property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setLastUpdateUser(String value)
   {
      this.lastUpdateUser = value;
   }

   /**
    * Gets the value of the length property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getLength()
   {
      return length;
   }

   /**
    * Sets the value of the length property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setLength(Integer value)
   {
      this.length = value;
   }

   /**
    * Gets the value of the maxCodeValueWeight property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public JAXBElement<Double> getMaxCodeValueWeight()
   {
      return maxCodeValueWeight;
   }

   /**
    * Sets the value of the maxCodeValueWeight property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public void setMaxCodeValueWeight(JAXBElement<Double> value)
   {
      this.maxCodeValueWeight = ((JAXBElement<Double>) value);
   }

   /**
    * Gets the value of the name property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getName()
   {
      return name;
   }

   /**
    * Sets the value of the name property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setName(String value)
   {
      this.name = value;
   }

   /**
    * Gets the value of the objectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getObjectId()
   {
      return objectId;
   }

   /**
    * Sets the value of the objectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setObjectId(Integer value)
   {
      this.objectId = value;
   }

   /**
    * Gets the value of the sequenceNumber property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getSequenceNumber()
   {
      return sequenceNumber;
   }

   /**
    * Sets the value of the sequenceNumber property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setSequenceNumber(Integer value)
   {
      this.sequenceNumber = value;
   }

   /**
    * Gets the value of the weight property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public JAXBElement<Double> getWeight()
   {
      return weight;
   }

   /**
    * Sets the value of the weight property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public void setWeight(JAXBElement<Double> value)
   {
      this.weight = ((JAXBElement<Double>) value);
   }

}
