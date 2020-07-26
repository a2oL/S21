/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.s2.s2.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Artur
 */
@Entity
@Table(name = "ts2_tipo_de_area")
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
