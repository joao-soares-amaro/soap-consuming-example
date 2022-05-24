
package com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for revalidarPrazoAutorizacaoPostagem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="revalidarPrazoAutorizacaoPostagem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codAdministrativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroPedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtdeDias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "revalidarPrazoAutorizacaoPostagem", propOrder = {
    "codAdministrativo",
    "numeroPedido",
    "qtdeDias"
})
public class RevalidarPrazoAutorizacaoPostagem {

    protected String codAdministrativo;
    protected String numeroPedido;
    protected String qtdeDias;

    /**
     * Gets the value of the codAdministrativo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAdministrativo() {
        return codAdministrativo;
    }

    /**
     * Sets the value of the codAdministrativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAdministrativo(String value) {
        this.codAdministrativo = value;
    }

    /**
     * Gets the value of the numeroPedido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPedido() {
        return numeroPedido;
    }

    /**
     * Sets the value of the numeroPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPedido(String value) {
        this.numeroPedido = value;
    }

    /**
     * Gets the value of the qtdeDias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtdeDias() {
        return qtdeDias;
    }

    /**
     * Sets the value of the qtdeDias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdeDias(String value) {
        this.qtdeDias = value;
    }

}
