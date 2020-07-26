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
public class Ts2ServidorPublicoProcedimiPK implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -2542896349209147455L;
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @Column(name = "orden")
    private int orden;
    @Basic(optional = false)
    @Column(name = "id_tipo_de_procedimiento")
    private int idTipoDeProcedimiento;

    public Ts2ServidorPublicoProcedimiPK() {
    }

    public Ts2ServidorPublicoProcedimiPK(String id, int orden, int idTipoDeProcedimiento) {
        this.id = id;
        this.orden = orden;
        this.idTipoDeProcedimiento = idTipoDeProcedimiento;
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

    public int getIdTipoDeProcedimiento() {
        return idTipoDeProcedimiento;
    }

    public void setIdTipoDeProcedimiento(int idTipoDeProcedimiento) {
        this.idTipoDeProcedimiento = idTipoDeProcedimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        hash += (int) orden;
        hash += (int) idTipoDeProcedimiento;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Ts2ServidorPublicoProcedimiPK)) {
            return false;
        }
        Ts2ServidorPublicoProcedimiPK other = (Ts2ServidorPublicoProcedimiPK) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        if (this.orden != other.orden) {
            return false;
        }
        if (this.idTipoDeProcedimiento != other.idTipoDeProcedimiento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Ts2ServidorPublicoProcedimiPK[ id=" + id + ", orden=" + orden + ", idTipoDeProcedimiento=" + idTipoDeProcedimiento + " ]";
    }
    
}
