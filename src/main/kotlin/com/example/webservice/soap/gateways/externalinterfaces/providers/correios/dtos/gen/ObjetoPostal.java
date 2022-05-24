
package com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for objetoPostal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="objetoPostal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numero_etiqueta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="controle_objeto_cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ultimo_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descricao_status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data_ultima_atualizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hora_ultima_atualizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="peso_cubico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="peso_real" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valor_postagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objetoPostal", propOrder = {
    "numeroEtiqueta",
    "controleObjetoCliente",
    "ultimoStatus",
    "descricaoStatus",
    "dataUltimaAtualizacao",
    "horaUltimaAtualizacao",
    "pesoCubico",
    "pesoReal",
    "valorPostagem"
})
public class ObjetoPostal {

    @XmlElement(name = "numero_etiqueta")
    protected String numeroEtiqueta;
    @XmlElement(name = "controle_objeto_cliente")
    protected String controleObjetoCliente;
    @XmlElement(name = "ultimo_status")
    protected String ultimoStatus;
    @XmlElement(name = "descricao_status")
    protected String descricaoStatus;
    @XmlElement(name = "data_ultima_atualizacao")
    protected String dataUltimaAtualizacao;
    @XmlElement(name = "hora_ultima_atualizacao")
    protected String horaUltimaAtualizacao;
    @XmlElement(name = "peso_cubico")
    protected String pesoCubico;
    @XmlElement(name = "peso_real")
    protected String pesoReal;
    @XmlElement(name = "valor_postagem")
    protected String valorPostagem;

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
     * Gets the value of the controleObjetoCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControleObjetoCliente() {
        return controleObjetoCliente;
    }

    /**
     * Sets the value of the controleObjetoCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControleObjetoCliente(String value) {
        this.controleObjetoCliente = value;
    }

    /**
     * Gets the value of the ultimoStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltimoStatus() {
        return ultimoStatus;
    }

    /**
     * Sets the value of the ultimoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltimoStatus(String value) {
        this.ultimoStatus = value;
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
     * Gets the value of the dataUltimaAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    /**
     * Sets the value of the dataUltimaAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUltimaAtualizacao(String value) {
        this.dataUltimaAtualizacao = value;
    }

    /**
     * Gets the value of the horaUltimaAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraUltimaAtualizacao() {
        return horaUltimaAtualizacao;
    }

    /**
     * Sets the value of the horaUltimaAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraUltimaAtualizacao(String value) {
        this.horaUltimaAtualizacao = value;
    }

    /**
     * Gets the value of the pesoCubico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoCubico() {
        return pesoCubico;
    }

    /**
     * Sets the value of the pesoCubico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoCubico(String value) {
        this.pesoCubico = value;
    }

    /**
     * Gets the value of the pesoReal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPesoReal() {
        return pesoReal;
    }

    /**
     * Sets the value of the pesoReal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPesoReal(String value) {
        this.pesoReal = value;
    }

    /**
     * Gets the value of the valorPostagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorPostagem() {
        return valorPostagem;
    }

    /**
     * Sets the value of the valorPostagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorPostagem(String value) {
        this.valorPostagem = value;
    }

}
