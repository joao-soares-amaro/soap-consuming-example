
package com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retornoResumoColeta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retornoResumoColeta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoObjeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enderecoResumoRemetente" type="{http://service.logisticareversa.correios.com.br/}enderecoResumoTO" minOccurs="0"/&gt;
 *         &lt;element name="enderecoResumoDestinatario" type="{http://service.logisticareversa.correios.com.br/}enderecoResumoTO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retornoResumoColeta", propOrder = {
    "codigoObjeto",
    "enderecoResumoRemetente",
    "enderecoResumoDestinatario"
})
public class RetornoResumoColeta {

    protected String codigoObjeto;
    protected EnderecoResumoTO enderecoResumoRemetente;
    protected EnderecoResumoTO enderecoResumoDestinatario;

    /**
     * Gets the value of the codigoObjeto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoObjeto() {
        return codigoObjeto;
    }

    /**
     * Sets the value of the codigoObjeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoObjeto(String value) {
        this.codigoObjeto = value;
    }

    /**
     * Gets the value of the enderecoResumoRemetente property.
     * 
     * @return
     *     possible object is
     *     {@link EnderecoResumoTO }
     *     
     */
    public EnderecoResumoTO getEnderecoResumoRemetente() {
        return enderecoResumoRemetente;
    }

    /**
     * Sets the value of the enderecoResumoRemetente property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnderecoResumoTO }
     *     
     */
    public void setEnderecoResumoRemetente(EnderecoResumoTO value) {
        this.enderecoResumoRemetente = value;
    }

    /**
     * Gets the value of the enderecoResumoDestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link EnderecoResumoTO }
     *     
     */
    public EnderecoResumoTO getEnderecoResumoDestinatario() {
        return enderecoResumoDestinatario;
    }

    /**
     * Sets the value of the enderecoResumoDestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnderecoResumoTO }
     *     
     */
    public void setEnderecoResumoDestinatario(EnderecoResumoTO value) {
        this.enderecoResumoDestinatario = value;
    }

}
