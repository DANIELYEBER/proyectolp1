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
@Table(name = "glo_estrategiaindicador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloEstrategiaindicador.findAll", query = "SELECT g FROM GloEstrategiaindicador g")})
public class GloEstrategiaindicador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estrategiaindicador")
    private Integer idEstrategiaindicador;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstrategiaindicador")
    private Collection<GloMeta> gloMetaCollection;
    @JoinColumn(name = "id_indicador", referencedColumnName = "id_indicador")
    @ManyToOne(optional = false)
    private GloIndicador idIndicador;
    @JoinColumn(name = "id_ejeestrategia", referencedColumnName = "id_ejeestrategia")
    @ManyToOne(optional = false)
    private GloEjeestrategia idEjeestrategia;

    public GloEstrategiaindicador() {
    }

    public GloEstrategiaindicador(Integer idEstrategiaindicador) {
        this.idEstrategiaindicador = idEstrategiaindicador;
    }

    public GloEstrategiaindicador(Integer idEstrategiaindicador, String codigo) {
        this.idEstrategiaindicador = idEstrategiaindicador;
        this.codigo = codigo;
    }

    public Integer getIdEstrategiaindicador() {
        return idEstrategiaindicador;
    }

    public void setIdEstrategiaindicador(Integer idEstrategiaindicador) {
        this.idEstrategiaindicador = idEstrategiaindicador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @XmlTransient
    public Collection<GloMeta> getGloMetaCollection() {
        return gloMetaCollection;
    }

    public void setGloMetaCollection(Collection<GloMeta> gloMetaCollection) {
        this.gloMetaCollection = gloMetaCollection;
    }

    public GloIndicador getIdIndicador() {
        return idIndicador;
    }

    public void setIdIndicador(GloIndicador idIndicador) {
        this.idIndicador = idIndicador;
    }

    public GloEjeestrategia getIdEjeestrategia() {
        return idEjeestrategia;
    }

    public void setIdEjeestrategia(GloEjeestrategia idEjeestrategia) {
        this.idEjeestrategia = idEjeestrategia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstrategiaindicador != null ? idEstrategiaindicador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloEstrategiaindicador)) {
            return false;
        }
        GloEstrategiaindicador other = (GloEstrategiaindicador) object;
        if ((this.idEstrategiaindicador == null && other.idEstrategiaindicador != null) || (this.idEstrategiaindicador != null && !this.idEstrategiaindicador.equals(other.idEstrategiaindicador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloEstrategiaindicador[ idEstrategiaindicador=" + idEstrategiaindicador + " ]";
    }
    
}
