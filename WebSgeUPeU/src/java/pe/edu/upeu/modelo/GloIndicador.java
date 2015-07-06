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
@Table(name = "glo_indicador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloIndicador.findAll", query = "SELECT g FROM GloIndicador g")})
public class GloIndicador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_indicador")
    private Integer idIndicador;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "minmetapropuesta")
    private double minmetapropuesta;
    @Basic(optional = false)
    @Column(name = "metapropuesta")
    private double metapropuesta;
    @JoinColumn(name = "id_tipoorden", referencedColumnName = "id_tipoorden")
    @ManyToOne(optional = false)
    private GloTipoorden idTipoorden;
    @JoinColumn(name = "id_tipometa", referencedColumnName = "id_tipometa")
    @ManyToOne(optional = false)
    private GloTipometa idTipometa;
    @JoinColumn(name = "id_tipoarea", referencedColumnName = "id_tipoarea")
    @ManyToOne(optional = false)
    private GloTipoarea idTipoarea;
    @JoinColumn(name = "id_temp_ejeestrategico", referencedColumnName = "id_temp_ejeestrategico")
    @ManyToOne(optional = false)
    private GloTemporadaejeestrategico idTempEjeestrategico;
    @JoinColumn(name = "id_significancia", referencedColumnName = "id_significancia")
    @ManyToOne(optional = false)
    private GloSignificancia idSignificancia;
    @JoinColumn(name = "id_filial", referencedColumnName = "id_filial")
    @ManyToOne(optional = false)
    private CorpFilial idFilial;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idIndicador")
    private Collection<GloEstrategiaindicador> gloEstrategiaindicadorCollection;

    public GloIndicador() {
    }

    public GloIndicador(Integer idIndicador) {
        this.idIndicador = idIndicador;
    }

    public GloIndicador(Integer idIndicador, String nombre, String codigo, String descripcion, String estado, double minmetapropuesta, double metapropuesta) {
        this.idIndicador = idIndicador;
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.minmetapropuesta = minmetapropuesta;
        this.metapropuesta = metapropuesta;
    }

    public Integer getIdIndicador() {
        return idIndicador;
    }

    public void setIdIndicador(Integer idIndicador) {
        this.idIndicador = idIndicador;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getMinmetapropuesta() {
        return minmetapropuesta;
    }

    public void setMinmetapropuesta(double minmetapropuesta) {
        this.minmetapropuesta = minmetapropuesta;
    }

    public double getMetapropuesta() {
        return metapropuesta;
    }

    public void setMetapropuesta(double metapropuesta) {
        this.metapropuesta = metapropuesta;
    }

    public GloTipoorden getIdTipoorden() {
        return idTipoorden;
    }

    public void setIdTipoorden(GloTipoorden idTipoorden) {
        this.idTipoorden = idTipoorden;
    }

    public GloTipometa getIdTipometa() {
        return idTipometa;
    }

    public void setIdTipometa(GloTipometa idTipometa) {
        this.idTipometa = idTipometa;
    }

    public GloTipoarea getIdTipoarea() {
        return idTipoarea;
    }

    public void setIdTipoarea(GloTipoarea idTipoarea) {
        this.idTipoarea = idTipoarea;
    }

    public GloTemporadaejeestrategico getIdTempEjeestrategico() {
        return idTempEjeestrategico;
    }

    public void setIdTempEjeestrategico(GloTemporadaejeestrategico idTempEjeestrategico) {
        this.idTempEjeestrategico = idTempEjeestrategico;
    }

    public GloSignificancia getIdSignificancia() {
        return idSignificancia;
    }

    public void setIdSignificancia(GloSignificancia idSignificancia) {
        this.idSignificancia = idSignificancia;
    }

    public CorpFilial getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(CorpFilial idFilial) {
        this.idFilial = idFilial;
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
        hash += (idIndicador != null ? idIndicador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloIndicador)) {
            return false;
        }
        GloIndicador other = (GloIndicador) object;
        if ((this.idIndicador == null && other.idIndicador != null) || (this.idIndicador != null && !this.idIndicador.equals(other.idIndicador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloIndicador[ idIndicador=" + idIndicador + " ]";
    }
    
}
