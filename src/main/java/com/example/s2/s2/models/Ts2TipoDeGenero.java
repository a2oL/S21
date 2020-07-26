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
@Table(name = "ts2_tipo_de_genero")
public class Ts2TipoDeGenero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tipo_de_genero")
    private Integer idTipoDeGenero;
    @Column(name = "valor")
    private String valor;
    @Column(name = "clave")
    private String clave;

    public Ts2TipoDeGenero() {
    }


    public Ts2TipoDeGenero(Integer idTipoDeGenero, String valor, String clave) {
        this.idTipoDeGenero = idTipoDeGenero;
        this.valor = valor;
        this.clave = clave;
    }


    public Ts2TipoDeGenero(Integer idTipoDeGenero) {
        this.idTipoDeGenero = idTipoDeGenero;
    }

    public Integer getIdTipoDeGenero() {
        return idTipoDeGenero;
    }

    public void setIdTipoDeGenero(Integer idTipoDeGenero) {
        this.idTipoDeGenero = idTipoDeGenero;
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

}
