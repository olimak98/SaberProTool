package com.saberpro.presentation.backingBeans;

import com.saberpro.exceptions.*;

import com.saberpro.modelo.*;
import com.saberpro.modelo.dto.PreguntaDTO;

import com.saberpro.presentation.businessDelegate.*;

import com.saberpro.utilities.*;

import org.primefaces.component.calendar.*;
import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.component.inputtext.InputText;
import org.primefaces.component.inputtextarea.InputTextarea;
import org.primefaces.extensions.component.ckeditor.CKEditor;
import org.primefaces.model.UploadedFile;
import org.primefaces.event.RowEditEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

import java.sql.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.ServletContext;


/**
 * @author Zathura Code Generator http://zathuracode.org/
 * www.zathuracode.org
 *
 */
@ManagedBean
@ViewScoped
public class PreguntaView implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = LoggerFactory.getLogger(PreguntaView.class);
    
    
    
    private String content;
    private String contentRespuesta1;
    private String contentRespuesta2;
    private String contentRespuesta3;
    private String contentRespuesta4;
    
    private InputText rutaPregunta;
    private InputText rutaRespuesta1;
    private InputText rutaRespuesta2;
    private InputText rutaRespuesta3;
    private InputText rutaRespuesta4;
    
    private InputTextarea txtRetroalimentacion;
    
    private UploadedFile chooseImportFile;
    private UploadedFile choosePregunta;
    private UploadedFile chooseRespuesta1;
    private UploadedFile chooseRespuesta2;
    private UploadedFile chooseRespuesta3;
    private UploadedFile chooseRespuesta4;
    
    private CommandButton importFile;
    private CommandButton subirPregunta;
    private CommandButton subirRespuesta1;
    private CommandButton subirRespuesta2;
    private CommandButton subirRespuesta3;
    private CommandButton subirRespuesta4;
    
    private List<PreguntaDTO> data;
    
    private PreguntaDTO selectedPregunta;
    
    private Pregunta entity;
    
    private boolean showDialog;
    
    @ManagedProperty(value = "#{BusinessDelegatorView}")
    private IBusinessDelegatorView businessDelegatorView;

    public PreguntaView() {
        super();
    }
    
    public void saveListener() {
    	
    }
    
    public String getModulo(long id) {
    	try {
			return businessDelegatorView.getModulo(id).getNombre();
		} catch (Exception e) {
			return e.getMessage();
		}
    }
    
    public void importFilePregunta() {
    	try {
			if(chooseImportFile!=null) {
				
				Usuario usuario = (Usuario)FacesUtils.getfromSession("usuario");
				
				String ext = chooseImportFile.getFileName().substring(chooseImportFile.getFileName().lastIndexOf("."));
				businessDelegatorView.importFilePregunta(chooseImportFile.getInputstream(),usuario.getIdUsuario(),ext);
				
				data = null;
				
				FacesUtils.addInfoMessage("Se importo correctamente las preguntas");
			}
			
			
		} catch (Exception e) {
			FacesUtils.addErrorMessage(e.getMessage());
		}
    }
    
    public void subirImagenPregunta() {
    	try {
    		if(choosePregunta!=null) {
    			ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
    			
    			String ruta= (String) servletContext.getRealPath("/")+"pregunta/"+choosePregunta.getFileName();
    			String httpRuta = "http://localhost:8080/saber-pro-app/pregunta/"+choosePregunta.getFileName();
    			
    			businessDelegatorView.subirFilePregunta(choosePregunta.getInputstream(),ruta);
    			
    			rutaPregunta.setValue(httpRuta);   			
    			
    			content = content +"<p><img alt=\"\" src=\""+httpRuta+"\"/></p>"; 
    			
    			FacesUtils.addInfoMessage("Se subio el archivo correctamente");
    		}
			
		} catch (Exception e) {
			FacesUtils.addErrorMessage(e.getMessage());
		}
    }
    
    public void subirImagenRespuesta1() {
    	try {
    		if(chooseRespuesta1!=null) {
    			ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
    			
    			String ruta= (String) servletContext.getRealPath("/")+"respuesta/"+chooseRespuesta1.getFileName();
    			String httpRuta = "http://localhost:8080/saber-pro-app/respuesta/"+chooseRespuesta1.getFileName();
    			
    			businessDelegatorView.subirFilePregunta(chooseRespuesta1.getInputstream(),ruta);
    			
    			rutaRespuesta1.setValue(httpRuta);   			
    			
    			contentRespuesta1 = contentRespuesta1 +"<p><img alt=\"\" src=\""+httpRuta+"\"/></p>"; 
    			
    			FacesUtils.addInfoMessage("Se subio el archivo correctamente");
    		}
			
		} catch (Exception e) {
			FacesUtils.addErrorMessage(e.getMessage());
		}
    }
    
    public void subirImagenRespuesta2() {
    	try {
    		if(chooseRespuesta2!=null) {
    			ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
    			
    			String ruta= (String) servletContext.getRealPath("/")+"respuesta/"+chooseRespuesta2.getFileName();
    			String httpRuta = "http://localhost:8080/saber-pro-app/respuesta/"+chooseRespuesta2.getFileName();
    			
    			businessDelegatorView.subirFilePregunta(chooseRespuesta2.getInputstream(),ruta);
    			
    			rutaRespuesta2.setValue(httpRuta);   			
    			
    			contentRespuesta2 = contentRespuesta2 +"<p><img alt=\"\" src=\""+httpRuta+"\"/></p>"; 
    			
    			FacesUtils.addInfoMessage("Se subio el archivo correctamente");
    		}
			
		} catch (Exception e) {
			FacesUtils.addErrorMessage(e.getMessage());
		}
    }
    
    public void subirImagenRespuesta3() {
    	try {
    		if(chooseRespuesta3!=null) {
    			ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
    			
    			String ruta= (String) servletContext.getRealPath("/")+"respuesta/"+chooseRespuesta3.getFileName();
    			String httpRuta = "http://localhost:8080/saber-pro-app/respuesta/"+chooseRespuesta3.getFileName();
    			
    			businessDelegatorView.subirFilePregunta(chooseRespuesta3.getInputstream(),ruta);
    			
    			rutaRespuesta3.setValue(httpRuta);   			
    			
    			contentRespuesta3 = contentRespuesta3 +"<p><img alt=\"\" src=\""+httpRuta+"\"/></p>"; 
    			
    			FacesUtils.addInfoMessage("Se subio el archivo correctamente");
    		}
			
		} catch (Exception e) {
			FacesUtils.addErrorMessage(e.getMessage());
		}
    }
    
    public void subirImagenRespuesta4() {
    	try {
    		if(chooseRespuesta4!=null) {
    			ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
    			
    			String ruta= (String) servletContext.getRealPath("/")+"respuesta/"+chooseRespuesta4.getFileName();
    			String httpRuta = "http://localhost:8080/saber-pro-app/respuesta/"+chooseRespuesta4.getFileName();
    			
    			businessDelegatorView.subirFilePregunta(chooseRespuesta4.getInputstream(),ruta);
    			
    			rutaRespuesta4.setValue(httpRuta);   			
    			
    			contentRespuesta4 = contentRespuesta4 +"<p><img alt=\"\" src=\""+httpRuta+"\"/></p>"; 
    			
    			FacesUtils.addInfoMessage("Se subio el archivo correctamente");
    		}
			
		} catch (Exception e) {
			FacesUtils.addErrorMessage(e.getMessage());
		}
    }

    public List<PreguntaDTO> getData() {
        try {
            if (data == null) {
                data = businessDelegatorView.getDataPregunta();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public void setData(List<PreguntaDTO> preguntaDTO) {
        this.data = preguntaDTO;
    }

    public PreguntaDTO getSelectedPregunta() {
        return selectedPregunta;
    }

    public void setSelectedPregunta(PreguntaDTO pregunta) {
        this.selectedPregunta = pregunta;
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

    public boolean isShowDialog() {
        return showDialog;
    }

    public void setShowDialog(boolean showDialog) {
        this.showDialog = showDialog;
    }

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContentRespuesta1() {
		return contentRespuesta1;
	}

	public void setContentRespuesta1(String contentRespuesta1) {
		this.contentRespuesta1 = contentRespuesta1;
	}

	public String getContentRespuesta2() {
		return contentRespuesta2;
	}

	public void setContentRespuesta2(String contentRespuesta2) {
		this.contentRespuesta2 = contentRespuesta2;
	}

	public String getContentRespuesta3() {
		return contentRespuesta3;
	}

	public void setContentRespuesta3(String contentRespuesta3) {
		this.contentRespuesta3 = contentRespuesta3;
	}

	public String getContentRespuesta4() {
		return contentRespuesta4;
	}

	public void setContentRespuesta4(String contentRespuesta4) {
		this.contentRespuesta4 = contentRespuesta4;
	}

	public UploadedFile getChoosePregunta() {
		return choosePregunta;
	}

	public void setChoosePregunta(UploadedFile choosePregunta) {
		this.choosePregunta = choosePregunta;
	}

	public CommandButton getSubirPregunta() {
		return subirPregunta;
	}

	public void setSubirPregunta(CommandButton subirPregunta) {
		this.subirPregunta = subirPregunta;
	}

	public InputText getRutaPregunta() {
		return rutaPregunta;
	}

	public void setRutaPregunta(InputText rutaPregunta) {
		this.rutaPregunta = rutaPregunta;
	}

	public InputTextarea getTxtRetroalimentacion() {
		return txtRetroalimentacion;
	}

	public void setTxtRetroalimentacion(InputTextarea txtRetroalimentacion) {
		this.txtRetroalimentacion = txtRetroalimentacion;
	}

	public UploadedFile getChooseRespuesta1() {
		return chooseRespuesta1;
	}

	public void setChooseRespuesta1(UploadedFile chooseRespuesta1) {
		this.chooseRespuesta1 = chooseRespuesta1;
	}

	public UploadedFile getChooseRespuesta2() {
		return chooseRespuesta2;
	}

	public void setChooseRespuesta2(UploadedFile chooseRespuesta2) {
		this.chooseRespuesta2 = chooseRespuesta2;
	}

	public UploadedFile getChooseRespuesta3() {
		return chooseRespuesta3;
	}

	public void setChooseRespuesta3(UploadedFile chooseRespuesta3) {
		this.chooseRespuesta3 = chooseRespuesta3;
	}

	public UploadedFile getChooseRespuesta4() {
		return chooseRespuesta4;
	}

	public void setChooseRespuesta4(UploadedFile chooseRespuesta4) {
		this.chooseRespuesta4 = chooseRespuesta4;
	}

	public InputText getRutaRespuesta1() {
		return rutaRespuesta1;
	}

	public void setRutaRespuesta1(InputText rutaRespuesta1) {
		this.rutaRespuesta1 = rutaRespuesta1;
	}

	public InputText getRutaRespuesta2() {
		return rutaRespuesta2;
	}

	public void setRutaRespuesta2(InputText rutaRespuesta2) {
		this.rutaRespuesta2 = rutaRespuesta2;
	}

	public InputText getRutaRespuesta3() {
		return rutaRespuesta3;
	}

	public void setRutaRespuesta3(InputText rutaRespuesta3) {
		this.rutaRespuesta3 = rutaRespuesta3;
	}

	public InputText getRutaRespuesta4() {
		return rutaRespuesta4;
	}

	public void setRutaRespuesta4(InputText rutaRespuesta4) {
		this.rutaRespuesta4 = rutaRespuesta4;
	}

	public CommandButton getSubirRespuesta1() {
		return subirRespuesta1;
	}

	public void setSubirRespuesta1(CommandButton subirRespuesta1) {
		this.subirRespuesta1 = subirRespuesta1;
	}

	public CommandButton getSubirRespuesta2() {
		return subirRespuesta2;
	}

	public void setSubirRespuesta2(CommandButton subirRespuesta2) {
		this.subirRespuesta2 = subirRespuesta2;
	}

	public CommandButton getSubirRespuesta3() {
		return subirRespuesta3;
	}

	public void setSubirRespuesta3(CommandButton subirRespuesta3) {
		this.subirRespuesta3 = subirRespuesta3;
	}

	public CommandButton getSubirRespuesta4() {
		return subirRespuesta4;
	}

	public void setSubirRespuesta4(CommandButton subirRespuesta4) {
		this.subirRespuesta4 = subirRespuesta4;
	}

	public UploadedFile getChooseImportFile() {
		return chooseImportFile;
	}

	public void setChooseImportFile(UploadedFile chooseImportFile) {
		this.chooseImportFile = chooseImportFile;
	}

	public CommandButton getImportFile() {
		return importFile;
	}

	public void setImportFile(CommandButton importFile) {
		this.importFile = importFile;
	}

	
}
