/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.s2.s2.models;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Artur
 */
@Entity
@Table(name = "ts2_tipo_de_area")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ts2TipoDeArea.findAll", query = "SELECT t FROM Ts2TipoDeArea t"),
    @NamedQuery(name = "Ts2TipoDeArea.findByIdTipoDeArea", query = "SELECT t FROM Ts2TipoDeArea t WHERE t.idTipoDeArea = :idTipoDeArea"),
    @NamedQuery(name = "Ts2TipoDeArea.findByValor", query = "SELECT t FROM Ts2TipoDeArea t WHERE t.valor = :valor"),
    @NamedQuery(name = "Ts2TipoDeArea.findByClave", query = "SELECT t FROM Ts2TipoDeArea t WHERE t.clave = :clave")})
public class Ts2TipoDeArea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tipo_de_area")
    private Integer idTipoDeArea;
    @Column(name = "valor")
    private String valor;
    @Column(name = "clave")
    private String clave;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ts2TipoDeArea")
    private Collection<Ts2ServidorPublicoArea> ts2ServidorPublicoAreaCollection;

    public Ts2TipoDeArea() {
    }

    public Ts2TipoDeArea(Integer idTipoDeArea) {
        this.idTipoDeArea = idTipoDeArea;
    }

    public Integer getIdTipoDeArea() {
        return idTipoDeArea;
    }

    public void setIdTipoDeArea(Integer idTipoDeArea) {
        this.idTipoDeArea = idTipoDeArea;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @XmlTransient
    public Collection<Ts2ServidorPublicoArea> getTs2ServidorPublicoAreaCollection() {
        return ts2ServidorPublicoAreaCollection;
    }

    public void setTs2ServidorPublicoAreaCollection(Collection<Ts2ServidorPublicoArea> ts2ServidorPublicoAreaCollection) {
        this.ts2ServidorPublicoAreaCollection = ts2ServidorPublicoAreaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoDeArea != null ? idTipoDeArea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Ts2TipoDeArea)) {
            return false;
        }
        Ts2TipoDeArea other = (Ts2TipoDeArea) object;
        if ((this.idTipoDeArea == null && other.idTipoDeArea != null) || (this.idTipoDeArea != null && !this.idTipoDeArea.equals(other.idTipoDeArea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Ts2TipoDeArea[ idTipoDeArea=" + idTipoDeArea + " ]";
    }
    
}
