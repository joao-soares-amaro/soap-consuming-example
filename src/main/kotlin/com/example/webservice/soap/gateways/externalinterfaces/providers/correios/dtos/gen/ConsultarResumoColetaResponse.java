
package com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarResumoColetaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarResumoColetaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consultarResumoColeta" type="{http://service.logisticareversa.correios.com.br/}retornoResumoColeta" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarResumoColetaResponse", propOrder = {
    "consultarResumoColeta"
})
public class ConsultarResumoColetaResponse {

    protected RetornoResumoColeta consultarResumoColeta;

    /**
     * Gets the value of the consultarResumoColeta property.
     * 
     * @return
     *     possible object is
     *     {@link RetornoResumoColeta }
     *     
     */
    public RetornoResumoColeta getConsultarResumoColeta() {
        return consultarResumoColeta;
    }

    /**
     * Sets the value of the consultarResumoColeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoResumoColeta }
     *     
     */
    public void setConsultarResumoColeta(RetornoResumoColeta value) {
        this.consultarResumoColeta = value;
    }

}
