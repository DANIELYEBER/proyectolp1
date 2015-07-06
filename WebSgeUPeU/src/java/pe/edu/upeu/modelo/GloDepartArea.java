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
@Table(name = "glo_depart_area")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloDepartArea.findAll", query = "SELECT g FROM GloDepartArea g")})
public class GloDepartArea implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_depart_area")
    private Integer idDepartArea;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDepartArea")
    private Collection<GloAreaEje> gloAreaEjeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDepartArea")
    private Collection<FinPartidapresupuestaria> finPartidapresupuestariaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDepartArea")
    private Collection<FinNivelfinanciero> finNivelfinancieroCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDepartArea")
    private Collection<GloEstadoArea> gloEstadoAreaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDepartArea")
    private Collection<GloDepartareaCoordinador> gloDepartareaCoordinadorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDepartArea")
    private Collection<GloMeta> gloMetaCollection;
    @JoinColumn(name = "id_departamento_filial", referencedColumnName = "id_departamento_filial")
    @ManyToOne(optional = false)
    private GloDepartamentosFilial idDepartamentoFilial;
    @JoinColumn(name = "id_areas", referencedColumnName = "id_areas")
    @ManyToOne(optional = false)
    private GloAreas idAreas;

    public GloDepartArea() {
    }

    public GloDepartArea(Integer idDepartArea) {
        this.idDepartArea = idDepartArea;
    }

    public Integer getIdDepartArea() {
        return idDepartArea;
    }

    public void setIdDepartArea(Integer idDepartArea) {
        this.idDepartArea = idDepartArea;
    }

    @XmlTransient
    public Collection<GloAreaEje> getGloAreaEjeCollection() {
        return gloAreaEjeCollection;
    }

    public void setGloAreaEjeCollection(Collection<GloAreaEje> gloAreaEjeCollection) {
        this.gloAreaEjeCollection = gloAreaEjeCollection;
    }

    @XmlTransient
    public Collection<FinPartidapresupuestaria> getFinPartidapresupuestariaCollection() {
        return finPartidapresupuestariaCollection;
    }

    public void setFinPartidapresupuestariaCollection(Collection<FinPartidapresupuestaria> finPartidapresupuestariaCollection) {
        this.finPartidapresupuestariaCollection = finPartidapresupuestariaCollection;
    }

    @XmlTransient
    public Collection<FinNivelfinanciero> getFinNivelfinancieroCollection() {
        return finNivelfinancieroCollection;
    }

    public void setFinNivelfinancieroCollection(Collection<FinNivelfinanciero> finNivelfinancieroCollection) {
        this.finNivelfinancieroCollection = finNivelfinancieroCollection;
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

    public GloDepartamentosFilial getIdDepartamentoFilial() {
        return idDepartamentoFilial;
    }

    public void setIdDepartamentoFilial(GloDepartamentosFilial idDepartamentoFilial) {
        this.idDepartamentoFilial = idDepartamentoFilial;
    }

    public GloAreas getIdAreas() {
        return idAreas;
    }

    public void setIdAreas(GloAreas idAreas) {
        this.idAreas = idAreas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDepartArea != null ? idDepartArea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloDepartArea)) {
            return false;
        }
        GloDepartArea other = (GloDepartArea) object;
        if ((this.idDepartArea == null && other.idDepartArea != null) || (this.idDepartArea != null && !this.idDepartArea.equals(other.idDepartArea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloDepartArea[ idDepartArea=" + idDepartArea + " ]";
    }
    
}
