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
@Table(name = "ts2_servidor_publico_superior")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ts2ServidorPublicoSuperior.findAll", query = "SELECT t FROM Ts2ServidorPublicoSuperior t"),
    @NamedQuery(name = "Ts2ServidorPublicoSuperior.findById", query = "SELECT t FROM Ts2ServidorPublicoSuperior t WHERE t.ts2ServidorPublicoSuperiorPK.id = :id"),
    @NamedQuery(name = "Ts2ServidorPublicoSuperior.findByOrden", query = "SELECT t FROM Ts2ServidorPublicoSuperior t WHERE t.ts2ServidorPublicoSuperiorPK.orden = :orden"),
    @NamedQuery(name = "Ts2ServidorPublicoSuperior.findByNombres", query = "SELECT t FROM Ts2ServidorPublicoSuperior t WHERE t.nombres = :nombres"),
    @NamedQuery(name = "Ts2ServidorPublicoSuperior.findByPrimerapellido", query = "SELECT t FROM Ts2ServidorPublicoSuperior t WHERE t.primerapellido = :primerapellido"),
    @NamedQuery(name = "Ts2ServidorPublicoSuperior.findBySegundoapellido", query = "SELECT t FROM Ts2ServidorPublicoSuperior t WHERE t.segundoapellido = :segundoapellido"),
    @NamedQuery(name = "Ts2ServidorPublicoSuperior.findByCurp", query = "SELECT t FROM Ts2ServidorPublicoSuperior t WHERE t.curp = :curp"),
    @NamedQuery(name = "Ts2ServidorPublicoSuperior.findByRfc", query = "SELECT t FROM Ts2ServidorPublicoSuperior t WHERE t.rfc = :rfc"),
    @NamedQuery(name = "Ts2ServidorPublicoSuperior.findByFechaDeRegistro", query = "SELECT t FROM Ts2ServidorPublicoSuperior t WHERE t.fechaDeRegistro = :fechaDeRegistro"),
    @NamedQuery(name = "Ts2ServidorPublicoSuperior.findByUsuarioDeRegistro", query = "SELECT t FROM Ts2ServidorPublicoSuperior t WHERE t.usuarioDeRegistro = :usuarioDeRegistro"),
    @NamedQuery(name = "Ts2ServidorPublicoSuperior.findByFechaDeModificacion", query = "SELECT t FROM Ts2ServidorPublicoSuperior t WHERE t.fechaDeModificacion = :fechaDeModificacion"),
    @NamedQuery(name = "Ts2ServidorPublicoSuperior.findByUsuarioDeModificacion", query = "SELECT t FROM Ts2ServidorPublicoSuperior t WHERE t.usuarioDeModificacion = :usuarioDeModificacion")})
public class Ts2ServidorPublicoSuperior implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Ts2ServidorPublicoSuperiorPK ts2ServidorPublicoSuperiorPK;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "primerapellido")
    private String primerapellido;
    @Column(name = "segundoapellido")
    private String segundoapellido;
    @Column(name = "curp")
    private String curp;
    @Column(name = "rfc")
    private String rfc;
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
    @JoinColumn(name = "id_tipo_de_puesto", referencedColumnName = "id_tipo_de_puesto")
    @ManyToOne
    private Ts2TipoDePuesto idTipoDePuesto;

    public Ts2ServidorPublicoSuperior() {
    }

    public Ts2ServidorPublicoSuperior(Ts2ServidorPublicoSuperiorPK ts2ServidorPublicoSuperiorPK) {
        this.ts2ServidorPublicoSuperiorPK = ts2ServidorPublicoSuperiorPK;
    }

    public Ts2ServidorPublicoSuperior(String id, int orden) {
        this.ts2ServidorPublicoSuperiorPK = new Ts2ServidorPublicoSuperiorPK(id, orden);
    }

    public Ts2ServidorPublicoSuperiorPK getTs2ServidorPublicoSuperiorPK() {
        return ts2ServidorPublicoSuperiorPK;
    }

    public void setTs2ServidorPublicoSuperiorPK(Ts2ServidorPublicoSuperiorPK ts2ServidorPublicoSuperiorPK) {
        this.ts2ServidorPublicoSuperiorPK = ts2ServidorPublicoSuperiorPK;
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

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
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

    public Ts2TipoDePuesto getIdTipoDePuesto() {
        return idTipoDePuesto;
    }

    public void setIdTipoDePuesto(Ts2TipoDePuesto idTipoDePuesto) {
        this.idTipoDePuesto = idTipoDePuesto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ts2ServidorPublicoSuperiorPK != null ? ts2ServidorPublicoSuperiorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Ts2ServidorPublicoSuperior)) {
            return false;
        }
        Ts2ServidorPublicoSuperior other = (Ts2ServidorPublicoSuperior) object;
        if ((this.ts2ServidorPublicoSuperiorPK == null && other.ts2ServidorPublicoSuperiorPK != null) || (this.ts2ServidorPublicoSuperiorPK != null && !this.ts2ServidorPublicoSuperiorPK.equals(other.ts2ServidorPublicoSuperiorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Ts2ServidorPublicoSuperior[ ts2ServidorPublicoSuperiorPK=" + ts2ServidorPublicoSuperiorPK + " ]";
    }
    
}
