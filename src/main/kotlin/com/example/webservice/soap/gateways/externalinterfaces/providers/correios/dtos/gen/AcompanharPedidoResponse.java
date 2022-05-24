
package com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acompanharPedidoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acompanharPedidoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acompanharPedido" type="{http://service.logisticareversa.correios.com.br/}retornoAcompanhamento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acompanharPedidoResponse", propOrder = {
    "acompanharPedido"
})
public class AcompanharPedidoResponse {

    protected RetornoAcompanhamento acompanharPedido;

    /**
     * Gets the value of the acompanharPedido property.
     * 
     * @return
     *     possible object is
     *     {@link RetornoAcompanhamento }
     *     
     */
    public RetornoAcompanhamento getAcompanharPedido() {
        return acompanharPedido;
    }

    /**
     * Sets the value of the acompanharPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoAcompanhamento }
     *     
     */
    public void setAcompanharPedido(RetornoAcompanhamento value) {
        this.acompanharPedido = value;
    }

}
