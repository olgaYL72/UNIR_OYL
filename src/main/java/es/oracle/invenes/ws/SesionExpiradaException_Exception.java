
package es.oracle.invenes.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.3.1-patch-01
 * Mon Apr 25 17:26:44 CEST 2016
 * Generated source version: 2.3.1-patch-01
 * 
 */

@WebFault(name = "SesionExpiradaException", targetNamespace = "http://ws.invenes.oracle.es/")
public class SesionExpiradaException_Exception extends Exception {
    public static final long serialVersionUID = 20160425172644L;
    
    private es.oracle.invenes.ws.SesionExpiradaException sesionExpiradaException;

    public SesionExpiradaException_Exception() {
        super();
    }
    
    public SesionExpiradaException_Exception(String message) {
        super(message);
    }
    
    public SesionExpiradaException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public SesionExpiradaException_Exception(String message, es.oracle.invenes.ws.SesionExpiradaException sesionExpiradaException) {
        super(message);
        this.sesionExpiradaException = sesionExpiradaException;
    }

    public SesionExpiradaException_Exception(String message, es.oracle.invenes.ws.SesionExpiradaException sesionExpiradaException, Throwable cause) {
        super(message, cause);
        this.sesionExpiradaException = sesionExpiradaException;
    }

    public es.oracle.invenes.ws.SesionExpiradaException getFaultInfo() {
        return this.sesionExpiradaException;
    }
}
