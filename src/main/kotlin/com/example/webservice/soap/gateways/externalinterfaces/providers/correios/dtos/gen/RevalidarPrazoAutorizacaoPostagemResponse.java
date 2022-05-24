
package com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for revalidarPrazoAutorizacaoPostagemResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="revalidarPrazoAutorizacaoPostagemResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="revalidarPrazoAutorizacaoPostagem" type="{http://service.logisticareversa.correios.com.br/}retornoRevalidarPrazo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "revalidarPrazoAutorizacaoPostagemResponse", propOrder = {
    "revalidarPrazoAutorizacaoPostagem"
})
public class RevalidarPrazoAutorizacaoPostagemResponse {

    protected RetornoRevalidarPrazo revalidarPrazoAutorizacaoPostagem;

    /**
     * Gets the value of the revalidarPrazoAutorizacaoPostagem property.
     * 
     * @return
     *     possible object is
     *     {@link RetornoRevalidarPrazo }
     *     
     */
    public RetornoRevalidarPrazo getRevalidarPrazoAutorizacaoPostagem() {
        return revalidarPrazoAutorizacaoPostagem;
    }

    /**
     * Sets the value of the revalidarPrazoAutorizacaoPostagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoRevalidarPrazo }
     *     
     */
    public void setRevalidarPrazoAutorizacaoPostagem(RetornoRevalidarPrazo value) {
        this.revalidarPrazoAutorizacaoPostagem = value;
    }

}
