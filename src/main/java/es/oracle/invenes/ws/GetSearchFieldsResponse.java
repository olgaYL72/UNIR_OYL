
package es.oracle.invenes.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getSearchFieldsResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getSearchFieldsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getSearchFieldsResponse" type="{http://ws.invenes.oracle.es/}invenesProperties" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSearchFieldsResponse", propOrder = {
    "getSearchFieldsResponse"
})
public class GetSearchFieldsResponse {

    protected InvenesProperties getSearchFieldsResponse;

    /**
     * Obtiene el valor de la propiedad getSearchFieldsResponse.
     * 
     * @return
     *     possible object is
     *     {@link InvenesProperties }
     *     
     */
    public InvenesProperties getGetSearchFieldsResponse() {
        return getSearchFieldsResponse;
    }

    /**
     * Define el valor de la propiedad getSearchFieldsResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link InvenesProperties }
     *     
     */
    public void setGetSearchFieldsResponse(InvenesProperties value) {
        this.getSearchFieldsResponse = value;
    }

}
