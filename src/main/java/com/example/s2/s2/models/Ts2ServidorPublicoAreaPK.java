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
public class Ts2ServidorPublicoAreaPK implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 6191280800835138698L;
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "orden")
    private int orden;
    @Basic(optional = false)
    @Column(name = "id_tipo_de_area")
    private int idTipoDeArea;

    public Ts2ServidorPublicoAreaPK() {
    }

    public Ts2ServidorPublicoAreaPK(String id, int orden, int idTipoDeArea) {
        this.id = id;
        this.orden = orden;
        this.idTipoDeArea = idTipoDeArea;
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

    public int getIdTipoDeArea() {
        return idTipoDeArea;
    }

    public void setIdTipoDeArea(int idTipoDeArea) {
        this.idTipoDeArea = idTipoDeArea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        hash += (int) orden;
        hash += (int) idTipoDeArea;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Ts2ServidorPublicoAreaPK)) {
            return false;
        }
        Ts2ServidorPublicoAreaPK other = (Ts2ServidorPublicoAreaPK) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        if (this.orden != other.orden) {
            return false;
        }
        if (this.idTipoDeArea != other.idTipoDeArea) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Ts2ServidorPublicoAreaPK[ id=" + id + ", orden=" + orden + ", idTipoDeArea=" + idTipoDeArea + " ]";
    }
    
}
