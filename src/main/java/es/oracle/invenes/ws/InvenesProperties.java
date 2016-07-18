
package es.oracle.invenes.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para invenesProperties complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="invenesProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="labelValueBean" type="{http://ws.invenes.oracle.es/}labelValueBean" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invenesProperties", propOrder = {
    "labelValueBean"
})
public class InvenesProperties {

    @XmlElement(nillable = true)
    protected List<LabelValueBean> labelValueBean;

    /**
     * Gets the value of the labelValueBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labelValueBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabelValueBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelValueBean }
     * 
     * 
     */
    public List<LabelValueBean> getLabelValueBean() {
        if (labelValueBean == null) {
            labelValueBean = new ArrayList<LabelValueBean>();
        }
        return this.labelValueBean;
    }

}
