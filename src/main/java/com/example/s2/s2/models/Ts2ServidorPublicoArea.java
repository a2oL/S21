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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Artur
 */
@Entity
@Table(name = "ts2_servidor_publico_area")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ts2ServidorPublicoArea.findAll", query = "SELECT t FROM Ts2ServidorPublicoArea t"),
    @NamedQuery(name = "Ts2ServidorPublicoArea.findById", query = "SELECT t FROM Ts2ServidorPublicoArea t WHERE t.ts2ServidorPublicoAreaPK.id = :id"),
    @NamedQuery(name = "Ts2ServidorPublicoArea.findByOrden", query = "SELECT t FROM Ts2ServidorPublicoArea t WHERE t.ts2ServidorPublicoAreaPK.orden = :orden"),
    @NamedQuery(name = "Ts2ServidorPublicoArea.findByIdTipoDeArea", query = "SELECT t FROM Ts2ServidorPublicoArea t WHERE t.ts2ServidorPublicoAreaPK.idTipoDeArea = :idTipoDeArea"),
    @NamedQuery(name = "Ts2ServidorPublicoArea.findByFechaDeRegistro", query = "SELECT t FROM Ts2ServidorPublicoArea t WHERE t.fechaDeRegistro = :fechaDeRegistro"),
    @NamedQuery(name = "Ts2ServidorPublicoArea.findByUsuarioDeRegistro", query = "SELECT t FROM Ts2ServidorPublicoArea t WHERE t.usuarioDeRegistro = :usuarioDeRegistro"),
    @NamedQuery(name = "Ts2ServidorPublicoArea.findByFechaDeModificacion", query = "SELECT t FROM Ts2ServidorPublicoArea t WHERE t.fechaDeModificacion = :fechaDeModificacion"),
    @NamedQuery(name = "Ts2ServidorPublicoArea.findByUsuarioDeModificacion", query = "SELECT t FROM Ts2ServidorPublicoArea t WHERE t.usuarioDeModificacion = :usuarioDeModificacion")})
public class Ts2ServidorPublicoArea implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Ts2ServidorPublicoAreaPK ts2ServidorPublicoAreaPK;
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
    @JoinColumn(name = "id_tipo_de_area", referencedColumnName = "id_tipo_de_area", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Ts2TipoDeArea ts2TipoDeArea;

    public Ts2ServidorPublicoArea() {
    }

    public Ts2ServidorPublicoArea(Ts2ServidorPublicoAreaPK ts2ServidorPublicoAreaPK) {
        this.ts2ServidorPublicoAreaPK = ts2ServidorPublicoAreaPK;
    }

    public Ts2ServidorPublicoArea(String id, int orden, int idTipoDeArea) {
        this.ts2ServidorPublicoAreaPK = new Ts2ServidorPublicoAreaPK(id, orden, idTipoDeArea);
    }

    public Ts2ServidorPublicoAreaPK getTs2ServidorPublicoAreaPK() {
        return ts2ServidorPublicoAreaPK;
    }

    public void setTs2ServidorPublicoAreaPK(Ts2ServidorPublicoAreaPK ts2ServidorPublicoAreaPK) {
        this.ts2ServidorPublicoAreaPK = ts2ServidorPublicoAreaPK;
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

    public Ts2TipoDeArea getTs2TipoDeArea() {
        return ts2TipoDeArea;
    }

    public void setTs2TipoDeArea(Ts2TipoDeArea ts2TipoDeArea) {
        this.ts2TipoDeArea = ts2TipoDeArea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ts2ServidorPublicoAreaPK != null ? ts2ServidorPublicoAreaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
   
        if (!(object instanceof Ts2ServidorPublicoArea)) {
            return false;
        }
        Ts2ServidorPublicoArea other = (Ts2ServidorPublicoArea) object;
        if ((this.ts2ServidorPublicoAreaPK == null && other.ts2ServidorPublicoAreaPK != null) || (this.ts2ServidorPublicoAreaPK != null && !this.ts2ServidorPublicoAreaPK.equals(other.ts2ServidorPublicoAreaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Ts2ServidorPublicoArea[ ts2ServidorPublicoAreaPK=" + ts2ServidorPublicoAreaPK + " ]";
    }
    
}
