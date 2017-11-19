/*
 *
 */

package mx.gob.saludtlax.rh.configuracion.especialidad;

import java.io.Serializable;

/**
 * @author L.I. Eduardo B. C. Mex (lic.eduardo_mex@hotmail.com)
 * 
 * @version 1.0
 * @since 12:33:43 09/08/2016
 */
public class EspecialidadDTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 6028023791915500164L;

    private Integer idEspecialidadAspiranteEmpleado;

    private Integer idEspecialidad;

    private String especialidad;

    /**
     *
     */
    public EspecialidadDTO() {
        super();
    }

    public EspecialidadDTO(Integer idEspecialidad, String especialidad) {

        this.idEspecialidad = idEspecialidad;
        this.especialidad = especialidad;

    }

    public EspecialidadDTO(Integer idEspecialidadAspiranteEmpleado,
            Integer idEspecialidad, String especialidad) {

        this.idEspecialidadAspiranteEmpleado = idEspecialidadAspiranteEmpleado;
        this.idEspecialidad = idEspecialidad;
        this.especialidad = especialidad;

    }

    /**
     * @return the idEspecialidad
     */
    public Integer getIdEspecialidad() {
        return idEspecialidad;
    }

    /**
     * @param idEspecialidad
     *            the idEspecialidad to set
     */
    public void setIdEspecialidad(Integer idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad
     *            the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the idEspecialidadAspiranteEmpleado
     */
    public Integer getIdEspecialidadAspiranteEmpleado() {
        return idEspecialidadAspiranteEmpleado;
    }

    /**
     * @param idEspecialidadAspiranteEmpleado
     *            the idEspecialidadAspiranteEmpleado to set
     */
    public void setIdEspecialidadAspiranteEmpleado(
            Integer idEspecialidadAspiranteEmpleado) {
        this.idEspecialidadAspiranteEmpleado = idEspecialidadAspiranteEmpleado;
    }

}
