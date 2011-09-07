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
 * <p>Java class for TimesheetDelegateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimesheetDelegateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActiveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApproverUserName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ApproverUserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DelegateUserEmailAddress" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="120"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DelegateUserName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DelegateUserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "TimesheetDelegateType", propOrder =
{
   "activeFlag",
   "approverUserName",
   "approverUserObjectId",
   "createDate",
   "createUser",
   "delegateUserEmailAddress",
   "delegateUserName",
   "delegateUserObjectId",
   "lastUpdateDate",
   "lastUpdateUser",
   "objectId",
   "projectObjectId"
}) @SuppressWarnings("all") public class TimesheetDelegateType
{

   @XmlElementRef(name = "ActiveFlag", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Boolean> activeFlag;
   @XmlElement(name = "ApproverUserName") protected String approverUserName;
   @XmlElement(name = "ApproverUserObjectId") protected Integer approverUserObjectId;
   @XmlElementRef(name = "CreateDate", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Date> createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "DelegateUserEmailAddress") protected String delegateUserEmailAddress;
   @XmlElement(name = "DelegateUserName") protected String delegateUserName;
   @XmlElement(name = "DelegateUserObjectId") protected Integer delegateUserObjectId;
   @XmlElementRef(name = "LastUpdateDate", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Date> lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElementRef(name = "ProjectObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Integer> projectObjectId;

   /**
    * Gets the value of the activeFlag property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public JAXBElement<Boolean> getActiveFlag()
   {
      return activeFlag;
   }

   /**
    * Sets the value of the activeFlag property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public void setActiveFlag(JAXBElement<Boolean> value)
   {
      this.activeFlag = ((JAXBElement<Boolean>) value);
   }

   /**
    * Gets the value of the approverUserName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getApproverUserName()
   {
      return approverUserName;
   }

   /**
    * Sets the value of the approverUserName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setApproverUserName(String value)
   {
      this.approverUserName = value;
   }

   /**
    * Gets the value of the approverUserObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getApproverUserObjectId()
   {
      return approverUserObjectId;
   }

   /**
    * Sets the value of the approverUserObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setApproverUserObjectId(Integer value)
   {
      this.approverUserObjectId = value;
   }

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
    * Gets the value of the delegateUserEmailAddress property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getDelegateUserEmailAddress()
   {
      return delegateUserEmailAddress;
   }

   /**
    * Sets the value of the delegateUserEmailAddress property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setDelegateUserEmailAddress(String value)
   {
      this.delegateUserEmailAddress = value;
   }

   /**
    * Gets the value of the delegateUserName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getDelegateUserName()
   {
      return delegateUserName;
   }

   /**
    * Sets the value of the delegateUserName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setDelegateUserName(String value)
   {
      this.delegateUserName = value;
   }

   /**
    * Gets the value of the delegateUserObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getDelegateUserObjectId()
   {
      return delegateUserObjectId;
   }

   /**
    * Sets the value of the delegateUserObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setDelegateUserObjectId(Integer value)
   {
      this.delegateUserObjectId = value;
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
    * Gets the value of the projectObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public JAXBElement<Integer> getProjectObjectId()
   {
      return projectObjectId;
   }

   /**
    * Sets the value of the projectObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public void setProjectObjectId(JAXBElement<Integer> value)
   {
      this.projectObjectId = ((JAXBElement<Integer>) value);
   }

}
