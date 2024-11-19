
package turismoservidor;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.5
 * 2024-11-19T18:00:59.003-03:00
 * Generated source version: 4.0.5
 */

@WebFault(name = "ClaseNoExisteException", targetNamespace = "http://publicador/")
public class ClaseNoExisteException_Exception extends Exception {

    private ClaseNoExisteException faultInfo;

    public ClaseNoExisteException_Exception() {
        super();
    }

    public ClaseNoExisteException_Exception(String message) {
        super(message);
    }

    public ClaseNoExisteException_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ClaseNoExisteException_Exception(String message, ClaseNoExisteException claseNoExisteException) {
        super(message);
        this.faultInfo = claseNoExisteException;
    }

    public ClaseNoExisteException_Exception(String message, ClaseNoExisteException claseNoExisteException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = claseNoExisteException;
    }

    public ClaseNoExisteException getFaultInfo() {
        return this.faultInfo;
    }
}