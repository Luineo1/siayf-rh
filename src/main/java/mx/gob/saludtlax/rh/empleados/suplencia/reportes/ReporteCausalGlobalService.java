
package mx.gob.saludtlax.rh.empleados.suplencia.reportes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;

import mx.gob.saludtlax.rh.util.Configuracion;

/**
 *
 * @author José Pablo
 *
 */
public class ReporteCausalGlobalService {
    @PersistenceContext(unitName = Configuracion.UNIDAD_PERSISTENCIA)
    private EntityManager entityManager;

    protected List<ReporteCausalGlobalDTO> obtenerListaCausalGlobal(Integer numeroQuincena, Integer ejercicioFiscal, Integer idCentroResponsabilidad,
            String lugar) {

        Session session = entityManager.unwrap(Session.class);

        Query query = session.createSQLQuery("CALL usp_causal_global(:numeroQuincena, :ejercicioFiscal, :idCentroResponsabilidad, :lugar) ")
                .setParameter("numeroQuincena", numeroQuincena).setParameter("ejercicioFiscal", ejercicioFiscal)
                .setParameter("idCentroResponsabilidad", idCentroResponsabilidad).setParameter("lugar", lugar);

        query.setResultTransformer(Transformers.aliasToBean(ReporteCausalGlobalDTO.class));

        @SuppressWarnings("unchecked")
        List<ReporteCausalGlobalDTO> list = query.list();

        return list;

    }
}
