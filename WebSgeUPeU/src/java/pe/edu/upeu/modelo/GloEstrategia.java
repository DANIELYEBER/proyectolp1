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
@Table(name = "glo_estrategia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloEstrategia.findAll", query = "SELECT g FROM GloEstrategia g")})
public class GloEstrategia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estrategia")
    private Integer idEstrategia;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "porcentaje_valor")
    private double porcentajeValor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstrategia")
    private Collection<GloEjeestrategia> gloEjeestrategiaCollection;
    @JoinColumn(name = "id_tipoarea", referencedColumnName = "id_tipoarea")
    @ManyToOne(optional = false)
    private GloTipoarea idTipoarea;
    @JoinColumn(name = "id_perspectiva", referencedColumnName = "id_perspectiva")
    @ManyToOne(optional = false)
    private GloPerspectiva idPerspectiva;
    @JoinColumn(name = "id_filial", referencedColumnName = "id_filial")
    @ManyToOne(optional = false)
    private CorpFilial idFilial;

    public GloEstrategia() {
    }

    public GloEstrategia(Integer idEstrategia) {
        this.idEstrategia = idEstrategia;
    }

    public GloEstrategia(Integer idEstrategia, String nombre, String descripcion, String codigo, double porcentajeValor) {
        this.idEstrategia = idEstrategia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.porcentajeValor = porcentajeValor;
    }

    public Integer getIdEstrategia() {
        return idEstrategia;
    }

    public void setIdEstrategia(Integer idEstrategia) {
        this.idEstrategia = idEstrategia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPorcentajeValor() {
        return porcentajeValor;
    }

    public void setPorcentajeValor(double porcentajeValor) {
        this.porcentajeValor = porcentajeValor;
    }

    @XmlTransient
    public Collection<GloEjeestrategia> getGloEjeestrategiaCollection() {
        return gloEjeestrategiaCollection;
    }

    public void setGloEjeestrategiaCollection(Collection<GloEjeestrategia> gloEjeestrategiaCollection) {
        this.gloEjeestrategiaCollection = gloEjeestrategiaCollection;
    }

    public GloTipoarea getIdTipoarea() {
        return idTipoarea;
    }

    public void setIdTipoarea(GloTipoarea idTipoarea) {
        this.idTipoarea = idTipoarea;
    }

    public GloPerspectiva getIdPerspectiva() {
        return idPerspectiva;
    }

    public void setIdPerspectiva(GloPerspectiva idPerspectiva) {
        this.idPerspectiva = idPerspectiva;
    }

    public CorpFilial getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(CorpFilial idFilial) {
        this.idFilial = idFilial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstrategia != null ? idEstrategia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloEstrategia)) {
            return false;
        }
        GloEstrategia other = (GloEstrategia) object;
        if ((this.idEstrategia == null && other.idEstrategia != null) || (this.idEstrategia != null && !this.idEstrategia.equals(other.idEstrategia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloEstrategia[ idEstrategia=" + idEstrategia + " ]";
    }
    
}
