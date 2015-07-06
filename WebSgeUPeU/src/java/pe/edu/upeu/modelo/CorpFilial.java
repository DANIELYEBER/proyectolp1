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
@Table(name = "corp_filial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CorpFilial.findAll", query = "SELECT c FROM CorpFilial c")})
public class CorpFilial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_filial")
    private Integer idFilial;
    @Basic(optional = false)
    @Column(name = "nombre_filial")
    private String nombreFilial;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "mision")
    private String mision;
    @Basic(optional = false)
    @Column(name = "vision")
    private String vision;
    @Basic(optional = false)
    @Column(name = "valores")
    private String valores;
    @Basic(optional = false)
    @Column(name = "logo")
    private String logo;
    @Basic(optional = false)
    @Column(name = "ruc")
    private String ruc;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "celular")
    private String celular;
    @Basic(optional = false)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa")
    @ManyToOne(optional = false)
    private CorpEmpresa idEmpresa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFilial")
    private Collection<GloDepartamentosFilial> gloDepartamentosFilialCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFilial")
    private Collection<GloIndicador> gloIndicadorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFilial")
    private Collection<GloUsuarioFilial> gloUsuarioFilialCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFilial")
    private Collection<GloEstadoFilial> gloEstadoFilialCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFilial")
    private Collection<GloEstrategia> gloEstrategiaCollection;

    public CorpFilial() {
    }

    public CorpFilial(Integer idFilial) {
        this.idFilial = idFilial;
    }

    public CorpFilial(Integer idFilial, String nombreFilial, String descripcion, String mision, String vision, String valores, String logo, String ruc, String telefono, String celular, String correo, String estado) {
        this.idFilial = idFilial;
        this.nombreFilial = nombreFilial;
        this.descripcion = descripcion;
        this.mision = mision;
        this.vision = vision;
        this.valores = valores;
        this.logo = logo;
        this.ruc = ruc;
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
        this.estado = estado;
    }

    public Integer getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(Integer idFilial) {
        this.idFilial = idFilial;
    }

    public String getNombreFilial() {
        return nombreFilial;
    }

    public void setNombreFilial(String nombreFilial) {
        this.nombreFilial = nombreFilial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getValores() {
        return valores;
    }

    public void setValores(String valores) {
        this.valores = valores;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public CorpEmpresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(CorpEmpresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @XmlTransient
    public Collection<GloDepartamentosFilial> getGloDepartamentosFilialCollection() {
        return gloDepartamentosFilialCollection;
    }

    public void setGloDepartamentosFilialCollection(Collection<GloDepartamentosFilial> gloDepartamentosFilialCollection) {
        this.gloDepartamentosFilialCollection = gloDepartamentosFilialCollection;
    }

    @XmlTransient
    public Collection<GloIndicador> getGloIndicadorCollection() {
        return gloIndicadorCollection;
    }

    public void setGloIndicadorCollection(Collection<GloIndicador> gloIndicadorCollection) {
        this.gloIndicadorCollection = gloIndicadorCollection;
    }

    @XmlTransient
    public Collection<GloUsuarioFilial> getGloUsuarioFilialCollection() {
        return gloUsuarioFilialCollection;
    }

    public void setGloUsuarioFilialCollection(Collection<GloUsuarioFilial> gloUsuarioFilialCollection) {
        this.gloUsuarioFilialCollection = gloUsuarioFilialCollection;
    }

    @XmlTransient
    public Collection<GloEstadoFilial> getGloEstadoFilialCollection() {
        return gloEstadoFilialCollection;
    }

    public void setGloEstadoFilialCollection(Collection<GloEstadoFilial> gloEstadoFilialCollection) {
        this.gloEstadoFilialCollection = gloEstadoFilialCollection;
    }

    @XmlTransient
    public Collection<GloEstrategia> getGloEstrategiaCollection() {
        return gloEstrategiaCollection;
    }

    public void setGloEstrategiaCollection(Collection<GloEstrategia> gloEstrategiaCollection) {
        this.gloEstrategiaCollection = gloEstrategiaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFilial != null ? idFilial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CorpFilial)) {
            return false;
        }
        CorpFilial other = (CorpFilial) object;
        if ((this.idFilial == null && other.idFilial != null) || (this.idFilial != null && !this.idFilial.equals(other.idFilial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.CorpFilial[ idFilial=" + idFilial + " ]";
    }
    
}
