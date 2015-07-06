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
@Table(name = "glo_perspectiva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloPerspectiva.findAll", query = "SELECT g FROM GloPerspectiva g")})
public class GloPerspectiva implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_perspectiva")
    private Integer idPerspectiva;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPerspectiva")
    private Collection<GloEstrategia> gloEstrategiaCollection;

    public GloPerspectiva() {
    }

    public GloPerspectiva(Integer idPerspectiva) {
        this.idPerspectiva = idPerspectiva;
    }

    public GloPerspectiva(Integer idPerspectiva, String nombre, String descripcion, String codigo) {
        this.idPerspectiva = idPerspectiva;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
    }

    public Integer getIdPerspectiva() {
        return idPerspectiva;
    }

    public void setIdPerspectiva(Integer idPerspectiva) {
        this.idPerspectiva = idPerspectiva;
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
    public Collection<GloEstrategia> getGloEstrategiaCollection() {
        return gloEstrategiaCollection;
    }

    public void setGloEstrategiaCollection(Collection<GloEstrategia> gloEstrategiaCollection) {
        this.gloEstrategiaCollection = gloEstrategiaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerspectiva != null ? idPerspectiva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloPerspectiva)) {
            return false;
        }
        GloPerspectiva other = (GloPerspectiva) object;
        if ((this.idPerspectiva == null && other.idPerspectiva != null) || (this.idPerspectiva != null && !this.idPerspectiva.equals(other.idPerspectiva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloPerspectiva[ idPerspectiva=" + idPerspectiva + " ]";
    }
    
}
