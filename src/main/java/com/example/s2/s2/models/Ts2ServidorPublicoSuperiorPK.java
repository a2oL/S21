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
public class Ts2ServidorPublicoSuperiorPK implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 7301010451510036712L;
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "orden")
    private int orden;

    public Ts2ServidorPublicoSuperiorPK() {
    }

    public Ts2ServidorPublicoSuperiorPK(String id, int orden) {
        this.id = id;
        this.orden = orden;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        hash += (int) orden;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Ts2ServidorPublicoSuperiorPK)) {
            return false;
        }
        Ts2ServidorPublicoSuperiorPK other = (Ts2ServidorPublicoSuperiorPK) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        if (this.orden != other.orden) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Ts2ServidorPublicoSuperiorPK[ id=" + id + ", orden=" + orden + " ]";
    }
    
}
