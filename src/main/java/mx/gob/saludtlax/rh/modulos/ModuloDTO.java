package mx.gob.saludtlax.rh.modulos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.gob.saludtlax.rh.acciones.AccionDTO;

public class ModuloDTO implements Serializable {

	/**
		 *
		 */
	private static final long serialVersionUID = -5233436540607958367L;
	private Integer idModulo;
	private String nombre;
	private String url;
	private Boolean habilitado;
	private Integer idArea;
	private String nombreArea;
	private List<AccionDTO> acciones = new ArrayList<>();

	// *********** Getters and Setters ***********

	public Integer getIdModulo() {
		return idModulo;
	}

	public void setIdModulo(Integer idModulo) {
		this.idModulo = idModulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(Boolean habilitado) {
		this.habilitado = habilitado;
	}

	public Integer getIdArea() {
		return idArea;
	}

	public void setIdArea(Integer idArea) {
		this.idArea = idArea;
	}

	public String getNombreArea() {
		return nombreArea;
	}

	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}

	public List<AccionDTO> getAcciones() {
		return acciones;
	}

	public void setAcciones(List<AccionDTO> acciones) {
		this.acciones = acciones;
	}

}
