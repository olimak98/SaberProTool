package com.saberpro.modelo;

import org.hibernate.validator.constraints.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import javax.validation.constraints.*;


/**
* @author Zathura Code Generator http://zathuracode.org/
* www.zathuracode.org
*
*/
@Entity
@Table(name = "pregunta", schema = "public")
public class Pregunta implements java.io.Serializable {
    @NotNull
    private Long idPregunta;
    @NotNull
    private Modulo modulo;
    @NotNull
    private TipoPregunta tipoPregunta;
    @NotNull
    @NotEmpty
    @Size(max = 1)
    private String activo;
    @NotNull
    @NotEmpty
    @Size(max = 3000)
    private String descripcionPregunta;
    @NotNull
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String retroalimentacion;
    private String rutaImagen;
    @NotNull
    private Long usuCreador;
    private Long usuModificador;
    private Set<PruebaProgramaUsuarioPregunta> pruebaProgramaUsuarioPreguntas = new HashSet<PruebaProgramaUsuarioPregunta>(0);
    private Set<Respuesta> respuestas = new HashSet<Respuesta>(0);

    public Pregunta() {
    }

    public Pregunta(Long idPregunta, String activo, String descripcionPregunta,
        Date fechaCreacion, Date fechaModificacion, Modulo modulo,
        Set<PruebaProgramaUsuarioPregunta> pruebaProgramaUsuarioPreguntas,
        Set<Respuesta> respuestas, String retroalimentacion, String rutaImagen,
        TipoPregunta tipoPregunta, Long usuCreador, Long usuModificador) {
        this.idPregunta = idPregunta;
        this.modulo = modulo;
        this.tipoPregunta = tipoPregunta;
        this.activo = activo;
        this.descripcionPregunta = descripcionPregunta;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.retroalimentacion = retroalimentacion;
        this.rutaImagen = rutaImagen;
        this.usuCreador = usuCreador;
        this.usuModificador = usuModificador;
        this.pruebaProgramaUsuarioPreguntas = pruebaProgramaUsuarioPreguntas;
        this.respuestas = respuestas;
    }

    @Id
    @Column(name = "id_pregunta", unique = true, nullable = false)
    public Long getIdPregunta() {
        return this.idPregunta;
    }

    public void setIdPregunta(Long idPregunta) {
        this.idPregunta = idPregunta;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_modulo")
    public Modulo getModulo() {
        return this.modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_pregunta")
    public TipoPregunta getTipoPregunta() {
        return this.tipoPregunta;
    }

    public void setTipoPregunta(TipoPregunta tipoPregunta) {
        this.tipoPregunta = tipoPregunta;
    }

    @Column(name = "activo", nullable = false)
    public String getActivo() {
        return this.activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    @Column(name = "descripcion_pregunta", nullable = false)
    public String getDescripcionPregunta() {
        return this.descripcionPregunta;
    }

    public void setDescripcionPregunta(String descripcionPregunta) {
        this.descripcionPregunta = descripcionPregunta;
    }

    @Column(name = "fecha_creacion", nullable = false)
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Column(name = "fecha_modificacion")
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Column(name = "retroalimentacion")
    public String getRetroalimentacion() {
        return this.retroalimentacion;
    }

    public void setRetroalimentacion(String retroalimentacion) {
        this.retroalimentacion = retroalimentacion;
    }

    @Column(name = "ruta_imagen")
    public String getRutaImagen() {
        return this.rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    @Column(name = "usu_creador", nullable = false)
    public Long getUsuCreador() {
        return this.usuCreador;
    }

    public void setUsuCreador(Long usuCreador) {
        this.usuCreador = usuCreador;
    }

    @Column(name = "usu_modificador")
    public Long getUsuModificador() {
        return this.usuModificador;
    }

    public void setUsuModificador(Long usuModificador) {
        this.usuModificador = usuModificador;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pregunta")
    public Set<PruebaProgramaUsuarioPregunta> getPruebaProgramaUsuarioPreguntas() {
        return this.pruebaProgramaUsuarioPreguntas;
    }

    public void setPruebaProgramaUsuarioPreguntas(
        Set<PruebaProgramaUsuarioPregunta> pruebaProgramaUsuarioPreguntas) {
        this.pruebaProgramaUsuarioPreguntas = pruebaProgramaUsuarioPreguntas;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pregunta")
    public Set<Respuesta> getRespuestas() {
        return this.respuestas;
    }

    public void setRespuestas(Set<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }
}
