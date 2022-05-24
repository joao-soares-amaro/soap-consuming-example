
package com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sobreWebServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sobreWebServiceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sobreWebService" type="{http://service.logisticareversa.correios.com.br/}retornoSobreWebService" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sobreWebServiceResponse", propOrder = {
    "sobreWebService"
})
public class SobreWebServiceResponse {

    protected RetornoSobreWebService sobreWebService;

    /**
     * Gets the value of the sobreWebService property.
     * 
     * @return
     *     possible object is
     *     {@link RetornoSobreWebService }
     *     
     */
    public RetornoSobreWebService getSobreWebService() {
        return sobreWebService;
    }

    /**
     * Sets the value of the sobreWebService property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoSobreWebService }
     *     
     */
    public void setSobreWebService(RetornoSobreWebService value) {
        this.sobreWebService = value;
    }

}
