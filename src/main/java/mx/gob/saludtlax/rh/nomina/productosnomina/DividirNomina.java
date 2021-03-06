/*
 * DividirNomina.java
 * Creado el 25/Dec/2016 8:21:08 PM
 * 
 */
package mx.gob.saludtlax.rh.nomina.productosnomina;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Freddy Barrera (freddy.barrera.moo@gmail.com)
 */
@Local
public interface DividirNomina extends Serializable {

    List<DividirNominaDTO> obtenerProductoNomina(Integer primerResultado);

    List<DividirNominaDTO> obtenerProductoNomina(Integer primerResultado, Integer cantidadResultados, Integer idProductoNomina);
    
    Integer obtenerTotalProductosNomina(Integer idProductoNomina);

    List<DividirNominaDTO> dividirProductoNomina(DividirNominaFiltro filtro, Integer idUsuario);
    
}
