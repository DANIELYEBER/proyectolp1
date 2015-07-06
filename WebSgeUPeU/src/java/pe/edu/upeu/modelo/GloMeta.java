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
@Table(name = "glo_meta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloMeta.findAll", query = "SELECT g FROM GloMeta g")})
public class GloMeta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_meta")
    private Integer idMeta;
    @Basic(optional = false)
    @Column(name = "meta")
    private double meta;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "fecha_rg")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRg;
    @Basic(optional = false)
    @Column(name = "fecha_md")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaMd;
    @Basic(optional = false)
    @Column(name = "avancemeta")
    private double avancemeta;
    @Basic(optional = false)
    @Column(name = "avancemeta1")
    private double avancemeta1;
    @Basic(optional = false)
    @Column(name = "avancemeta2")
    private double avancemeta2;
    @Basic(optional = false)
    @Column(name = "avancemeta3")
    private double avancemeta3;
    @Basic(optional = false)
    @Column(name = "avancemeta4")
    private double avancemeta4;
    @Basic(optional = false)
    @Column(name = "avancemeta5")
    private double avancemeta5;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMeta")
    private Collection<GloActividad> gloActividadCollection;
    @JoinColumn(name = "id_usuario_filial", referencedColumnName = "id_usuario_filial")
    @ManyToOne(optional = false)
    private GloUsuarioFilial idUsuarioFilial;
    @JoinColumn(name = "id_estrategiaindicador", referencedColumnName = "id_estrategiaindicador")
    @ManyToOne(optional = false)
    private GloEstrategiaindicador idEstrategiaindicador;
    @JoinColumn(name = "id_depart_area", referencedColumnName = "id_depart_area")
    @ManyToOne(optional = false)
    private GloDepartArea idDepartArea;
    @JoinColumn(name = "id_periodo", referencedColumnName = "id_periodo")
    @ManyToOne(optional = false)
    private ConfPeriodo idPeriodo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMeta")
    private Collection<GloAvance> gloAvanceCollection;

    public GloMeta() {
    }

    public GloMeta(Integer idMeta) {
        this.idMeta = idMeta;
    }

    public GloMeta(Integer idMeta, double meta, String descripcion, Date fechaRg, Date fechaMd, double avancemeta, double avancemeta1, double avancemeta2, double avancemeta3, double avancemeta4, double avancemeta5) {
        this.idMeta = idMeta;
        this.meta = meta;
        this.descripcion = descripcion;
        this.fechaRg = fechaRg;
        this.fechaMd = fechaMd;
        this.avancemeta = avancemeta;
        this.avancemeta1 = avancemeta1;
        this.avancemeta2 = avancemeta2;
        this.avancemeta3 = avancemeta3;
        this.avancemeta4 = avancemeta4;
        this.avancemeta5 = avancemeta5;
    }

    public Integer getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(Integer idMeta) {
        this.idMeta = idMeta;
    }

    public double getMeta() {
        return meta;
    }

    public void setMeta(double meta) {
        this.meta = meta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaRg() {
        return fechaRg;
    }

    public void setFechaRg(Date fechaRg) {
        this.fechaRg = fechaRg;
    }

    public Date getFechaMd() {
        return fechaMd;
    }

    public void setFechaMd(Date fechaMd) {
        this.fechaMd = fechaMd;
    }

    public double getAvancemeta() {
        return avancemeta;
    }

    public void setAvancemeta(double avancemeta) {
        this.avancemeta = avancemeta;
    }

    public double getAvancemeta1() {
        return avancemeta1;
    }

    public void setAvancemeta1(double avancemeta1) {
        this.avancemeta1 = avancemeta1;
    }

    public double getAvancemeta2() {
        return avancemeta2;
    }

    public void setAvancemeta2(double avancemeta2) {
        this.avancemeta2 = avancemeta2;
    }

    public double getAvancemeta3() {
        return avancemeta3;
    }

    public void setAvancemeta3(double avancemeta3) {
        this.avancemeta3 = avancemeta3;
    }

    public double getAvancemeta4() {
        return avancemeta4;
    }

    public void setAvancemeta4(double avancemeta4) {
        this.avancemeta4 = avancemeta4;
    }

    public double getAvancemeta5() {
        return avancemeta5;
    }

    public void setAvancemeta5(double avancemeta5) {
        this.avancemeta5 = avancemeta5;
    }

    @XmlTransient
    public Collection<GloActividad> getGloActividadCollection() {
        return gloActividadCollection;
    }

    public void setGloActividadCollection(Collection<GloActividad> gloActividadCollection) {
        this.gloActividadCollection = gloActividadCollection;
    }

    public GloUsuarioFilial getIdUsuarioFilial() {
        return idUsuarioFilial;
    }

    public void setIdUsuarioFilial(GloUsuarioFilial idUsuarioFilial) {
        this.idUsuarioFilial = idUsuarioFilial;
    }

    public GloEstrategiaindicador getIdEstrategiaindicador() {
        return idEstrategiaindicador;
    }

    public void setIdEstrategiaindicador(GloEstrategiaindicador idEstrategiaindicador) {
        this.idEstrategiaindicador = idEstrategiaindicador;
    }

    public GloDepartArea getIdDepartArea() {
        return idDepartArea;
    }

    public void setIdDepartArea(GloDepartArea idDepartArea) {
        this.idDepartArea = idDepartArea;
    }

    public ConfPeriodo getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(ConfPeriodo idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    @XmlTransient
    public Collection<GloAvance> getGloAvanceCollection() {
        return gloAvanceCollection;
    }

    public void setGloAvanceCollection(Collection<GloAvance> gloAvanceCollection) {
        this.gloAvanceCollection = gloAvanceCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMeta != null ? idMeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloMeta)) {
            return false;
        }
        GloMeta other = (GloMeta) object;
        if ((this.idMeta == null && other.idMeta != null) || (this.idMeta != null && !this.idMeta.equals(other.idMeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloMeta[ idMeta=" + idMeta + " ]";
    }
    
}
