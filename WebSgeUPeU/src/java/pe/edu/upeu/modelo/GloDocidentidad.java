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
@Table(name = "glo_docidentidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloDocidentidad.findAll", query = "SELECT g FROM GloDocidentidad g")})
public class GloDocidentidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_docidentidad")
    private Integer idDocidentidad;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDocidentidad")
    private Collection<GloPersona> gloPersonaCollection;

    public GloDocidentidad() {
    }

    public GloDocidentidad(Integer idDocidentidad) {
        this.idDocidentidad = idDocidentidad;
    }

    public GloDocidentidad(Integer idDocidentidad, String nombre, String estado) {
        this.idDocidentidad = idDocidentidad;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Integer getIdDocidentidad() {
        return idDocidentidad;
    }

    public void setIdDocidentidad(Integer idDocidentidad) {
        this.idDocidentidad = idDocidentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<GloPersona> getGloPersonaCollection() {
        return gloPersonaCollection;
    }

    public void setGloPersonaCollection(Collection<GloPersona> gloPersonaCollection) {
        this.gloPersonaCollection = gloPersonaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocidentidad != null ? idDocidentidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloDocidentidad)) {
            return false;
        }
        GloDocidentidad other = (GloDocidentidad) object;
        if ((this.idDocidentidad == null && other.idDocidentidad != null) || (this.idDocidentidad != null && !this.idDocidentidad.equals(other.idDocidentidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloDocidentidad[ idDocidentidad=" + idDocidentidad + " ]";
    }
    
}
