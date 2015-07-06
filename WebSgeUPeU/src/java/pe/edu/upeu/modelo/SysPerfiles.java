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
@Table(name = "sys_perfiles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysPerfiles.findAll", query = "SELECT s FROM SysPerfiles s")})
public class SysPerfiles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_perfiles")
    private Integer idPerfiles;
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
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPerfiles")
    private Collection<GloUsuarioFilial> gloUsuarioFilialCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPerfiles")
    private Collection<SysAccesosPerfiles> sysAccesosPerfilesCollection;

    public SysPerfiles() {
    }

    public SysPerfiles(Integer idPerfiles) {
        this.idPerfiles = idPerfiles;
    }

    public SysPerfiles(Integer idPerfiles, String nombre, String descripcion, String codigo, String estado) {
        this.idPerfiles = idPerfiles;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.estado = estado;
    }

    public Integer getIdPerfiles() {
        return idPerfiles;
    }

    public void setIdPerfiles(Integer idPerfiles) {
        this.idPerfiles = idPerfiles;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<GloUsuarioFilial> getGloUsuarioFilialCollection() {
        return gloUsuarioFilialCollection;
    }

    public void setGloUsuarioFilialCollection(Collection<GloUsuarioFilial> gloUsuarioFilialCollection) {
        this.gloUsuarioFilialCollection = gloUsuarioFilialCollection;
    }

    @XmlTransient
    public Collection<SysAccesosPerfiles> getSysAccesosPerfilesCollection() {
        return sysAccesosPerfilesCollection;
    }

    public void setSysAccesosPerfilesCollection(Collection<SysAccesosPerfiles> sysAccesosPerfilesCollection) {
        this.sysAccesosPerfilesCollection = sysAccesosPerfilesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerfiles != null ? idPerfiles.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysPerfiles)) {
            return false;
        }
        SysPerfiles other = (SysPerfiles) object;
        if ((this.idPerfiles == null && other.idPerfiles != null) || (this.idPerfiles != null && !this.idPerfiles.equals(other.idPerfiles))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.SysPerfiles[ idPerfiles=" + idPerfiles + " ]";
    }
    
}
