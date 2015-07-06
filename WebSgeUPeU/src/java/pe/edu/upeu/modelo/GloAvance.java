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
@Table(name = "glo_avance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloAvance.findAll", query = "SELECT g FROM GloAvance g")})
public class GloAvance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_avance")
    private Integer idAvance;
    @Basic(optional = false)
    @Column(name = "fecha_rg")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRg;
    @Basic(optional = false)
    @Column(name = "fecha_md")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaMd;
    @Basic(optional = false)
    @Column(name = "evidenciaurl")
    private String evidenciaurl;
    @Basic(optional = false)
    @Column(name = "avancemeta")
    private double avancemeta;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAvance")
    private Collection<GloEvidencia> gloEvidenciaCollection;
    @JoinColumn(name = "id_usuario_filial", referencedColumnName = "id_usuario_filial")
    @ManyToOne(optional = false)
    private GloUsuarioFilial idUsuarioFilial;
    @JoinColumn(name = "id_puntocontrol", referencedColumnName = "id_puntocontrol")
    @ManyToOne(optional = false)
    private GloPuntocontrol idPuntocontrol;
    @JoinColumn(name = "id_meta", referencedColumnName = "id_meta")
    @ManyToOne(optional = false)
    private GloMeta idMeta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAvance")
    private Collection<GloSeguimiento> gloSeguimientoCollection;

    public GloAvance() {
    }

    public GloAvance(Integer idAvance) {
        this.idAvance = idAvance;
    }

    public GloAvance(Integer idAvance, Date fechaRg, Date fechaMd, String evidenciaurl, double avancemeta, String estado) {
        this.idAvance = idAvance;
        this.fechaRg = fechaRg;
        this.fechaMd = fechaMd;
        this.evidenciaurl = evidenciaurl;
        this.avancemeta = avancemeta;
        this.estado = estado;
    }

    public Integer getIdAvance() {
        return idAvance;
    }

    public void setIdAvance(Integer idAvance) {
        this.idAvance = idAvance;
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

    public String getEvidenciaurl() {
        return evidenciaurl;
    }

    public void setEvidenciaurl(String evidenciaurl) {
        this.evidenciaurl = evidenciaurl;
    }

    public double getAvancemeta() {
        return avancemeta;
    }

    public void setAvancemeta(double avancemeta) {
        this.avancemeta = avancemeta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<GloEvidencia> getGloEvidenciaCollection() {
        return gloEvidenciaCollection;
    }

    public void setGloEvidenciaCollection(Collection<GloEvidencia> gloEvidenciaCollection) {
        this.gloEvidenciaCollection = gloEvidenciaCollection;
    }

    public GloUsuarioFilial getIdUsuarioFilial() {
        return idUsuarioFilial;
    }

    public void setIdUsuarioFilial(GloUsuarioFilial idUsuarioFilial) {
        this.idUsuarioFilial = idUsuarioFilial;
    }

    public GloPuntocontrol getIdPuntocontrol() {
        return idPuntocontrol;
    }

    public void setIdPuntocontrol(GloPuntocontrol idPuntocontrol) {
        this.idPuntocontrol = idPuntocontrol;
    }

    public GloMeta getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(GloMeta idMeta) {
        this.idMeta = idMeta;
    }

    @XmlTransient
    public Collection<GloSeguimiento> getGloSeguimientoCollection() {
        return gloSeguimientoCollection;
    }

    public void setGloSeguimientoCollection(Collection<GloSeguimiento> gloSeguimientoCollection) {
        this.gloSeguimientoCollection = gloSeguimientoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAvance != null ? idAvance.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloAvance)) {
            return false;
        }
        GloAvance other = (GloAvance) object;
        if ((this.idAvance == null && other.idAvance != null) || (this.idAvance != null && !this.idAvance.equals(other.idAvance))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloAvance[ idAvance=" + idAvance + " ]";
    }
    
}
