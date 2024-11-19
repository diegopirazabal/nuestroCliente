
package turismoservidor;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entrenador complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entrenador"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://publicador/}usuario"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="disciplina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="linkSitioWeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entrenador", propOrder = {
    "disciplina",
    "linkSitioWeb"
})
public class Entrenador
    extends Usuario
{

    protected String disciplina;
    protected String linkSitioWeb;

    /**
     * Gets the value of the disciplina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisciplina() {
        return disciplina;
    }

    /**
     * Sets the value of the disciplina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisciplina(String value) {
        this.disciplina = value;
    }

    /**
     * Gets the value of the linkSitioWeb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkSitioWeb() {
        return linkSitioWeb;
    }

    /**
     * Sets the value of the linkSitioWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkSitioWeb(String value) {
        this.linkSitioWeb = value;
    }

}
