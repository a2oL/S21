/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.s2.s2.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Artur
 */
@Entity
@Table(name = "ts2_servidor_publico_responsa")
public class Ts2ServidorPublicoResponsa implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Ts2ServidorPublicoResponsaPK ts2ServidorPublicoResponsaPK;
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
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Ts2ServidorPublico ts2ServidorPublico;
    @JoinColumn(name = "id_tipo_de_responsabilidad", referencedColumnName = "id_tipo_de_responsabilidad", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Ts2TipoDeResponsabilidad ts2TipoDeResponsabilidad;

    public Ts2ServidorPublicoResponsa() {
    }

    public Ts2ServidorPublicoResponsa(Ts2ServidorPublicoResponsaPK ts2ServidorPublicoResponsaPK) {
        this.ts2ServidorPublicoResponsaPK = ts2ServidorPublicoResponsaPK;
    }

    public Ts2ServidorPublicoResponsa(String id, int orden, int idTipoDeResponsabilidad) {
        this.ts2ServidorPublicoResponsaPK = new Ts2ServidorPublicoResponsaPK(id, orden, idTipoDeResponsabilidad);
    }

    public Ts2ServidorPublicoResponsaPK getTs2ServidorPublicoResponsaPK() {
        return ts2ServidorPublicoResponsaPK;
    }

    public void setTs2ServidorPublicoResponsaPK(Ts2ServidorPublicoResponsaPK ts2ServidorPublicoResponsaPK) {
        this.ts2ServidorPublicoResponsaPK = ts2ServidorPublicoResponsaPK;
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

    public Ts2ServidorPublico getTs2ServidorPublico() {
        return ts2ServidorPublico;
    }

    public void setTs2ServidorPublico(Ts2ServidorPublico ts2ServidorPublico) {
        this.ts2ServidorPublico = ts2ServidorPublico;
    }

    public Ts2TipoDeResponsabilidad getTs2TipoDeResponsabilidad() {
        return ts2TipoDeResponsabilidad;
    }

    public void setTs2TipoDeResponsabilidad(Ts2TipoDeResponsabilidad ts2TipoDeResponsabilidad) {
        this.ts2TipoDeResponsabilidad = ts2TipoDeResponsabilidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ts2ServidorPublicoResponsaPK != null ? ts2ServidorPublicoResponsaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
    
        if (!(object instanceof Ts2ServidorPublicoResponsa)) {
            return false;
        }
        Ts2ServidorPublicoResponsa other = (Ts2ServidorPublicoResponsa) object;
        if ((this.ts2ServidorPublicoResponsaPK == null && other.ts2ServidorPublicoResponsaPK != null) || (this.ts2ServidorPublicoResponsaPK != null && !this.ts2ServidorPublicoResponsaPK.equals(other.ts2ServidorPublicoResponsaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Ts2ServidorPublicoResponsa[ ts2ServidorPublicoResponsaPK=" + ts2ServidorPublicoResponsaPK + " ]";
    }
    
}
