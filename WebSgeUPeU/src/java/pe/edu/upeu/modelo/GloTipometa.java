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
@Table(name = "glo_tipometa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloTipometa.findAll", query = "SELECT g FROM GloTipometa g")})
public class GloTipometa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipometa")
    private Integer idTipometa;
    @Basic(optional = false)
    @Column(name = "nombretipo")
    private String nombretipo;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipometa")
    private Collection<GloIndicador> gloIndicadorCollection;

    public GloTipometa() {
    }

    public GloTipometa(Integer idTipometa) {
        this.idTipometa = idTipometa;
    }

    public GloTipometa(Integer idTipometa, String nombretipo, String descripcion, String estado) {
        this.idTipometa = idTipometa;
        this.nombretipo = nombretipo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Integer getIdTipometa() {
        return idTipometa;
    }

    public void setIdTipometa(Integer idTipometa) {
        this.idTipometa = idTipometa;
    }

    public String getNombretipo() {
        return nombretipo;
    }

    public void setNombretipo(String nombretipo) {
        this.nombretipo = nombretipo;
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
    public Collection<GloIndicador> getGloIndicadorCollection() {
        return gloIndicadorCollection;
    }

    public void setGloIndicadorCollection(Collection<GloIndicador> gloIndicadorCollection) {
        this.gloIndicadorCollection = gloIndicadorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipometa != null ? idTipometa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloTipometa)) {
            return false;
        }
        GloTipometa other = (GloTipometa) object;
        if ((this.idTipometa == null && other.idTipometa != null) || (this.idTipometa != null && !this.idTipometa.equals(other.idTipometa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloTipometa[ idTipometa=" + idTipometa + " ]";
    }
    
}
