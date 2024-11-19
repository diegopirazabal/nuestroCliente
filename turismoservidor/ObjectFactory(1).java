
package turismoservidor;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the turismoservidor package. 
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

    private final static QName _ActividadRepetidaException_QNAME = new QName("http://turismoservidor/", "ActividadRepetidaException");
    private final static QName _SalidaNoExisteException_QNAME = new QName("http://turismoservidor/", "SalidaNoExisteException");
    private final static QName _UsuarioNoExisteException_QNAME = new QName("http://turismoservidor/", "UsuarioNoExisteException");
    private final static QName _UsuarioRepetidoException_QNAME = new QName("http://turismoservidor/", "UsuarioRepetidoException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: turismoservidor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActividadRepetidaException }
     * 
     * @return
     *     the new instance of {@link ActividadRepetidaException }
     */
    public ActividadRepetidaException createActividadRepetidaException() {
        return new ActividadRepetidaException();
    }

    /**
     * Create an instance of {@link SalidaNoExisteException }
     * 
     * @return
     *     the new instance of {@link SalidaNoExisteException }
     */
    public SalidaNoExisteException createSalidaNoExisteException() {
        return new SalidaNoExisteException();
    }

    /**
     * Create an instance of {@link UsuarioNoExisteException }
     * 
     * @return
     *     the new instance of {@link UsuarioNoExisteException }
     */
    public UsuarioNoExisteException createUsuarioNoExisteException() {
        return new UsuarioNoExisteException();
    }

    /**
     * Create an instance of {@link UsuarioRepetidoException }
     * 
     * @return
     *     the new instance of {@link UsuarioRepetidoException }
     */
    public UsuarioRepetidoException createUsuarioRepetidoException() {
        return new UsuarioRepetidoException();
    }

    /**
     * Create an instance of {@link DataUsuario }
     * 
     * @return
     *     the new instance of {@link DataUsuario }
     */
    public DataUsuario createDataUsuario() {
        return new DataUsuario();
    }

    /**
     * Create an instance of {@link DataTurista }
     * 
     * @return
     *     the new instance of {@link DataTurista }
     */
    public DataTurista createDataTurista() {
        return new DataTurista();
    }

    /**
     * Create an instance of {@link DataProveedor }
     * 
     * @return
     *     the new instance of {@link DataProveedor }
     */
    public DataProveedor createDataProveedor() {
        return new DataProveedor();
    }

    /**
     * Create an instance of {@link DataListaSalidas }
     * 
     * @return
     *     the new instance of {@link DataListaSalidas }
     */
    public DataListaSalidas createDataListaSalidas() {
        return new DataListaSalidas();
    }

    /**
     * Create an instance of {@link DataSalida }
     * 
     * @return
     *     the new instance of {@link DataSalida }
     */
    public DataSalida createDataSalida() {
        return new DataSalida();
    }

    /**
     * Create an instance of {@link LocalDate }
     * 
     * @return
     *     the new instance of {@link LocalDate }
     */
    public LocalDate createLocalDate() {
        return new LocalDate();
    }

    /**
     * Create an instance of {@link DataActividad }
     * 
     * @return
     *     the new instance of {@link DataActividad }
     */
    public DataActividad createDataActividad() {
        return new DataActividad();
    }

    /**
     * Create an instance of {@link DataListaActividades }
     * 
     * @return
     *     the new instance of {@link DataListaActividades }
     */
    public DataListaActividades createDataListaActividades() {
        return new DataListaActividades();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActividadRepetidaException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActividadRepetidaException }{@code >}
     */
    @XmlElementDecl(namespace = "http://turismoservidor/", name = "ActividadRepetidaException")
    public JAXBElement<ActividadRepetidaException> createActividadRepetidaException(ActividadRepetidaException value) {
        return new JAXBElement<>(_ActividadRepetidaException_QNAME, ActividadRepetidaException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalidaNoExisteException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SalidaNoExisteException }{@code >}
     */
    @XmlElementDecl(namespace = "http://turismoservidor/", name = "SalidaNoExisteException")
    public JAXBElement<SalidaNoExisteException> createSalidaNoExisteException(SalidaNoExisteException value) {
        return new JAXBElement<>(_SalidaNoExisteException_QNAME, SalidaNoExisteException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioNoExisteException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsuarioNoExisteException }{@code >}
     */
    @XmlElementDecl(namespace = "http://turismoservidor/", name = "UsuarioNoExisteException")
    public JAXBElement<UsuarioNoExisteException> createUsuarioNoExisteException(UsuarioNoExisteException value) {
        return new JAXBElement<>(_UsuarioNoExisteException_QNAME, UsuarioNoExisteException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioRepetidoException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsuarioRepetidoException }{@code >}
     */
    @XmlElementDecl(namespace = "http://turismoservidor/", name = "UsuarioRepetidoException")
    public JAXBElement<UsuarioRepetidoException> createUsuarioRepetidoException(UsuarioRepetidoException value) {
        return new JAXBElement<>(_UsuarioRepetidoException_QNAME, UsuarioRepetidoException.class, null, value);
    }

}
