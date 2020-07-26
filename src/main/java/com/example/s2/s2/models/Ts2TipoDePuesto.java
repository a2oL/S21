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
@Table(name = "ts2_tipo_de_puesto")
public class Ts2TipoDePuesto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tipo_de_puesto")
    private Integer idTipoDePuesto;
    @Column(name = "orden")
    private String orden;
    @Column(name = "jerarquia")
    private String jerarquia;
    @Column(name = "nivel")
    private String nivel;
    @Column(name = "funcional")
    private String funcional;

    public Ts2TipoDePuesto(Integer idTipoDePuesto, String orden, String jerarquia, String nivel, String funcional) {
        this.idTipoDePuesto = idTipoDePuesto;
        this.orden = orden;
        this.jerarquia = jerarquia;
        this.nivel = nivel;
        this.funcional = funcional;
    }
   


    public Ts2TipoDePuesto() {
    }

    public Ts2TipoDePuesto(Integer idTipoDePuesto) {
        this.idTipoDePuesto = idTipoDePuesto;
    }

    public Integer getIdTipoDePuesto() {
        return idTipoDePuesto;
    }

    public void setIdTipoDePuesto(Integer idTipoDePuesto) {
        this.idTipoDePuesto = idTipoDePuesto;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getJerarquia() {
        return jerarquia;
    }

    public void setJerarquia(String jerarquia) {
        this.jerarquia = jerarquia;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getFuncional() {
        return funcional;
    }

    public void setFuncional(String funcional) {
        this.funcional = funcional;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoDePuesto != null ? idTipoDePuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Ts2TipoDePuesto)) {
            return false;
        }
        Ts2TipoDePuesto other = (Ts2TipoDePuesto) object;
        if ((this.idTipoDePuesto == null && other.idTipoDePuesto != null) || (this.idTipoDePuesto != null && !this.idTipoDePuesto.equals(other.idTipoDePuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Ts2TipoDePuesto[ idTipoDePuesto=" + idTipoDePuesto + " ]";
    }
    
}
