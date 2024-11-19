package publicador;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.5
 * 2024-11-19T15:29:24.916-03:00
 * Generated source version: 4.0.5
 *
 */
@WebServiceClient(name = "PublicadorService",
                  wsdlLocation = "http://localhost:9191/publicador?wsdl",
                  targetNamespace = "http://publicador/")
public class PublicadorService extends Service {

    public static final URL WSDL_LOCATION;

    public static final QName SERVICE = new QName("http://publicador/", "PublicadorService");
    public static final QName PublicadorPort = new QName("http://publicador/", "PublicadorPort");
    static {
        URL url = null;
        try {
            url = URI.create("http://localhost:9191/publicador?wsdl").toURL();
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PublicadorService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:9191/publicador?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PublicadorService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PublicadorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PublicadorService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public PublicadorService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PublicadorService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PublicadorService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Publicador
     */
    @WebEndpoint(name = "PublicadorPort")
    public Publicador getPublicadorPort() {
        return super.getPort(PublicadorPort, Publicador.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Publicador
     */
    @WebEndpoint(name = "PublicadorPort")
    public Publicador getPublicadorPort(WebServiceFeature... features) {
        return super.getPort(PublicadorPort, Publicador.class, features);
    }

}
