/**
 * 
 */
package mx.gob.saludtlax.rh.nomina.presupuestocalendario;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import mx.gob.saludtlax.rh.excepciones.ReglaNegocioException;
import mx.gob.saludtlax.rh.excepciones.ValidacionCodigoError;
import mx.gob.saludtlax.rh.excepciones.ValidacionException;
import mx.gob.saludtlax.rh.util.JSFUtils;
import mx.gob.saludtlax.rh.util.ValidacionUtil;

/**
 * @author Eduardo Mex
 *
 */
@ManagedBean(name = "presupuestoCalendario")
@ViewScoped
public class PresupuestoCalendarioController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1628601104971308846L;

	@Inject
	private PresupuestoCalendario presupuestoCalendario;

	private PresupuestoCalendarioView view;

	@PostConstruct
	public void init() {
		this.view = new PresupuestoCalendarioView();
		vistaPrincipal();
	}

	public void vistaPrincipal() {
		this.view.setListaPresupuestoCalendario(presupuestoCalendario.obtenerListaPresupuestoCalendario());
		this.view.setActualizarPresupuestoCalendario(new PresupuestoCalendarioDTO());
		this.view.setCreaPresupuestoCalendario(new PresupuestoCalendarioDTO());
		this.view.setMostrarVistaPrincipal(true);
		this.view.setMostrarVistaCrear(false);
		this.view.setMostrarVistaActualizar(false);
	}

	public void restarVistaSinBusquedaAnio() {
		if (!ValidacionUtil.esNumeroPositivoInt(this.view.getAnioCriterio())) {
			vistaPrincipal();
		}
	}

	public void obtenerListaPresupuestoCalendarioPorAnio() {
		try {

			if (ValidacionUtil.esNumeroPositivoInt(this.view.getAnioCriterio())) {
				List<PresupuestoCalendarioDTO> lista = presupuestoCalendario
						.obtenerListaPresupuestoCalendarioPorAnio(this.view.getAnioCriterio());

				if (!lista.isEmpty()) {
					this.view.setListaPresupuestoCalendario(lista);
				} else {
					vistaPrincipal();
					throw new ValidacionException(
							"No se encontrarón resultados con el año " + this.view.getAnioCriterio().toString()
									+ ", por favor ingrese el año correctamente.",
							ValidacionCodigoError.REGISTRO_NO_ENCONTRADO);
				}

			} else {
				vistaPrincipal();
				throw new ValidacionException("El año es requerido, por favor ingrese el año correctamente.",
						ValidacionCodigoError.VALOR_REQUERIDO);
			}

		} catch (ReglaNegocioException | ValidacionException exception) {
			JSFUtils.errorMessage("Error: ", exception.getMessage());
		}
	}

	public void crearPresupuestoCalendario() {
		try {

			presupuestoCalendario.crearPresupuestoCalendario(this.view.getCreaPresupuestoCalendario());

			vistaPrincipal();

			JSFUtils.infoMessage("Presupuesto Calendario: ", "¡Se registro correctamente!");

		} catch (ReglaNegocioException | ValidacionException exception) {
			JSFUtils.errorMessage("Error: ", exception.getMessage());
		}
	}

	public void actualizarPresupuestoCalendario() {
		try {

			presupuestoCalendario.actualizarPresupuestoCalendario(this.view.getActualizarPresupuestoCalendario());

			vistaPrincipal();

			JSFUtils.infoMessage("Presupuesto Calendario: ", "¡Se actualizo correctamente!");

		} catch (ReglaNegocioException | ValidacionException exception) {
			JSFUtils.errorMessage("Error: ", exception.getMessage());
		}
	}

	public void eliminarPresupuestoCalensario(Integer idPresupuestoCalendario) {
		try {

			presupuestoCalendario.eliminarPresupuestoCalendario(idPresupuestoCalendario);

			vistaPrincipal();

			JSFUtils.infoMessage("Presupuesto Calendario: ", "¡Se elimino correctamente!");

		} catch (ReglaNegocioException | ValidacionException exception) {
			JSFUtils.errorMessage("Error: ", exception.getMessage());
		}
	}

	public void mostrarVistaCrearPresupuestoCalendario() {
		this.view.setCreaPresupuestoCalendario(new PresupuestoCalendarioDTO());
		this.view.setMostrarVistaPrincipal(false);
		this.view.setMostrarVistaCrear(true);
		this.view.setMostrarVistaActualizar(false);
	}

	public void mostrarVistaActualizarPresupuestoCalendario(PresupuestoCalendarioDTO dto) {
		this.view.setActualizarPresupuestoCalendario(dto);
		this.view.setMostrarVistaPrincipal(false);
		this.view.setMostrarVistaCrear(false);
		this.view.setMostrarVistaActualizar(true);
	}

	/************* Getters and Setters **************/

	/**
	 * @return the view
	 */
	public PresupuestoCalendarioView getView() {
		return view;
	}

	/**
	 * @param view
	 *            the view to set
	 */
	public void setView(PresupuestoCalendarioView view) {
		this.view = view;
	}

}
