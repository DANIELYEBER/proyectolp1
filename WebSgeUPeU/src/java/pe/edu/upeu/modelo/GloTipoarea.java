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
@Table(name = "glo_tipoarea")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloTipoarea.findAll", query = "SELECT g FROM GloTipoarea g")})
public class GloTipoarea implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipoarea")
    private Integer idTipoarea;
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "etiqueta")
    private String etiqueta;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoarea")
    private Collection<GloDepartamentosFilial> gloDepartamentosFilialCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoarea")
    private Collection<GloIndicador> gloIndicadorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoarea")
    private Collection<GloEstrategia> gloEstrategiaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoarea")
    private Collection<GloEjeestrategico> gloEjeestrategicoCollection;

    public GloTipoarea() {
    }

    public GloTipoarea(Integer idTipoarea) {
        this.idTipoarea = idTipoarea;
    }

    public GloTipoarea(Integer idTipoarea, String etiqueta, String estado, String descripcion) {
        this.idTipoarea = idTipoarea;
        this.etiqueta = etiqueta;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public Integer getIdTipoarea() {
        return idTipoarea;
    }

    public void setIdTipoarea(Integer idTipoarea) {
        this.idTipoarea = idTipoarea;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<GloDepartamentosFilial> getGloDepartamentosFilialCollection() {
        return gloDepartamentosFilialCollection;
    }

    public void setGloDepartamentosFilialCollection(Collection<GloDepartamentosFilial> gloDepartamentosFilialCollection) {
        this.gloDepartamentosFilialCollection = gloDepartamentosFilialCollection;
    }

    @XmlTransient
    public Collection<GloIndicador> getGloIndicadorCollection() {
        return gloIndicadorCollection;
    }

    public void setGloIndicadorCollection(Collection<GloIndicador> gloIndicadorCollection) {
        this.gloIndicadorCollection = gloIndicadorCollection;
    }

    @XmlTransient
    public Collection<GloEstrategia> getGloEstrategiaCollection() {
        return gloEstrategiaCollection;
    }

    public void setGloEstrategiaCollection(Collection<GloEstrategia> gloEstrategiaCollection) {
        this.gloEstrategiaCollection = gloEstrategiaCollection;
    }

    @XmlTransient
    public Collection<GloEjeestrategico> getGloEjeestrategicoCollection() {
        return gloEjeestrategicoCollection;
    }

    public void setGloEjeestrategicoCollection(Collection<GloEjeestrategico> gloEjeestrategicoCollection) {
        this.gloEjeestrategicoCollection = gloEjeestrategicoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoarea != null ? idTipoarea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloTipoarea)) {
            return false;
        }
        GloTipoarea other = (GloTipoarea) object;
        if ((this.idTipoarea == null && other.idTipoarea != null) || (this.idTipoarea != null && !this.idTipoarea.equals(other.idTipoarea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloTipoarea[ idTipoarea=" + idTipoarea + " ]";
    }
    
}
