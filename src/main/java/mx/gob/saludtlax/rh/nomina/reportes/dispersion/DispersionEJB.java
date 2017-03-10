/*
 * DispersionEJB.java
 * Creado el 07/Dec/2016 6:34:40 PM
 * 
 */
package mx.gob.saludtlax.rh.nomina.reportes.dispersion;

import java.io.IOException;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.gob.saludtlax.rh.excepciones.ValidacionCodigoError;
import mx.gob.saludtlax.rh.excepciones.ValidacionException;
import mx.gob.saludtlax.rh.util.ValidacionUtil;
import org.jboss.logging.Logger;

/**
 * 
 * @author Freddy Barrera (freddy.barrera@folfasesores.com.mx)
 */
@Stateless
public class DispersionEJB implements Dispersion {

    private static final long serialVersionUID = 1691448290310983411L;
    private static final Logger LOGGER = Logger.getLogger(DispersionEJB.class.getName());
    
    
    @Inject private DispersionService dispersionService;
    @Inject private DispersionReporteService dispersionReporteService;
    @Inject private DispersionExcelService dispersionExcelService;

    @Override
    public byte[] generarReporte(Integer idProductoNomina) {
        return generarReporte(idProductoNomina, false);
    }

    @Override
    public byte[] generarReporte(Integer idProductoNomina, boolean excel) {
        if(ValidacionUtil.esMenorQueUno(idProductoNomina)) {
            throw new ValidacionException("El ID del producto de nomina no puede ser cero o menor que uno", ValidacionCodigoError.NUMERO_NEGATIVO);
        }

        List<DispersionDTO> dispersion = dispersionService.obtenerInformacion(idProductoNomina);

        if (excel) {
            try {
                return dispersionExcelService.obtenerBytes(dispersion);
            } catch (IOException ex) {
                LOGGER.error(ex.getMessage());
                return null;
            }
        } else {
            return dispersionReporteService.obtenerReporte(dispersion);
        }
    }
    
}