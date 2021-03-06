/**
 *
 */
package mx.gob.saludtlax.rh.bolsatrabajo.aspirantes;

/**
 * Esta clase contiene las contantes para los filtros.
 * 
 * @author Leila Schiaffini Ehuan
 * @since 01/08/2016 16:11:54
 */
public class EnumTipoFiltro {

	/**
	 * Debido a que solo se emplean las constantes, esta clase no debe permitir
	 * la creación de instancias usando la palabra reservada <code>new</code>.
	 */
	private EnumTipoFiltro() {
	}

	public static final int NOMBRE_RFC_CURP = 1;

	public static final int NOMBRE_RFC_CURP_PROFESION = 2;

	public static final int NOMBRE_RFC_CURP_ACTIVOS = 3;

	public static final int NOMBRE_RFC_CURP_CONTRATACION = 4;

	public static final int NOMBRE_RFC_CURP_TODAS_ADSCRIPCIONES = 5;

	public static final int NOMBRE_RFC_CURP_ADSCRIPCION_ASIGNADA = 6;

	public static final int CRITERIO_COMBO_TODAS_ADSCRIPCIONES = 6;

	public static final int CRITERIO_COMBO_ADSCRIPCION_ASIGNADA = 7;
	
	public static final int CRITERIO_FEDERALES = 8;

}
