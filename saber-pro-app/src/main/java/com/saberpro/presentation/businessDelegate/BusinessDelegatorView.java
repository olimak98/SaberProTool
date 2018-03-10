package com.saberpro.presentation.businessDelegate;

import com.saberpro.modelo.EstadoPrueba;
import com.saberpro.modelo.Facultad;
import com.saberpro.modelo.GrupoOpcion;
import com.saberpro.modelo.Matricula;
import com.saberpro.modelo.Modulo;
import com.saberpro.modelo.Opcion;
import com.saberpro.modelo.Parametro;
import com.saberpro.modelo.Permiso;
import com.saberpro.modelo.Pregunta;
import com.saberpro.modelo.Programa;
import com.saberpro.modelo.ProgramaModulo;
import com.saberpro.modelo.ProgramaUsuario;
import com.saberpro.modelo.Prueba;
import com.saberpro.modelo.PruebaModulo;
import com.saberpro.modelo.PruebaProgramaUsuario;
import com.saberpro.modelo.PruebaProgramaUsuarioPregunta;
import com.saberpro.modelo.PruebaReal;
import com.saberpro.modelo.Respuesta;
import com.saberpro.modelo.RespuestaPruebaProgramaUsuarioPregunta;
import com.saberpro.modelo.ResultadoReal;
import com.saberpro.modelo.TipoModulo;
import com.saberpro.modelo.TipoPregunta;
import com.saberpro.modelo.TipoPrueba;
import com.saberpro.modelo.TipoUsuario;
import com.saberpro.modelo.Usuario;
import com.saberpro.modelo.control.EstadoPruebaLogic;
import com.saberpro.modelo.control.FacultadLogic;
import com.saberpro.modelo.control.GrupoOpcionLogic;
import com.saberpro.modelo.control.IEstadoPruebaLogic;
import com.saberpro.modelo.control.IFacultadLogic;
import com.saberpro.modelo.control.IGrupoOpcionLogic;
import com.saberpro.modelo.control.IMatriculaLogic;
import com.saberpro.modelo.control.IModuloLogic;
import com.saberpro.modelo.control.IOpcionLogic;
import com.saberpro.modelo.control.IParametroLogic;
import com.saberpro.modelo.control.IPermisoLogic;
import com.saberpro.modelo.control.IPreguntaLogic;
import com.saberpro.modelo.control.IProgramaLogic;
import com.saberpro.modelo.control.IProgramaModuloLogic;
import com.saberpro.modelo.control.IProgramaUsuarioLogic;
import com.saberpro.modelo.control.IPruebaLogic;
import com.saberpro.modelo.control.IPruebaModuloLogic;
import com.saberpro.modelo.control.IPruebaProgramaUsuarioLogic;
import com.saberpro.modelo.control.IPruebaProgramaUsuarioPreguntaLogic;
import com.saberpro.modelo.control.IPruebaRealLogic;
import com.saberpro.modelo.control.IRespuestaLogic;
import com.saberpro.modelo.control.IRespuestaPruebaProgramaUsuarioPreguntaLogic;
import com.saberpro.modelo.control.IResultadoRealLogic;
import com.saberpro.modelo.control.ITipoModuloLogic;
import com.saberpro.modelo.control.ITipoPreguntaLogic;
import com.saberpro.modelo.control.ITipoPruebaLogic;
import com.saberpro.modelo.control.ITipoUsuarioLogic;
import com.saberpro.modelo.control.IUsuarioLogic;
import com.saberpro.modelo.control.MatriculaLogic;
import com.saberpro.modelo.control.ModuloLogic;
import com.saberpro.modelo.control.OpcionLogic;
import com.saberpro.modelo.control.ParametroLogic;
import com.saberpro.modelo.control.PermisoLogic;
import com.saberpro.modelo.control.PreguntaLogic;
import com.saberpro.modelo.control.ProgramaLogic;
import com.saberpro.modelo.control.ProgramaModuloLogic;
import com.saberpro.modelo.control.ProgramaUsuarioLogic;
import com.saberpro.modelo.control.PruebaLogic;
import com.saberpro.modelo.control.PruebaModuloLogic;
import com.saberpro.modelo.control.PruebaProgramaUsuarioLogic;
import com.saberpro.modelo.control.PruebaProgramaUsuarioPreguntaLogic;
import com.saberpro.modelo.control.PruebaRealLogic;
import com.saberpro.modelo.control.RespuestaLogic;
import com.saberpro.modelo.control.RespuestaPruebaProgramaUsuarioPreguntaLogic;
import com.saberpro.modelo.control.ResultadoRealLogic;
import com.saberpro.modelo.control.TipoModuloLogic;
import com.saberpro.modelo.control.TipoPreguntaLogic;
import com.saberpro.modelo.control.TipoPruebaLogic;
import com.saberpro.modelo.control.TipoUsuarioLogic;
import com.saberpro.modelo.control.UsuarioLogic;
import com.saberpro.modelo.dto.EstadoPruebaDTO;
import com.saberpro.modelo.dto.FacultadDTO;
import com.saberpro.modelo.dto.GrupoOpcionDTO;
import com.saberpro.modelo.dto.MatriculaDTO;
import com.saberpro.modelo.dto.ModuloDTO;
import com.saberpro.modelo.dto.OpcionDTO;
import com.saberpro.modelo.dto.ParametroDTO;
import com.saberpro.modelo.dto.PermisoDTO;
import com.saberpro.modelo.dto.PreguntaDTO;
import com.saberpro.modelo.dto.ProgramaDTO;
import com.saberpro.modelo.dto.ProgramaModuloDTO;
import com.saberpro.modelo.dto.ProgramaUsuarioDTO;
import com.saberpro.modelo.dto.PruebaDTO;
import com.saberpro.modelo.dto.PruebaModuloDTO;
import com.saberpro.modelo.dto.PruebaProgramaUsuarioDTO;
import com.saberpro.modelo.dto.PruebaProgramaUsuarioPreguntaDTO;
import com.saberpro.modelo.dto.PruebaRealDTO;
import com.saberpro.modelo.dto.RespuestaDTO;
import com.saberpro.modelo.dto.RespuestaPruebaProgramaUsuarioPreguntaDTO;
import com.saberpro.modelo.dto.ResultadoRealDTO;
import com.saberpro.modelo.dto.TipoModuloDTO;
import com.saberpro.modelo.dto.TipoPreguntaDTO;
import com.saberpro.modelo.dto.TipoPruebaDTO;
import com.saberpro.modelo.dto.TipoUsuarioDTO;
import com.saberpro.modelo.dto.UsuarioDTO;

import com.saberpro.presentation.businessDelegate.IBusinessDelegatorView;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import java.sql.*;

import java.util.Date;
import java.util.List;
import java.util.Set;


/**
* Use a Business Delegate to reduce coupling between presentation-tier clients and business services.
* The Business Delegate hides the underlying implementation details of the business service, such as lookup and access details of the EJB architecture.
*
* The Business Delegate acts as a client-side business abstraction; it provides an abstraction for, and thus hides,
* the implementation of the business services. Using a Business Delegate reduces the coupling between presentation-tier clients and
* the system's business services. Depending on the implementation strategy, the Business Delegate may shield clients from possible
* volatility in the implementation of the business service API. Potentially, this reduces the number of changes that must be made to the
* presentation-tier client code when the business service API or its underlying implementation changes.
*
* However, interface methods in the Business Delegate may still require modification if the underlying business service API changes.
* Admittedly, though, it is more likely that changes will be made to the business service rather than to the Business Delegate.
*
* Often, developers are skeptical when a design goal such as abstracting the business layer causes additional upfront work in return
* for future gains. However, using this pattern or its strategies results in only a small amount of additional upfront work and provides
* considerable benefits. The main benefit is hiding the details of the underlying service. For example, the client can become transparent
* to naming and lookup services. The Business Delegate also handles the exceptions from the business services, such as java.rmi.Remote
* exceptions, Java Messages Service (JMS) exceptions and so on. The Business Delegate may intercept such service level exceptions and
* generate application level exceptions instead. Application level exceptions are easier to handle by the clients, and may be user friendly.
* The Business Delegate may also transparently perform any retry or recovery operations necessary in the event of a service failure without
* exposing the client to the problem until it is determined that the problem is not resolvable. These gains present a compelling reason to
* use the pattern.
*
* Another benefit is that the delegate may cache results and references to remote business services. Caching can significantly improve performance,
* because it limits unnecessary and potentially costly round trips over the network.
*
* A Business Delegate uses a component called the Lookup Service. The Lookup Service is responsible for hiding the underlying implementation
* details of the business service lookup code. The Lookup Service may be written as part of the Delegate, but we recommend that it be
* implemented as a separate component, as outlined in the Service Locator pattern (See "Service Locator" on page 368.)
*
* When the Business Delegate is used with a Session Facade, typically there is a one-to-one relationship between the two.
* This one-to-one relationship exists because logic that might have been encapsulated in a Business Delegate relating to its interaction
* with multiple business services (creating a one-to-many relationship) will often be factored back into a Session Facade.
*
* Finally, it should be noted that this pattern could be used to reduce coupling between other tiers, not simply the presentation and the
* business tiers.
*
* @author Zathura Code Generator http://zathuracode.org/
* www.zathuracode.org
*
*/
@Scope("singleton")
@Service("BusinessDelegatorView")
public class BusinessDelegatorView implements IBusinessDelegatorView {
    private static final Logger log = LoggerFactory.getLogger(BusinessDelegatorView.class);
    @Autowired
    private IModuloLogic moduloLogic;
    @Autowired
    private ITipoUsuarioLogic tipoUsuarioLogic;
    @Autowired
    private IEstadoPruebaLogic estadoPruebaLogic;
    @Autowired
    private IRespuestaLogic respuestaLogic;
    @Autowired
    private IResultadoRealLogic resultadoRealLogic;
    @Autowired
    private IPruebaModuloLogic pruebaModuloLogic;
    @Autowired
    private IPruebaProgramaUsuarioLogic pruebaProgramaUsuarioLogic;
    @Autowired
    private IPreguntaLogic preguntaLogic;
    @Autowired
    private IProgramaModuloLogic programaModuloLogic;
    @Autowired
    private IParametroLogic parametroLogic;
    @Autowired
    private IPruebaProgramaUsuarioPreguntaLogic pruebaProgramaUsuarioPreguntaLogic;
    @Autowired
    private ITipoPreguntaLogic tipoPreguntaLogic;
    @Autowired
    private IUsuarioLogic usuarioLogic;
    @Autowired
    private ITipoPruebaLogic tipoPruebaLogic;
    @Autowired
    private IMatriculaLogic matriculaLogic;
    @Autowired
    private IFacultadLogic facultadLogic;
    @Autowired
    private IRespuestaPruebaProgramaUsuarioPreguntaLogic respuestaPruebaProgramaUsuarioPreguntaLogic;
    @Autowired
    private IPruebaRealLogic pruebaRealLogic;
    @Autowired
    private IPermisoLogic permisoLogic;
    @Autowired
    private IGrupoOpcionLogic grupoOpcionLogic;
    @Autowired
    private IPruebaLogic pruebaLogic;
    @Autowired
    private IOpcionLogic opcionLogic;
    @Autowired
    private ITipoModuloLogic tipoModuloLogic;
    @Autowired
    private IProgramaLogic programaLogic;
    @Autowired
    private IProgramaUsuarioLogic programaUsuarioLogic;

    public List<Modulo> getModulo() throws Exception {
        return moduloLogic.getModulo();
    }

    public void saveModulo(Modulo entity) throws Exception {
        moduloLogic.saveModulo(entity);
    }

    public void deleteModulo(Modulo entity) throws Exception {
        moduloLogic.deleteModulo(entity);
    }

    public void updateModulo(Modulo entity) throws Exception {
        moduloLogic.updateModulo(entity);
    }

    public Modulo getModulo(Long idModulo) throws Exception {
        Modulo modulo = null;

        try {
            modulo = moduloLogic.getModulo(idModulo);
        } catch (Exception e) {
            throw e;
        }

        return modulo;
    }

    public List<Modulo> findByCriteriaInModulo(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return moduloLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Modulo> findPageModulo(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return moduloLogic.findPageModulo(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberModulo() throws Exception {
        return moduloLogic.findTotalNumberModulo();
    }

    public List<ModuloDTO> getDataModulo() throws Exception {
        return moduloLogic.getDataModulo();
    }

    public void validateModulo(Modulo modulo) throws Exception {
        moduloLogic.validateModulo(modulo);
    }

    public List<TipoUsuario> getTipoUsuario() throws Exception {
        return tipoUsuarioLogic.getTipoUsuario();
    }

    public void saveTipoUsuario(TipoUsuario entity) throws Exception {
        tipoUsuarioLogic.saveTipoUsuario(entity);
    }

    public void deleteTipoUsuario(TipoUsuario entity) throws Exception {
        tipoUsuarioLogic.deleteTipoUsuario(entity);
    }

    public void updateTipoUsuario(TipoUsuario entity) throws Exception {
        tipoUsuarioLogic.updateTipoUsuario(entity);
    }

    public TipoUsuario getTipoUsuario(Long idTipoUsuario)
        throws Exception {
        TipoUsuario tipoUsuario = null;

        try {
            tipoUsuario = tipoUsuarioLogic.getTipoUsuario(idTipoUsuario);
        } catch (Exception e) {
            throw e;
        }

        return tipoUsuario;
    }

    public List<TipoUsuario> findByCriteriaInTipoUsuario(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tipoUsuarioLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<TipoUsuario> findPageTipoUsuario(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tipoUsuarioLogic.findPageTipoUsuario(sortColumnName,
            sortAscending, startRow, maxResults);
    }

    public Long findTotalNumberTipoUsuario() throws Exception {
        return tipoUsuarioLogic.findTotalNumberTipoUsuario();
    }

    public List<TipoUsuarioDTO> getDataTipoUsuario() throws Exception {
        return tipoUsuarioLogic.getDataTipoUsuario();
    }

    public void validateTipoUsuario(TipoUsuario tipoUsuario)
        throws Exception {
        tipoUsuarioLogic.validateTipoUsuario(tipoUsuario);
    }

    public List<EstadoPrueba> getEstadoPrueba() throws Exception {
        return estadoPruebaLogic.getEstadoPrueba();
    }

    public void saveEstadoPrueba(EstadoPrueba entity) throws Exception {
        estadoPruebaLogic.saveEstadoPrueba(entity);
    }

    public void deleteEstadoPrueba(EstadoPrueba entity)
        throws Exception {
        estadoPruebaLogic.deleteEstadoPrueba(entity);
    }

    public void updateEstadoPrueba(EstadoPrueba entity)
        throws Exception {
        estadoPruebaLogic.updateEstadoPrueba(entity);
    }

    public EstadoPrueba getEstadoPrueba(Long idEstadoPrueba)
        throws Exception {
        EstadoPrueba estadoPrueba = null;

        try {
            estadoPrueba = estadoPruebaLogic.getEstadoPrueba(idEstadoPrueba);
        } catch (Exception e) {
            throw e;
        }

        return estadoPrueba;
    }

    public List<EstadoPrueba> findByCriteriaInEstadoPrueba(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return estadoPruebaLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<EstadoPrueba> findPageEstadoPrueba(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return estadoPruebaLogic.findPageEstadoPrueba(sortColumnName,
            sortAscending, startRow, maxResults);
    }

    public Long findTotalNumberEstadoPrueba() throws Exception {
        return estadoPruebaLogic.findTotalNumberEstadoPrueba();
    }

    public List<EstadoPruebaDTO> getDataEstadoPrueba()
        throws Exception {
        return estadoPruebaLogic.getDataEstadoPrueba();
    }

    public void validateEstadoPrueba(EstadoPrueba estadoPrueba)
        throws Exception {
        estadoPruebaLogic.validateEstadoPrueba(estadoPrueba);
    }

    public List<Respuesta> getRespuesta() throws Exception {
        return respuestaLogic.getRespuesta();
    }

    public void saveRespuesta(Respuesta entity) throws Exception {
        respuestaLogic.saveRespuesta(entity);
    }

    public void deleteRespuesta(Respuesta entity) throws Exception {
        respuestaLogic.deleteRespuesta(entity);
    }

    public void updateRespuesta(Respuesta entity) throws Exception {
        respuestaLogic.updateRespuesta(entity);
    }

    public Respuesta getRespuesta(Long idRespuesta) throws Exception {
        Respuesta respuesta = null;

        try {
            respuesta = respuestaLogic.getRespuesta(idRespuesta);
        } catch (Exception e) {
            throw e;
        }

        return respuesta;
    }

    public List<Respuesta> findByCriteriaInRespuesta(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return respuestaLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Respuesta> findPageRespuesta(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return respuestaLogic.findPageRespuesta(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberRespuesta() throws Exception {
        return respuestaLogic.findTotalNumberRespuesta();
    }

    public List<RespuestaDTO> getDataRespuesta() throws Exception {
        return respuestaLogic.getDataRespuesta();
    }

    public void validateRespuesta(Respuesta respuesta)
        throws Exception {
        respuestaLogic.validateRespuesta(respuesta);
    }

    public List<ResultadoReal> getResultadoReal() throws Exception {
        return resultadoRealLogic.getResultadoReal();
    }

    public void saveResultadoReal(ResultadoReal entity)
        throws Exception {
        resultadoRealLogic.saveResultadoReal(entity);
    }

    public void deleteResultadoReal(ResultadoReal entity)
        throws Exception {
        resultadoRealLogic.deleteResultadoReal(entity);
    }

    public void updateResultadoReal(ResultadoReal entity)
        throws Exception {
        resultadoRealLogic.updateResultadoReal(entity);
    }

    public ResultadoReal getResultadoReal(Long idResultadoReal)
        throws Exception {
        ResultadoReal resultadoReal = null;

        try {
            resultadoReal = resultadoRealLogic.getResultadoReal(idResultadoReal);
        } catch (Exception e) {
            throw e;
        }

        return resultadoReal;
    }

    public List<ResultadoReal> findByCriteriaInResultadoReal(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception {
        return resultadoRealLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<ResultadoReal> findPageResultadoReal(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return resultadoRealLogic.findPageResultadoReal(sortColumnName,
            sortAscending, startRow, maxResults);
    }

    public Long findTotalNumberResultadoReal() throws Exception {
        return resultadoRealLogic.findTotalNumberResultadoReal();
    }

    public List<ResultadoRealDTO> getDataResultadoReal()
        throws Exception {
        return resultadoRealLogic.getDataResultadoReal();
    }

    public void validateResultadoReal(ResultadoReal resultadoReal)
        throws Exception {
        resultadoRealLogic.validateResultadoReal(resultadoReal);
    }

    public List<PruebaModulo> getPruebaModulo() throws Exception {
        return pruebaModuloLogic.getPruebaModulo();
    }

    public void savePruebaModulo(PruebaModulo entity) throws Exception {
        pruebaModuloLogic.savePruebaModulo(entity);
    }

    public void deletePruebaModulo(PruebaModulo entity)
        throws Exception {
        pruebaModuloLogic.deletePruebaModulo(entity);
    }

    public void updatePruebaModulo(PruebaModulo entity)
        throws Exception {
        pruebaModuloLogic.updatePruebaModulo(entity);
    }

    public PruebaModulo getPruebaModulo(Long idPruebaModulo)
        throws Exception {
        PruebaModulo pruebaModulo = null;

        try {
            pruebaModulo = pruebaModuloLogic.getPruebaModulo(idPruebaModulo);
        } catch (Exception e) {
            throw e;
        }

        return pruebaModulo;
    }

    public List<PruebaModulo> findByCriteriaInPruebaModulo(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return pruebaModuloLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<PruebaModulo> findPagePruebaModulo(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return pruebaModuloLogic.findPagePruebaModulo(sortColumnName,
            sortAscending, startRow, maxResults);
    }

    public Long findTotalNumberPruebaModulo() throws Exception {
        return pruebaModuloLogic.findTotalNumberPruebaModulo();
    }

    public List<PruebaModuloDTO> getDataPruebaModulo()
        throws Exception {
        return pruebaModuloLogic.getDataPruebaModulo();
    }

    public void validatePruebaModulo(PruebaModulo pruebaModulo)
        throws Exception {
        pruebaModuloLogic.validatePruebaModulo(pruebaModulo);
    }

    public List<PruebaProgramaUsuario> getPruebaProgramaUsuario()
        throws Exception {
        return pruebaProgramaUsuarioLogic.getPruebaProgramaUsuario();
    }

    public void savePruebaProgramaUsuario(PruebaProgramaUsuario entity)
        throws Exception {
        pruebaProgramaUsuarioLogic.savePruebaProgramaUsuario(entity);
    }

    public void deletePruebaProgramaUsuario(PruebaProgramaUsuario entity)
        throws Exception {
        pruebaProgramaUsuarioLogic.deletePruebaProgramaUsuario(entity);
    }

    public void updatePruebaProgramaUsuario(PruebaProgramaUsuario entity)
        throws Exception {
        pruebaProgramaUsuarioLogic.updatePruebaProgramaUsuario(entity);
    }

    public PruebaProgramaUsuario getPruebaProgramaUsuario(
        Long idPruebaProgramaUsuario) throws Exception {
        PruebaProgramaUsuario pruebaProgramaUsuario = null;

        try {
            pruebaProgramaUsuario = pruebaProgramaUsuarioLogic.getPruebaProgramaUsuario(idPruebaProgramaUsuario);
        } catch (Exception e) {
            throw e;
        }

        return pruebaProgramaUsuario;
    }

    public List<PruebaProgramaUsuario> findByCriteriaInPruebaProgramaUsuario(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception {
        return pruebaProgramaUsuarioLogic.findByCriteria(variables,
            variablesBetween, variablesBetweenDates);
    }

    public List<PruebaProgramaUsuario> findPagePruebaProgramaUsuario(
        String sortColumnName, boolean sortAscending, int startRow,
        int maxResults) throws Exception {
        return pruebaProgramaUsuarioLogic.findPagePruebaProgramaUsuario(sortColumnName,
            sortAscending, startRow, maxResults);
    }

    public Long findTotalNumberPruebaProgramaUsuario()
        throws Exception {
        return pruebaProgramaUsuarioLogic.findTotalNumberPruebaProgramaUsuario();
    }

    public List<PruebaProgramaUsuarioDTO> getDataPruebaProgramaUsuario()
        throws Exception {
        return pruebaProgramaUsuarioLogic.getDataPruebaProgramaUsuario();
    }

    public void validatePruebaProgramaUsuario(
        PruebaProgramaUsuario pruebaProgramaUsuario) throws Exception {
        pruebaProgramaUsuarioLogic.validatePruebaProgramaUsuario(pruebaProgramaUsuario);
    }

    public List<Pregunta> getPregunta() throws Exception {
        return preguntaLogic.getPregunta();
    }

    public void savePregunta(Pregunta entity) throws Exception {
        preguntaLogic.savePregunta(entity);
    }

    public void deletePregunta(Pregunta entity) throws Exception {
        preguntaLogic.deletePregunta(entity);
    }

    public void updatePregunta(Pregunta entity) throws Exception {
        preguntaLogic.updatePregunta(entity);
    }

    public Pregunta getPregunta(Long idPregunta) throws Exception {
        Pregunta pregunta = null;

        try {
            pregunta = preguntaLogic.getPregunta(idPregunta);
        } catch (Exception e) {
            throw e;
        }

        return pregunta;
    }

    public List<Pregunta> findByCriteriaInPregunta(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return preguntaLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Pregunta> findPagePregunta(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return preguntaLogic.findPagePregunta(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberPregunta() throws Exception {
        return preguntaLogic.findTotalNumberPregunta();
    }

    public List<PreguntaDTO> getDataPregunta() throws Exception {
        return preguntaLogic.getDataPregunta();
    }

    public void validatePregunta(Pregunta pregunta) throws Exception {
        preguntaLogic.validatePregunta(pregunta);
    }

    public List<ProgramaModulo> getProgramaModulo() throws Exception {
        return programaModuloLogic.getProgramaModulo();
    }

    public void saveProgramaModulo(ProgramaModulo entity)
        throws Exception {
        programaModuloLogic.saveProgramaModulo(entity);
    }

    public void deleteProgramaModulo(ProgramaModulo entity)
        throws Exception {
        programaModuloLogic.deleteProgramaModulo(entity);
    }

    public void updateProgramaModulo(ProgramaModulo entity)
        throws Exception {
        programaModuloLogic.updateProgramaModulo(entity);
    }

    public ProgramaModulo getProgramaModulo(Long idProgramaModulo)
        throws Exception {
        ProgramaModulo programaModulo = null;

        try {
            programaModulo = programaModuloLogic.getProgramaModulo(idProgramaModulo);
        } catch (Exception e) {
            throw e;
        }

        return programaModulo;
    }

    public List<ProgramaModulo> findByCriteriaInProgramaModulo(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception {
        return programaModuloLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<ProgramaModulo> findPageProgramaModulo(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return programaModuloLogic.findPageProgramaModulo(sortColumnName,
            sortAscending, startRow, maxResults);
    }

    public Long findTotalNumberProgramaModulo() throws Exception {
        return programaModuloLogic.findTotalNumberProgramaModulo();
    }

    public List<ProgramaModuloDTO> getDataProgramaModulo()
        throws Exception {
        return programaModuloLogic.getDataProgramaModulo();
    }

    public void validateProgramaModulo(ProgramaModulo programaModulo)
        throws Exception {
        programaModuloLogic.validateProgramaModulo(programaModulo);
    }

    public List<Parametro> getParametro() throws Exception {
        return parametroLogic.getParametro();
    }

    public void saveParametro(Parametro entity) throws Exception {
        parametroLogic.saveParametro(entity);
    }

    public void deleteParametro(Parametro entity) throws Exception {
        parametroLogic.deleteParametro(entity);
    }

    public void updateParametro(Parametro entity) throws Exception {
        parametroLogic.updateParametro(entity);
    }

    public Parametro getParametro(Long idParametro) throws Exception {
        Parametro parametro = null;

        try {
            parametro = parametroLogic.getParametro(idParametro);
        } catch (Exception e) {
            throw e;
        }

        return parametro;
    }

    public List<Parametro> findByCriteriaInParametro(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return parametroLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Parametro> findPageParametro(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return parametroLogic.findPageParametro(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberParametro() throws Exception {
        return parametroLogic.findTotalNumberParametro();
    }

    public List<ParametroDTO> getDataParametro() throws Exception {
        return parametroLogic.getDataParametro();
    }

    public void validateParametro(Parametro parametro)
        throws Exception {
        parametroLogic.validateParametro(parametro);
    }

    public List<PruebaProgramaUsuarioPregunta> getPruebaProgramaUsuarioPregunta()
        throws Exception {
        return pruebaProgramaUsuarioPreguntaLogic.getPruebaProgramaUsuarioPregunta();
    }

    public void savePruebaProgramaUsuarioPregunta(
        PruebaProgramaUsuarioPregunta entity) throws Exception {
        pruebaProgramaUsuarioPreguntaLogic.savePruebaProgramaUsuarioPregunta(entity);
    }

    public void deletePruebaProgramaUsuarioPregunta(
        PruebaProgramaUsuarioPregunta entity) throws Exception {
        pruebaProgramaUsuarioPreguntaLogic.deletePruebaProgramaUsuarioPregunta(entity);
    }

    public void updatePruebaProgramaUsuarioPregunta(
        PruebaProgramaUsuarioPregunta entity) throws Exception {
        pruebaProgramaUsuarioPreguntaLogic.updatePruebaProgramaUsuarioPregunta(entity);
    }

    public PruebaProgramaUsuarioPregunta getPruebaProgramaUsuarioPregunta(
        Long idPruebaProgramaUsuarioPregunta) throws Exception {
        PruebaProgramaUsuarioPregunta pruebaProgramaUsuarioPregunta = null;

        try {
            pruebaProgramaUsuarioPregunta = pruebaProgramaUsuarioPreguntaLogic.getPruebaProgramaUsuarioPregunta(idPruebaProgramaUsuarioPregunta);
        } catch (Exception e) {
            throw e;
        }

        return pruebaProgramaUsuarioPregunta;
    }

    public List<PruebaProgramaUsuarioPregunta> findByCriteriaInPruebaProgramaUsuarioPregunta(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception {
        return pruebaProgramaUsuarioPreguntaLogic.findByCriteria(variables,
            variablesBetween, variablesBetweenDates);
    }

    public List<PruebaProgramaUsuarioPregunta> findPagePruebaProgramaUsuarioPregunta(
        String sortColumnName, boolean sortAscending, int startRow,
        int maxResults) throws Exception {
        return pruebaProgramaUsuarioPreguntaLogic.findPagePruebaProgramaUsuarioPregunta(sortColumnName,
            sortAscending, startRow, maxResults);
    }

    public Long findTotalNumberPruebaProgramaUsuarioPregunta()
        throws Exception {
        return pruebaProgramaUsuarioPreguntaLogic.findTotalNumberPruebaProgramaUsuarioPregunta();
    }

    public List<PruebaProgramaUsuarioPreguntaDTO> getDataPruebaProgramaUsuarioPregunta()
        throws Exception {
        return pruebaProgramaUsuarioPreguntaLogic.getDataPruebaProgramaUsuarioPregunta();
    }

    public void validatePruebaProgramaUsuarioPregunta(
        PruebaProgramaUsuarioPregunta pruebaProgramaUsuarioPregunta)
        throws Exception {
        pruebaProgramaUsuarioPreguntaLogic.validatePruebaProgramaUsuarioPregunta(pruebaProgramaUsuarioPregunta);
    }

    public List<TipoPregunta> getTipoPregunta() throws Exception {
        return tipoPreguntaLogic.getTipoPregunta();
    }

    public void saveTipoPregunta(TipoPregunta entity) throws Exception {
        tipoPreguntaLogic.saveTipoPregunta(entity);
    }

    public void deleteTipoPregunta(TipoPregunta entity)
        throws Exception {
        tipoPreguntaLogic.deleteTipoPregunta(entity);
    }

    public void updateTipoPregunta(TipoPregunta entity)
        throws Exception {
        tipoPreguntaLogic.updateTipoPregunta(entity);
    }

    public TipoPregunta getTipoPregunta(Long idTipoPregunta)
        throws Exception {
        TipoPregunta tipoPregunta = null;

        try {
            tipoPregunta = tipoPreguntaLogic.getTipoPregunta(idTipoPregunta);
        } catch (Exception e) {
            throw e;
        }

        return tipoPregunta;
    }

    public List<TipoPregunta> findByCriteriaInTipoPregunta(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tipoPreguntaLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<TipoPregunta> findPageTipoPregunta(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tipoPreguntaLogic.findPageTipoPregunta(sortColumnName,
            sortAscending, startRow, maxResults);
    }

    public Long findTotalNumberTipoPregunta() throws Exception {
        return tipoPreguntaLogic.findTotalNumberTipoPregunta();
    }

    public List<TipoPreguntaDTO> getDataTipoPregunta()
        throws Exception {
        return tipoPreguntaLogic.getDataTipoPregunta();
    }

    public void validateTipoPregunta(TipoPregunta tipoPregunta)
        throws Exception {
        tipoPreguntaLogic.validateTipoPregunta(tipoPregunta);
    }

    public List<Usuario> getUsuario() throws Exception {
        return usuarioLogic.getUsuario();
    }

    public void saveUsuario(Usuario entity) throws Exception {
        usuarioLogic.saveUsuario(entity);
    }

    public void deleteUsuario(Usuario entity) throws Exception {
        usuarioLogic.deleteUsuario(entity);
    }

    public void updateUsuario(Usuario entity) throws Exception {
        usuarioLogic.updateUsuario(entity);
    }

    public Usuario getUsuario(Long idUsuario) throws Exception {
        Usuario usuario = null;

        try {
            usuario = usuarioLogic.getUsuario(idUsuario);
        } catch (Exception e) {
            throw e;
        }

        return usuario;
    }

    public List<Usuario> findByCriteriaInUsuario(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return usuarioLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Usuario> findPageUsuario(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return usuarioLogic.findPageUsuario(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberUsuario() throws Exception {
        return usuarioLogic.findTotalNumberUsuario();
    }

    public List<UsuarioDTO> getDataUsuario() throws Exception {
        return usuarioLogic.getDataUsuario();
    }

    public void validateUsuario(Usuario usuario) throws Exception {
        usuarioLogic.validateUsuario(usuario);
    }

    public List<TipoPrueba> getTipoPrueba() throws Exception {
        return tipoPruebaLogic.getTipoPrueba();
    }

    public void saveTipoPrueba(TipoPrueba entity) throws Exception {
        tipoPruebaLogic.saveTipoPrueba(entity);
    }

    public void deleteTipoPrueba(TipoPrueba entity) throws Exception {
        tipoPruebaLogic.deleteTipoPrueba(entity);
    }

    public void updateTipoPrueba(TipoPrueba entity) throws Exception {
        tipoPruebaLogic.updateTipoPrueba(entity);
    }

    public TipoPrueba getTipoPrueba(Long idTipoPrueba)
        throws Exception {
        TipoPrueba tipoPrueba = null;

        try {
            tipoPrueba = tipoPruebaLogic.getTipoPrueba(idTipoPrueba);
        } catch (Exception e) {
            throw e;
        }

        return tipoPrueba;
    }

    public List<TipoPrueba> findByCriteriaInTipoPrueba(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tipoPruebaLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<TipoPrueba> findPageTipoPrueba(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tipoPruebaLogic.findPageTipoPrueba(sortColumnName,
            sortAscending, startRow, maxResults);
    }

    public Long findTotalNumberTipoPrueba() throws Exception {
        return tipoPruebaLogic.findTotalNumberTipoPrueba();
    }

    public List<TipoPruebaDTO> getDataTipoPrueba() throws Exception {
        return tipoPruebaLogic.getDataTipoPrueba();
    }

    public void validateTipoPrueba(TipoPrueba tipoPrueba)
        throws Exception {
        tipoPruebaLogic.validateTipoPrueba(tipoPrueba);
    }

    public List<Matricula> getMatricula() throws Exception {
        return matriculaLogic.getMatricula();
    }

    public void saveMatricula(Matricula entity) throws Exception {
        matriculaLogic.saveMatricula(entity);
    }

    public void deleteMatricula(Matricula entity) throws Exception {
        matriculaLogic.deleteMatricula(entity);
    }

    public void updateMatricula(Matricula entity) throws Exception {
        matriculaLogic.updateMatricula(entity);
    }

    public Matricula getMatricula(Long idMatricula) throws Exception {
        Matricula matricula = null;

        try {
            matricula = matriculaLogic.getMatricula(idMatricula);
        } catch (Exception e) {
            throw e;
        }

        return matricula;
    }

    public List<Matricula> findByCriteriaInMatricula(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return matriculaLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Matricula> findPageMatricula(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return matriculaLogic.findPageMatricula(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberMatricula() throws Exception {
        return matriculaLogic.findTotalNumberMatricula();
    }

    public List<MatriculaDTO> getDataMatricula() throws Exception {
        return matriculaLogic.getDataMatricula();
    }

    public void validateMatricula(Matricula matricula)
        throws Exception {
        matriculaLogic.validateMatricula(matricula);
    }

    public List<Facultad> getFacultad() throws Exception {
        return facultadLogic.getFacultad();
    }

    public void saveFacultad(Facultad entity) throws Exception {
        facultadLogic.saveFacultad(entity);
    }

    public void deleteFacultad(Facultad entity) throws Exception {
        facultadLogic.deleteFacultad(entity);
    }

    public void updateFacultad(Facultad entity) throws Exception {
        facultadLogic.updateFacultad(entity);
    }

    public Facultad getFacultad(Long idFacultad) throws Exception {
        Facultad facultad = null;

        try {
            facultad = facultadLogic.getFacultad(idFacultad);
        } catch (Exception e) {
            throw e;
        }

        return facultad;
    }

    public List<Facultad> findByCriteriaInFacultad(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return facultadLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Facultad> findPageFacultad(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return facultadLogic.findPageFacultad(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberFacultad() throws Exception {
        return facultadLogic.findTotalNumberFacultad();
    }

    public List<FacultadDTO> getDataFacultad() throws Exception {
        return facultadLogic.getDataFacultad();
    }

    public void validateFacultad(Facultad facultad) throws Exception {
        facultadLogic.validateFacultad(facultad);
    }

    public List<RespuestaPruebaProgramaUsuarioPregunta> getRespuestaPruebaProgramaUsuarioPregunta()
        throws Exception {
        return respuestaPruebaProgramaUsuarioPreguntaLogic.getRespuestaPruebaProgramaUsuarioPregunta();
    }

    public void saveRespuestaPruebaProgramaUsuarioPregunta(
        RespuestaPruebaProgramaUsuarioPregunta entity)
        throws Exception {
        respuestaPruebaProgramaUsuarioPreguntaLogic.saveRespuestaPruebaProgramaUsuarioPregunta(entity);
    }

    public void deleteRespuestaPruebaProgramaUsuarioPregunta(
        RespuestaPruebaProgramaUsuarioPregunta entity)
        throws Exception {
        respuestaPruebaProgramaUsuarioPreguntaLogic.deleteRespuestaPruebaProgramaUsuarioPregunta(entity);
    }

    public void updateRespuestaPruebaProgramaUsuarioPregunta(
        RespuestaPruebaProgramaUsuarioPregunta entity)
        throws Exception {
        respuestaPruebaProgramaUsuarioPreguntaLogic.updateRespuestaPruebaProgramaUsuarioPregunta(entity);
    }

    public RespuestaPruebaProgramaUsuarioPregunta getRespuestaPruebaProgramaUsuarioPregunta(
        Long idRespuestaPruebaProgramaUsuarioPregunta)
        throws Exception {
        RespuestaPruebaProgramaUsuarioPregunta respuestaPruebaProgramaUsuarioPregunta =
            null;

        try {
            respuestaPruebaProgramaUsuarioPregunta = respuestaPruebaProgramaUsuarioPreguntaLogic.getRespuestaPruebaProgramaUsuarioPregunta(idRespuestaPruebaProgramaUsuarioPregunta);
        } catch (Exception e) {
            throw e;
        }

        return respuestaPruebaProgramaUsuarioPregunta;
    }

    public List<RespuestaPruebaProgramaUsuarioPregunta> findByCriteriaInRespuestaPruebaProgramaUsuarioPregunta(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception {
        return respuestaPruebaProgramaUsuarioPreguntaLogic.findByCriteria(variables,
            variablesBetween, variablesBetweenDates);
    }

    public List<RespuestaPruebaProgramaUsuarioPregunta> findPageRespuestaPruebaProgramaUsuarioPregunta(
        String sortColumnName, boolean sortAscending, int startRow,
        int maxResults) throws Exception {
        return respuestaPruebaProgramaUsuarioPreguntaLogic.findPageRespuestaPruebaProgramaUsuarioPregunta(sortColumnName,
            sortAscending, startRow, maxResults);
    }

    public Long findTotalNumberRespuestaPruebaProgramaUsuarioPregunta()
        throws Exception {
        return respuestaPruebaProgramaUsuarioPreguntaLogic.findTotalNumberRespuestaPruebaProgramaUsuarioPregunta();
    }

    public List<RespuestaPruebaProgramaUsuarioPreguntaDTO> getDataRespuestaPruebaProgramaUsuarioPregunta()
        throws Exception {
        return respuestaPruebaProgramaUsuarioPreguntaLogic.getDataRespuestaPruebaProgramaUsuarioPregunta();
    }

    public void validateRespuestaPruebaProgramaUsuarioPregunta(
        RespuestaPruebaProgramaUsuarioPregunta respuestaPruebaProgramaUsuarioPregunta)
        throws Exception {
        respuestaPruebaProgramaUsuarioPreguntaLogic.validateRespuestaPruebaProgramaUsuarioPregunta(respuestaPruebaProgramaUsuarioPregunta);
    }

    public List<PruebaReal> getPruebaReal() throws Exception {
        return pruebaRealLogic.getPruebaReal();
    }

    public void savePruebaReal(PruebaReal entity) throws Exception {
        pruebaRealLogic.savePruebaReal(entity);
    }

    public void deletePruebaReal(PruebaReal entity) throws Exception {
        pruebaRealLogic.deletePruebaReal(entity);
    }

    public void updatePruebaReal(PruebaReal entity) throws Exception {
        pruebaRealLogic.updatePruebaReal(entity);
    }

    public PruebaReal getPruebaReal(Long idPruebaReal)
        throws Exception {
        PruebaReal pruebaReal = null;

        try {
            pruebaReal = pruebaRealLogic.getPruebaReal(idPruebaReal);
        } catch (Exception e) {
            throw e;
        }

        return pruebaReal;
    }

    public List<PruebaReal> findByCriteriaInPruebaReal(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return pruebaRealLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<PruebaReal> findPagePruebaReal(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return pruebaRealLogic.findPagePruebaReal(sortColumnName,
            sortAscending, startRow, maxResults);
    }

    public Long findTotalNumberPruebaReal() throws Exception {
        return pruebaRealLogic.findTotalNumberPruebaReal();
    }

    public List<PruebaRealDTO> getDataPruebaReal() throws Exception {
        return pruebaRealLogic.getDataPruebaReal();
    }

    public void validatePruebaReal(PruebaReal pruebaReal)
        throws Exception {
        pruebaRealLogic.validatePruebaReal(pruebaReal);
    }

    public List<Permiso> getPermiso() throws Exception {
        return permisoLogic.getPermiso();
    }

    public void savePermiso(Permiso entity) throws Exception {
        permisoLogic.savePermiso(entity);
    }

    public void deletePermiso(Permiso entity) throws Exception {
        permisoLogic.deletePermiso(entity);
    }

    public void updatePermiso(Permiso entity) throws Exception {
        permisoLogic.updatePermiso(entity);
    }

    public Permiso getPermiso(Long idPermiso) throws Exception {
        Permiso permiso = null;

        try {
            permiso = permisoLogic.getPermiso(idPermiso);
        } catch (Exception e) {
            throw e;
        }

        return permiso;
    }

    public List<Permiso> findByCriteriaInPermiso(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return permisoLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Permiso> findPagePermiso(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return permisoLogic.findPagePermiso(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberPermiso() throws Exception {
        return permisoLogic.findTotalNumberPermiso();
    }

    public List<PermisoDTO> getDataPermiso() throws Exception {
        return permisoLogic.getDataPermiso();
    }

    public void validatePermiso(Permiso permiso) throws Exception {
        permisoLogic.validatePermiso(permiso);
    }

    public List<GrupoOpcion> getGrupoOpcion() throws Exception {
        return grupoOpcionLogic.getGrupoOpcion();
    }

    public void saveGrupoOpcion(GrupoOpcion entity) throws Exception {
        grupoOpcionLogic.saveGrupoOpcion(entity);
    }

    public void deleteGrupoOpcion(GrupoOpcion entity) throws Exception {
        grupoOpcionLogic.deleteGrupoOpcion(entity);
    }

    public void updateGrupoOpcion(GrupoOpcion entity) throws Exception {
        grupoOpcionLogic.updateGrupoOpcion(entity);
    }

    public GrupoOpcion getGrupoOpcion(Long idGrupoOpcion)
        throws Exception {
        GrupoOpcion grupoOpcion = null;

        try {
            grupoOpcion = grupoOpcionLogic.getGrupoOpcion(idGrupoOpcion);
        } catch (Exception e) {
            throw e;
        }

        return grupoOpcion;
    }

    public List<GrupoOpcion> findByCriteriaInGrupoOpcion(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return grupoOpcionLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<GrupoOpcion> findPageGrupoOpcion(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return grupoOpcionLogic.findPageGrupoOpcion(sortColumnName,
            sortAscending, startRow, maxResults);
    }

    public Long findTotalNumberGrupoOpcion() throws Exception {
        return grupoOpcionLogic.findTotalNumberGrupoOpcion();
    }

    public List<GrupoOpcionDTO> getDataGrupoOpcion() throws Exception {
        return grupoOpcionLogic.getDataGrupoOpcion();
    }

    public void validateGrupoOpcion(GrupoOpcion grupoOpcion)
        throws Exception {
        grupoOpcionLogic.validateGrupoOpcion(grupoOpcion);
    }

    public List<Prueba> getPrueba() throws Exception {
        return pruebaLogic.getPrueba();
    }

    public void savePrueba(Prueba entity) throws Exception {
        pruebaLogic.savePrueba(entity);
    }

    public void deletePrueba(Prueba entity) throws Exception {
        pruebaLogic.deletePrueba(entity);
    }

    public void updatePrueba(Prueba entity) throws Exception {
        pruebaLogic.updatePrueba(entity);
    }

    public Prueba getPrueba(Long idPrueba) throws Exception {
        Prueba prueba = null;

        try {
            prueba = pruebaLogic.getPrueba(idPrueba);
        } catch (Exception e) {
            throw e;
        }

        return prueba;
    }

    public List<Prueba> findByCriteriaInPrueba(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return pruebaLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Prueba> findPagePrueba(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return pruebaLogic.findPagePrueba(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberPrueba() throws Exception {
        return pruebaLogic.findTotalNumberPrueba();
    }

    public List<PruebaDTO> getDataPrueba() throws Exception {
        return pruebaLogic.getDataPrueba();
    }

    public void validatePrueba(Prueba prueba) throws Exception {
        pruebaLogic.validatePrueba(prueba);
    }

    public List<Opcion> getOpcion() throws Exception {
        return opcionLogic.getOpcion();
    }

    public void saveOpcion(Opcion entity) throws Exception {
        opcionLogic.saveOpcion(entity);
    }

    public void deleteOpcion(Opcion entity) throws Exception {
        opcionLogic.deleteOpcion(entity);
    }

    public void updateOpcion(Opcion entity) throws Exception {
        opcionLogic.updateOpcion(entity);
    }

    public Opcion getOpcion(Long idOpcion) throws Exception {
        Opcion opcion = null;

        try {
            opcion = opcionLogic.getOpcion(idOpcion);
        } catch (Exception e) {
            throw e;
        }

        return opcion;
    }

    public List<Opcion> findByCriteriaInOpcion(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return opcionLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Opcion> findPageOpcion(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return opcionLogic.findPageOpcion(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberOpcion() throws Exception {
        return opcionLogic.findTotalNumberOpcion();
    }

    public List<OpcionDTO> getDataOpcion() throws Exception {
        return opcionLogic.getDataOpcion();
    }

    public void validateOpcion(Opcion opcion) throws Exception {
        opcionLogic.validateOpcion(opcion);
    }

    public List<TipoModulo> getTipoModulo() throws Exception {
        return tipoModuloLogic.getTipoModulo();
    }

    public void saveTipoModulo(TipoModulo entity) throws Exception {
        tipoModuloLogic.saveTipoModulo(entity);
    }

    public void deleteTipoModulo(TipoModulo entity) throws Exception {
        tipoModuloLogic.deleteTipoModulo(entity);
    }

    public void updateTipoModulo(TipoModulo entity) throws Exception {
        tipoModuloLogic.updateTipoModulo(entity);
    }

    public TipoModulo getTipoModulo(Long idTipoModulo)
        throws Exception {
        TipoModulo tipoModulo = null;

        try {
            tipoModulo = tipoModuloLogic.getTipoModulo(idTipoModulo);
        } catch (Exception e) {
            throw e;
        }

        return tipoModulo;
    }

    public List<TipoModulo> findByCriteriaInTipoModulo(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tipoModuloLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<TipoModulo> findPageTipoModulo(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tipoModuloLogic.findPageTipoModulo(sortColumnName,
            sortAscending, startRow, maxResults);
    }

    public Long findTotalNumberTipoModulo() throws Exception {
        return tipoModuloLogic.findTotalNumberTipoModulo();
    }

    public List<TipoModuloDTO> getDataTipoModulo() throws Exception {
        return tipoModuloLogic.getDataTipoModulo();
    }

    public void validateTipoModulo(TipoModulo tipoModulo)
        throws Exception {
        tipoModuloLogic.validateTipoModulo(tipoModulo);
    }

    public List<Programa> getPrograma() throws Exception {
        return programaLogic.getPrograma();
    }

    public void savePrograma(Programa entity) throws Exception {
        programaLogic.savePrograma(entity);
    }

    public void deletePrograma(Programa entity) throws Exception {
        programaLogic.deletePrograma(entity);
    }

    public void updatePrograma(Programa entity) throws Exception {
        programaLogic.updatePrograma(entity);
    }

    public Programa getPrograma(Long idPrograma) throws Exception {
        Programa programa = null;

        try {
            programa = programaLogic.getPrograma(idPrograma);
        } catch (Exception e) {
            throw e;
        }

        return programa;
    }

    public List<Programa> findByCriteriaInPrograma(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return programaLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Programa> findPagePrograma(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return programaLogic.findPagePrograma(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberPrograma() throws Exception {
        return programaLogic.findTotalNumberPrograma();
    }

    public List<ProgramaDTO> getDataPrograma() throws Exception {
        return programaLogic.getDataPrograma();
    }

    public void validatePrograma(Programa programa) throws Exception {
        programaLogic.validatePrograma(programa);
    }

    public List<ProgramaUsuario> getProgramaUsuario() throws Exception {
        return programaUsuarioLogic.getProgramaUsuario();
    }

    public void saveProgramaUsuario(ProgramaUsuario entity)
        throws Exception {
        programaUsuarioLogic.saveProgramaUsuario(entity);
    }

    public void deleteProgramaUsuario(ProgramaUsuario entity)
        throws Exception {
        programaUsuarioLogic.deleteProgramaUsuario(entity);
    }

    public void updateProgramaUsuario(ProgramaUsuario entity)
        throws Exception {
        programaUsuarioLogic.updateProgramaUsuario(entity);
    }

    public ProgramaUsuario getProgramaUsuario(Long idProgramaUsuario)
        throws Exception {
        ProgramaUsuario programaUsuario = null;

        try {
            programaUsuario = programaUsuarioLogic.getProgramaUsuario(idProgramaUsuario);
        } catch (Exception e) {
            throw e;
        }

        return programaUsuario;
    }

    public List<ProgramaUsuario> findByCriteriaInProgramaUsuario(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception {
        return programaUsuarioLogic.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<ProgramaUsuario> findPageProgramaUsuario(
        String sortColumnName, boolean sortAscending, int startRow,
        int maxResults) throws Exception {
        return programaUsuarioLogic.findPageProgramaUsuario(sortColumnName,
            sortAscending, startRow, maxResults);
    }

    public Long findTotalNumberProgramaUsuario() throws Exception {
        return programaUsuarioLogic.findTotalNumberProgramaUsuario();
    }

    public List<ProgramaUsuarioDTO> getDataProgramaUsuario()
        throws Exception {
        return programaUsuarioLogic.getDataProgramaUsuario();
    }

    public void validateProgramaUsuario(ProgramaUsuario programaUsuario)
        throws Exception {
        programaUsuarioLogic.validateProgramaUsuario(programaUsuario);
    }
}
