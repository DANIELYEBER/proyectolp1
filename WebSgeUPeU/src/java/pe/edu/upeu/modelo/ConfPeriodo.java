/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SistemasUpeu
 */
@Entity
@Table(name = "conf_periodo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfPeriodo.findAll", query = "SELECT c FROM ConfPeriodo c")})
public class ConfPeriodo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_periodo")
    private Integer idPeriodo;
    @Basic(optional = false)
    @Column(name = "periodo")
    private String periodo;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeriodo")
    private Collection<GloEstadoDepartamento> gloEstadoDepartamentoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeriodo")
    private Collection<GloAreaEje> gloAreaEjeCollection;
    @JoinColumn(name = "id_temporada", referencedColumnName = "id_temporada")
    @ManyToOne(optional = false)
    private ConfTemporada idTemporada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeriodo")
    private Collection<FinPartidapresupuestaria> finPartidapresupuestariaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeriodo")
    private Collection<GloEstadoArea> gloEstadoAreaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeriodo")
    private Collection<GloDepartareaCoordinador> gloDepartareaCoordinadorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeriodo")
    private Collection<GloMeta> gloMetaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeriodo")
    private Collection<GloEstadoFilial> gloEstadoFilialCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPeriodo")
    private Collection<GloDepartCoordinador> gloDepartCoordinadorCollection;

    public ConfPeriodo() {
    }

    public ConfPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public ConfPeriodo(Integer idPeriodo, String periodo, String descripcion, Date fechaInicio, Date fechaFin, String estado) {
        this.idPeriodo = idPeriodo;
        this.periodo = periodo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }

    public Integer getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<GloEstadoDepartamento> getGloEstadoDepartamentoCollection() {
        return gloEstadoDepartamentoCollection;
    }

    public void setGloEstadoDepartamentoCollection(Collection<GloEstadoDepartamento> gloEstadoDepartamentoCollection) {
        this.gloEstadoDepartamentoCollection = gloEstadoDepartamentoCollection;
    }

    @XmlTransient
    public Collection<GloAreaEje> getGloAreaEjeCollection() {
        return gloAreaEjeCollection;
    }

    public void setGloAreaEjeCollection(Collection<GloAreaEje> gloAreaEjeCollection) {
        this.gloAreaEjeCollection = gloAreaEjeCollection;
    }

    public ConfTemporada getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(ConfTemporada idTemporada) {
        this.idTemporada = idTemporada;
    }

    @XmlTransient
    public Collection<FinPartidapresupuestaria> getFinPartidapresupuestariaCollection() {
        return finPartidapresupuestariaCollection;
    }

    public void setFinPartidapresupuestariaCollection(Collection<FinPartidapresupuestaria> finPartidapresupuestariaCollection) {
        this.finPartidapresupuestariaCollection = finPartidapresupuestariaCollection;
    }

    @XmlTransient
    public Collection<GloEstadoArea> getGloEstadoAreaCollection() {
        return gloEstadoAreaCollection;
    }

    public void setGloEstadoAreaCollection(Collection<GloEstadoArea> gloEstadoAreaCollection) {
        this.gloEstadoAreaCollection = gloEstadoAreaCollection;
    }

    @XmlTransient
    public Collection<GloDepartareaCoordinador> getGloDepartareaCoordinadorCollection() {
        return gloDepartareaCoordinadorCollection;
    }

    public void setGloDepartareaCoordinadorCollection(Collection<GloDepartareaCoordinador> gloDepartareaCoordinadorCollection) {
        this.gloDepartareaCoordinadorCollection = gloDepartareaCoordinadorCollection;
    }

    @XmlTransient
    public Collection<GloMeta> getGloMetaCollection() {
        return gloMetaCollection;
    }

    public void setGloMetaCollection(Collection<GloMeta> gloMetaCollection) {
        this.gloMetaCollection = gloMetaCollection;
    }

    @XmlTransient
    public Collection<GloEstadoFilial> getGloEstadoFilialCollection() {
        return gloEstadoFilialCollection;
    }

    public void setGloEstadoFilialCollection(Collection<GloEstadoFilial> gloEstadoFilialCollection) {
        this.gloEstadoFilialCollection = gloEstadoFilialCollection;
    }

    @XmlTransient
    public Collection<GloDepartCoordinador> getGloDepartCoordinadorCollection() {
        return gloDepartCoordinadorCollection;
    }

    public void setGloDepartCoordinadorCollection(Collection<GloDepartCoordinador> gloDepartCoordinadorCollection) {
        this.gloDepartCoordinadorCollection = gloDepartCoordinadorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPeriodo != null ? idPeriodo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConfPeriodo)) {
            return false;
        }
        ConfPeriodo other = (ConfPeriodo) object;
        if ((this.idPeriodo == null && other.idPeriodo != null) || (this.idPeriodo != null && !this.idPeriodo.equals(other.idPeriodo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.ConfPeriodo[ idPeriodo=" + idPeriodo + " ]";
    }
    
}
