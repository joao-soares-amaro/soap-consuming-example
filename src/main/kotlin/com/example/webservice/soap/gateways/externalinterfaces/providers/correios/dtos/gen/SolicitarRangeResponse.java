
package com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for solicitarRangeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solicitarRangeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="solicitarRange" type="{http://service.logisticareversa.correios.com.br/}retornoFaixaNumerica" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitarRangeResponse", propOrder = {
    "solicitarRange"
})
public class SolicitarRangeResponse {

    protected RetornoFaixaNumerica solicitarRange;

    /**
     * Gets the value of the solicitarRange property.
     * 
     * @return
     *     possible object is
     *     {@link RetornoFaixaNumerica }
     *     
     */
    public RetornoFaixaNumerica getSolicitarRange() {
        return solicitarRange;
    }

    /**
     * Sets the value of the solicitarRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoFaixaNumerica }
     *     
     */
    public void setSolicitarRange(RetornoFaixaNumerica value) {
        this.solicitarRange = value;
    }

}
