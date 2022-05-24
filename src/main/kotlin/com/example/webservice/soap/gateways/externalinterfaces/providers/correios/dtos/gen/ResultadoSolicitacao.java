
package com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultadoSolicitacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultadoSolicitacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero_coleta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero_etiqueta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_obj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status_objeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prazo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data_solicitacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hora_solicitacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigo_erro" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="descricao_erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultadoSolicitacao", propOrder = {
    "tipo",
    "idCliente",
    "numeroColeta",
    "numeroEtiqueta",
    "idObj",
    "statusObjeto",
    "prazo",
    "dataSolicitacao",
    "horaSolicitacao",
    "codigoErro",
    "descricaoErro"
})
public class ResultadoSolicitacao {

    protected String tipo;
    @XmlElement(name = "id_cliente")
    protected String idCliente;
    @XmlElement(name = "numero_coleta")
    protected String numeroColeta;
    @XmlElement(name = "numero_etiqueta")
    protected String numeroEtiqueta;
    @XmlElement(name = "id_obj")
    protected String idObj;
    @XmlElement(name = "status_objeto")
    protected String statusObjeto;
    protected String prazo;
    @XmlElement(name = "data_solicitacao")
    protected String dataSolicitacao;
    @XmlElement(name = "hora_solicitacao")
    protected String horaSolicitacao;
    @XmlElement(name = "codigo_erro")
    protected long codigoErro;
    @XmlElement(name = "descricao_erro")
    protected String descricaoErro;

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the idCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * Sets the value of the idCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCliente(String value) {
        this.idCliente = value;
    }

    /**
     * Gets the value of the numeroColeta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroColeta() {
        return numeroColeta;
    }

    /**
     * Sets the value of the numeroColeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroColeta(String value) {
        this.numeroColeta = value;
    }

    /**
     * Gets the value of the numeroEtiqueta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroEtiqueta() {
        return numeroEtiqueta;
    }

    /**
     * Sets the value of the numeroEtiqueta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroEtiqueta(String value) {
        this.numeroEtiqueta = value;
    }

    /**
     * Gets the value of the idObj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdObj() {
        return idObj;
    }

    /**
     * Sets the value of the idObj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdObj(String value) {
        this.idObj = value;
    }

    /**
     * Gets the value of the statusObjeto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusObjeto() {
        return statusObjeto;
    }

    /**
     * Sets the value of the statusObjeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusObjeto(String value) {
        this.statusObjeto = value;
    }

    /**
     * Gets the value of the prazo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrazo() {
        return prazo;
    }

    /**
     * Sets the value of the prazo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrazo(String value) {
        this.prazo = value;
    }

    /**
     * Gets the value of the dataSolicitacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    /**
     * Sets the value of the dataSolicitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSolicitacao(String value) {
        this.dataSolicitacao = value;
    }

    /**
     * Gets the value of the horaSolicitacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraSolicitacao() {
        return horaSolicitacao;
    }

    /**
     * Sets the value of the horaSolicitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraSolicitacao(String value) {
        this.horaSolicitacao = value;
    }

    /**
     * Gets the value of the codigoErro property.
     * 
     */
    public long getCodigoErro() {
        return codigoErro;
    }

    /**
     * Sets the value of the codigoErro property.
     * 
     */
    public void setCodigoErro(long value) {
        this.codigoErro = value;
    }

    /**
     * Gets the value of the descricaoErro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoErro() {
        return descricaoErro;
    }

    /**
     * Sets the value of the descricaoErro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoErro(String value) {
        this.descricaoErro = value;
    }

}
