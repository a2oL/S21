/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.s2.s2.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Artur Lpz
 */
@Entity
@Table(name = "ts2_servidor_publico")
public class Ts2ServidorPublico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "fechacaptura")
    @Temporal(TemporalType.DATE)
    private Date fechacaptura;
    @Column(name = "ejerciciofiscal")
    private String ejerciciofiscal;
    @Column(name = "fechainicialdelejercicio")
    @Temporal(TemporalType.DATE)
    private Date fechainicialdelejercicio;
    @Column(name = "fechafinaldelejercicio")
    @Temporal(TemporalType.DATE)
    private Date fechafinaldelejercicio;
    @Column(name = "rfc")
    private String rfc;
    @Column(name = "curp")
    private String curp;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "primerapellido")
    private String primerapellido;
    @Column(name = "segundoapellido")
    private String segundoapellido;
    @Column(name = "fecha_de_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaDeRegistro;
    @Column(name = "usuario_de_registro")
    private String usuarioDeRegistro;
    @Column(name = "fecha_de_modificacion")
    @Temporal(TemporalType.DATE)
    private Date fechaDeModificacion;
    @Column(name = "usuario_de_modificacion")
    private String usuarioDeModificacion;
    @Column(name = "revisado")
    private Integer revisado;
    @Column(name = "observaciones_verificacion")
    private String observacionesVerificacion;
    @Column(name = "fecha_de_revision")
    @Temporal(TemporalType.DATE)
    private Date fechaDeRevision;
    @Column(name = "usuario_de_revision")
    private String usuarioDeRevision;
    
    @JoinColumn(name = "id_tipo_de_ente_publico", referencedColumnName = "id_tipo_de_ente_publico")
    @ManyToOne
    private Ts2TipoDeEntePublico idTipoDeEntePublico;
    @JoinColumn(name = "id_tipo_de_genero", referencedColumnName = "id_tipo_de_genero")
    @ManyToOne
    private Ts2TipoDeGenero idTipoDeGenero;
    @JoinColumn(name = "id_tipo_de_puesto", referencedColumnName = "id_tipo_de_puesto")
    @ManyToOne
    private Ts2TipoDePuesto idTipoDePuesto;
    @JoinColumn(name = "id_tipo_de_ramo", referencedColumnName = "id_tipo_de_ramo")
    @ManyToOne
    private Ts2TipoDeRamo idTipoDeRamo;
    

    public Ts2ServidorPublico() {
    }

    public Ts2ServidorPublico(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechacaptura() {
        return fechacaptura;
    }

    public void setFechacaptura(Date fechacaptura) {
        this.fechacaptura = fechacaptura;
    }

    public String getEjerciciofiscal() {
        return ejerciciofiscal;
    }

    public void setEjerciciofiscal(String ejerciciofiscal) {
        this.ejerciciofiscal = ejerciciofiscal;
    }

    public Date getFechainicialdelejercicio() {
        return fechainicialdelejercicio;
    }

    public void setFechainicialdelejercicio(Date fechainicialdelejercicio) {
        this.fechainicialdelejercicio = fechainicialdelejercicio;
    }

    public Date getFechafinaldelejercicio() {
        return fechafinaldelejercicio;
    }

    public void setFechafinaldelejercicio(Date fechafinaldelejercicio) {
        this.fechafinaldelejercicio = fechafinaldelejercicio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    public Date getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(Date fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public String getUsuarioDeRegistro() {
        return usuarioDeRegistro;
    }

    public void setUsuarioDeRegistro(String usuarioDeRegistro) {
        this.usuarioDeRegistro = usuarioDeRegistro;
    }

    public Date getFechaDeModificacion() {
        return fechaDeModificacion;
    }

    public void setFechaDeModificacion(Date fechaDeModificacion) {
        this.fechaDeModificacion = fechaDeModificacion;
    }

    public String getUsuarioDeModificacion() {
        return usuarioDeModificacion;
    }

    public void setUsuarioDeModificacion(String usuarioDeModificacion) {
        this.usuarioDeModificacion = usuarioDeModificacion;
    }

    public Integer getRevisado() {
        return revisado;
    }

    public void setRevisado(Integer revisado) {
        this.revisado = revisado;
    }

    public String getObservacionesVerificacion() {
        return observacionesVerificacion;
    }

    public void setObservacionesVerificacion(String observacionesVerificacion) {
        this.observacionesVerificacion = observacionesVerificacion;
    }

    public Date getFechaDeRevision() {
        return fechaDeRevision;
    }

    public void setFechaDeRevision(Date fechaDeRevision) {
        this.fechaDeRevision = fechaDeRevision;
    }

    public String getUsuarioDeRevision() {
        return usuarioDeRevision;
    }

    public void setUsuarioDeRevision(String usuarioDeRevision) {
        this.usuarioDeRevision = usuarioDeRevision;
    }


    public Ts2TipoDeEntePublico getIdTipoDeEntePublico() {
        return idTipoDeEntePublico;
    }

    public void setIdTipoDeEntePublico(Ts2TipoDeEntePublico idTipoDeEntePublico) {
        this.idTipoDeEntePublico = idTipoDeEntePublico;
    }

    public Ts2TipoDeGenero getIdTipoDeGenero() {
        return idTipoDeGenero;
    }

    public void setIdTipoDeGenero(Ts2TipoDeGenero idTipoDeGenero) {
        this.idTipoDeGenero = idTipoDeGenero;
    }

    public Ts2TipoDePuesto getIdTipoDePuesto() {
        return idTipoDePuesto;
    }

    public void setIdTipoDePuesto(Ts2TipoDePuesto idTipoDePuesto) {
        this.idTipoDePuesto = idTipoDePuesto;
    }

    public Ts2TipoDeRamo getIdTipoDeRamo() {
        return idTipoDeRamo;
    }

    public void setIdTipoDeRamo(Ts2TipoDeRamo idTipoDeRamo) {
        this.idTipoDeRamo = idTipoDeRamo;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
     
        if (!(object instanceof Ts2ServidorPublico)) {
            return false;
        }
        Ts2ServidorPublico other = (Ts2ServidorPublico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Ts2ServidorPublico[ id=" + id + " ]";
    }
    
}
