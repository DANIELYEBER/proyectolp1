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
@Table(name = "glo_persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloPersona.findAll", query = "SELECT g FROM GloPersona g")})
public class GloPersona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_persona")
    private Integer idPersona;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido_pat")
    private String apellidoPat;
    @Basic(optional = false)
    @Column(name = "apellido_mat")
    private String apellidoMat;
    @Basic(optional = false)
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @Column(name = "genero")
    private String genero;
    @Basic(optional = false)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "clave")
    private String clave;
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersona")
    private Collection<GloAreaEje> gloAreaEjeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersona")
    private Collection<GloUsuarioFilial> gloUsuarioFilialCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersona")
    private Collection<GloDepartareaCoordinador> gloDepartareaCoordinadorCollection;
    @JoinColumn(name = "id_docidentidad", referencedColumnName = "id_docidentidad")
    @ManyToOne(optional = false)
    private GloDocidentidad idDocidentidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPersona")
    private Collection<GloDepartCoordinador> gloDepartCoordinadorCollection;

    public GloPersona() {
    }

    public GloPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public GloPersona(Integer idPersona, String nombre, String apellidoPat, String apellidoMat, Date fechaNacimiento, String genero, String correo, String usuario, String clave) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.correo = correo;
        this.usuario = usuario;
        this.clave = clave;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<GloAreaEje> getGloAreaEjeCollection() {
        return gloAreaEjeCollection;
    }

    public void setGloAreaEjeCollection(Collection<GloAreaEje> gloAreaEjeCollection) {
        this.gloAreaEjeCollection = gloAreaEjeCollection;
    }

    @XmlTransient
    public Collection<GloUsuarioFilial> getGloUsuarioFilialCollection() {
        return gloUsuarioFilialCollection;
    }

    public void setGloUsuarioFilialCollection(Collection<GloUsuarioFilial> gloUsuarioFilialCollection) {
        this.gloUsuarioFilialCollection = gloUsuarioFilialCollection;
    }

    @XmlTransient
    public Collection<GloDepartareaCoordinador> getGloDepartareaCoordinadorCollection() {
        return gloDepartareaCoordinadorCollection;
    }

    public void setGloDepartareaCoordinadorCollection(Collection<GloDepartareaCoordinador> gloDepartareaCoordinadorCollection) {
        this.gloDepartareaCoordinadorCollection = gloDepartareaCoordinadorCollection;
    }

    public GloDocidentidad getIdDocidentidad() {
        return idDocidentidad;
    }

    public void setIdDocidentidad(GloDocidentidad idDocidentidad) {
        this.idDocidentidad = idDocidentidad;
    }

    @XmlTransient
    public Collection<GloDepartCoordinador> getGloDepartCoordinadorCollection() {
        return gloDepartCoordinadorCollection;
    }

    public void setGloDepartCoordinadorCollection(Collection<GloDepartCoordinador> gloDepartCoordinadorCollection) {
        this.gloDepartCoordinadorCollection = gloDepartCoordinadorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloPersona)) {
            return false;
        }
        GloPersona other = (GloPersona) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloPersona[ idPersona=" + idPersona + " ]";
    }
    
}
