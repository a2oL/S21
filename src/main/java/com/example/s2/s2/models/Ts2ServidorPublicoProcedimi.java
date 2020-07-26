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
@Table(name = "ts2_servidor_publico_procedimi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ts2ServidorPublicoProcedimi.findAll", query = "SELECT t FROM Ts2ServidorPublicoProcedimi t"),
    @NamedQuery(name = "Ts2ServidorPublicoProcedimi.findById", query = "SELECT t FROM Ts2ServidorPublicoProcedimi t WHERE t.ts2ServidorPublicoProcedimiPK.id = :id"),
    @NamedQuery(name = "Ts2ServidorPublicoProcedimi.findByOrden", query = "SELECT t FROM Ts2ServidorPublicoProcedimi t WHERE t.ts2ServidorPublicoProcedimiPK.orden = :orden"),
    @NamedQuery(name = "Ts2ServidorPublicoProcedimi.findByIdTipoDeProcedimiento", query = "SELECT t FROM Ts2ServidorPublicoProcedimi t WHERE t.ts2ServidorPublicoProcedimiPK.idTipoDeProcedimiento = :idTipoDeProcedimiento"),
    @NamedQuery(name = "Ts2ServidorPublicoProcedimi.findByFechaDeRegistro", query = "SELECT t FROM Ts2ServidorPublicoProcedimi t WHERE t.fechaDeRegistro = :fechaDeRegistro"),
    @NamedQuery(name = "Ts2ServidorPublicoProcedimi.findByUsuarioDeRegistro", query = "SELECT t FROM Ts2ServidorPublicoProcedimi t WHERE t.usuarioDeRegistro = :usuarioDeRegistro"),
    @NamedQuery(name = "Ts2ServidorPublicoProcedimi.findByFechaDeModificacion", query = "SELECT t FROM Ts2ServidorPublicoProcedimi t WHERE t.fechaDeModificacion = :fechaDeModificacion"),
    @NamedQuery(name = "Ts2ServidorPublicoProcedimi.findByUsuarioDeModificacion", query = "SELECT t FROM Ts2ServidorPublicoProcedimi t WHERE t.usuarioDeModificacion = :usuarioDeModificacion")})
public class Ts2ServidorPublicoProcedimi implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Ts2ServidorPublicoProcedimiPK ts2ServidorPublicoProcedimiPK;
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
    @JoinColumn(name = "id_tipo_de_procedimiento", referencedColumnName = "id_tipo_de_procedimiento", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Ts2TipoDeProcedimiento ts2TipoDeProcedimiento;

    public Ts2ServidorPublicoProcedimi() {
    }

    public Ts2ServidorPublicoProcedimi(Ts2ServidorPublicoProcedimiPK ts2ServidorPublicoProcedimiPK) {
        this.ts2ServidorPublicoProcedimiPK = ts2ServidorPublicoProcedimiPK;
    }

    public Ts2ServidorPublicoProcedimi(String id, int orden, int idTipoDeProcedimiento) {
        this.ts2ServidorPublicoProcedimiPK = new Ts2ServidorPublicoProcedimiPK(id, orden, idTipoDeProcedimiento);
    }

    public Ts2ServidorPublicoProcedimiPK getTs2ServidorPublicoProcedimiPK() {
        return ts2ServidorPublicoProcedimiPK;
    }

    public void setTs2ServidorPublicoProcedimiPK(Ts2ServidorPublicoProcedimiPK ts2ServidorPublicoProcedimiPK) {
        this.ts2ServidorPublicoProcedimiPK = ts2ServidorPublicoProcedimiPK;
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

    public Ts2TipoDeProcedimiento getTs2TipoDeProcedimiento() {
        return ts2TipoDeProcedimiento;
    }

    public void setTs2TipoDeProcedimiento(Ts2TipoDeProcedimiento ts2TipoDeProcedimiento) {
        this.ts2TipoDeProcedimiento = ts2TipoDeProcedimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ts2ServidorPublicoProcedimiPK != null ? ts2ServidorPublicoProcedimiPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Ts2ServidorPublicoProcedimi)) {
            return false;
        }
        Ts2ServidorPublicoProcedimi other = (Ts2ServidorPublicoProcedimi) object;
        if ((this.ts2ServidorPublicoProcedimiPK == null && other.ts2ServidorPublicoProcedimiPK != null) || (this.ts2ServidorPublicoProcedimiPK != null && !this.ts2ServidorPublicoProcedimiPK.equals(other.ts2ServidorPublicoProcedimiPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Ts2ServidorPublicoProcedimi[ ts2ServidorPublicoProcedimiPK=" + ts2ServidorPublicoProcedimiPK + " ]";
    }
    
}
