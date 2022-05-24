
package com.example.webservice.soap.gateways.externalinterfaces.providers.correios.dtos.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coletaReversa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coletaReversa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.logisticareversa.correios.com.br/}coleta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="servico_adicional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="obj_col" type="{http://service.logisticareversa.correios.com.br/}objeto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coletaReversa", propOrder = {
    "numero",
    "ag",
    "cartao",
    "servicoAdicional",
    "ar",
    "objCol"
})
public class ColetaReversa
    extends Coleta
{

    protected Integer numero;
    protected String ag;
    protected String cartao;
    @XmlElement(name = "servico_adicional")
    protected String servicoAdicional;
    protected Integer ar;
    @XmlElement(name = "obj_col", nillable = true)
    protected List<Objeto> objCol;

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumero(Integer value) {
        this.numero = value;
    }

    /**
     * Gets the value of the ag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAg() {
        return ag;
    }

    /**
     * Sets the value of the ag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAg(String value) {
        this.ag = value;
    }

    /**
     * Gets the value of the cartao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartao() {
        return cartao;
    }

    /**
     * Sets the value of the cartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartao(String value) {
        this.cartao = value;
    }

    /**
     * Gets the value of the servicoAdicional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicoAdicional() {
        return servicoAdicional;
    }

    /**
     * Sets the value of the servicoAdicional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicoAdicional(String value) {
        this.servicoAdicional = value;
    }

    /**
     * Gets the value of the ar property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAr() {
        return ar;
    }

    /**
     * Sets the value of the ar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAr(Integer value) {
        this.ar = value;
    }

    /**
     * Gets the value of the objCol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objCol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjCol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Objeto }
     * 
     * 
     */
    public List<Objeto> getObjCol() {
        if (objCol == null) {
            objCol = new ArrayList<Objeto>();
        }
        return this.objCol;
    }

}
