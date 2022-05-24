
package com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dnecTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dnecTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dnec_mensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dnec_resultset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dnec_retorno" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="dnec_total" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dnecTO", propOrder = {
    "dnecMensagem",
    "dnecResultset",
    "dnecRetorno",
    "dnecTotal"
})
public class DnecTO {

    @XmlElement(name = "dnec_mensagem")
    protected String dnecMensagem;
    @XmlElement(name = "dnec_resultset")
    protected String dnecResultset;
    @XmlElement(name = "dnec_retorno")
    protected long dnecRetorno;
    @XmlElement(name = "dnec_total")
    protected double dnecTotal;

    /**
     * Gets the value of the dnecMensagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnecMensagem() {
        return dnecMensagem;
    }

    /**
     * Sets the value of the dnecMensagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnecMensagem(String value) {
        this.dnecMensagem = value;
    }

    /**
     * Gets the value of the dnecResultset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnecResultset() {
        return dnecResultset;
    }

    /**
     * Sets the value of the dnecResultset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnecResultset(String value) {
        this.dnecResultset = value;
    }

    /**
     * Gets the value of the dnecRetorno property.
     * 
     */
    public long getDnecRetorno() {
        return dnecRetorno;
    }

    /**
     * Sets the value of the dnecRetorno property.
     * 
     */
    public void setDnecRetorno(long value) {
        this.dnecRetorno = value;
    }

    /**
     * Gets the value of the dnecTotal property.
     * 
     */
    public double getDnecTotal() {
        return dnecTotal;
    }

    /**
     * Sets the value of the dnecTotal property.
     * 
     */
    public void setDnecTotal(double value) {
        this.dnecTotal = value;
    }

}
