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
@Table(name = "glo_ejeestrategico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloEjeestrategico.findAll", query = "SELECT g FROM GloEjeestrategico g")})
public class GloEjeestrategico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ejeestrategico")
    private Integer idEjeestrategico;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "objetivoestrategico")
    private String objetivoestrategico;
    @Basic(optional = false)
    @Column(name = "mapaestrategico")
    private String mapaestrategico;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "porcentaje_valor")
    private double porcentajeValor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEjeestrategico")
    private Collection<GloTemporadaejeestrategico> gloTemporadaejeestrategicoCollection;
    @JoinColumn(name = "id_tipoarea", referencedColumnName = "id_tipoarea")
    @ManyToOne(optional = false)
    private GloTipoarea idTipoarea;

    public GloEjeestrategico() {
    }

    public GloEjeestrategico(Integer idEjeestrategico) {
        this.idEjeestrategico = idEjeestrategico;
    }

    public GloEjeestrategico(Integer idEjeestrategico, String nombre, String descripcion, String estado, String objetivoestrategico, String mapaestrategico, String codigo, double porcentajeValor) {
        this.idEjeestrategico = idEjeestrategico;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.objetivoestrategico = objetivoestrategico;
        this.mapaestrategico = mapaestrategico;
        this.codigo = codigo;
        this.porcentajeValor = porcentajeValor;
    }

    public Integer getIdEjeestrategico() {
        return idEjeestrategico;
    }

    public void setIdEjeestrategico(Integer idEjeestrategico) {
        this.idEjeestrategico = idEjeestrategico;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObjetivoestrategico() {
        return objetivoestrategico;
    }

    public void setObjetivoestrategico(String objetivoestrategico) {
        this.objetivoestrategico = objetivoestrategico;
    }

    public String getMapaestrategico() {
        return mapaestrategico;
    }

    public void setMapaestrategico(String mapaestrategico) {
        this.mapaestrategico = mapaestrategico;
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
    public Collection<GloTemporadaejeestrategico> getGloTemporadaejeestrategicoCollection() {
        return gloTemporadaejeestrategicoCollection;
    }

    public void setGloTemporadaejeestrategicoCollection(Collection<GloTemporadaejeestrategico> gloTemporadaejeestrategicoCollection) {
        this.gloTemporadaejeestrategicoCollection = gloTemporadaejeestrategicoCollection;
    }

    public GloTipoarea getIdTipoarea() {
        return idTipoarea;
    }

    public void setIdTipoarea(GloTipoarea idTipoarea) {
        this.idTipoarea = idTipoarea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEjeestrategico != null ? idEjeestrategico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloEjeestrategico)) {
            return false;
        }
        GloEjeestrategico other = (GloEjeestrategico) object;
        if ((this.idEjeestrategico == null && other.idEjeestrategico != null) || (this.idEjeestrategico != null && !this.idEjeestrategico.equals(other.idEjeestrategico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloEjeestrategico[ idEjeestrategico=" + idEjeestrategico + " ]";
    }
    
}
