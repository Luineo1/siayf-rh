package mx.gob.saludtlax.rh.configuracion.isr;

import java.math.BigDecimal;

public class TablaRetencionDTO {
	private Integer idTarifaRetencion;
	private Integer ejercicioFiscal;
	private BigDecimal limiteSuperior;
	private BigDecimal limiteInferior;
	private BigDecimal cuotaFija;
	private BigDecimal porcentajeAplicable;
	private Integer idTipoPeriodo;
	
//	<Getters & Setters>
	
	public Integer getIdTarifaRetencion() {
		return idTarifaRetencion;
	}
	public void setIdTarifaRetencion(Integer idTarifaRetencion) {
		this.idTarifaRetencion = idTarifaRetencion;
	}
	public Integer getEjercicioFiscal() {
		return ejercicioFiscal;
	}
	public void setEjercicioFiscal(Integer ejercicioFiscal) {
		this.ejercicioFiscal = ejercicioFiscal;
	}
	public BigDecimal getLimiteSuperior() {
		return limiteSuperior;
	}
	public void setLimiteSuperior(BigDecimal limiteSuperior) {
		this.limiteSuperior = limiteSuperior;
	}
	public BigDecimal getLimiteInferior() {
		return limiteInferior;
	}
	public void setLimiteInferior(BigDecimal limiteInferior) {
		this.limiteInferior = limiteInferior;
	}
	public BigDecimal getCuotaFija() {
		return cuotaFija;
	}
	public void setCuotaFija(BigDecimal cuotaFija) {
		this.cuotaFija = cuotaFija;
	}
	public BigDecimal getPorcentajeAplicable() {
		return porcentajeAplicable;
	}
	public void setPorcentajeAplicable(BigDecimal porcentajeAplicable) {
		this.porcentajeAplicable = porcentajeAplicable;
	}
	public Integer getIdTipoPeriodo() {
		return idTipoPeriodo;
	}
	public void setIdTipoPeriodo(Integer idTipoPeriodo) {
		this.idTipoPeriodo = idTipoPeriodo;
	}
	
}
