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
@Table(name = "corp_empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CorpEmpresa.findAll", query = "SELECT c FROM CorpEmpresa c")})
public class CorpEmpresa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_empresa")
    private Integer idEmpresa;
    @Basic(optional = false)
    @Column(name = "razonsocial")
    private String razonsocial;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private Collection<CorpFilial> corpFilialCollection;
    @JoinColumn(name = "id_tipo", referencedColumnName = "id_tipo")
    @ManyToOne(optional = false)
    private CorpTipo idTipo;
    @JoinColumn(name = "id_organizacion", referencedColumnName = "id_organizacion")
    @ManyToOne(optional = false)
    private CorpOrganizacion idOrganizacion;

    public CorpEmpresa() {
    }

    public CorpEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public CorpEmpresa(Integer idEmpresa, String razonsocial, String descripcion, String mision, String vision, String valores, String logo, String ruc, String telefono, String celular, String correo, String estado) {
        this.idEmpresa = idEmpresa;
        this.razonsocial = razonsocial;
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

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
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

    @XmlTransient
    public Collection<CorpFilial> getCorpFilialCollection() {
        return corpFilialCollection;
    }

    public void setCorpFilialCollection(Collection<CorpFilial> corpFilialCollection) {
        this.corpFilialCollection = corpFilialCollection;
    }

    public CorpTipo getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(CorpTipo idTipo) {
        this.idTipo = idTipo;
    }

    public CorpOrganizacion getIdOrganizacion() {
        return idOrganizacion;
    }

    public void setIdOrganizacion(CorpOrganizacion idOrganizacion) {
        this.idOrganizacion = idOrganizacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresa != null ? idEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CorpEmpresa)) {
            return false;
        }
        CorpEmpresa other = (CorpEmpresa) object;
        if ((this.idEmpresa == null && other.idEmpresa != null) || (this.idEmpresa != null && !this.idEmpresa.equals(other.idEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.CorpEmpresa[ idEmpresa=" + idEmpresa + " ]";
    }
    
}
