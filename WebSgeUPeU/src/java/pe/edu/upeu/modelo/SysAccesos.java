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
@Table(name = "sys_accesos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysAccesos.findAll", query = "SELECT s FROM SysAccesos s")})
public class SysAccesos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_acceso")
    private Integer idAcceso;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "url")
    private String url;
    @Basic(optional = false)
    @Column(name = "codigo_seg")
    private String codigoSeg;
    @Basic(optional = false)
    @Column(name = "nro_orden")
    private int nroOrden;
    @Basic(optional = false)
    @Column(name = "imagen")
    private String imagen;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAcceso")
    private Collection<SysAccesoPrivilegio> sysAccesoPrivilegioCollection;
    @JoinColumn(name = "id_menu", referencedColumnName = "id_menu")
    @ManyToOne(optional = false)
    private SysMenu idMenu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAcceso")
    private Collection<SysAccesosPerfiles> sysAccesosPerfilesCollection;

    public SysAccesos() {
    }

    public SysAccesos(Integer idAcceso) {
        this.idAcceso = idAcceso;
    }

    public SysAccesos(Integer idAcceso, String nombre, String descripcion, String url, String codigoSeg, int nroOrden, String imagen, String estado) {
        this.idAcceso = idAcceso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url = url;
        this.codigoSeg = codigoSeg;
        this.nroOrden = nroOrden;
        this.imagen = imagen;
        this.estado = estado;
    }

    public Integer getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(Integer idAcceso) {
        this.idAcceso = idAcceso;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCodigoSeg() {
        return codigoSeg;
    }

    public void setCodigoSeg(String codigoSeg) {
        this.codigoSeg = codigoSeg;
    }

    public int getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(int nroOrden) {
        this.nroOrden = nroOrden;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<SysAccesoPrivilegio> getSysAccesoPrivilegioCollection() {
        return sysAccesoPrivilegioCollection;
    }

    public void setSysAccesoPrivilegioCollection(Collection<SysAccesoPrivilegio> sysAccesoPrivilegioCollection) {
        this.sysAccesoPrivilegioCollection = sysAccesoPrivilegioCollection;
    }

    public SysMenu getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(SysMenu idMenu) {
        this.idMenu = idMenu;
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
        hash += (idAcceso != null ? idAcceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysAccesos)) {
            return false;
        }
        SysAccesos other = (SysAccesos) object;
        if ((this.idAcceso == null && other.idAcceso != null) || (this.idAcceso != null && !this.idAcceso.equals(other.idAcceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.SysAccesos[ idAcceso=" + idAcceso + " ]";
    }
    
}
