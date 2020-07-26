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
@Table(name = "ts2_tipo_de_responsabilidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ts2TipoDeResponsabilidad.findAll", query = "SELECT t FROM Ts2TipoDeResponsabilidad t"),
    @NamedQuery(name = "Ts2TipoDeResponsabilidad.findByIdTipoDeResponsabilidad", query = "SELECT t FROM Ts2TipoDeResponsabilidad t WHERE t.idTipoDeResponsabilidad = :idTipoDeResponsabilidad"),
    @NamedQuery(name = "Ts2TipoDeResponsabilidad.findByValor", query = "SELECT t FROM Ts2TipoDeResponsabilidad t WHERE t.valor = :valor"),
    @NamedQuery(name = "Ts2TipoDeResponsabilidad.findByClave", query = "SELECT t FROM Ts2TipoDeResponsabilidad t WHERE t.clave = :clave")})
public class Ts2TipoDeResponsabilidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tipo_de_responsabilidad")
    private Integer idTipoDeResponsabilidad;
    @Column(name = "valor")
    private String valor;
    @Column(name = "clave")
    private String clave;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ts2TipoDeResponsabilidad")
    private Collection<Ts2ServidorPublicoResponsa> ts2ServidorPublicoResponsaCollection;

    public Ts2TipoDeResponsabilidad() {
    }

    public Ts2TipoDeResponsabilidad(Integer idTipoDeResponsabilidad) {
        this.idTipoDeResponsabilidad = idTipoDeResponsabilidad;
    }

    public Integer getIdTipoDeResponsabilidad() {
        return idTipoDeResponsabilidad;
    }

    public void setIdTipoDeResponsabilidad(Integer idTipoDeResponsabilidad) {
        this.idTipoDeResponsabilidad = idTipoDeResponsabilidad;
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
    public Collection<Ts2ServidorPublicoResponsa> getTs2ServidorPublicoResponsaCollection() {
        return ts2ServidorPublicoResponsaCollection;
    }

    public void setTs2ServidorPublicoResponsaCollection(Collection<Ts2ServidorPublicoResponsa> ts2ServidorPublicoResponsaCollection) {
        this.ts2ServidorPublicoResponsaCollection = ts2ServidorPublicoResponsaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoDeResponsabilidad != null ? idTipoDeResponsabilidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Ts2TipoDeResponsabilidad)) {
            return false;
        }
        Ts2TipoDeResponsabilidad other = (Ts2TipoDeResponsabilidad) object;
        if ((this.idTipoDeResponsabilidad == null && other.idTipoDeResponsabilidad != null) || (this.idTipoDeResponsabilidad != null && !this.idTipoDeResponsabilidad.equals(other.idTipoDeResponsabilidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Ts2TipoDeResponsabilidad[ idTipoDeResponsabilidad=" + idTipoDeResponsabilidad + " ]";
    }
    
}
