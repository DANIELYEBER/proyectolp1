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
@Table(name = "corp_organizacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CorpOrganizacion.findAll", query = "SELECT c FROM CorpOrganizacion c")})
public class CorpOrganizacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_organizacion")
    private Integer idOrganizacion;
    @Basic(optional = false)
    @Column(name = "nombre_organizacion")
    private String nombreOrganizacion;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "mison")
    private String mison;
    @Basic(optional = false)
    @Column(name = "vison")
    private String vison;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOrganizacion")
    private Collection<CorpEmpresa> corpEmpresaCollection;

    public CorpOrganizacion() {
    }

    public CorpOrganizacion(Integer idOrganizacion) {
        this.idOrganizacion = idOrganizacion;
    }

    public CorpOrganizacion(Integer idOrganizacion, String nombreOrganizacion, String descripcion, String mison, String vison, String valores, String logo, String ruc, String telefono, String celular, String correo, String estado) {
        this.idOrganizacion = idOrganizacion;
        this.nombreOrganizacion = nombreOrganizacion;
        this.descripcion = descripcion;
        this.mison = mison;
        this.vison = vison;
        this.valores = valores;
        this.logo = logo;
        this.ruc = ruc;
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
        this.estado = estado;
    }

    public Integer getIdOrganizacion() {
        return idOrganizacion;
    }

    public void setIdOrganizacion(Integer idOrganizacion) {
        this.idOrganizacion = idOrganizacion;
    }

    public String getNombreOrganizacion() {
        return nombreOrganizacion;
    }

    public void setNombreOrganizacion(String nombreOrganizacion) {
        this.nombreOrganizacion = nombreOrganizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMison() {
        return mison;
    }

    public void setMison(String mison) {
        this.mison = mison;
    }

    public String getVison() {
        return vison;
    }

    public void setVison(String vison) {
        this.vison = vison;
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
    public Collection<CorpEmpresa> getCorpEmpresaCollection() {
        return corpEmpresaCollection;
    }

    public void setCorpEmpresaCollection(Collection<CorpEmpresa> corpEmpresaCollection) {
        this.corpEmpresaCollection = corpEmpresaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrganizacion != null ? idOrganizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CorpOrganizacion)) {
            return false;
        }
        CorpOrganizacion other = (CorpOrganizacion) object;
        if ((this.idOrganizacion == null && other.idOrganizacion != null) || (this.idOrganizacion != null && !this.idOrganizacion.equals(other.idOrganizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.CorpOrganizacion[ idOrganizacion=" + idOrganizacion + " ]";
    }
    
}
