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

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import java.util.Set;


/**
* @author Zathura Code Generator http://zathuracode.org/
* www.zathuracode.org
*
*/
public interface IBusinessDelegatorView {
    public List<Modulo> getModulo() throws Exception;

    public void saveModulo(Modulo entity) throws Exception;

    public void deleteModulo(Modulo entity) throws Exception;

    public void updateModulo(Modulo entity) throws Exception;

    public Modulo getModulo(Long idModulo) throws Exception;

    public List<Modulo> findByCriteriaInModulo(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Modulo> findPageModulo(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberModulo() throws Exception;

    public List<ModuloDTO> getDataModulo() throws Exception;

    public void validateModulo(Modulo modulo) throws Exception;

    public List<TipoUsuario> getTipoUsuario() throws Exception;

    public void saveTipoUsuario(TipoUsuario entity) throws Exception;

    public void deleteTipoUsuario(TipoUsuario entity) throws Exception;

    public void updateTipoUsuario(TipoUsuario entity) throws Exception;

    public TipoUsuario getTipoUsuario(Long idTipoUsuario)
        throws Exception;

    public List<TipoUsuario> findByCriteriaInTipoUsuario(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<TipoUsuario> findPageTipoUsuario(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTipoUsuario() throws Exception;

    public List<TipoUsuarioDTO> getDataTipoUsuario() throws Exception;

    public void validateTipoUsuario(TipoUsuario tipoUsuario)
        throws Exception;

    public List<EstadoPrueba> getEstadoPrueba() throws Exception;

    public void saveEstadoPrueba(EstadoPrueba entity) throws Exception;

    public void deleteEstadoPrueba(EstadoPrueba entity)
        throws Exception;

    public void updateEstadoPrueba(EstadoPrueba entity)
        throws Exception;

    public EstadoPrueba getEstadoPrueba(Long idEstadoPrueba)
        throws Exception;

    public List<EstadoPrueba> findByCriteriaInEstadoPrueba(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<EstadoPrueba> findPageEstadoPrueba(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberEstadoPrueba() throws Exception;

    public List<EstadoPruebaDTO> getDataEstadoPrueba()
        throws Exception;

    public void validateEstadoPrueba(EstadoPrueba estadoPrueba)
        throws Exception;

    public List<Respuesta> getRespuesta() throws Exception;

    public void saveRespuesta(Respuesta entity) throws Exception;

    public void deleteRespuesta(Respuesta entity) throws Exception;

    public void updateRespuesta(Respuesta entity) throws Exception;

    public Respuesta getRespuesta(Long idRespuesta) throws Exception;

    public List<Respuesta> findByCriteriaInRespuesta(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Respuesta> findPageRespuesta(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberRespuesta() throws Exception;

    public List<RespuestaDTO> getDataRespuesta() throws Exception;

    public void validateRespuesta(Respuesta respuesta)
        throws Exception;

    public List<ResultadoReal> getResultadoReal() throws Exception;

    public void saveResultadoReal(ResultadoReal entity)
        throws Exception;

    public void deleteResultadoReal(ResultadoReal entity)
        throws Exception;

    public void updateResultadoReal(ResultadoReal entity)
        throws Exception;

    public ResultadoReal getResultadoReal(Long idResultadoReal)
        throws Exception;

    public List<ResultadoReal> findByCriteriaInResultadoReal(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception;

    public List<ResultadoReal> findPageResultadoReal(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberResultadoReal() throws Exception;

    public List<ResultadoRealDTO> getDataResultadoReal()
        throws Exception;

    public void validateResultadoReal(ResultadoReal resultadoReal)
        throws Exception;

    public List<PruebaModulo> getPruebaModulo() throws Exception;

    public void savePruebaModulo(PruebaModulo entity) throws Exception;

    public void deletePruebaModulo(PruebaModulo entity)
        throws Exception;

    public void updatePruebaModulo(PruebaModulo entity)
        throws Exception;

    public PruebaModulo getPruebaModulo(Long idPruebaModulo)
        throws Exception;

    public List<PruebaModulo> findByCriteriaInPruebaModulo(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<PruebaModulo> findPagePruebaModulo(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberPruebaModulo() throws Exception;

    public List<PruebaModuloDTO> getDataPruebaModulo()
        throws Exception;

    public void validatePruebaModulo(PruebaModulo pruebaModulo)
        throws Exception;

    public List<PruebaProgramaUsuario> getPruebaProgramaUsuario()
        throws Exception;

    public void savePruebaProgramaUsuario(PruebaProgramaUsuario entity)
        throws Exception;

    public void deletePruebaProgramaUsuario(PruebaProgramaUsuario entity)
        throws Exception;

    public void updatePruebaProgramaUsuario(PruebaProgramaUsuario entity)
        throws Exception;

    public PruebaProgramaUsuario getPruebaProgramaUsuario(
        Long idPruebaProgramaUsuario) throws Exception;

    public List<PruebaProgramaUsuario> findByCriteriaInPruebaProgramaUsuario(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception;

    public List<PruebaProgramaUsuario> findPagePruebaProgramaUsuario(
        String sortColumnName, boolean sortAscending, int startRow,
        int maxResults) throws Exception;

    public Long findTotalNumberPruebaProgramaUsuario()
        throws Exception;

    public List<PruebaProgramaUsuarioDTO> getDataPruebaProgramaUsuario()
        throws Exception;

    public void validatePruebaProgramaUsuario(
        PruebaProgramaUsuario pruebaProgramaUsuario) throws Exception;

    public List<Pregunta> getPregunta() throws Exception;

    public void savePregunta(Pregunta entity) throws Exception;

    public void deletePregunta(Pregunta entity) throws Exception;

    public void updatePregunta(Pregunta entity) throws Exception;

    public Pregunta getPregunta(Long idPregunta) throws Exception;

    public List<Pregunta> findByCriteriaInPregunta(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Pregunta> findPagePregunta(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberPregunta() throws Exception;

    public List<PreguntaDTO> getDataPregunta() throws Exception;

    public void validatePregunta(Pregunta pregunta) throws Exception;

    public List<ProgramaModulo> getProgramaModulo() throws Exception;

    public void saveProgramaModulo(ProgramaModulo entity)
        throws Exception;

    public void deleteProgramaModulo(ProgramaModulo entity)
        throws Exception;

    public void updateProgramaModulo(ProgramaModulo entity)
        throws Exception;

    public ProgramaModulo getProgramaModulo(Long idProgramaModulo)
        throws Exception;

    public List<ProgramaModulo> findByCriteriaInProgramaModulo(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception;

    public List<ProgramaModulo> findPageProgramaModulo(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberProgramaModulo() throws Exception;

    public List<ProgramaModuloDTO> getDataProgramaModulo()
        throws Exception;

    public void validateProgramaModulo(ProgramaModulo programaModulo)
        throws Exception;

    public List<Parametro> getParametro() throws Exception;

    public void saveParametro(Parametro entity) throws Exception;

    public void deleteParametro(Parametro entity) throws Exception;

    public void updateParametro(Parametro entity) throws Exception;

    public Parametro getParametro(Long idParametro) throws Exception;

    public List<Parametro> findByCriteriaInParametro(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Parametro> findPageParametro(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberParametro() throws Exception;

    public List<ParametroDTO> getDataParametro() throws Exception;

    public void validateParametro(Parametro parametro)
        throws Exception;

    public List<PruebaProgramaUsuarioPregunta> getPruebaProgramaUsuarioPregunta()
        throws Exception;

    public void savePruebaProgramaUsuarioPregunta(
        PruebaProgramaUsuarioPregunta entity) throws Exception;

    public void deletePruebaProgramaUsuarioPregunta(
        PruebaProgramaUsuarioPregunta entity) throws Exception;

    public void updatePruebaProgramaUsuarioPregunta(
        PruebaProgramaUsuarioPregunta entity) throws Exception;

    public PruebaProgramaUsuarioPregunta getPruebaProgramaUsuarioPregunta(
        Long idPruebaProgramaUsuarioPregunta) throws Exception;

    public List<PruebaProgramaUsuarioPregunta> findByCriteriaInPruebaProgramaUsuarioPregunta(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception;

    public List<PruebaProgramaUsuarioPregunta> findPagePruebaProgramaUsuarioPregunta(
        String sortColumnName, boolean sortAscending, int startRow,
        int maxResults) throws Exception;

    public Long findTotalNumberPruebaProgramaUsuarioPregunta()
        throws Exception;

    public List<PruebaProgramaUsuarioPreguntaDTO> getDataPruebaProgramaUsuarioPregunta()
        throws Exception;

    public void validatePruebaProgramaUsuarioPregunta(
        PruebaProgramaUsuarioPregunta pruebaProgramaUsuarioPregunta)
        throws Exception;

    public List<TipoPregunta> getTipoPregunta() throws Exception;

    public void saveTipoPregunta(TipoPregunta entity) throws Exception;

    public void deleteTipoPregunta(TipoPregunta entity)
        throws Exception;

    public void updateTipoPregunta(TipoPregunta entity)
        throws Exception;

    public TipoPregunta getTipoPregunta(Long idTipoPregunta)
        throws Exception;

    public List<TipoPregunta> findByCriteriaInTipoPregunta(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<TipoPregunta> findPageTipoPregunta(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTipoPregunta() throws Exception;

    public List<TipoPreguntaDTO> getDataTipoPregunta()
        throws Exception;

    public void validateTipoPregunta(TipoPregunta tipoPregunta)
        throws Exception;

    public List<Usuario> getUsuario() throws Exception;

    public void saveUsuario(Usuario entity) throws Exception;

    public void deleteUsuario(Usuario entity) throws Exception;

    public void updateUsuario(Usuario entity) throws Exception;

    public Usuario getUsuario(Long idUsuario) throws Exception;

    public List<Usuario> findByCriteriaInUsuario(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Usuario> findPageUsuario(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberUsuario() throws Exception;

    public List<UsuarioDTO> getDataUsuario() throws Exception;

    public void validateUsuario(Usuario usuario) throws Exception;

    public List<TipoPrueba> getTipoPrueba() throws Exception;

    public void saveTipoPrueba(TipoPrueba entity) throws Exception;

    public void deleteTipoPrueba(TipoPrueba entity) throws Exception;

    public void updateTipoPrueba(TipoPrueba entity) throws Exception;

    public TipoPrueba getTipoPrueba(Long idTipoPrueba)
        throws Exception;

    public List<TipoPrueba> findByCriteriaInTipoPrueba(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<TipoPrueba> findPageTipoPrueba(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTipoPrueba() throws Exception;

    public List<TipoPruebaDTO> getDataTipoPrueba() throws Exception;

    public void validateTipoPrueba(TipoPrueba tipoPrueba)
        throws Exception;

    public List<Matricula> getMatricula() throws Exception;

    public void saveMatricula(Matricula entity) throws Exception;

    public void deleteMatricula(Matricula entity) throws Exception;

    public void updateMatricula(Matricula entity) throws Exception;

    public Matricula getMatricula(Long idMatricula) throws Exception;

    public List<Matricula> findByCriteriaInMatricula(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Matricula> findPageMatricula(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberMatricula() throws Exception;

    public List<MatriculaDTO> getDataMatricula() throws Exception;

    public void validateMatricula(Matricula matricula)
        throws Exception;

    public List<Facultad> getFacultad() throws Exception;

    public void saveFacultad(Facultad entity) throws Exception;

    public void deleteFacultad(Facultad entity) throws Exception;

    public void updateFacultad(Facultad entity) throws Exception;

    public Facultad getFacultad(Long idFacultad) throws Exception;

    public List<Facultad> findByCriteriaInFacultad(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Facultad> findPageFacultad(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberFacultad() throws Exception;

    public List<FacultadDTO> getDataFacultad() throws Exception;

    public void validateFacultad(Facultad facultad) throws Exception;

    public List<RespuestaPruebaProgramaUsuarioPregunta> getRespuestaPruebaProgramaUsuarioPregunta()
        throws Exception;

    public void saveRespuestaPruebaProgramaUsuarioPregunta(
        RespuestaPruebaProgramaUsuarioPregunta entity)
        throws Exception;

    public void deleteRespuestaPruebaProgramaUsuarioPregunta(
        RespuestaPruebaProgramaUsuarioPregunta entity)
        throws Exception;

    public void updateRespuestaPruebaProgramaUsuarioPregunta(
        RespuestaPruebaProgramaUsuarioPregunta entity)
        throws Exception;

    public RespuestaPruebaProgramaUsuarioPregunta getRespuestaPruebaProgramaUsuarioPregunta(
        Long idRespuestaPruebaProgramaUsuarioPregunta)
        throws Exception;

    public List<RespuestaPruebaProgramaUsuarioPregunta> findByCriteriaInRespuestaPruebaProgramaUsuarioPregunta(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception;

    public List<RespuestaPruebaProgramaUsuarioPregunta> findPageRespuestaPruebaProgramaUsuarioPregunta(
        String sortColumnName, boolean sortAscending, int startRow,
        int maxResults) throws Exception;

    public Long findTotalNumberRespuestaPruebaProgramaUsuarioPregunta()
        throws Exception;

    public List<RespuestaPruebaProgramaUsuarioPreguntaDTO> getDataRespuestaPruebaProgramaUsuarioPregunta()
        throws Exception;

    public void validateRespuestaPruebaProgramaUsuarioPregunta(
        RespuestaPruebaProgramaUsuarioPregunta respuestaPruebaProgramaUsuarioPregunta)
        throws Exception;

    public List<PruebaReal> getPruebaReal() throws Exception;

    public void savePruebaReal(PruebaReal entity) throws Exception;

    public void deletePruebaReal(PruebaReal entity) throws Exception;

    public void updatePruebaReal(PruebaReal entity) throws Exception;

    public PruebaReal getPruebaReal(Long idPruebaReal)
        throws Exception;

    public List<PruebaReal> findByCriteriaInPruebaReal(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<PruebaReal> findPagePruebaReal(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberPruebaReal() throws Exception;

    public List<PruebaRealDTO> getDataPruebaReal() throws Exception;

    public void validatePruebaReal(PruebaReal pruebaReal)
        throws Exception;

    public List<Permiso> getPermiso() throws Exception;

    public void savePermiso(Permiso entity) throws Exception;

    public void deletePermiso(Permiso entity) throws Exception;

    public void updatePermiso(Permiso entity) throws Exception;

    public Permiso getPermiso(Long idPermiso) throws Exception;

    public List<Permiso> findByCriteriaInPermiso(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Permiso> findPagePermiso(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberPermiso() throws Exception;

    public List<PermisoDTO> getDataPermiso() throws Exception;

    public void validatePermiso(Permiso permiso) throws Exception;

    public List<GrupoOpcion> getGrupoOpcion() throws Exception;

    public void saveGrupoOpcion(GrupoOpcion entity) throws Exception;

    public void deleteGrupoOpcion(GrupoOpcion entity) throws Exception;

    public void updateGrupoOpcion(GrupoOpcion entity) throws Exception;

    public GrupoOpcion getGrupoOpcion(Long idGrupoOpcion)
        throws Exception;

    public List<GrupoOpcion> findByCriteriaInGrupoOpcion(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<GrupoOpcion> findPageGrupoOpcion(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberGrupoOpcion() throws Exception;

    public List<GrupoOpcionDTO> getDataGrupoOpcion() throws Exception;

    public void validateGrupoOpcion(GrupoOpcion grupoOpcion)
        throws Exception;

    public List<Prueba> getPrueba() throws Exception;

    public void savePrueba(Prueba entity) throws Exception;

    public void deletePrueba(Prueba entity) throws Exception;

    public void updatePrueba(Prueba entity) throws Exception;

    public Prueba getPrueba(Long idPrueba) throws Exception;

    public List<Prueba> findByCriteriaInPrueba(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Prueba> findPagePrueba(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberPrueba() throws Exception;

    public List<PruebaDTO> getDataPrueba() throws Exception;

    public void validatePrueba(Prueba prueba) throws Exception;

    public List<Opcion> getOpcion() throws Exception;

    public void saveOpcion(Opcion entity) throws Exception;

    public void deleteOpcion(Opcion entity) throws Exception;

    public void updateOpcion(Opcion entity) throws Exception;

    public Opcion getOpcion(Long idOpcion) throws Exception;

    public List<Opcion> findByCriteriaInOpcion(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Opcion> findPageOpcion(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberOpcion() throws Exception;

    public List<OpcionDTO> getDataOpcion() throws Exception;

    public void validateOpcion(Opcion opcion) throws Exception;

    public List<TipoModulo> getTipoModulo() throws Exception;

    public void saveTipoModulo(TipoModulo entity) throws Exception;

    public void deleteTipoModulo(TipoModulo entity) throws Exception;

    public void updateTipoModulo(TipoModulo entity) throws Exception;

    public TipoModulo getTipoModulo(Long idTipoModulo)
        throws Exception;

    public List<TipoModulo> findByCriteriaInTipoModulo(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<TipoModulo> findPageTipoModulo(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTipoModulo() throws Exception;

    public List<TipoModuloDTO> getDataTipoModulo() throws Exception;

    public void validateTipoModulo(TipoModulo tipoModulo)
        throws Exception;

    public List<Programa> getPrograma() throws Exception;

    public void savePrograma(Programa entity) throws Exception;

    public void deletePrograma(Programa entity) throws Exception;

    public void updatePrograma(Programa entity) throws Exception;

    public Programa getPrograma(Long idPrograma) throws Exception;

    public List<Programa> findByCriteriaInPrograma(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Programa> findPagePrograma(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberPrograma() throws Exception;

    public List<ProgramaDTO> getDataPrograma() throws Exception;

    public void validatePrograma(Programa programa) throws Exception;

    public List<ProgramaUsuario> getProgramaUsuario() throws Exception;

    public void saveProgramaUsuario(ProgramaUsuario entity)
        throws Exception;

    public void deleteProgramaUsuario(ProgramaUsuario entity)
        throws Exception;

    public void updateProgramaUsuario(ProgramaUsuario entity)
        throws Exception;

    public ProgramaUsuario getProgramaUsuario(Long idProgramaUsuario)
        throws Exception;

    public List<ProgramaUsuario> findByCriteriaInProgramaUsuario(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception;

    public List<ProgramaUsuario> findPageProgramaUsuario(
        String sortColumnName, boolean sortAscending, int startRow,
        int maxResults) throws Exception;

    public Long findTotalNumberProgramaUsuario() throws Exception;

    public List<ProgramaUsuarioDTO> getDataProgramaUsuario()
        throws Exception;

    public void validateProgramaUsuario(ProgramaUsuario programaUsuario)
        throws Exception;
}
