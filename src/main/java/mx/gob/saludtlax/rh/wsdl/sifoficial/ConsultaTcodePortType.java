
package mx.gob.saludtlax.rh.wsdl.sifoficial;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "consulta_tcodePortType", targetNamespace = "http://tempuri.org/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConsultaTcodePortType {


    /**
     * 
     * @param idFuenteFinanciamiento
     * @param idTokenCrypted
     * @return
     *     returns org.tempuri.ConsultaFuentesFinanciamientoResponseArrFuentesFinanciamiento
     */
    @WebMethod(operationName = "consulta_fuentes_financiamiento", action = "consulta_fuentes_financiamiento")
    @WebResult(name = "arr_fuentes_financiamiento", partName = "arr_fuentes_financiamiento")
    public ConsultaFuentesFinanciamientoResponseArrFuentesFinanciamiento consultaFuentesFinanciamiento(
        @WebParam(name = "id_fuente_financiamiento", partName = "id_fuente_financiamiento")
        int idFuenteFinanciamiento,
        @WebParam(name = "id_token_crypted", partName = "id_token_crypted")
        String idTokenCrypted);

    /**
     * 
     * @param idFuenteFinanciamiento
     * @param idTokenCrypted
     * @return
     *     returns org.tempuri.ConsultaSubfuentesFinanciamientoResponseArrSubfuentesFinanciamiento
     */
    @WebMethod(operationName = "consulta_subfuentes_financiamiento", action = "consulta_subfuentes_financiamiento")
    @WebResult(name = "arr_subfuentes_financiamiento", partName = "arr_subfuentes_financiamiento")
    public ConsultaSubfuentesFinanciamientoResponseArrSubfuentesFinanciamiento consultaSubfuentesFinanciamiento(
        @WebParam(name = "id_token_crypted", partName = "id_token_crypted")
        String idTokenCrypted,
        @WebParam(name = "id_fuente_financiamiento", partName = "id_fuente_financiamiento")
        int idFuenteFinanciamiento);

    /**
     * 
     * @param idKeyBy5
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "firmar_token_by5", action = "firmar_token_by5")
    @WebResult(name = "id_key_by5", partName = "id_key_by5")
    public String firmarTokenBy5(
        @WebParam(name = "id_key_by5", partName = "id_key_by5")
        String idKeyBy5);

    /**
     * 
     * @param idDependencia
     * @param idTokenCrypted
     * @return
     *     returns org.tempuri.ConsultaDependenciasResponseArrDependencias
     */
    @WebMethod(operationName = "consulta_dependencias", action = "consulta_dependencias")
    @WebResult(name = "arr_dependencias", partName = "arr_dependencias")
    public ConsultaDependenciasResponseArrDependencias consultaDependencias(
        @WebParam(name = "id_dependencia", partName = "id_dependencia")
        int idDependencia,
        @WebParam(name = "id_token_crypted", mode = WebParam.Mode.INOUT, partName = "id_token_crypted")
        Holder<String> idTokenCrypted);

    /**
     * 
     * @param idTokenCrypted
     * @param idTipoRecurso
     * @return
     *     returns org.tempuri.ConsultaTiposRecursoResponseArrTiposRecurso
     */
    @WebMethod(operationName = "consulta_tipos_recurso", action = "consulta_tipos_recurso")
    @WebResult(name = "arr_tipos_recurso", partName = "arr_tipos_recurso")
    public ConsultaTiposRecursoResponseArrTiposRecurso consultaTiposRecurso(
        @WebParam(name = "id_tipo_recurso", partName = "id_tipo_recurso")
        int idTipoRecurso,
        @WebParam(name = "id_token_crypted", mode = WebParam.Mode.INOUT, partName = "id_token_crypted")
        Holder<String> idTokenCrypted);

    /**
     * 
     * @param idDependencia
     * @param idTokenCrypted
     * @return
     *     returns org.tempuri.ConsultaUnidadesResponsablesResponseArrUnidadesResponsables
     */
    @WebMethod(operationName = "consulta_unidades_responsables", action = "consulta_unidades_responsables")
    @WebResult(name = "arr_unidades_responsables", partName = "arr_unidades_responsables")
    public ConsultaUnidadesResponsablesResponseArrUnidadesResponsables consultaUnidadesResponsables(
        @WebParam(name = "id_dependencia", partName = "id_dependencia")
        int idDependencia,
        @WebParam(name = "id_token_crypted", mode = WebParam.Mode.INOUT, partName = "id_token_crypted")
        Holder<String> idTokenCrypted);

    /**
     * 
     * @param idTokenCrypted
     * @param idCapitulo
     * @return
     *     returns org.tempuri.ConsultaPartidasResponseArrPartidas
     */
    @WebMethod(operationName = "consulta_partidas", action = "consulta_partidas")
    @WebResult(name = "arr_partidas", partName = "arr_partidas")
    public ConsultaPartidasResponseArrPartidas consultaPartidas(
        @WebParam(name = "id_capitulo", partName = "id_capitulo")
        int idCapitulo,
        @WebParam(name = "id_token_crypted", mode = WebParam.Mode.INOUT, partName = "id_token_crypted")
        Holder<String> idTokenCrypted);

    /**
     * 
     * @param idDependencia
     * @param idTokenCrypted
     * @return
     *     returns org.tempuri.ConsultaProyectosResponseArrProyectos
     */
    @WebMethod(operationName = "consulta_proyectos", action = "consulta_proyectos")
    @WebResult(name = "arr_proyectos", partName = "arr_proyectos")
    public ConsultaProyectosResponseArrProyectos consultaProyectos(
        @WebParam(name = "id_dependencia", partName = "id_dependencia")
        int idDependencia,
        @WebParam(name = "id_token_crypted", mode = WebParam.Mode.INOUT, partName = "id_token_crypted")
        Holder<String> idTokenCrypted);

    /**
     * 
     * @param clavePresupuestal
     * @param idMes
     * @param idTokenCrypted
     * @return
     *     returns org.tempuri.ConsultaPresupuestoResponseArrPresupuesto
     */
    @WebMethod(operationName = "consulta_presupuesto", action = "consulta_presupuesto")
    @WebResult(name = "arr_presupuesto", partName = "arr_presupuesto")
    public ConsultaPresupuestoResponseArrPresupuesto consultaPresupuesto(
        @WebParam(name = "id_token_crypted", partName = "id_token_crypted")
        String idTokenCrypted,
        @WebParam(name = "clave_presupuestal", partName = "clave_presupuestal")
        String clavePresupuestal,
        @WebParam(name = "id_mes", partName = "id_mes")
        String idMes);

    /**
     * 
     * @param idTokenCrypted
     * @return
     *     returns org.tempuri.ConsultaBeneficiariosResponseArrBeneficiarios
     */
    @WebMethod(operationName = "consulta_beneficiarios", action = "consulta_beneficiarios")
    @WebResult(name = "arr_beneficiarios", partName = "arr_beneficiarios")
    public ConsultaBeneficiariosResponseArrBeneficiarios consultaBeneficiarios(
        @WebParam(name = "id_token_crypted", partName = "id_token_crypted")
        String idTokenCrypted);

    /**
     * 
     * @param importe
     * @param descripcionTramite
     * @param fechaDocumento
     * @param idTipoTramite
     * @param arrDetalleTramite
     * @param idTokenCrypted
     * @param numeroDocumentoTramite
     * @param idSubfuenteFinanciamiento
     * @param idTipoDocumentoTramite
     * @param idTipoRecurso
     * @param idBeneficiario
     * @return
     *     returns int
     */
    @WebMethod(operationName = "insercion_tramite", action = "insercion_tramite")
    @WebResult(name = "id_tramite", partName = "id_tramite")
    public int insercionTramite(
        @WebParam(name = "id_token_crypted", partName = "id_token_crypted")
        String idTokenCrypted,
        @WebParam(name = "id_tipo_tramite", partName = "id_tipo_tramite")
        int idTipoTramite,
        @WebParam(name = "id_tipo_documento_tramite", partName = "id_tipo_documento_tramite")
        int idTipoDocumentoTramite,
        @WebParam(name = "numero_documento_tramite", partName = "numero_documento_tramite")
        String numeroDocumentoTramite,
        @WebParam(name = "fecha_documento", partName = "fecha_documento")
        String fechaDocumento,
        @WebParam(name = "id_beneficiario", partName = "id_beneficiario")
        int idBeneficiario,
        @WebParam(name = "descripcion_tramite", partName = "descripcion_tramite")
        String descripcionTramite,
        @WebParam(name = "importe", partName = "importe")
        BigDecimal importe,
        @WebParam(name = "id_subfuente_financiamiento", partName = "id_subfuente_financiamiento")
        int idSubfuenteFinanciamiento,
        @WebParam(name = "id_tipo_recurso", partName = "id_tipo_recurso")
        int idTipoRecurso,
        @WebParam(name = "arr_detalle_tramite", partName = "arr_detalle_tramite")
        InsercionTramiteArrDetalleTramite arrDetalleTramite);

    
    
    /**
     * 
     * @param cuentaRetencion
     * @param idTokenCrypted
     * @return
     *     returns org.tempuri.ConsultaDetalleRetencionesResponseElementoRetencion
     */
    @WebMethod(operationName = "consulta_detalle_retenciones", action = "consulta_detalle_retenciones")
    @WebResult(name = "elemento_retencion", partName = "elemento_retencion")
    public ConsultaDetalleRetencionesResponseElementoRetencion consultaDetalleRetenciones(
        @WebParam(name = "id_token_crypted", partName = "id_token_crypted")
        String idTokenCrypted,
        @WebParam(name = "cuenta_retencion", partName = "cuenta_retencion")
        String cuentaRetencion);

    /**
     * 
     * @param cuentaRetencion
     * @param idTokenCrypted
     * @return
     *     returns org.tempuri.ConsultaConceptosPartidaNominaResponseElementoConversion
     */
    @WebMethod(operationName = "consulta_conceptos_partida_nomina", action = "consulta_deconceptos_partida_nomina")
    @WebResult(name = "elemento_conversion", partName = "elemento_conversion")
    public ConsultaConceptosPartidaNominaResponseElementoConversion consultaConceptosPartidaNomina(
        @WebParam(name = "id_token_crypted", partName = "id_token_crypted")
        String idTokenCrypted,
        @WebParam(name = "cuenta_retencion", partName = "cuenta_retencion")
        String cuentaRetencion);
}