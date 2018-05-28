package com.saberpro.presentation.backingBeans;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import org.primefaces.event.SelectEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.saberpro.modelo.PruebaProgramaUsuario;
import com.saberpro.modelo.PruebaProgramaUsuarioPregunta;
import com.saberpro.modelo.RespuestaPruebaProgramaUsuarioPregunta;
import com.saberpro.modelo.dto.ModeloPruebaDTO;
import com.saberpro.modelo.dto.ModuloPreguntaDTO;
import com.saberpro.modelo.dto.RespuestaDTO;
import com.saberpro.presentation.businessDelegate.IBusinessDelegatorView;
import com.saberpro.utilities.Constantes;
import com.saberpro.utilities.FacesUtils;


/**
 * @author Zathura Code Generator http://zathuracode.org/
 * www.zathuracode.org
 *
 */
@ManagedBean
@ViewScoped
public class TomarPruebaView implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(TomarPruebaView.class);
    
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;
    
    private Long pruebaProgramaUsuarioId = null;
    private PruebaProgramaUsuario pruebaProgramaUsuario;
//    private List<RespuestaPruebaProgramaUsuarioPregunta> respuestas = new ArrayList<>();
    private ModeloPruebaDTO modeloPruebaDTO = null;
    private Long idModuloSeleccionado;
    
    private List<SelectItem> modulos = new ArrayList<>();
    
    private ModuloPreguntaDTO preguntaActual = null;
    

    public TomarPruebaView() {
        super();
    }

    @PostConstruct
	public void tomarPruebaViewPC() {
		try {
			
			//Se toma la prueba programa usurio del parametro
			FacesContext facesContext = FacesContext.getCurrentInstance();
			Map params = facesContext.getExternalContext().getRequestParameterMap();
			pruebaProgramaUsuarioId = new Long((String) params.get("id"));
			if (pruebaProgramaUsuarioId == null) {
				FacesContext.getCurrentInstance().getExternalContext().redirect("prueba.xhtml");
			}				
			else {
				pruebaProgramaUsuario = businessDelegatorView.getPruebaProgramaUsuario(pruebaProgramaUsuarioId);
			}
			
			if (pruebaProgramaUsuario == null) {
				throw new Exception("No se pudo encontrar la prueba del usuario " + pruebaProgramaUsuarioId);
			}
			
			//Si la prueba ya finalizó, lo redirecciona
			if(pruebaProgramaUsuario.getEstadoPrueba().getIdEstadoPrueba().equals(Constantes.PRUEBA_ESTADO_FINALIZADA)) {
				FacesContext.getCurrentInstance().getExternalContext().redirect("prueba.xhtml");
			}
			
			//Se consultan las respuestas de las preguntas
			modeloPruebaDTO = businessDelegatorView.consultarPruebaProgramaUsuario(pruebaProgramaUsuarioId);
			if (modeloPruebaDTO==null) {
				throw new Exception("No se pudo consultar las respuestas de la prueba");
			}
			
			List<ModuloPreguntaDTO> preguntas = modeloPruebaDTO.getModuloPreguntasDTO();
			Map<Long, String> modulos = new LinkedHashMap<>(); 
			for (ModuloPreguntaDTO moduloPreguntaDTO : preguntas) {
				
				if (modulos.get(moduloPreguntaDTO.getIdModulo()) == null) {
					modulos.put(moduloPreguntaDTO.getIdModulo(), moduloPreguntaDTO.getNombreModulo());
				}
				
			}
			
			Set<Long> idsModulos = modulos.keySet();
			for (Long idModulo : idsModulos) {
				this.modulos.add(new SelectItem(idModulo, modulos.get(idModulo)));
			}
			
			preguntaActual = modeloPruebaDTO.getModuloPreguntasDTO().get(0);
			
		} catch (Exception e) {
			FacesUtils.addErrorMessage(e.getMessage());
		}
	}
    
    public void action_siguientePregunta(ActionEvent event) {
    	try {
			if (preguntaActual==null) {
				preguntaActual = modeloPruebaDTO.getModuloPreguntasDTO().get(0);
				idModuloSeleccionado = preguntaActual.getIdModulo();
				return;
			}else {
				List<ModuloPreguntaDTO> preguntasDePrueba = modeloPruebaDTO.getModuloPreguntasDTO();
				
				for (int i=0; i<preguntasDePrueba.size(); i++ ) {
					if (preguntaActual == preguntasDePrueba.get(i)) {
						//Se llegó a la ultima pregunta, la siguiente pregunta será la primera
						if ((i+1)>=preguntasDePrueba.size()) {
							preguntaActual = modeloPruebaDTO.getModuloPreguntasDTO().get(0);
							idModuloSeleccionado = preguntaActual.getIdModulo();
							return;
						}else {
							preguntaActual = modeloPruebaDTO.getModuloPreguntasDTO().get(i+1);
							idModuloSeleccionado = preguntaActual.getIdModulo();
							break;
						}
					}
				}
			}
		} catch (Exception e) {
			FacesUtils.addErrorMessage(e.getMessage());
		}
    }
    
    public void action_anteriorPregunta(ActionEvent event) {
    	try {
			if (preguntaActual==null) {
				preguntaActual = modeloPruebaDTO.getModuloPreguntasDTO().get(0);
				idModuloSeleccionado = preguntaActual.getIdModulo();
				return;
			}else {
				List<ModuloPreguntaDTO> preguntasDePrueba = modeloPruebaDTO.getModuloPreguntasDTO();
				
				for (int i=0; i<preguntasDePrueba.size(); i++ ) {
					if (preguntaActual == preguntasDePrueba.get(i)) {
						//Se llegó a la primera pregunta, la siguiente pregunta será la última
						if (i==0) {
							preguntaActual = preguntasDePrueba.get(preguntasDePrueba.size()-1);
							idModuloSeleccionado = preguntaActual.getIdModulo();
							return;
						}else {
							preguntaActual = modeloPruebaDTO.getModuloPreguntasDTO().get(i-1);
							idModuloSeleccionado = preguntaActual.getIdModulo();
							break;
						}
					}
				}
			}
		} catch (Exception e) {
			FacesUtils.addErrorMessage(e.getMessage());
		}
    }
    
    public void onRowSelect(SelectEvent selectEvent) {
    	try {
			
    		RespuestaDTO respuestaSeleccionada = (RespuestaDTO)selectEvent.getObject();
    		
    		//Se consulta el registro de prueba programa usuario pregunta
    		Long idPruebaProgramaUsuario = this.pruebaProgramaUsuario.getIdPruebaProgramaUsuario();
    		Long idPregunta = respuestaSeleccionada.getIdPregunta_Pregunta();
    		
    		Object[] variablesConsulta = {"pruebaProgramaUsuario.idPruebaProgramaUsuario", false, idPruebaProgramaUsuario, "=",
    				"pregunta.idPregunta", false, idPregunta, "="};
    		
    		List<PruebaProgramaUsuarioPregunta> lista = businessDelegatorView.findByCriteriaInPruebaProgramaUsuarioPregunta(variablesConsulta, null, null);
    		if (lista==null || lista.size()==0) {
    			throw new Exception("No existe la prueba programa usuario pregunta para la prueba programa usuario " + idPruebaProgramaUsuario + " "
    					+ "y la pregunta " + idPregunta);
    		}
    		
    		//Se actualiza el porcentaje de avance
    		Integer contadorPreguntasTotales = modeloPruebaDTO.getCantidadTotalDePreguntas();
    		Integer contadorPreguntasContestadas = modeloPruebaDTO.getCantidadTotalDePreguntasContestadas();
    		
    		contadorPreguntasContestadas++;
    		
    		if (contadorPreguntasTotales!=0) {
				modeloPruebaDTO.setPorcentajeAvance((int)( (contadorPreguntasContestadas*1.0D)/(contadorPreguntasTotales*1.0D)*100D) );
			}
    		
    		businessDelegatorView.guardarRespuestaAPregunta(lista.get(0).getIdPruebaProgramaUsuarioPregunta(), respuestaSeleccionada.getIdRespuesta());
    		
    		FacesUtils.addInfoMessage("Respuesta almacenada!");
    		
		} catch (Exception e) {
			FacesUtils.addErrorMessage(e.getMessage());
		}
    }
    
    public void cambioModulo(ValueChangeEvent vce) {
    	try {
			
    		Long idModulo = (Long)vce.getNewValue();
    		
    		//Se va a la primera pregunta del modulo seleccionado
    		List<ModuloPreguntaDTO> preguntas = modeloPruebaDTO.getModuloPreguntasDTO();
			 
			for (ModuloPreguntaDTO moduloPreguntaDTO : preguntas) {
				if (moduloPreguntaDTO.getIdModulo().equals(idModulo)) {
					this.preguntaActual = moduloPreguntaDTO;
					break;
				}
			}
    		
		} catch (Exception e) {
			FacesUtils.addErrorMessage(e.getMessage());
		}
    }
	
    public TimeZone getTimeZone() {
        return java.util.TimeZone.getDefault();
    }

    public IBusinessDelegatorView getBusinessDelegatorView() {
        return businessDelegatorView;
    }

    public void setBusinessDelegatorView(
        IBusinessDelegatorView businessDelegatorView) {
        this.businessDelegatorView = businessDelegatorView;
    }

	public Long getPruebaProgramaUsuarioId() {
		return pruebaProgramaUsuarioId;
	}

	public void setPruebaProgramaUsuarioId(Long pruebaProgramaUsuarioId) {
		this.pruebaProgramaUsuarioId = pruebaProgramaUsuarioId;
	}

	public PruebaProgramaUsuario getPruebaProgramaUsuario() {
		return pruebaProgramaUsuario;
	}

	public void setPruebaProgramaUsuario(PruebaProgramaUsuario pruebaProgramaUsuario) {
		this.pruebaProgramaUsuario = pruebaProgramaUsuario;
	}

	public ModeloPruebaDTO getModeloPruebaDTO() {
		return modeloPruebaDTO;
	}

	public void setModeloPruebaDTO(ModeloPruebaDTO modeloPruebaDTO) {
		this.modeloPruebaDTO = modeloPruebaDTO;
	}

	public List<SelectItem> getModulos() {
		return modulos;
	}

	public void setModulos(List<SelectItem> modulos) {
		this.modulos = modulos;
	}

	public Long getIdModuloSeleccionado() {
		return idModuloSeleccionado;
	}

	public void setIdModuloSeleccionado(Long idModuloSeleccionado) {
		this.idModuloSeleccionado = idModuloSeleccionado;
	}

	public ModuloPreguntaDTO getPreguntaActual() {
		return preguntaActual;
	}

	public void setPreguntaActual(ModuloPreguntaDTO preguntaActual) {
		this.preguntaActual = preguntaActual;
	}
	
}
