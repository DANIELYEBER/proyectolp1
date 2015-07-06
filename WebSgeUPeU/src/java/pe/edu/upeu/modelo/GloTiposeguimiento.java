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
@Table(name = "glo_tiposeguimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloTiposeguimiento.findAll", query = "SELECT g FROM GloTiposeguimiento g")})
public class GloTiposeguimiento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tiposeguimiento")
    private Integer idTiposeguimiento;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "etiqueta")
    private String etiqueta;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTiposeguimiento")
    private Collection<GloSeguimiento> gloSeguimientoCollection;

    public GloTiposeguimiento() {
    }

    public GloTiposeguimiento(Integer idTiposeguimiento) {
        this.idTiposeguimiento = idTiposeguimiento;
    }

    public GloTiposeguimiento(Integer idTiposeguimiento, String nombre, String etiqueta, String estado) {
        this.idTiposeguimiento = idTiposeguimiento;
        this.nombre = nombre;
        this.etiqueta = etiqueta;
        this.estado = estado;
    }

    public Integer getIdTiposeguimiento() {
        return idTiposeguimiento;
    }

    public void setIdTiposeguimiento(Integer idTiposeguimiento) {
        this.idTiposeguimiento = idTiposeguimiento;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<GloSeguimiento> getGloSeguimientoCollection() {
        return gloSeguimientoCollection;
    }

    public void setGloSeguimientoCollection(Collection<GloSeguimiento> gloSeguimientoCollection) {
        this.gloSeguimientoCollection = gloSeguimientoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTiposeguimiento != null ? idTiposeguimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloTiposeguimiento)) {
            return false;
        }
        GloTiposeguimiento other = (GloTiposeguimiento) object;
        if ((this.idTiposeguimiento == null && other.idTiposeguimiento != null) || (this.idTiposeguimiento != null && !this.idTiposeguimiento.equals(other.idTiposeguimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloTiposeguimiento[ idTiposeguimiento=" + idTiposeguimiento + " ]";
    }
    
}
