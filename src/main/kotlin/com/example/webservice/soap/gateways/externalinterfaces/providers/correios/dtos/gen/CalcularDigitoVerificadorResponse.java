
package com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calcularDigitoVerificadorResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calcularDigitoVerificadorResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calcularDigitoVerificador" type="{http://service.logisticareversa.correios.com.br/}retornoDigitoVerificador" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcularDigitoVerificadorResponse", propOrder = {
    "calcularDigitoVerificador"
})
public class CalcularDigitoVerificadorResponse {

    protected RetornoDigitoVerificador calcularDigitoVerificador;

    /**
     * Gets the value of the calcularDigitoVerificador property.
     * 
     * @return
     *     possible object is
     *     {@link RetornoDigitoVerificador }
     *     
     */
    public RetornoDigitoVerificador getCalcularDigitoVerificador() {
        return calcularDigitoVerificador;
    }

    /**
     * Sets the value of the calcularDigitoVerificador property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoDigitoVerificador }
     *     
     */
    public void setCalcularDigitoVerificador(RetornoDigitoVerificador value) {
        this.calcularDigitoVerificador = value;
    }

}
