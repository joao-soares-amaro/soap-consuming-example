
package com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validarPostagemReversa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validarPostagemReversa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codAdministrativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigo_servico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cep_destinatario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coleta" type="{http://service.logisticareversa.correios.com.br/}coletaReversa" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarPostagemReversa", propOrder = {
    "codAdministrativo",
    "codigoServico",
    "cartao",
    "cepDestinatario",
    "coleta"
})
public class ValidarPostagemReversa {

    protected String codAdministrativo;
    @XmlElement(name = "codigo_servico")
    protected String codigoServico;
    protected String cartao;
    @XmlElement(name = "cep_destinatario")
    protected String cepDestinatario;
    protected ColetaReversa coleta;

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
     * Gets the value of the codigoServico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoServico() {
        return codigoServico;
    }

    /**
     * Sets the value of the codigoServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoServico(String value) {
        this.codigoServico = value;
    }

    /**
     * Gets the value of the cartao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartao() {
        return cartao;
    }

    /**
     * Sets the value of the cartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartao(String value) {
        this.cartao = value;
    }

    /**
     * Gets the value of the cepDestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepDestinatario() {
        return cepDestinatario;
    }

    /**
     * Sets the value of the cepDestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepDestinatario(String value) {
        this.cepDestinatario = value;
    }

    /**
     * Gets the value of the coleta property.
     * 
     * @return
     *     possible object is
     *     {@link ColetaReversa }
     *     
     */
    public ColetaReversa getColeta() {
        return coleta;
    }

    /**
     * Sets the value of the coleta property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColetaReversa }
     *     
     */
    public void setColeta(ColetaReversa value) {
        this.coleta = value;
    }

}
