
package com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acompanharPedidoPorDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acompanharPedidoPorDataResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acompanharPedidoPorData" type="{http://service.logisticareversa.correios.com.br/}retornoAcompanhamento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acompanharPedidoPorDataResponse", propOrder = {
    "acompanharPedidoPorData"
})
public class AcompanharPedidoPorDataResponse {

    protected RetornoAcompanhamento acompanharPedidoPorData;

    /**
     * Gets the value of the acompanharPedidoPorData property.
     * 
     * @return
     *     possible object is
     *     {@link RetornoAcompanhamento }
     *     
     */
    public RetornoAcompanhamento getAcompanharPedidoPorData() {
        return acompanharPedidoPorData;
    }

    /**
     * Sets the value of the acompanharPedidoPorData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoAcompanhamento }
     *     
     */
    public void setAcompanharPedidoPorData(RetornoAcompanhamento value) {
        this.acompanharPedidoPorData = value;
    }

}
