
package es.oracle.invenes.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para doLoginResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="doLoginResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="doLoginResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doLoginResponse", propOrder = {
    "doLoginResponse"
})
public class DoLoginResponse {

    protected String doLoginResponse;

    /**
     * Obtiene el valor de la propiedad doLoginResponse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoLoginResponse() {
        return doLoginResponse;
    }

    /**
     * Define el valor de la propiedad doLoginResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoLoginResponse(String value) {
        this.doLoginResponse = value;
    }

}
