/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.modelo;

import java.io.Serializable;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SistemasUpeu
 */
@Entity
@Table(name = "glo_significancia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloSignificancia.findAll", query = "SELECT g FROM GloSignificancia g")})
public class GloSignificancia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_significancia")
    private Integer idSignificancia;
    @Basic(optional = false)
    @Column(name = "nivel")
    private int nivel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSignificancia")
    private Collection<GloIndicador> gloIndicadorCollection;

    public GloSignificancia() {
    }

    public GloSignificancia(Integer idSignificancia) {
        this.idSignificancia = idSignificancia;
    }

    public GloSignificancia(Integer idSignificancia, int nivel) {
        this.idSignificancia = idSignificancia;
        this.nivel = nivel;
    }

    public Integer getIdSignificancia() {
        return idSignificancia;
    }

    public void setIdSignificancia(Integer idSignificancia) {
        this.idSignificancia = idSignificancia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @XmlTransient
    public Collection<GloIndicador> getGloIndicadorCollection() {
        return gloIndicadorCollection;
    }

    public void setGloIndicadorCollection(Collection<GloIndicador> gloIndicadorCollection) {
        this.gloIndicadorCollection = gloIndicadorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSignificancia != null ? idSignificancia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloSignificancia)) {
            return false;
        }
        GloSignificancia other = (GloSignificancia) object;
        if ((this.idSignificancia == null && other.idSignificancia != null) || (this.idSignificancia != null && !this.idSignificancia.equals(other.idSignificancia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloSignificancia[ idSignificancia=" + idSignificancia + " ]";
    }
    
}
