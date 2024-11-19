
package turismoservidor;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.5
 * 2024-11-19T18:00:58.946-03:00
 * Generated source version: 4.0.5
 */

@WebFault(name = "ClaseRepetidaException", targetNamespace = "http://publicador/")
public class ClaseRepetidaException_Exception extends Exception {

    private ClaseRepetidaException faultInfo;

    public ClaseRepetidaException_Exception() {
        super();
    }

    public ClaseRepetidaException_Exception(String message) {
        super(message);
    }

    public ClaseRepetidaException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ClaseRepetidaException_Exception(String message, ClaseRepetidaException claseRepetidaException) {
        super(message);
        this.faultInfo = claseRepetidaException;
    }

    public ClaseRepetidaException_Exception(String message, ClaseRepetidaException claseRepetidaException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = claseRepetidaException;
    }

    public ClaseRepetidaException getFaultInfo() {
        return this.faultInfo;
    }
}