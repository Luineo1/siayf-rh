/*
 *
 */

package mx.gob.saludtlax.rh.expediente.aspirante;

import java.io.Serializable;

/**
 * @author L.I. Eduardo B. C. Mex (lic.eduardo_mex@hotmail.com)
 * @since 30/06/2016 15:07:56
 * @version 1.0
 * 
 */
public class ExpedienteAspiranteDTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -1557770379844162307L;

    private Integer idAspirante;

    private String numeroExpediente;

    /**
     * @return the idAspirante
     */
    public Integer getIdAspirante() {
        return idAspirante;
    }

    /**
     * @param idAspirante
     *            the idAspirante to set
     */
    public void setIdAspirante(Integer idAspirante) {
        this.idAspirante = idAspirante;
    }

    /**
     * @return the numeroExpediente
     */
    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    /**
     * @param numeroExpediente
     *            the numeroExpediente to set
     */
    public void setNumeroExpediente(String numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

}
