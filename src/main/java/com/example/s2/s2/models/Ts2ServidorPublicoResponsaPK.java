/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.s2.s2.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Artur
 */
@Embeddable
public class Ts2ServidorPublicoResponsaPK implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1150579287576526959L;
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "orden")
    private int orden;
    @Basic(optional = false)
    @Column(name = "id_tipo_de_responsabilidad")
    private int idTipoDeResponsabilidad;

    public Ts2ServidorPublicoResponsaPK() {
    }

    public Ts2ServidorPublicoResponsaPK(String id, int orden, int idTipoDeResponsabilidad) {
        this.id = id;
        this.orden = orden;
        this.idTipoDeResponsabilidad = idTipoDeResponsabilidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public int getIdTipoDeResponsabilidad() {
        return idTipoDeResponsabilidad;
    }

    public void setIdTipoDeResponsabilidad(int idTipoDeResponsabilidad) {
        this.idTipoDeResponsabilidad = idTipoDeResponsabilidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        hash += (int) orden;
        hash += (int) idTipoDeResponsabilidad;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
    
        if (!(object instanceof Ts2ServidorPublicoResponsaPK)) {
            return false;
        }
        Ts2ServidorPublicoResponsaPK other = (Ts2ServidorPublicoResponsaPK) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        if (this.orden != other.orden) {
            return false;
        }
        if (this.idTipoDeResponsabilidad != other.idTipoDeResponsabilidad) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Ts2ServidorPublicoResponsaPK[ id=" + id + ", orden=" + orden + ", idTipoDeResponsabilidad=" + idTipoDeResponsabilidad + " ]";
    }
    
}
