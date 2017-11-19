/*
 *
 */

package mx.gob.saludtlax.rh.persistencia;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.saludtlax.rh.util.Configuracion;

/**
 * @author L.I. Eduardo B. C. Mex (lic.eduardo_mex@hotmail.com)
 * 
 * @version 1.0
 * @since 31/05/2016 10:55:40
 */
public class RamaPuestoRepository extends
        GenericRepository<RamaPuestoEntity, Integer> implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -248707723857368544L;
    /**
     *
     */

    @PersistenceContext(unitName = Configuracion.UNIDAD_PERSISTENCIA)
    private EntityManager entityManager;

    /**
     * Obtiene la lista de rama puesto por identificador de puesto
     *
     * @param idPuesto
     * @return
     */
    public List<RamaPuestoEntity> obtenerListaRamaPuesto() {
        return entityManager.createQuery(
                "SELECT r FROM RamaPuestoEntity AS r ORDER BY r.idRamaPuesto",
                RamaPuestoEntity.class).getResultList();
    }

}
