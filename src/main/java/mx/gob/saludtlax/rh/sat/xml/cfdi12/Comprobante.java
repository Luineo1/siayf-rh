
package mx.gob.saludtlax.rh.sat.xml.cfdi12;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "emisor", "receptor", "conceptos",
        "impuestos", "complemento", "addenda" })
@XmlRootElement(name = "Comprobante")
public class Comprobante {

    @XmlElement(name = "Emisor", required = true)
    protected Comprobante.Emisor emisor;
    @XmlElement(name = "Receptor", required = true)
    protected Comprobante.Receptor receptor;
    @XmlElement(name = "Conceptos", required = true)
    protected Comprobante.Conceptos conceptos;
    @XmlElement(name = "Impuestos", required = true)
    protected Comprobante.Impuestos impuestos;
    @XmlElement(name = "Complemento")
    protected Comprobante.Complemento complemento;
    @XmlElement(name = "Addenda")
    protected Comprobante.Addenda addenda;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "serie")
    protected String serie;
    @XmlAttribute(name = "folio")
    protected String folio;
    @XmlAttribute(name = "fecha", required = true)
    protected XMLGregorianCalendar fecha;
    @XmlAttribute(name = "sello", required = true)
    protected String sello;
    @XmlAttribute(name = "formaDePago", required = true)
    protected String formaDePago;
    @XmlAttribute(name = "noCertificado", required = true)
    protected String noCertificado;
    @XmlAttribute(name = "certificado", required = true)
    protected String certificado;
    @XmlAttribute(name = "condicionesDePago")
    protected String condicionesDePago;
    @XmlAttribute(name = "subTotal", required = true)
    protected BigDecimal subTotal;
    @XmlAttribute(name = "descuento")
    protected BigDecimal descuento;
    @XmlAttribute(name = "motivoDescuento")
    protected String motivoDescuento;
    @XmlAttribute(name = "TipoCambio")
    protected String tipoCambio;
    @XmlAttribute(name = "Moneda")
    protected String moneda;
    @XmlAttribute(name = "total", required = true)
    protected BigDecimal total;
    @XmlAttribute(name = "tipoDeComprobante", required = true)
    protected String tipoDeComprobante;
    @XmlAttribute(name = "metodoDePago", required = true)
    protected String metodoDePago;
    @XmlAttribute(name = "LugarExpedicion", required = true)
    protected String lugarExpedicion;
    @XmlAttribute(name = "NumCtaPago")
    protected String numCtaPago;
    @XmlAttribute(name = "FolioFiscalOrig")
    protected String folioFiscalOrig;
    @XmlAttribute(name = "SerieFolioFiscalOrig")
    protected String serieFolioFiscalOrig;
    @XmlAttribute(name = "FechaFolioFiscalOrig")
    protected XMLGregorianCalendar fechaFolioFiscalOrig;
    @XmlAttribute(name = "MontoFolioFiscalOrig")
    protected BigDecimal montoFolioFiscalOrig;

    /**
     * Obtiene el valor de la propiedad emisor.
     *
     * @return
     *         possible object is
     *         {@link Comprobante.Emisor }
     *
     */
    public Comprobante.Emisor getEmisor() {
        return emisor;
    }

    /**
     * Define el valor de la propiedad emisor.
     *
     * @param value
     *            allowed object is
     *            {@link Comprobante.Emisor }
     *
     */
    public void setEmisor(Comprobante.Emisor value) {
        emisor = value;
    }

    /**
     * Obtiene el valor de la propiedad receptor.
     *
     * @return
     *         possible object is
     *         {@link Comprobante.Receptor }
     *
     */
    public Comprobante.Receptor getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     *
     * @param value
     *            allowed object is
     *            {@link Comprobante.Receptor }
     *
     */
    public void setReceptor(Comprobante.Receptor value) {
        receptor = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptos.
     *
     * @return
     *         possible object is
     *         {@link Comprobante.Conceptos }
     *
     */
    public Comprobante.Conceptos getConceptos() {
        return conceptos;
    }

    /**
     * Define el valor de la propiedad conceptos.
     *
     * @param value
     *            allowed object is
     *            {@link Comprobante.Conceptos }
     *
     */
    public void setConceptos(Comprobante.Conceptos value) {
        conceptos = value;
    }

    /**
     * Obtiene el valor de la propiedad impuestos.
     *
     * @return
     *         possible object is
     *         {@link Comprobante.Impuestos }
     *
     */
    public Comprobante.Impuestos getImpuestos() {
        return impuestos;
    }

    /**
     * Define el valor de la propiedad impuestos.
     *
     * @param value
     *            allowed object is
     *            {@link Comprobante.Impuestos }
     *
     */
    public void setImpuestos(Comprobante.Impuestos value) {
        impuestos = value;
    }

    /**
     * Obtiene el valor de la propiedad complemento.
     *
     * @return
     *         possible object is
     *         {@link Comprobante.Complemento }
     *
     */
    public Comprobante.Complemento getComplemento() {
        return complemento;
    }

    /**
     * Define el valor de la propiedad complemento.
     *
     * @param value
     *            allowed object is
     *            {@link Comprobante.Complemento }
     *
     */
    public void setComplemento(Comprobante.Complemento value) {
        complemento = value;
    }

    /**
     * Obtiene el valor de la propiedad addenda.
     *
     * @return
     *         possible object is
     *         {@link Comprobante.Addenda }
     *
     */
    public Comprobante.Addenda getAddenda() {
        return addenda;
    }

    /**
     * Define el valor de la propiedad addenda.
     *
     * @param value
     *            allowed object is
     *            {@link Comprobante.Addenda }
     *
     */
    public void setAddenda(Comprobante.Addenda value) {
        addenda = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getVersion() {
        if (version == null) {
            return "3.2";
        } else {
            return version;
        }
    }

    /**
     * Define el valor de la propiedad version.
     *
     * @param value
     *            allowed object is
     *            {@link String }
     *
     */
    public void setVersion(String value) {
        version = value;
    }

    /**
     * Obtiene el valor de la propiedad serie.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     *
     * @param value
     *            allowed object is
     *            {@link String }
     *
     */
    public void setSerie(String value) {
        serie = value;
    }

    /**
     * Obtiene el valor de la propiedad folio.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Define el valor de la propiedad folio.
     *
     * @param value
     *            allowed object is
     *            {@link String }
     *
     */
    public void setFolio(String value) {
        folio = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     *
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFecha() {
        return fecha.normalize();
    }

    /**
     * Define el valor de la propiedad fecha.
     *
     * @param value
     *            allowed object is
     *            {@link XMLGregorianCalendar }
     *
     */
    public void setFecha(XMLGregorianCalendar value) {
        fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad sello.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getSello() {
        return sello;
    }

    /**
     * Define el valor de la propiedad sello.
     *
     * @param value
     *            allowed object is
     *            {@link String }
     *
     */
    public void setSello(String value) {
        sello = value;
    }

    /**
     * Obtiene el valor de la propiedad formaDePago.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getFormaDePago() {
        return formaDePago;
    }

    /**
     * Define el valor de la propiedad formaDePago.
     *
     * @param value
     *            allowed object is
     *            {@link String }
     *
     */
    public void setFormaDePago(String value) {
        formaDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad noCertificado.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getNoCertificado() {
        return noCertificado;
    }

    /**
     * Define el valor de la propiedad noCertificado.
     *
     * @param value
     *            allowed object is
     *            {@link String }
     *
     */
    public void setNoCertificado(String value) {
        noCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad certificado.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getCertificado() {
        return certificado;
    }

    /**
     * Define el valor de la propiedad certificado.
     *
     * @param value
     *            allowed object is
     *            {@link String }
     *
     */
    public void setCertificado(String value) {
        certificado = value;
    }

    /**
     * Obtiene el valor de la propiedad condicionesDePago.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getCondicionesDePago() {
        return condicionesDePago;
    }

    /**
     * Define el valor de la propiedad condicionesDePago.
     *
     * @param value
     *            allowed object is
     *            {@link String }
     *
     */
    public void setCondicionesDePago(String value) {
        condicionesDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad subTotal.
     *
     * @return
     *         possible object is
     *         {@link BigDecimal }
     *
     */
    public BigDecimal getSubTotal() {
        return subTotal;
    }

    /**
     * Define el valor de la propiedad subTotal.
     *
     * @param value
     *            allowed object is
     *            {@link BigDecimal }
     *
     */
    public void setSubTotal(BigDecimal value) {
        subTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad descuento.
     *
     * @return
     *         possible object is
     *         {@link BigDecimal }
     *
     */
    public BigDecimal getDescuento() {
        return descuento;
    }

    /**
     * Define el valor de la propiedad descuento.
     *
     * @param value
     *            allowed object is
     *            {@link BigDecimal }
     *
     */
    public void setDescuento(BigDecimal value) {
        descuento = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoDescuento.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getMotivoDescuento() {
        return motivoDescuento;
    }

    /**
     * Define el valor de la propiedad motivoDescuento.
     *
     * @param value
     *            allowed object is
     *            {@link String }
     *
     */
    public void setMotivoDescuento(String value) {
        motivoDescuento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambio.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Define el valor de la propiedad tipoCambio.
     *
     * @param value
     *            allowed object is
     *            {@link String }
     *
     */
    public void setTipoCambio(String value) {
        tipoCambio = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     *
     * @param value
     *            allowed object is
     *            {@link String }
     *
     */
    public void setMoneda(String value) {
        moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     *
     * @return
     *         possible object is
     *         {@link BigDecimal }
     *
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     *
     * @param value
     *            allowed object is
     *            {@link BigDecimal }
     *
     */
    public void setTotal(BigDecimal value) {
        total = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDeComprobante.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getTipoDeComprobante() {
        return tipoDeComprobante;
    }

    /**
     * Define el valor de la propiedad tipoDeComprobante.
     *
     * @param value
     *            allowed object is
     *            {@link String }
     *
     */
    public void setTipoDeComprobante(String value) {
        tipoDeComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad metodoDePago.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getMetodoDePago() {
        return metodoDePago;
    }

    /**
     * Define el valor de la propiedad metodoDePago.
     *
     * @param value
     *            allowed object is
     *            {@link String }
     *
     */
    public void setMetodoDePago(String value) {
        metodoDePago = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarExpedicion.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    /**
     * Define el valor de la propiedad lugarExpedicion.
     *
     * @param value
     *            allowed object is
     *            {@link String }
     *
     */
    public void setLugarExpedicion(String value) {
        lugarExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad numCtaPago.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getNumCtaPago() {
        return numCtaPago;
    }

    /**
     * Define el valor de la propiedad numCtaPago.
     *
     * @param value
     *            allowed object is
     *            {@link String }
     *
     */
    public void setNumCtaPago(String value) {
        numCtaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad folioFiscalOrig.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getFolioFiscalOrig() {
        return folioFiscalOrig;
    }

    /**
     * Define el valor de la propiedad folioFiscalOrig.
     *
     * @param value
     *            allowed object is
     *            {@link String }
     *
     */
    public void setFolioFiscalOrig(String value) {
        folioFiscalOrig = value;
    }

    /**
     * Obtiene el valor de la propiedad serieFolioFiscalOrig.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getSerieFolioFiscalOrig() {
        return serieFolioFiscalOrig;
    }

    /**
     * Define el valor de la propiedad serieFolioFiscalOrig.
     *
     * @param value
     *            allowed object is
     *            {@link String }
     *
     */
    public void setSerieFolioFiscalOrig(String value) {
        serieFolioFiscalOrig = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFolioFiscalOrig.
     *
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaFolioFiscalOrig() {
        return fechaFolioFiscalOrig;
    }

    /**
     * Define el valor de la propiedad fechaFolioFiscalOrig.
     *
     * @param value
     *            allowed object is
     *            {@link XMLGregorianCalendar }
     *
     */
    public void setFechaFolioFiscalOrig(XMLGregorianCalendar value) {
        fechaFolioFiscalOrig = value;
    }

    /**
     * Obtiene el valor de la propiedad montoFolioFiscalOrig.
     *
     * @return
     *         possible object is
     *         {@link BigDecimal }
     *
     */
    public BigDecimal getMontoFolioFiscalOrig() {
        return montoFolioFiscalOrig;
    }

    /**
     * Define el valor de la propiedad montoFolioFiscalOrig.
     *
     * @param value
     *            allowed object is
     *            {@link BigDecimal }
     *
     */
    public void setMontoFolioFiscalOrig(BigDecimal value) {
        montoFolioFiscalOrig = value;
    }

    /**
     * <p>
     * Clase Java para anonymous complex type.
     *
     * <p>
     * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "any" })
    public static class Addenda {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         *
         * <pre>
         * getAny().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         *
         *
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<>();
            }
            return any;
        }

    }

    /**
     * <p>
     * Clase Java para anonymous complex type.
     *
     * <p>
     * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "any" })
    public static class Complemento {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         *
         * <pre>
         * getAny().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         *
         *
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<>();
            }
            return any;
        }

    }

    /**
     * <p>
     * Clase Java para anonymous complex type.
     *
     * <p>
     * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Concepto" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice minOccurs="0">
     *                   &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/cfd/3}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="CuentaPredial" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="numero" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;whiteSpace value="collapse"/>
     *                                 &lt;minLength value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ComplementoConcepto" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;any maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Parte" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/cfd/3}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="cantidad" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                 &lt;whiteSpace value="collapse"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="unidad">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;whiteSpace value="collapse"/>
     *                                 &lt;minLength value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="noIdentificacion">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;whiteSpace value="collapse"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="descripcion" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;whiteSpace value="collapse"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="valorUnitario" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
     *                           &lt;attribute name="importe" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/choice>
     *                 &lt;attribute name="cantidad" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       &lt;whiteSpace value="collapse"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="unidad" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;whiteSpace value="collapse"/>
     *                       &lt;minLength value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="noIdentificacion">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;whiteSpace value="collapse"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="descripcion" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;whiteSpace value="collapse"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="valorUnitario" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
     *                 &lt;attribute name="importe" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "concepto" })
    public static class Conceptos {

        @XmlElement(name = "Concepto", required = true)
        protected List<Comprobante.Conceptos.Concepto> concepto;

        /**
         * Gets the value of the concepto property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the concepto property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         *
         * <pre>
         * getConcepto().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Comprobante.Conceptos.Concepto }
         *
         *
         */
        public List<Comprobante.Conceptos.Concepto> getConcepto() {
            if (concepto == null) {
                concepto = new ArrayList<>();
            }
            return concepto;
        }

        /**
         * <p>
         * Clase Java para anonymous complex type.
         *
         * <p>
         * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;choice minOccurs="0">
         *         &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/cfd/3}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="CuentaPredial" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="numero" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;whiteSpace value="collapse"/>
         *                       &lt;minLength value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ComplementoConcepto" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;any maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Parte" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/cfd/3}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="cantidad" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                       &lt;whiteSpace value="collapse"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="unidad">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;whiteSpace value="collapse"/>
         *                       &lt;minLength value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="noIdentificacion">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;whiteSpace value="collapse"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="descripcion" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;whiteSpace value="collapse"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="valorUnitario" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
         *                 &lt;attribute name="importe" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/choice>
         *       &lt;attribute name="cantidad" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             &lt;whiteSpace value="collapse"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="unidad" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;whiteSpace value="collapse"/>
         *             &lt;minLength value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="noIdentificacion">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;whiteSpace value="collapse"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="descripcion" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;whiteSpace value="collapse"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="valorUnitario" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
         *       &lt;attribute name="importe" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "informacionAduanera",
                "cuentaPredial", "complementoConcepto", "parte" })
        public static class Concepto {

            @XmlElement(name = "InformacionAduanera")
            protected List<TInformacionAduanera> informacionAduanera;
            @XmlElement(name = "CuentaPredial")
            protected Comprobante.Conceptos.Concepto.CuentaPredial cuentaPredial;
            @XmlElement(name = "ComplementoConcepto")
            protected Comprobante.Conceptos.Concepto.ComplementoConcepto complementoConcepto;
            @XmlElement(name = "Parte")
            protected List<Comprobante.Conceptos.Concepto.Parte> parte;
            @XmlAttribute(name = "cantidad", required = true)
            protected BigDecimal cantidad;
            @XmlAttribute(name = "unidad", required = true)
            protected String unidad;
            @XmlAttribute(name = "noIdentificacion")
            protected String noIdentificacion;
            @XmlAttribute(name = "descripcion", required = true)
            protected String descripcion;
            @XmlAttribute(name = "valorUnitario", required = true)
            protected BigDecimal valorUnitario;
            @XmlAttribute(name = "importe", required = true)
            protected BigDecimal importe;

            /**
             * Gets the value of the informacionAduanera property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the informacionAduanera property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             *
             * <pre>
             * getInformacionAduanera().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TInformacionAduanera }
             *
             *
             */
            public List<TInformacionAduanera> getInformacionAduanera() {
                if (informacionAduanera == null) {
                    informacionAduanera = new ArrayList<>();
                }
                return informacionAduanera;
            }

            /**
             * Obtiene el valor de la propiedad cuentaPredial.
             *
             * @return
             *         possible object is
             *         {@link Comprobante.Conceptos.Concepto.CuentaPredial }
             *
             */
            public Comprobante.Conceptos.Concepto.CuentaPredial getCuentaPredial() {
                return cuentaPredial;
            }

            /**
             * Define el valor de la propiedad cuentaPredial.
             *
             * @param value
             *            allowed object is
             *            {@link Comprobante.Conceptos.Concepto.CuentaPredial }
             *
             */
            public void setCuentaPredial(
                    Comprobante.Conceptos.Concepto.CuentaPredial value) {
                cuentaPredial = value;
            }

            /**
             * Obtiene el valor de la propiedad complementoConcepto.
             *
             * @return
             *         possible object is
             *         {@link Comprobante.Conceptos.Concepto.ComplementoConcepto }
             *
             */
            public Comprobante.Conceptos.Concepto.ComplementoConcepto getComplementoConcepto() {
                return complementoConcepto;
            }

            /**
             * Define el valor de la propiedad complementoConcepto.
             *
             * @param value
             *            allowed object is
             *            {@link Comprobante.Conceptos.Concepto.ComplementoConcepto }
             *
             */
            public void setComplementoConcepto(
                    Comprobante.Conceptos.Concepto.ComplementoConcepto value) {
                complementoConcepto = value;
            }

            /**
             * Gets the value of the parte property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the parte property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             *
             * <pre>
             * getParte().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Comprobante.Conceptos.Concepto.Parte }
             *
             *
             */
            public List<Comprobante.Conceptos.Concepto.Parte> getParte() {
                if (parte == null) {
                    parte = new ArrayList<>();
                }
                return parte;
            }

            /**
             * Obtiene el valor de la propiedad cantidad.
             *
             * @return
             *         possible object is
             *         {@link BigDecimal }
             *
             */
            public BigDecimal getCantidad() {
                return cantidad;
            }

            /**
             * Define el valor de la propiedad cantidad.
             *
             * @param value
             *            allowed object is
             *            {@link BigDecimal }
             *
             */
            public void setCantidad(BigDecimal value) {
                cantidad = value;
            }

            /**
             * Obtiene el valor de la propiedad unidad.
             *
             * @return
             *         possible object is
             *         {@link String }
             *
             */
            public String getUnidad() {
                return unidad;
            }

            /**
             * Define el valor de la propiedad unidad.
             *
             * @param value
             *            allowed object is
             *            {@link String }
             *
             */
            public void setUnidad(String value) {
                unidad = value;
            }

            /**
             * Obtiene el valor de la propiedad noIdentificacion.
             *
             * @return
             *         possible object is
             *         {@link String }
             *
             */
            public String getNoIdentificacion() {
                return noIdentificacion;
            }

            /**
             * Define el valor de la propiedad noIdentificacion.
             *
             * @param value
             *            allowed object is
             *            {@link String }
             *
             */
            public void setNoIdentificacion(String value) {
                noIdentificacion = value;
            }

            /**
             * Obtiene el valor de la propiedad descripcion.
             *
             * @return
             *         possible object is
             *         {@link String }
             *
             */
            public String getDescripcion() {
                return descripcion;
            }

            /**
             * Define el valor de la propiedad descripcion.
             *
             * @param value
             *            allowed object is
             *            {@link String }
             *
             */
            public void setDescripcion(String value) {
                descripcion = value;
            }

            /**
             * Obtiene el valor de la propiedad valorUnitario.
             *
             * @return
             *         possible object is
             *         {@link BigDecimal }
             *
             */
            public BigDecimal getValorUnitario() {
                return valorUnitario;
            }

            /**
             * Define el valor de la propiedad valorUnitario.
             *
             * @param value
             *            allowed object is
             *            {@link BigDecimal }
             *
             */
            public void setValorUnitario(BigDecimal value) {
                valorUnitario = value;
            }

            /**
             * Obtiene el valor de la propiedad importe.
             *
             * @return
             *         possible object is
             *         {@link BigDecimal }
             *
             */
            public BigDecimal getImporte() {
                return importe;
            }

            /**
             * Define el valor de la propiedad importe.
             *
             * @param value
             *            allowed object is
             *            {@link BigDecimal }
             *
             */
            public void setImporte(BigDecimal value) {
                importe = value;
            }

            /**
             * <p>
             * Clase Java para anonymous complex type.
             *
             * <p>
             * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;any maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = { "any" })
            public static class ComplementoConcepto {

                @XmlAnyElement(lax = true)
                protected List<Object> any;

                /**
                 * Gets the value of the any property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the any property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 *
                 * <pre>
                 * getAny().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 *
                 *
                 */
                public List<Object> getAny() {
                    if (any == null) {
                        any = new ArrayList<>();
                    }
                    return any;
                }

            }

            /**
             * <p>
             * Clase Java para anonymous complex type.
             *
             * <p>
             * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="numero" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;whiteSpace value="collapse"/>
             *             &lt;minLength value="1"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CuentaPredial {

                @XmlAttribute(name = "numero", required = true)
                protected String numero;

                /**
                 * Obtiene el valor de la propiedad numero.
                 *
                 * @return
                 *         possible object is
                 *         {@link String }
                 *
                 */
                public String getNumero() {
                    return numero;
                }

                /**
                 * Define el valor de la propiedad numero.
                 *
                 * @param value
                 *            allowed object is
                 *            {@link String }
                 *
                 */
                public void setNumero(String value) {
                    numero = value;
                }

            }

            /**
             * <p>
             * Clase Java para anonymous complex type.
             *
             * <p>
             * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="InformacionAduanera" type="{http://www.sat.gob.mx/cfd/3}t_InformacionAduanera" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="cantidad" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *             &lt;whiteSpace value="collapse"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="unidad">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;whiteSpace value="collapse"/>
             *             &lt;minLength value="1"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="noIdentificacion">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;whiteSpace value="collapse"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="descripcion" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;whiteSpace value="collapse"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="valorUnitario" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
             *       &lt;attribute name="importe" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = { "informacionAduanera" })
            public static class Parte {

                @XmlElement(name = "InformacionAduanera")
                protected List<TInformacionAduanera> informacionAduanera;
                @XmlAttribute(name = "cantidad", required = true)
                protected BigDecimal cantidad;
                @XmlAttribute(name = "unidad")
                protected String unidad;
                @XmlAttribute(name = "noIdentificacion")
                protected String noIdentificacion;
                @XmlAttribute(name = "descripcion", required = true)
                protected String descripcion;
                @XmlAttribute(name = "valorUnitario")
                protected BigDecimal valorUnitario;
                @XmlAttribute(name = "importe")
                protected BigDecimal importe;

                /**
                 * Gets the value of the informacionAduanera property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the informacionAduanera property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 *
                 * <pre>
                 * getInformacionAduanera().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TInformacionAduanera }
                 *
                 *
                 */
                public List<TInformacionAduanera> getInformacionAduanera() {
                    if (informacionAduanera == null) {
                        informacionAduanera = new ArrayList<>();
                    }
                    return informacionAduanera;
                }

                /**
                 * Obtiene el valor de la propiedad cantidad.
                 *
                 * @return
                 *         possible object is
                 *         {@link BigDecimal }
                 *
                 */
                public BigDecimal getCantidad() {
                    return cantidad;
                }

                /**
                 * Define el valor de la propiedad cantidad.
                 *
                 * @param value
                 *            allowed object is
                 *            {@link BigDecimal }
                 *
                 */
                public void setCantidad(BigDecimal value) {
                    cantidad = value;
                }

                /**
                 * Obtiene el valor de la propiedad unidad.
                 *
                 * @return
                 *         possible object is
                 *         {@link String }
                 *
                 */
                public String getUnidad() {
                    return unidad;
                }

                /**
                 * Define el valor de la propiedad unidad.
                 *
                 * @param value
                 *            allowed object is
                 *            {@link String }
                 *
                 */
                public void setUnidad(String value) {
                    unidad = value;
                }

                /**
                 * Obtiene el valor de la propiedad noIdentificacion.
                 *
                 * @return
                 *         possible object is
                 *         {@link String }
                 *
                 */
                public String getNoIdentificacion() {
                    return noIdentificacion;
                }

                /**
                 * Define el valor de la propiedad noIdentificacion.
                 *
                 * @param value
                 *            allowed object is
                 *            {@link String }
                 *
                 */
                public void setNoIdentificacion(String value) {
                    noIdentificacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad descripcion.
                 *
                 * @return
                 *         possible object is
                 *         {@link String }
                 *
                 */
                public String getDescripcion() {
                    return descripcion;
                }

                /**
                 * Define el valor de la propiedad descripcion.
                 *
                 * @param value
                 *            allowed object is
                 *            {@link String }
                 *
                 */
                public void setDescripcion(String value) {
                    descripcion = value;
                }

                /**
                 * Obtiene el valor de la propiedad valorUnitario.
                 *
                 * @return
                 *         possible object is
                 *         {@link BigDecimal }
                 *
                 */
                public BigDecimal getValorUnitario() {
                    return valorUnitario;
                }

                /**
                 * Define el valor de la propiedad valorUnitario.
                 *
                 * @param value
                 *            allowed object is
                 *            {@link BigDecimal }
                 *
                 */
                public void setValorUnitario(BigDecimal value) {
                    valorUnitario = value;
                }

                /**
                 * Obtiene el valor de la propiedad importe.
                 *
                 * @return
                 *         possible object is
                 *         {@link BigDecimal }
                 *
                 */
                public BigDecimal getImporte() {
                    return importe;
                }

                /**
                 * Define el valor de la propiedad importe.
                 *
                 * @param value
                 *            allowed object is
                 *            {@link BigDecimal }
                 *
                 */
                public void setImporte(BigDecimal value) {
                    importe = value;
                }

            }

        }

    }

    /**
     * <p>
     * Clase Java para anonymous complex type.
     *
     * <p>
     * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DomicilioFiscal" type="{http://www.sat.gob.mx/cfd/3}t_UbicacionFiscal" minOccurs="0"/>
     *         &lt;element name="ExpedidoEn" type="{http://www.sat.gob.mx/cfd/3}t_Ubicacion" minOccurs="0"/>
     *         &lt;sequence>
     *           &lt;element name="RegimenFiscal" maxOccurs="unbounded">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="Regimen" use="required">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;whiteSpace value="collapse"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/sequence>
     *       &lt;/sequence>
     *       &lt;attribute name="rfc" use="required" type="{http://www.sat.gob.mx/cfd/3}t_RFC" />
     *       &lt;attribute name="nombre">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;whiteSpace value="collapse"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "domicilioFiscal", "expedidoEn",
            "regimenFiscal" })
    public static class Emisor {

        @XmlElement(name = "DomicilioFiscal")
        protected TUbicacionFiscal domicilioFiscal;
        @XmlElement(name = "ExpedidoEn")
        protected TUbicacion expedidoEn;
        @XmlElement(name = "RegimenFiscal", required = true)
        protected List<Comprobante.Emisor.RegimenFiscal> regimenFiscal;
        @XmlAttribute(name = "rfc", required = true)
        protected String rfc;
        @XmlAttribute(name = "nombre")
        protected String nombre;

        /**
         * Obtiene el valor de la propiedad domicilioFiscal.
         *
         * @return
         *         possible object is
         *         {@link TUbicacionFiscal }
         *
         */
        public TUbicacionFiscal getDomicilioFiscal() {
            return domicilioFiscal;
        }

        /**
         * Define el valor de la propiedad domicilioFiscal.
         *
         * @param value
         *            allowed object is
         *            {@link TUbicacionFiscal }
         *
         */
        public void setDomicilioFiscal(TUbicacionFiscal value) {
            domicilioFiscal = value;
        }

        /**
         * Obtiene el valor de la propiedad expedidoEn.
         *
         * @return
         *         possible object is
         *         {@link TUbicacion }
         *
         */
        public TUbicacion getExpedidoEn() {
            return expedidoEn;
        }

        /**
         * Define el valor de la propiedad expedidoEn.
         *
         * @param value
         *            allowed object is
         *            {@link TUbicacion }
         *
         */
        public void setExpedidoEn(TUbicacion value) {
            expedidoEn = value;
        }

        /**
         * Gets the value of the regimenFiscal property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the regimenFiscal property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         *
         * <pre>
         * getRegimenFiscal().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Comprobante.Emisor.RegimenFiscal }
         *
         *
         */
        public List<Comprobante.Emisor.RegimenFiscal> getRegimenFiscal() {
            if (regimenFiscal == null) {
                regimenFiscal = new ArrayList<>();
            }
            return regimenFiscal;
        }

        /**
         * Obtiene el valor de la propiedad rfc.
         *
         * @return
         *         possible object is
         *         {@link String }
         *
         */
        public String getRfc() {
            return rfc;
        }

        /**
         * Define el valor de la propiedad rfc.
         *
         * @param value
         *            allowed object is
         *            {@link String }
         *
         */
        public void setRfc(String value) {
            rfc = value;
        }

        /**
         * Obtiene el valor de la propiedad nombre.
         *
         * @return
         *         possible object is
         *         {@link String }
         *
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         *
         * @param value
         *            allowed object is
         *            {@link String }
         *
         */
        public void setNombre(String value) {
            nombre = value;
        }

        /**
         * <p>
         * Clase Java para anonymous complex type.
         *
         * <p>
         * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Regimen" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;whiteSpace value="collapse"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RegimenFiscal {

            @XmlAttribute(name = "Regimen", required = true)
            protected String regimen;

            /**
             * Obtiene el valor de la propiedad regimen.
             *
             * @return
             *         possible object is
             *         {@link String }
             *
             */
            public String getRegimen() {
                return regimen;
            }

            /**
             * Define el valor de la propiedad regimen.
             *
             * @param value
             *            allowed object is
             *            {@link String }
             *
             */
            public void setRegimen(String value) {
                regimen = value;
            }

        }

    }

    /**
     * <p>
     * Clase Java para anonymous complex type.
     *
     * <p>
     * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Retenciones" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Retencion" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="impuesto" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;whiteSpace value="collapse"/>
     *                                 &lt;enumeration value="ISR"/>
     *                                 &lt;enumeration value="IVA"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="importe" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Traslados" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Traslado" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="impuesto" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;whiteSpace value="collapse"/>
     *                                 &lt;enumeration value="IVA"/>
     *                                 &lt;enumeration value="IEPS"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="tasa" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
     *                           &lt;attribute name="importe" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="totalImpuestosRetenidos" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
     *       &lt;attribute name="totalImpuestosTrasladados" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "retenciones", "traslados" })
    public static class Impuestos {

        @XmlElement(name = "Retenciones")
        protected Comprobante.Impuestos.Retenciones retenciones;
        @XmlElement(name = "Traslados")
        protected Comprobante.Impuestos.Traslados traslados;
        @XmlAttribute(name = "totalImpuestosRetenidos")
        protected BigDecimal totalImpuestosRetenidos;
        @XmlAttribute(name = "totalImpuestosTrasladados")
        protected BigDecimal totalImpuestosTrasladados;

        /**
         * Obtiene el valor de la propiedad retenciones.
         *
         * @return
         *         possible object is
         *         {@link Comprobante.Impuestos.Retenciones }
         *
         */
        public Comprobante.Impuestos.Retenciones getRetenciones() {
            return retenciones;
        }

        /**
         * Define el valor de la propiedad retenciones.
         *
         * @param value
         *            allowed object is
         *            {@link Comprobante.Impuestos.Retenciones }
         *
         */
        public void setRetenciones(Comprobante.Impuestos.Retenciones value) {
            retenciones = value;
        }

        /**
         * Obtiene el valor de la propiedad traslados.
         *
         * @return
         *         possible object is
         *         {@link Comprobante.Impuestos.Traslados }
         *
         */
        public Comprobante.Impuestos.Traslados getTraslados() {
            return traslados;
        }

        /**
         * Define el valor de la propiedad traslados.
         *
         * @param value
         *            allowed object is
         *            {@link Comprobante.Impuestos.Traslados }
         *
         */
        public void setTraslados(Comprobante.Impuestos.Traslados value) {
            traslados = value;
        }

        /**
         * Obtiene el valor de la propiedad totalImpuestosRetenidos.
         *
         * @return
         *         possible object is
         *         {@link BigDecimal }
         *
         */
        public BigDecimal getTotalImpuestosRetenidos() {
            return totalImpuestosRetenidos;
        }

        /**
         * Define el valor de la propiedad totalImpuestosRetenidos.
         *
         * @param value
         *            allowed object is
         *            {@link BigDecimal }
         *
         */
        public void setTotalImpuestosRetenidos(BigDecimal value) {
            totalImpuestosRetenidos = value;
        }

        /**
         * Obtiene el valor de la propiedad totalImpuestosTrasladados.
         *
         * @return
         *         possible object is
         *         {@link BigDecimal }
         *
         */
        public BigDecimal getTotalImpuestosTrasladados() {
            return totalImpuestosTrasladados;
        }

        /**
         * Define el valor de la propiedad totalImpuestosTrasladados.
         *
         * @param value
         *            allowed object is
         *            {@link BigDecimal }
         *
         */
        public void setTotalImpuestosTrasladados(BigDecimal value) {
            totalImpuestosTrasladados = value;
        }

        /**
         * <p>
         * Clase Java para anonymous complex type.
         *
         * <p>
         * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Retencion" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="impuesto" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;whiteSpace value="collapse"/>
         *                       &lt;enumeration value="ISR"/>
         *                       &lt;enumeration value="IVA"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="importe" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "retencion" })
        public static class Retenciones {

            @XmlElement(name = "Retencion", required = true)
            protected List<Comprobante.Impuestos.Retenciones.Retencion> retencion;

            /**
             * Gets the value of the retencion property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the retencion property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             *
             * <pre>
             * getRetencion().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Comprobante.Impuestos.Retenciones.Retencion }
             *
             *
             */
            public List<Comprobante.Impuestos.Retenciones.Retencion> getRetencion() {
                if (retencion == null) {
                    retencion = new ArrayList<>();
                }
                return retencion;
            }

            /**
             * <p>
             * Clase Java para anonymous complex type.
             *
             * <p>
             * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="impuesto" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;whiteSpace value="collapse"/>
             *             &lt;enumeration value="ISR"/>
             *             &lt;enumeration value="IVA"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="importe" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Retencion {

                @XmlAttribute(name = "impuesto", required = true)
                protected String impuesto;
                @XmlAttribute(name = "importe", required = true)
                protected BigDecimal importe;

                /**
                 * Obtiene el valor de la propiedad impuesto.
                 *
                 * @return
                 *         possible object is
                 *         {@link String }
                 *
                 */
                public String getImpuesto() {
                    return impuesto;
                }

                /**
                 * Define el valor de la propiedad impuesto.
                 *
                 * @param value
                 *            allowed object is
                 *            {@link String }
                 *
                 */
                public void setImpuesto(String value) {
                    impuesto = value;
                }

                /**
                 * Obtiene el valor de la propiedad importe.
                 *
                 * @return
                 *         possible object is
                 *         {@link BigDecimal }
                 *
                 */
                public BigDecimal getImporte() {
                    return importe;
                }

                /**
                 * Define el valor de la propiedad importe.
                 *
                 * @param value
                 *            allowed object is
                 *            {@link BigDecimal }
                 *
                 */
                public void setImporte(BigDecimal value) {
                    importe = value;
                }

            }

        }

        /**
         * <p>
         * Clase Java para anonymous complex type.
         *
         * <p>
         * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Traslado" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="impuesto" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;whiteSpace value="collapse"/>
         *                       &lt;enumeration value="IVA"/>
         *                       &lt;enumeration value="IEPS"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="tasa" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
         *                 &lt;attribute name="importe" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "traslado" })
        public static class Traslados {

            @XmlElement(name = "Traslado", required = true)
            protected List<Comprobante.Impuestos.Traslados.Traslado> traslado;

            /**
             * Gets the value of the traslado property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the traslado property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             *
             * <pre>
             * getTraslado().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Comprobante.Impuestos.Traslados.Traslado }
             *
             *
             */
            public List<Comprobante.Impuestos.Traslados.Traslado> getTraslado() {
                if (traslado == null) {
                    traslado = new ArrayList<>();
                }
                return traslado;
            }

            /**
             * <p>
             * Clase Java para anonymous complex type.
             *
             * <p>
             * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="impuesto" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;whiteSpace value="collapse"/>
             *             &lt;enumeration value="IVA"/>
             *             &lt;enumeration value="IEPS"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="tasa" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
             *       &lt;attribute name="importe" use="required" type="{http://www.sat.gob.mx/cfd/3}t_Importe" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Traslado {

                @XmlAttribute(name = "impuesto", required = true)
                protected String impuesto;
                @XmlAttribute(name = "tasa", required = true)
                protected BigDecimal tasa;
                @XmlAttribute(name = "importe", required = true)
                protected BigDecimal importe;

                /**
                 * Obtiene el valor de la propiedad impuesto.
                 *
                 * @return
                 *         possible object is
                 *         {@link String }
                 *
                 */
                public String getImpuesto() {
                    return impuesto;
                }

                /**
                 * Define el valor de la propiedad impuesto.
                 *
                 * @param value
                 *            allowed object is
                 *            {@link String }
                 *
                 */
                public void setImpuesto(String value) {
                    impuesto = value;
                }

                /**
                 * Obtiene el valor de la propiedad tasa.
                 *
                 * @return
                 *         possible object is
                 *         {@link BigDecimal }
                 *
                 */
                public BigDecimal getTasa() {
                    return tasa;
                }

                /**
                 * Define el valor de la propiedad tasa.
                 *
                 * @param value
                 *            allowed object is
                 *            {@link BigDecimal }
                 *
                 */
                public void setTasa(BigDecimal value) {
                    tasa = value;
                }

                /**
                 * Obtiene el valor de la propiedad importe.
                 *
                 * @return
                 *         possible object is
                 *         {@link BigDecimal }
                 *
                 */
                public BigDecimal getImporte() {
                    return importe;
                }

                /**
                 * Define el valor de la propiedad importe.
                 *
                 * @param value
                 *            allowed object is
                 *            {@link BigDecimal }
                 *
                 */
                public void setImporte(BigDecimal value) {
                    importe = value;
                }

            }

        }

    }

    /**
     * <p>
     * Clase Java para anonymous complex type.
     *
     * <p>
     * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Domicilio" type="{http://www.sat.gob.mx/cfd/3}t_Ubicacion" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="rfc" use="required" type="{http://www.sat.gob.mx/cfd/3}t_RFC" />
     *       &lt;attribute name="nombre">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;whiteSpace value="collapse"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "domicilio" })
    public static class Receptor {

        @XmlElement(name = "Domicilio")
        protected TUbicacion domicilio;
        @XmlAttribute(name = "rfc", required = true)
        protected String rfc;
        @XmlAttribute(name = "nombre")
        protected String nombre;

        /**
         * Obtiene el valor de la propiedad domicilio.
         *
         * @return
         *         possible object is
         *         {@link TUbicacion }
         *
         */
        public TUbicacion getDomicilio() {
            return domicilio;
        }

        /**
         * Define el valor de la propiedad domicilio.
         *
         * @param value
         *            allowed object is
         *            {@link TUbicacion }
         *
         */
        public void setDomicilio(TUbicacion value) {
            domicilio = value;
        }

        /**
         * Obtiene el valor de la propiedad rfc.
         *
         * @return
         *         possible object is
         *         {@link String }
         *
         */
        public String getRfc() {
            return rfc;
        }

        /**
         * Define el valor de la propiedad rfc.
         *
         * @param value
         *            allowed object is
         *            {@link String }
         *
         */
        public void setRfc(String value) {
            rfc = value;
        }

        /**
         * Obtiene el valor de la propiedad nombre.
         *
         * @return
         *         possible object is
         *         {@link String }
         *
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         *
         * @param value
         *            allowed object is
         *            {@link String }
         *
         */
        public void setNombre(String value) {
            nombre = value;
        }

    }

}
