
package turismoservidor;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataTypeInscripcion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataTypeInscripcion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidadDeportistas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="costo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="fechaInscripcion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataTypeInscripcion", propOrder = {
	"clase",
    "cantidadDeportistas",
    "costo",
    "fechaInscripcion"
})
public class DataTypeInscripcion {
	protected Clase clase;
    protected int cantidadDeportistas;
    protected double costo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInscripcion;

    /**
     * Gets the value of the cantidadDeportistas property.
     * 
     */
    public int getCantidadDeportistas() {
        return cantidadDeportistas;
    }

    /**
     * Sets the value of the cantidadDeportistas property.
     * 
     */
    public void setCantidadDeportistas(int value) {
        this.cantidadDeportistas = value;
    }

    /**
     * Gets the value of the costo property.
     * 
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Sets the value of the costo property.
     * 
     */
    public void setCosto(double value) {
        this.costo = value;
    }

    /**
     * Gets the value of the fechaInscripcion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInscripcion() {
        return fechaInscripcion;
    }

    /**
     * Sets the value of the fechaInscripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInscripcion(XMLGregorianCalendar value) {
        this.fechaInscripcion = value;
    }

	public Clase getClase() {
		// TODO Auto-generated method stub
		return clase;
	}

}
