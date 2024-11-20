
package turismoservidor;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the publicador package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActividadNoExisteException_QNAME = new QName("http://publicador/", "ActividadNoExisteException");
    private final static QName _ActividadRepetidaException_QNAME = new QName("http://publicador/", "ActividadRepetidaException");
    private final static QName _ClaseNoExisteException_QNAME = new QName("http://publicador/", "ClaseNoExisteException");
    private final static QName _ClaseRepetidaException_QNAME = new QName("http://publicador/", "ClaseRepetidaException");
    private final static QName _UsuarioNoExisteException_QNAME = new QName("http://publicador/", "UsuarioNoExisteException");
    private final static QName _UsuarioRepetidoException_QNAME = new QName("http://publicador/", "UsuarioRepetidoException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: publicador
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActividadNoExisteException }
     * 
     */
    public ActividadNoExisteException createActividadNoExisteException() {
        return new ActividadNoExisteException();
    }

    /**
     * Create an instance of {@link ActividadRepetidaException }
     * 
     */
    public ActividadRepetidaException createActividadRepetidaException() {
        return new ActividadRepetidaException();
    }

    /**
     * Create an instance of {@link ClaseNoExisteException }
     * 
     */
    public ClaseNoExisteException createClaseNoExisteException() {
        return new ClaseNoExisteException();
    }

    /**
     * Create an instance of {@link ClaseRepetidaException }
     * 
     */
    public ClaseRepetidaException createClaseRepetidaException() {
        return new ClaseRepetidaException();
    }

    /**
     * Create an instance of {@link UsuarioNoExisteException }
     * 
     */
    public UsuarioNoExisteException createUsuarioNoExisteException() {
        return new UsuarioNoExisteException();
    }

    /**
     * Create an instance of {@link UsuarioRepetidoException }
     * 
     */
    public UsuarioRepetidoException createUsuarioRepetidoException() {
        return new UsuarioRepetidoException();
    }

    /**
     * Create an instance of {@link DataListaUsuarios }
     * 
     */
    public DataListaUsuarios createDataListaUsuarios() {
        return new DataListaUsuarios();
    }

    /**
     * Create an instance of {@link DataTypeUsuario }
     * 
     */
    public DataTypeUsuario createDataTypeUsuario() {
        return new DataTypeUsuario();
    }

    /**
     * Create an instance of {@link DataTypeClase }
     * 
     */
    public DataTypeClase createDataTypeClase() {
        return new DataTypeClase();
    }

    /**
     * Create an instance of {@link DataListaActividades }
     * 
     */
    public DataListaActividades createDataListaActividades() {
        return new DataListaActividades();
    }

    /**
     * Create an instance of {@link DataTypeActividad }
     * 
     */
    public DataTypeActividad createDataTypeActividad() {
        return new DataTypeActividad();
    }

    /**
     * Create an instance of {@link Entrenador }
     * 
     */
    public Entrenador createEntrenador() {
        return new Entrenador();
    }

    /**
     * Create an instance of {@link DataListaClases }
     * 
     */
    public DataListaClases createDataListaClases() {
        return new DataListaClases();
    }

    /**
     * Create an instance of {@link Actividad }
     * 
     */
    public Actividad createActividad() {
        return new Actividad();
    }

    /**
     * Create an instance of {@link DataListaInscripciones }
     * 
     */
    public DataListaInscripciones createDataListaInscripciones() {
        return new DataListaInscripciones();
    }

    /**
     * Create an instance of {@link DataTypeInscripcion }
     * 
     */
    public DataTypeInscripcion createDataTypeInscripcion() {
        return new DataTypeInscripcion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActividadNoExisteException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActividadNoExisteException }{@code >}
     */
    @XmlElementDecl(namespace = "http://publicador/", name = "ActividadNoExisteException")
    public JAXBElement<ActividadNoExisteException> createActividadNoExisteException(ActividadNoExisteException value) {
        return new JAXBElement<ActividadNoExisteException>(_ActividadNoExisteException_QNAME, ActividadNoExisteException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActividadRepetidaException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActividadRepetidaException }{@code >}
     */
    @XmlElementDecl(namespace = "http://publicador/", name = "ActividadRepetidaException")
    public JAXBElement<ActividadRepetidaException> createActividadRepetidaException(ActividadRepetidaException value) {
        return new JAXBElement<ActividadRepetidaException>(_ActividadRepetidaException_QNAME, ActividadRepetidaException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaseNoExisteException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaseNoExisteException }{@code >}
     */
    @XmlElementDecl(namespace = "http://publicador/", name = "ClaseNoExisteException")
    public JAXBElement<ClaseNoExisteException> createClaseNoExisteException(ClaseNoExisteException value) {
        return new JAXBElement<ClaseNoExisteException>(_ClaseNoExisteException_QNAME, ClaseNoExisteException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaseRepetidaException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaseRepetidaException }{@code >}
     */
    @XmlElementDecl(namespace = "http://publicador/", name = "ClaseRepetidaException")
    public JAXBElement<ClaseRepetidaException> createClaseRepetidaException(ClaseRepetidaException value) {
        return new JAXBElement<ClaseRepetidaException>(_ClaseRepetidaException_QNAME, ClaseRepetidaException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioNoExisteException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsuarioNoExisteException }{@code >}
     */
    @XmlElementDecl(namespace = "http://publicador/", name = "UsuarioNoExisteException")
    public JAXBElement<UsuarioNoExisteException> createUsuarioNoExisteException(UsuarioNoExisteException value) {
        return new JAXBElement<UsuarioNoExisteException>(_UsuarioNoExisteException_QNAME, UsuarioNoExisteException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioRepetidoException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsuarioRepetidoException }{@code >}
     */
    @XmlElementDecl(namespace = "http://publicador/", name = "UsuarioRepetidoException")
    public JAXBElement<UsuarioRepetidoException> createUsuarioRepetidoException(UsuarioRepetidoException value) {
        return new JAXBElement<UsuarioRepetidoException>(_UsuarioRepetidoException_QNAME, UsuarioRepetidoException.class, null, value);
    }

}
