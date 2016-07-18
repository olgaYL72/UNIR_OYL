
package es.oracle.invenes.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.3.1-patch-01
 * Mon Apr 25 17:26:44 CEST 2016
 * Generated source version: 2.3.1-patch-01
 * 
 */

@WebFault(name = "InvenesWebException", targetNamespace = "http://ws.invenes.oracle.es/")
public class InvenesWebException_Exception extends Exception {
    public static final long serialVersionUID = 20160425172644L;
    
    private es.oracle.invenes.ws.InvenesWebException invenesWebException;

    public InvenesWebException_Exception() {
        super();
    }
    
    public InvenesWebException_Exception(String message) {
        super(message);
    }
    
    public InvenesWebException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public InvenesWebException_Exception(String message, es.oracle.invenes.ws.InvenesWebException invenesWebException) {
        super(message);
        this.invenesWebException = invenesWebException;
    }

    public InvenesWebException_Exception(String message, es.oracle.invenes.ws.InvenesWebException invenesWebException, Throwable cause) {
        super(message, cause);
        this.invenesWebException = invenesWebException;
    }

    public es.oracle.invenes.ws.InvenesWebException getFaultInfo() {
        return this.invenesWebException;
    }
}
