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
@Table(name = "glo_temporadaejeestrategico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloTemporadaejeestrategico.findAll", query = "SELECT g FROM GloTemporadaejeestrategico g")})
public class GloTemporadaejeestrategico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_temp_ejeestrategico")
    private Integer idTempEjeestrategico;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTempEjeestrategico")
    private Collection<GloAreaEje> gloAreaEjeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTempEjeestrategico")
    private Collection<GloEjeestrategia> gloEjeestrategiaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTempEjeestrategico")
    private Collection<GloIndicador> gloIndicadorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTempEjeestrategico")
    private Collection<FinNivelfinanciero> finNivelfinancieroCollection;
    @JoinColumn(name = "id_ejeestrategico", referencedColumnName = "id_ejeestrategico")
    @ManyToOne(optional = false)
    private GloEjeestrategico idEjeestrategico;
    @JoinColumn(name = "id_temporada", referencedColumnName = "id_temporada")
    @ManyToOne(optional = false)
    private ConfTemporada idTemporada;

    public GloTemporadaejeestrategico() {
    }

    public GloTemporadaejeestrategico(Integer idTempEjeestrategico) {
        this.idTempEjeestrategico = idTempEjeestrategico;
    }

    public GloTemporadaejeestrategico(Integer idTempEjeestrategico, String codigo) {
        this.idTempEjeestrategico = idTempEjeestrategico;
        this.codigo = codigo;
    }

    public Integer getIdTempEjeestrategico() {
        return idTempEjeestrategico;
    }

    public void setIdTempEjeestrategico(Integer idTempEjeestrategico) {
        this.idTempEjeestrategico = idTempEjeestrategico;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @XmlTransient
    public Collection<GloAreaEje> getGloAreaEjeCollection() {
        return gloAreaEjeCollection;
    }

    public void setGloAreaEjeCollection(Collection<GloAreaEje> gloAreaEjeCollection) {
        this.gloAreaEjeCollection = gloAreaEjeCollection;
    }

    @XmlTransient
    public Collection<GloEjeestrategia> getGloEjeestrategiaCollection() {
        return gloEjeestrategiaCollection;
    }

    public void setGloEjeestrategiaCollection(Collection<GloEjeestrategia> gloEjeestrategiaCollection) {
        this.gloEjeestrategiaCollection = gloEjeestrategiaCollection;
    }

    @XmlTransient
    public Collection<GloIndicador> getGloIndicadorCollection() {
        return gloIndicadorCollection;
    }

    public void setGloIndicadorCollection(Collection<GloIndicador> gloIndicadorCollection) {
        this.gloIndicadorCollection = gloIndicadorCollection;
    }

    @XmlTransient
    public Collection<FinNivelfinanciero> getFinNivelfinancieroCollection() {
        return finNivelfinancieroCollection;
    }

    public void setFinNivelfinancieroCollection(Collection<FinNivelfinanciero> finNivelfinancieroCollection) {
        this.finNivelfinancieroCollection = finNivelfinancieroCollection;
    }

    public GloEjeestrategico getIdEjeestrategico() {
        return idEjeestrategico;
    }

    public void setIdEjeestrategico(GloEjeestrategico idEjeestrategico) {
        this.idEjeestrategico = idEjeestrategico;
    }

    public ConfTemporada getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(ConfTemporada idTemporada) {
        this.idTemporada = idTemporada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTempEjeestrategico != null ? idTempEjeestrategico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloTemporadaejeestrategico)) {
            return false;
        }
        GloTemporadaejeestrategico other = (GloTemporadaejeestrategico) object;
        if ((this.idTempEjeestrategico == null && other.idTempEjeestrategico != null) || (this.idTempEjeestrategico != null && !this.idTempEjeestrategico.equals(other.idTempEjeestrategico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloTemporadaejeestrategico[ idTempEjeestrategico=" + idTempEjeestrategico + " ]";
    }
    
}
