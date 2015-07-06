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
@Table(name = "glo_departamentos_filial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloDepartamentosFilial.findAll", query = "SELECT g FROM GloDepartamentosFilial g")})
public class GloDepartamentosFilial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_departamento_filial")
    private Integer idDepartamentoFilial;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDepartamentoFilial")
    private Collection<GloEstadoDepartamento> gloEstadoDepartamentoCollection;
    @JoinColumn(name = "id_tipoarea", referencedColumnName = "id_tipoarea")
    @ManyToOne(optional = false)
    private GloTipoarea idTipoarea;
    @JoinColumn(name = "id_departamento", referencedColumnName = "id_departamento")
    @ManyToOne(optional = false)
    private GloDepartamentos idDepartamento;
    @JoinColumn(name = "id_filial", referencedColumnName = "id_filial")
    @ManyToOne(optional = false)
    private CorpFilial idFilial;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDepartamentoFilial")
    private Collection<GloDepartArea> gloDepartAreaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDepartamentoFilial")
    private Collection<GloDepartCoordinador> gloDepartCoordinadorCollection;

    public GloDepartamentosFilial() {
    }

    public GloDepartamentosFilial(Integer idDepartamentoFilial) {
        this.idDepartamentoFilial = idDepartamentoFilial;
    }

    public Integer getIdDepartamentoFilial() {
        return idDepartamentoFilial;
    }

    public void setIdDepartamentoFilial(Integer idDepartamentoFilial) {
        this.idDepartamentoFilial = idDepartamentoFilial;
    }

    @XmlTransient
    public Collection<GloEstadoDepartamento> getGloEstadoDepartamentoCollection() {
        return gloEstadoDepartamentoCollection;
    }

    public void setGloEstadoDepartamentoCollection(Collection<GloEstadoDepartamento> gloEstadoDepartamentoCollection) {
        this.gloEstadoDepartamentoCollection = gloEstadoDepartamentoCollection;
    }

    public GloTipoarea getIdTipoarea() {
        return idTipoarea;
    }

    public void setIdTipoarea(GloTipoarea idTipoarea) {
        this.idTipoarea = idTipoarea;
    }

    public GloDepartamentos getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(GloDepartamentos idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public CorpFilial getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(CorpFilial idFilial) {
        this.idFilial = idFilial;
    }

    @XmlTransient
    public Collection<GloDepartArea> getGloDepartAreaCollection() {
        return gloDepartAreaCollection;
    }

    public void setGloDepartAreaCollection(Collection<GloDepartArea> gloDepartAreaCollection) {
        this.gloDepartAreaCollection = gloDepartAreaCollection;
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
        hash += (idDepartamentoFilial != null ? idDepartamentoFilial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloDepartamentosFilial)) {
            return false;
        }
        GloDepartamentosFilial other = (GloDepartamentosFilial) object;
        if ((this.idDepartamentoFilial == null && other.idDepartamentoFilial != null) || (this.idDepartamentoFilial != null && !this.idDepartamentoFilial.equals(other.idDepartamentoFilial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloDepartamentosFilial[ idDepartamentoFilial=" + idDepartamentoFilial + " ]";
    }
    
}
