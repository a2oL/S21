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
@Table(name = "ts2_tipo_de_ente_publico")
public class Ts2TipoDeEntePublico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tipo_de_ente_publico")
    private Integer idTipoDeEntePublico;
    @Column(name = "valor")
    private String valor;
    @Column(name = "siglas")
    private String siglas;
    @Column(name = "clave")
    private String clave;
    @Column(name = "poder")
    private String poder;
    

    public Ts2TipoDeEntePublico(Integer idTipoDeEntePublico, String valor, String siglas, String clave, String poder) {
        this.idTipoDeEntePublico = idTipoDeEntePublico;
        this.valor = valor;
        this.siglas = siglas;
        this.clave = clave;
        this.poder = poder;
    }

    public Ts2TipoDeEntePublico() {
    }

    public Ts2TipoDeEntePublico(Integer idTipoDeEntePublico) {
        this.idTipoDeEntePublico = idTipoDeEntePublico;
    }

    public Integer getIdTipoDeEntePublico() {
        return idTipoDeEntePublico;
    }

    public void setIdTipoDeEntePublico(Integer idTipoDeEntePublico) {
        this.idTipoDeEntePublico = idTipoDeEntePublico;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoDeEntePublico != null ? idTipoDeEntePublico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
       
        if (!(object instanceof Ts2TipoDeEntePublico)) {
            return false;
        }
        Ts2TipoDeEntePublico other = (Ts2TipoDeEntePublico) object;
        if ((this.idTipoDeEntePublico == null && other.idTipoDeEntePublico != null) || (this.idTipoDeEntePublico != null && !this.idTipoDeEntePublico.equals(other.idTipoDeEntePublico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Ts2TipoDeEntePublico[ idTipoDeEntePublico=" + idTipoDeEntePublico + " ]";
    }
    
}
