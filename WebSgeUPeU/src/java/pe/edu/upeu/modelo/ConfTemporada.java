/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SistemasUpeu
 */
@Entity
@Table(name = "conf_temporada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfTemporada.findAll", query = "SELECT c FROM ConfTemporada c")})
public class ConfTemporada implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_temporada")
    private Integer idTemporada;
    @Basic(optional = false)
    @Column(name = "finicio")
    @Temporal(TemporalType.DATE)
    private Date finicio;
    @Basic(optional = false)
    @Column(name = "ffin")
    @Temporal(TemporalType.DATE)
    private Date ffin;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTemporada")
    private Collection<ConfPeriodo> confPeriodoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTemporada")
    private Collection<GloTemporadaejeestrategico> gloTemporadaejeestrategicoCollection;

    public ConfTemporada() {
    }

    public ConfTemporada(Integer idTemporada) {
        this.idTemporada = idTemporada;
    }

    public ConfTemporada(Integer idTemporada, Date finicio, Date ffin, String descripcion, String estado) {
        this.idTemporada = idTemporada;
        this.finicio = finicio;
        this.ffin = ffin;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Integer getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(Integer idTemporada) {
        this.idTemporada = idTemporada;
    }

    public Date getFinicio() {
        return finicio;
    }

    public void setFinicio(Date finicio) {
        this.finicio = finicio;
    }

    public Date getFfin() {
        return ffin;
    }

    public void setFfin(Date ffin) {
        this.ffin = ffin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<ConfPeriodo> getConfPeriodoCollection() {
        return confPeriodoCollection;
    }

    public void setConfPeriodoCollection(Collection<ConfPeriodo> confPeriodoCollection) {
        this.confPeriodoCollection = confPeriodoCollection;
    }

    @XmlTransient
    public Collection<GloTemporadaejeestrategico> getGloTemporadaejeestrategicoCollection() {
        return gloTemporadaejeestrategicoCollection;
    }

    public void setGloTemporadaejeestrategicoCollection(Collection<GloTemporadaejeestrategico> gloTemporadaejeestrategicoCollection) {
        this.gloTemporadaejeestrategicoCollection = gloTemporadaejeestrategicoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTemporada != null ? idTemporada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConfTemporada)) {
            return false;
        }
        ConfTemporada other = (ConfTemporada) object;
        if ((this.idTemporada == null && other.idTemporada != null) || (this.idTemporada != null && !this.idTemporada.equals(other.idTemporada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.ConfTemporada[ idTemporada=" + idTemporada + " ]";
    }
    
}
