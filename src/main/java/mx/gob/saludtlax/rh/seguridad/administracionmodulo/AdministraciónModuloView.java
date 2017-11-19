/*
 *
 */

package mx.gob.saludtlax.rh.seguridad.administracionmodulo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.gob.saludtlax.rh.modulos.ModuloDTO;

/**
 * @author L.I. Eduardo B. C. Mex (lic.eduardo_mex@hotmail.com)
 *
 */
public class AdministraciónModuloView implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -4298049848018177738L;

    private List<ModuloDTO> listaModulo = new ArrayList<>();

    /**
     * @return the listaModulo
     */
    public List<ModuloDTO> getListaModulo() {
        return listaModulo;
    }

    /**
     * @param listaModulo
     *            the listaModulo to set
     */
    public void setListaModulo(List<ModuloDTO> listaModulo) {
        this.listaModulo = listaModulo;
    }

}
