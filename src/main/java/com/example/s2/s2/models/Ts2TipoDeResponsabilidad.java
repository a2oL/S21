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
@Table(name = "ts2_tipo_de_responsabilidad")
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
