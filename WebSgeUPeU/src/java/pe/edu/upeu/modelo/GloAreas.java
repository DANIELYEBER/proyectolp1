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
@Table(name = "glo_areas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloAreas.findAll", query = "SELECT g FROM GloAreas g")})
public class GloAreas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_areas")
    private Integer idAreas;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAreas")
    private Collection<GloDepartArea> gloDepartAreaCollection;

    public GloAreas() {
    }

    public GloAreas(Integer idAreas) {
        this.idAreas = idAreas;
    }

    public GloAreas(Integer idAreas, String nombre, String descripcion, String codigo) {
        this.idAreas = idAreas;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
    }

    public Integer getIdAreas() {
        return idAreas;
    }

    public void setIdAreas(Integer idAreas) {
        this.idAreas = idAreas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @XmlTransient
    public Collection<GloDepartArea> getGloDepartAreaCollection() {
        return gloDepartAreaCollection;
    }

    public void setGloDepartAreaCollection(Collection<GloDepartArea> gloDepartAreaCollection) {
        this.gloDepartAreaCollection = gloDepartAreaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAreas != null ? idAreas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloAreas)) {
            return false;
        }
        GloAreas other = (GloAreas) object;
        if ((this.idAreas == null && other.idAreas != null) || (this.idAreas != null && !this.idAreas.equals(other.idAreas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloAreas[ idAreas=" + idAreas + " ]";
    }
    
}
