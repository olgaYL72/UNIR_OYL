
package es.oracle.invenes.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para doSearchResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="doSearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="doSearchResponse" type="{http://ws.invenes.oracle.es/}searchResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doSearchResponse", propOrder = {
    "doSearchResponse"
})
public class DoSearchResponse {

    protected SearchResult doSearchResponse;

    /**
     * Obtiene el valor de la propiedad doSearchResponse.
     * 
     * @return
     *     possible object is
     *     {@link SearchResult }
     *     
     */
    public SearchResult getDoSearchResponse() {
        return doSearchResponse;
    }

    /**
     * Define el valor de la propiedad doSearchResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResult }
     *     
     */
    public void setDoSearchResponse(SearchResult value) {
        this.doSearchResponse = value;
    }

}
