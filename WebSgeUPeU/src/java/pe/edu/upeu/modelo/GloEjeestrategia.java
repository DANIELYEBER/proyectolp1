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
@Table(name = "glo_ejeestrategia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloEjeestrategia.findAll", query = "SELECT g FROM GloEjeestrategia g")})
public class GloEjeestrategia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ejeestrategia")
    private Integer idEjeestrategia;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @JoinColumn(name = "id_temp_ejeestrategico", referencedColumnName = "id_temp_ejeestrategico")
    @ManyToOne(optional = false)
    private GloTemporadaejeestrategico idTempEjeestrategico;
    @JoinColumn(name = "id_estrategia", referencedColumnName = "id_estrategia")
    @ManyToOne(optional = false)
    private GloEstrategia idEstrategia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEjeestrategia")
    private Collection<GloEstrategiaindicador> gloEstrategiaindicadorCollection;

    public GloEjeestrategia() {
    }

    public GloEjeestrategia(Integer idEjeestrategia) {
        this.idEjeestrategia = idEjeestrategia;
    }

    public GloEjeestrategia(Integer idEjeestrategia, String codigo) {
        this.idEjeestrategia = idEjeestrategia;
        this.codigo = codigo;
    }

    public Integer getIdEjeestrategia() {
        return idEjeestrategia;
    }

    public void setIdEjeestrategia(Integer idEjeestrategia) {
        this.idEjeestrategia = idEjeestrategia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public GloTemporadaejeestrategico getIdTempEjeestrategico() {
        return idTempEjeestrategico;
    }

    public void setIdTempEjeestrategico(GloTemporadaejeestrategico idTempEjeestrategico) {
        this.idTempEjeestrategico = idTempEjeestrategico;
    }

    public GloEstrategia getIdEstrategia() {
        return idEstrategia;
    }

    public void setIdEstrategia(GloEstrategia idEstrategia) {
        this.idEstrategia = idEstrategia;
    }

    @XmlTransient
    public Collection<GloEstrategiaindicador> getGloEstrategiaindicadorCollection() {
        return gloEstrategiaindicadorCollection;
    }

    public void setGloEstrategiaindicadorCollection(Collection<GloEstrategiaindicador> gloEstrategiaindicadorCollection) {
        this.gloEstrategiaindicadorCollection = gloEstrategiaindicadorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEjeestrategia != null ? idEjeestrategia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloEjeestrategia)) {
            return false;
        }
        GloEjeestrategia other = (GloEjeestrategia) object;
        if ((this.idEjeestrategia == null && other.idEjeestrategia != null) || (this.idEjeestrategia != null && !this.idEjeestrategia.equals(other.idEjeestrategia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloEjeestrategia[ idEjeestrategia=" + idEjeestrategia + " ]";
    }
    
}
