/**
 * Copyright © 2016
 */
package mx.gob.saludtlax.rh.persistencia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 		Eduardo Mex
 * @email		Lic.Eduardo_Mex@hotmail.com
 * @version     1.0
 * @since       25/07/2016 14:19:03
 */
@Entity
@Table(name = "subfuentes_financiamientos_temp")
public class SubFuenteFinanciamientoTempEntity {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_subfuente_financiamiento")
	private Integer idSubfuenteFinanciamiento;

	@Column(name = "id_fuente_financiamiento")
	private Integer idFuenteFinanciamiento;

	@Column(name = "id_fuente_financiamiento_opd")
	private Integer idFuenteFinanciamientoOpd;

	@Column(name = "id_base_36")
	private String idBase36;

	@Column(name = "descripcion")
	private String descripcion;

	@Override
	public String toString() {
		return "SubFuenteFinanciamientoEntity [id subfuente financiamiento=" + idSubfuenteFinanciamiento
				+ ", id fuente financiamiento=" + idFuenteFinanciamiento + ", id fuente financiamiento opd="
				+ idFuenteFinanciamientoOpd + ", id base 36=" + idBase36 + ", descripcion=" + descripcion + "]";
	}

	/**
	 * @return the idSubfuenteFinanciamiento
	 */
	public Integer getIdSubfuenteFinanciamiento() {
		return idSubfuenteFinanciamiento;
	}

	/**
	 * @param idSubfuenteFinanciamiento the idSubfuenteFinanciamiento to set
	 */
	public void setIdSubfuenteFinanciamiento(Integer idSubfuenteFinanciamiento) {
		this.idSubfuenteFinanciamiento = idSubfuenteFinanciamiento;
	}

	/**
	 * @return the idFuenteFinanciamiento
	 */
	public Integer getIdFuenteFinanciamiento() {
		return idFuenteFinanciamiento;
	}

	/**
	 * @param idFuenteFinanciamiento the idFuenteFinanciamiento to set
	 */
	public void setIdFuenteFinanciamiento(Integer idFuenteFinanciamiento) {
		this.idFuenteFinanciamiento = idFuenteFinanciamiento;
	}

	/**
	 * @return the idFuenteFinanciamientoOpd
	 */
	public Integer getIdFuenteFinanciamientoOpd() {
		return idFuenteFinanciamientoOpd;
	}

	/**
	 * @param idFuenteFinanciamientoOpd the idFuenteFinanciamientoOpd to set
	 */
	public void setIdFuenteFinanciamientoOpd(Integer idFuenteFinanciamientoOpd) {
		this.idFuenteFinanciamientoOpd = idFuenteFinanciamientoOpd;
	}

	/**
	 * @return the idBase36
	 */
	public String getIdBase36() {
		return idBase36;
	}

	/**
	 * @param idBase36 the idBase36 to set
	 */
	public void setIdBase36(String idBase36) {
		this.idBase36 = idBase36;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}