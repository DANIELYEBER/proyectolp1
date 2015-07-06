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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "fin_nivelfinanciero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FinNivelfinanciero.findAll", query = "SELECT f FROM FinNivelfinanciero f")})
public class FinNivelfinanciero implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_nivelfinanciero")
    private Integer idNivelfinanciero;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "etiqueta")
    private String etiqueta;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNivelfinanciero")
    private Collection<GloActividad> gloActividadCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNivelfinanciero")
    private Collection<FinPartidapresupuestaria> finPartidapresupuestariaCollection;
    @JoinColumn(name = "id_temp_ejeestrategico", referencedColumnName = "id_temp_ejeestrategico")
    @ManyToOne(optional = false)
    private GloTemporadaejeestrategico idTempEjeestrategico;
    @JoinColumn(name = "id_depart_area", referencedColumnName = "id_depart_area")
    @ManyToOne(optional = false)
    private GloDepartArea idDepartArea;

    public FinNivelfinanciero() {
    }

    public FinNivelfinanciero(Integer idNivelfinanciero) {
        this.idNivelfinanciero = idNivelfinanciero;
    }

    public FinNivelfinanciero(Integer idNivelfinanciero, String nombre, String codigo, String etiqueta, String estado) {
        this.idNivelfinanciero = idNivelfinanciero;
        this.nombre = nombre;
        this.codigo = codigo;
        this.etiqueta = etiqueta;
        this.estado = estado;
    }

    public Integer getIdNivelfinanciero() {
        return idNivelfinanciero;
    }

    public void setIdNivelfinanciero(Integer idNivelfinanciero) {
        this.idNivelfinanciero = idNivelfinanciero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
    public Collection<GloActividad> getGloActividadCollection() {
        return gloActividadCollection;
    }

    public void setGloActividadCollection(Collection<GloActividad> gloActividadCollection) {
        this.gloActividadCollection = gloActividadCollection;
    }

    @XmlTransient
    public Collection<FinPartidapresupuestaria> getFinPartidapresupuestariaCollection() {
        return finPartidapresupuestariaCollection;
    }

    public void setFinPartidapresupuestariaCollection(Collection<FinPartidapresupuestaria> finPartidapresupuestariaCollection) {
        this.finPartidapresupuestariaCollection = finPartidapresupuestariaCollection;
    }

    public GloTemporadaejeestrategico getIdTempEjeestrategico() {
        return idTempEjeestrategico;
    }

    public void setIdTempEjeestrategico(GloTemporadaejeestrategico idTempEjeestrategico) {
        this.idTempEjeestrategico = idTempEjeestrategico;
    }

    public GloDepartArea getIdDepartArea() {
        return idDepartArea;
    }

    public void setIdDepartArea(GloDepartArea idDepartArea) {
        this.idDepartArea = idDepartArea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNivelfinanciero != null ? idNivelfinanciero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FinNivelfinanciero)) {
            return false;
        }
        FinNivelfinanciero other = (FinNivelfinanciero) object;
        if ((this.idNivelfinanciero == null && other.idNivelfinanciero != null) || (this.idNivelfinanciero != null && !this.idNivelfinanciero.equals(other.idNivelfinanciero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.FinNivelfinanciero[ idNivelfinanciero=" + idNivelfinanciero + " ]";
    }
    
}
