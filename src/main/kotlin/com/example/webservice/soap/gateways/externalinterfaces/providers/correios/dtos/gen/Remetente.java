
package com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for remetente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="remetente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.logisticareversa.correios.com.br/}pessoa"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ddd_celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restricao_anac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remetente", propOrder = {
    "identificacao",
    "dddCelular",
    "celular",
    "sms",
    "restricaoAnac"
})
public class Remetente
    extends Pessoa
{

    protected String identificacao;
    @XmlElement(name = "ddd_celular")
    protected String dddCelular;
    protected String celular;
    protected String sms;
    @XmlElement(name = "restricao_anac")
    protected String restricaoAnac;

    /**
     * Gets the value of the identificacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacao() {
        return identificacao;
    }

    /**
     * Sets the value of the identificacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacao(String value) {
        this.identificacao = value;
    }

    /**
     * Gets the value of the dddCelular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDddCelular() {
        return dddCelular;
    }

    /**
     * Sets the value of the dddCelular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDddCelular(String value) {
        this.dddCelular = value;
    }

    /**
     * Gets the value of the celular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Sets the value of the celular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelular(String value) {
        this.celular = value;
    }

    /**
     * Gets the value of the sms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSms() {
        return sms;
    }

    /**
     * Sets the value of the sms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSms(String value) {
        this.sms = value;
    }

    /**
     * Gets the value of the restricaoAnac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestricaoAnac() {
        return restricaoAnac;
    }

    /**
     * Sets the value of the restricaoAnac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestricaoAnac(String value) {
        this.restricaoAnac = value;
    }

}
