
package es.oracle.invenes.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reference complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fieldValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="publicationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlsPDF" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reference", propOrder = {
    "fieldNames",
    "fieldValues",
    "idReference",
    "location",
    "publicationNumber",
    "urlImage",
    "urlReference",
    "urlsPDF"
})
public class Reference {

    @XmlElement(nillable = true)
    protected List<String> fieldNames;
    @XmlElement(nillable = true)
    protected List<String> fieldValues;
    protected String idReference;
    protected int location;
    protected String publicationNumber;
    protected String urlImage;
    protected String urlReference;
    @XmlElement(nillable = true)
    protected List<Object> urlsPDF;

    /**
     * Gets the value of the fieldNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFieldNames() {
        if (fieldNames == null) {
            fieldNames = new ArrayList<String>();
        }
        return this.fieldNames;
    }

    /**
     * Gets the value of the fieldValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFieldValues() {
        if (fieldValues == null) {
            fieldValues = new ArrayList<String>();
        }
        return this.fieldValues;
    }

    /**
     * Obtiene el valor de la propiedad idReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdReference() {
        return idReference;
    }

    /**
     * Define el valor de la propiedad idReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdReference(String value) {
        this.idReference = value;
    }

    /**
     * Obtiene el valor de la propiedad location.
     * 
     */
    public int getLocation() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     */
    public void setLocation(int value) {
        this.location = value;
    }

    /**
     * Obtiene el valor de la propiedad publicationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationNumber() {
        return publicationNumber;
    }

    /**
     * Define el valor de la propiedad publicationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationNumber(String value) {
        this.publicationNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad urlImage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlImage() {
        return urlImage;
    }

    /**
     * Define el valor de la propiedad urlImage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlImage(String value) {
        this.urlImage = value;
    }

    /**
     * Obtiene el valor de la propiedad urlReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlReference() {
        return urlReference;
    }

    /**
     * Define el valor de la propiedad urlReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlReference(String value) {
        this.urlReference = value;
    }

    /**
     * Gets the value of the urlsPDF property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlsPDF property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrlsPDF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getUrlsPDF() {
        if (urlsPDF == null) {
            urlsPDF = new ArrayList<Object>();
        }
        return this.urlsPDF;
    }

}
