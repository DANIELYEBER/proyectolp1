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
@Table(name = "glo_tipoorden")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloTipoorden.findAll", query = "SELECT g FROM GloTipoorden g")})
public class GloTipoorden implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipoorden")
    private Integer idTipoorden;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "etiqueta")
    private String etiqueta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoorden")
    private Collection<GloIndicador> gloIndicadorCollection;

    public GloTipoorden() {
    }

    public GloTipoorden(Integer idTipoorden) {
        this.idTipoorden = idTipoorden;
    }

    public GloTipoorden(Integer idTipoorden, String nombre, String etiqueta) {
        this.idTipoorden = idTipoorden;
        this.nombre = nombre;
        this.etiqueta = etiqueta;
    }

    public Integer getIdTipoorden() {
        return idTipoorden;
    }

    public void setIdTipoorden(Integer idTipoorden) {
        this.idTipoorden = idTipoorden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
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
        hash += (idTipoorden != null ? idTipoorden.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloTipoorden)) {
            return false;
        }
        GloTipoorden other = (GloTipoorden) object;
        if ((this.idTipoorden == null && other.idTipoorden != null) || (this.idTipoorden != null && !this.idTipoorden.equals(other.idTipoorden))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloTipoorden[ idTipoorden=" + idTipoorden + " ]";
    }
    
}
