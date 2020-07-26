/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.s2.s2.models;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Artur
 */
@Entity
@Table(name = "ts2_tipo_de_procedimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ts2TipoDeProcedimiento.findAll", query = "SELECT t FROM Ts2TipoDeProcedimiento t"),
    @NamedQuery(name = "Ts2TipoDeProcedimiento.findByIdTipoDeProcedimiento", query = "SELECT t FROM Ts2TipoDeProcedimiento t WHERE t.idTipoDeProcedimiento = :idTipoDeProcedimiento"),
    @NamedQuery(name = "Ts2TipoDeProcedimiento.findByValor", query = "SELECT t FROM Ts2TipoDeProcedimiento t WHERE t.valor = :valor"),
    @NamedQuery(name = "Ts2TipoDeProcedimiento.findByClave", query = "SELECT t FROM Ts2TipoDeProcedimiento t WHERE t.clave = :clave")})
public class Ts2TipoDeProcedimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_tipo_de_procedimiento")
    private Integer idTipoDeProcedimiento;
    @Column(name = "valor")
    private String valor;
    @Column(name = "clave")
    private Integer clave;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ts2TipoDeProcedimiento")
    private Collection<Ts2ServidorPublicoProcedimi> ts2ServidorPublicoProcedimiCollection;

    public Ts2TipoDeProcedimiento() {
    }

    public Ts2TipoDeProcedimiento(Integer idTipoDeProcedimiento) {
        this.idTipoDeProcedimiento = idTipoDeProcedimiento;
    }

    public Integer getIdTipoDeProcedimiento() {
        return idTipoDeProcedimiento;
    }

    public void setIdTipoDeProcedimiento(Integer idTipoDeProcedimiento) {
        this.idTipoDeProcedimiento = idTipoDeProcedimiento;
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

    @XmlTransient
    public Collection<Ts2ServidorPublicoProcedimi> getTs2ServidorPublicoProcedimiCollection() {
        return ts2ServidorPublicoProcedimiCollection;
    }

    public void setTs2ServidorPublicoProcedimiCollection(Collection<Ts2ServidorPublicoProcedimi> ts2ServidorPublicoProcedimiCollection) {
        this.ts2ServidorPublicoProcedimiCollection = ts2ServidorPublicoProcedimiCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoDeProcedimiento != null ? idTipoDeProcedimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Ts2TipoDeProcedimiento)) {
            return false;
        }
        Ts2TipoDeProcedimiento other = (Ts2TipoDeProcedimiento) object;
        if ((this.idTipoDeProcedimiento == null && other.idTipoDeProcedimiento != null) || (this.idTipoDeProcedimiento != null && !this.idTipoDeProcedimiento.equals(other.idTipoDeProcedimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Ts2TipoDeProcedimiento[ idTipoDeProcedimiento=" + idTipoDeProcedimiento + " ]";
    }
    
}
