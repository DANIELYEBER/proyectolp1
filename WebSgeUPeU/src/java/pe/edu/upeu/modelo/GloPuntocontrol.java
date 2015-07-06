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
@Table(name = "glo_puntocontrol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloPuntocontrol.findAll", query = "SELECT g FROM GloPuntocontrol g")})
public class GloPuntocontrol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_puntocontrol")
    private Integer idPuntocontrol;
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "equiteta")
    private String equiteta;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPuntocontrol")
    private Collection<GloAvance> gloAvanceCollection;

    public GloPuntocontrol() {
    }

    public GloPuntocontrol(Integer idPuntocontrol) {
        this.idPuntocontrol = idPuntocontrol;
    }

    public GloPuntocontrol(Integer idPuntocontrol, String equiteta, String estado) {
        this.idPuntocontrol = idPuntocontrol;
        this.equiteta = equiteta;
        this.estado = estado;
    }

    public Integer getIdPuntocontrol() {
        return idPuntocontrol;
    }

    public void setIdPuntocontrol(Integer idPuntocontrol) {
        this.idPuntocontrol = idPuntocontrol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquiteta() {
        return equiteta;
    }

    public void setEquiteta(String equiteta) {
        this.equiteta = equiteta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<GloAvance> getGloAvanceCollection() {
        return gloAvanceCollection;
    }

    public void setGloAvanceCollection(Collection<GloAvance> gloAvanceCollection) {
        this.gloAvanceCollection = gloAvanceCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPuntocontrol != null ? idPuntocontrol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloPuntocontrol)) {
            return false;
        }
        GloPuntocontrol other = (GloPuntocontrol) object;
        if ((this.idPuntocontrol == null && other.idPuntocontrol != null) || (this.idPuntocontrol != null && !this.idPuntocontrol.equals(other.idPuntocontrol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloPuntocontrol[ idPuntocontrol=" + idPuntocontrol + " ]";
    }
    
}
