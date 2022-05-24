
package com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for historicoColeta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="historicoColeta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="descricao_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data_atualizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hora_atualizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "historicoColeta", propOrder = {
    "status",
    "descricaoStatus",
    "dataAtualizacao",
    "horaAtualizacao",
    "observacao"
})
public class HistoricoColeta {

    protected Integer status;
    @XmlElement(name = "descricao_status")
    protected String descricaoStatus;
    @XmlElement(name = "data_atualizacao")
    protected String dataAtualizacao;
    @XmlElement(name = "hora_atualizacao")
    protected String horaAtualizacao;
    protected String observacao;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the descricaoStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoStatus() {
        return descricaoStatus;
    }

    /**
     * Sets the value of the descricaoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoStatus(String value) {
        this.descricaoStatus = value;
    }

    /**
     * Gets the value of the dataAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    /**
     * Sets the value of the dataAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAtualizacao(String value) {
        this.dataAtualizacao = value;
    }

    /**
     * Gets the value of the horaAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraAtualizacao() {
        return horaAtualizacao;
    }

    /**
     * Sets the value of the horaAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraAtualizacao(String value) {
        this.horaAtualizacao = value;
    }

    /**
     * Gets the value of the observacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Sets the value of the observacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

}
