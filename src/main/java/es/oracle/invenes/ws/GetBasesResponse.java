
package es.oracle.invenes.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getBasesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getBasesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getBasesResponse" type="{http://ws.invenes.oracle.es/}invenesProperties" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBasesResponse", propOrder = {
    "getBasesResponse"
})
public class GetBasesResponse {

    protected InvenesProperties getBasesResponse;

    /**
     * Obtiene el valor de la propiedad getBasesResponse.
     * 
     * @return
     *     possible object is
     *     {@link InvenesProperties }
     *     
     */
    public InvenesProperties getGetBasesResponse() {
        return getBasesResponse;
    }

    /**
     * Define el valor de la propiedad getBasesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link InvenesProperties }
     *     
     */
    public void setGetBasesResponse(InvenesProperties value) {
        this.getBasesResponse = value;
    }

}
