
package com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validarPostagemSimultaneaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validarPostagemSimultaneaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validarPostagemSimultanea" type="{http://service.logisticareversa.correios.com.br/}retornoValidacao" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarPostagemSimultaneaResponse", propOrder = {
    "validarPostagemSimultanea"
})
public class ValidarPostagemSimultaneaResponse {

    protected RetornoValidacao validarPostagemSimultanea;

    /**
     * Gets the value of the validarPostagemSimultanea property.
     * 
     * @return
     *     possible object is
     *     {@link RetornoValidacao }
     *     
     */
    public RetornoValidacao getValidarPostagemSimultanea() {
        return validarPostagemSimultanea;
    }

    /**
     * Sets the value of the validarPostagemSimultanea property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoValidacao }
     *     
     */
    public void setValidarPostagemSimultanea(RetornoValidacao value) {
        this.validarPostagemSimultanea = value;
    }

}
