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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Artur
 */
@Entity
@Table(name = "ts2_tipo_de_ramo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ts2TipoDeRamo.findAll", query = "SELECT t FROM Ts2TipoDeRamo t"),
    @NamedQuery(name = "Ts2TipoDeRamo.findByIdTipoDeRamo", query = "SELECT t FROM Ts2TipoDeRamo t WHERE t.idTipoDeRamo = :idTipoDeRamo"),
    @NamedQuery(name = "Ts2TipoDeRamo.findByValor", query = "SELECT t FROM Ts2TipoDeRamo t WHERE t.valor = :valor"),
    @NamedQuery(name = "Ts2TipoDeRamo.findByClave", query = "SELECT t FROM Ts2TipoDeRamo t WHERE t.clave = :clave")})
public class Ts2TipoDeRamo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tipo_de_ramo")
    private Integer idTipoDeRamo;
    @Column(name = "valor")
    private String valor;
    @Column(name = "clave")
    private Integer clave;
    


    public Ts2TipoDeRamo(Integer idTipoDeRamo, String valor, Integer clave) {
        this.idTipoDeRamo = idTipoDeRamo;
        this.valor = valor;
        this.clave = clave;
    }

    public Ts2TipoDeRamo() {
    }

    public Ts2TipoDeRamo(Integer idTipoDeRamo) {
        this.idTipoDeRamo = idTipoDeRamo;
    }

    public Integer getIdTipoDeRamo() {
        return idTipoDeRamo;
    }

    public void setIdTipoDeRamo(Integer idTipoDeRamo) {
        this.idTipoDeRamo = idTipoDeRamo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoDeRamo != null ? idTipoDeRamo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Ts2TipoDeRamo)) {
            return false;
        }
        Ts2TipoDeRamo other = (Ts2TipoDeRamo) object;
        if ((this.idTipoDeRamo == null && other.idTipoDeRamo != null) || (this.idTipoDeRamo != null && !this.idTipoDeRamo.equals(other.idTipoDeRamo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Ts2TipoDeRamo[ idTipoDeRamo=" + idTipoDeRamo + " ]";
    }
    
}
