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
@Table(name = "fin_cuenta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FinCuenta.findAll", query = "SELECT f FROM FinCuenta f")})
public class FinCuenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cuenta")
    private Integer idCuenta;
    @Basic(optional = false)
    @Column(name = "nombreelemento")
    private String nombreelemento;
    @Basic(optional = false)
    @Column(name = "elementocodigo")
    private String elementocodigo;
    @Basic(optional = false)
    @Column(name = "nombrecuenta")
    private String nombrecuenta;
    @Basic(optional = false)
    @Column(name = "cuentacodigo")
    private String cuentacodigo;
    @Basic(optional = false)
    @Column(name = "nombresubcuenta")
    private String nombresubcuenta;
    @Basic(optional = false)
    @Column(name = "subcuentacodigo")
    private String subcuentacodigo;
    @Basic(optional = false)
    @Column(name = "nombredivision")
    private String nombredivision;
    @Basic(optional = false)
    @Column(name = "divisioncodigo")
    private String divisioncodigo;
    @Basic(optional = false)
    @Column(name = "sombresubdivision")
    private String sombresubdivision;
    @Basic(optional = false)
    @Column(name = "subdivisioncodigo")
    private String subdivisioncodigo;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "condicion")
    private String condicion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCuenta")
    private Collection<GloActividad> gloActividadCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCuenta")
    private Collection<FinPartidapresupuestaria> finPartidapresupuestariaCollection;

    public FinCuenta() {
    }

    public FinCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public FinCuenta(Integer idCuenta, String nombreelemento, String elementocodigo, String nombrecuenta, String cuentacodigo, String nombresubcuenta, String subcuentacodigo, String nombredivision, String divisioncodigo, String sombresubdivision, String subdivisioncodigo, String descripcion, String estado, String condicion) {
        this.idCuenta = idCuenta;
        this.nombreelemento = nombreelemento;
        this.elementocodigo = elementocodigo;
        this.nombrecuenta = nombrecuenta;
        this.cuentacodigo = cuentacodigo;
        this.nombresubcuenta = nombresubcuenta;
        this.subcuentacodigo = subcuentacodigo;
        this.nombredivision = nombredivision;
        this.divisioncodigo = divisioncodigo;
        this.sombresubdivision = sombresubdivision;
        this.subdivisioncodigo = subdivisioncodigo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.condicion = condicion;
    }

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNombreelemento() {
        return nombreelemento;
    }

    public void setNombreelemento(String nombreelemento) {
        this.nombreelemento = nombreelemento;
    }

    public String getElementocodigo() {
        return elementocodigo;
    }

    public void setElementocodigo(String elementocodigo) {
        this.elementocodigo = elementocodigo;
    }

    public String getNombrecuenta() {
        return nombrecuenta;
    }

    public void setNombrecuenta(String nombrecuenta) {
        this.nombrecuenta = nombrecuenta;
    }

    public String getCuentacodigo() {
        return cuentacodigo;
    }

    public void setCuentacodigo(String cuentacodigo) {
        this.cuentacodigo = cuentacodigo;
    }

    public String getNombresubcuenta() {
        return nombresubcuenta;
    }

    public void setNombresubcuenta(String nombresubcuenta) {
        this.nombresubcuenta = nombresubcuenta;
    }

    public String getSubcuentacodigo() {
        return subcuentacodigo;
    }

    public void setSubcuentacodigo(String subcuentacodigo) {
        this.subcuentacodigo = subcuentacodigo;
    }

    public String getNombredivision() {
        return nombredivision;
    }

    public void setNombredivision(String nombredivision) {
        this.nombredivision = nombredivision;
    }

    public String getDivisioncodigo() {
        return divisioncodigo;
    }

    public void setDivisioncodigo(String divisioncodigo) {
        this.divisioncodigo = divisioncodigo;
    }

    public String getSombresubdivision() {
        return sombresubdivision;
    }

    public void setSombresubdivision(String sombresubdivision) {
        this.sombresubdivision = sombresubdivision;
    }

    public String getSubdivisioncodigo() {
        return subdivisioncodigo;
    }

    public void setSubdivisioncodigo(String subdivisioncodigo) {
        this.subdivisioncodigo = subdivisioncodigo;
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

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    @XmlTransient
    public Collection<GloActividad> getGloActividadCollection() {
        return gloActividadCollection;
    }

    public void setGloActividadCollection(Collection<GloActividad> gloActividadCollection) {
        this.gloActividadCollection = gloActividadCollection;
    }

    @XmlTransient
    public Collection<FinPartidapresupuestaria> getFinPartidapresupuestariaCollection() {
        return finPartidapresupuestariaCollection;
    }

    public void setFinPartidapresupuestariaCollection(Collection<FinPartidapresupuestaria> finPartidapresupuestariaCollection) {
        this.finPartidapresupuestariaCollection = finPartidapresupuestariaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCuenta != null ? idCuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FinCuenta)) {
            return false;
        }
        FinCuenta other = (FinCuenta) object;
        if ((this.idCuenta == null && other.idCuenta != null) || (this.idCuenta != null && !this.idCuenta.equals(other.idCuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.FinCuenta[ idCuenta=" + idCuenta + " ]";
    }
    
}
