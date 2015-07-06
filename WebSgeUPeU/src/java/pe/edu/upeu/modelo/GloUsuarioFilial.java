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
@Table(name = "glo_usuario_filial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloUsuarioFilial.findAll", query = "SELECT g FROM GloUsuarioFilial g")})
public class GloUsuarioFilial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario_filial")
    private Integer idUsuarioFilial;
    @Basic(optional = false)
    @Column(name = "estado")
    private int estado;
    @Basic(optional = false)
    @Column(name = "estado_1")
    private String estado1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuarioFilial")
    private Collection<GloActividad> gloActividadCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuarioFilial")
    private Collection<SysAccesoPrivilegio> sysAccesoPrivilegioCollection;
    @JoinColumn(name = "id_perfiles", referencedColumnName = "id_perfiles")
    @ManyToOne(optional = false)
    private SysPerfiles idPerfiles;
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @ManyToOne(optional = false)
    private GloPersona idPersona;
    @JoinColumn(name = "id_filial", referencedColumnName = "id_filial")
    @ManyToOne(optional = false)
    private CorpFilial idFilial;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuarioFilial")
    private Collection<GloMeta> gloMetaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuarioFilial")
    private Collection<GloEvidencia> gloEvidenciaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuarioFilial")
    private Collection<GloAvance> gloAvanceCollection;

    public GloUsuarioFilial() {
    }

    public GloUsuarioFilial(Integer idUsuarioFilial) {
        this.idUsuarioFilial = idUsuarioFilial;
    }

    public GloUsuarioFilial(Integer idUsuarioFilial, int estado, String estado1) {
        this.idUsuarioFilial = idUsuarioFilial;
        this.estado = estado;
        this.estado1 = estado1;
    }

    public Integer getIdUsuarioFilial() {
        return idUsuarioFilial;
    }

    public void setIdUsuarioFilial(Integer idUsuarioFilial) {
        this.idUsuarioFilial = idUsuarioFilial;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getEstado1() {
        return estado1;
    }

    public void setEstado1(String estado1) {
        this.estado1 = estado1;
    }

    @XmlTransient
    public Collection<GloActividad> getGloActividadCollection() {
        return gloActividadCollection;
    }

    public void setGloActividadCollection(Collection<GloActividad> gloActividadCollection) {
        this.gloActividadCollection = gloActividadCollection;
    }

    @XmlTransient
    public Collection<SysAccesoPrivilegio> getSysAccesoPrivilegioCollection() {
        return sysAccesoPrivilegioCollection;
    }

    public void setSysAccesoPrivilegioCollection(Collection<SysAccesoPrivilegio> sysAccesoPrivilegioCollection) {
        this.sysAccesoPrivilegioCollection = sysAccesoPrivilegioCollection;
    }

    public SysPerfiles getIdPerfiles() {
        return idPerfiles;
    }

    public void setIdPerfiles(SysPerfiles idPerfiles) {
        this.idPerfiles = idPerfiles;
    }

    public GloPersona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(GloPersona idPersona) {
        this.idPersona = idPersona;
    }

    public CorpFilial getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(CorpFilial idFilial) {
        this.idFilial = idFilial;
    }

    @XmlTransient
    public Collection<GloMeta> getGloMetaCollection() {
        return gloMetaCollection;
    }

    public void setGloMetaCollection(Collection<GloMeta> gloMetaCollection) {
        this.gloMetaCollection = gloMetaCollection;
    }

    @XmlTransient
    public Collection<GloEvidencia> getGloEvidenciaCollection() {
        return gloEvidenciaCollection;
    }

    public void setGloEvidenciaCollection(Collection<GloEvidencia> gloEvidenciaCollection) {
        this.gloEvidenciaCollection = gloEvidenciaCollection;
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
        hash += (idUsuarioFilial != null ? idUsuarioFilial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloUsuarioFilial)) {
            return false;
        }
        GloUsuarioFilial other = (GloUsuarioFilial) object;
        if ((this.idUsuarioFilial == null && other.idUsuarioFilial != null) || (this.idUsuarioFilial != null && !this.idUsuarioFilial.equals(other.idUsuarioFilial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloUsuarioFilial[ idUsuarioFilial=" + idUsuarioFilial + " ]";
    }
    
}
