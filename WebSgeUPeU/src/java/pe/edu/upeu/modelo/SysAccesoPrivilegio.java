/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SistemasUpeu
 */
@Entity
@Table(name = "sys_acceso_privilegio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysAccesoPrivilegio.findAll", query = "SELECT s FROM SysAccesoPrivilegio s")})
public class SysAccesoPrivilegio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_privilegio")
    private Integer idPrivilegio;
    @Basic(optional = false)
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Basic(optional = false)
    @Column(name = "ip_user_asignet")
    private String ipUserAsignet;
    @Basic(optional = false)
    @Column(name = "user_asignet")
    private int userAsignet;
    @Basic(optional = false)
    @Column(name = "action_add")
    private String actionAdd;
    @Basic(optional = false)
    @Column(name = "action_edit")
    private String actionEdit;
    @Basic(optional = false)
    @Column(name = "action_delete")
    private String actionDelete;
    @Basic(optional = false)
    @Column(name = "action_search")
    private String actionSearch;
    @Basic(optional = false)
    @Column(name = "action_addsearch")
    private String actionAddsearch;
    @Basic(optional = false)
    @Column(name = "action_activ")
    private String actionActiv;
    @Basic(optional = false)
    @Column(name = "action_viewdetail")
    private String actionViewdetail;
    @Basic(optional = false)
    @Column(name = "action_other")
    private String actionOther;
    @JoinColumn(name = "id_acceso", referencedColumnName = "id_acceso")
    @ManyToOne(optional = false)
    private SysAccesos idAcceso;
    @JoinColumn(name = "id_usuario_filial", referencedColumnName = "id_usuario_filial")
    @ManyToOne(optional = false)
    private GloUsuarioFilial idUsuarioFilial;

    public SysAccesoPrivilegio() {
    }

    public SysAccesoPrivilegio(Integer idPrivilegio) {
        this.idPrivilegio = idPrivilegio;
    }

    public SysAccesoPrivilegio(Integer idPrivilegio, Date fechaAlta, String ipUserAsignet, int userAsignet, String actionAdd, String actionEdit, String actionDelete, String actionSearch, String actionAddsearch, String actionActiv, String actionViewdetail, String actionOther) {
        this.idPrivilegio = idPrivilegio;
        this.fechaAlta = fechaAlta;
        this.ipUserAsignet = ipUserAsignet;
        this.userAsignet = userAsignet;
        this.actionAdd = actionAdd;
        this.actionEdit = actionEdit;
        this.actionDelete = actionDelete;
        this.actionSearch = actionSearch;
        this.actionAddsearch = actionAddsearch;
        this.actionActiv = actionActiv;
        this.actionViewdetail = actionViewdetail;
        this.actionOther = actionOther;
    }

    public Integer getIdPrivilegio() {
        return idPrivilegio;
    }

    public void setIdPrivilegio(Integer idPrivilegio) {
        this.idPrivilegio = idPrivilegio;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getIpUserAsignet() {
        return ipUserAsignet;
    }

    public void setIpUserAsignet(String ipUserAsignet) {
        this.ipUserAsignet = ipUserAsignet;
    }

    public int getUserAsignet() {
        return userAsignet;
    }

    public void setUserAsignet(int userAsignet) {
        this.userAsignet = userAsignet;
    }

    public String getActionAdd() {
        return actionAdd;
    }

    public void setActionAdd(String actionAdd) {
        this.actionAdd = actionAdd;
    }

    public String getActionEdit() {
        return actionEdit;
    }

    public void setActionEdit(String actionEdit) {
        this.actionEdit = actionEdit;
    }

    public String getActionDelete() {
        return actionDelete;
    }

    public void setActionDelete(String actionDelete) {
        this.actionDelete = actionDelete;
    }

    public String getActionSearch() {
        return actionSearch;
    }

    public void setActionSearch(String actionSearch) {
        this.actionSearch = actionSearch;
    }

    public String getActionAddsearch() {
        return actionAddsearch;
    }

    public void setActionAddsearch(String actionAddsearch) {
        this.actionAddsearch = actionAddsearch;
    }

    public String getActionActiv() {
        return actionActiv;
    }

    public void setActionActiv(String actionActiv) {
        this.actionActiv = actionActiv;
    }

    public String getActionViewdetail() {
        return actionViewdetail;
    }

    public void setActionViewdetail(String actionViewdetail) {
        this.actionViewdetail = actionViewdetail;
    }

    public String getActionOther() {
        return actionOther;
    }

    public void setActionOther(String actionOther) {
        this.actionOther = actionOther;
    }

    public SysAccesos getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(SysAccesos idAcceso) {
        this.idAcceso = idAcceso;
    }

    public GloUsuarioFilial getIdUsuarioFilial() {
        return idUsuarioFilial;
    }

    public void setIdUsuarioFilial(GloUsuarioFilial idUsuarioFilial) {
        this.idUsuarioFilial = idUsuarioFilial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrivilegio != null ? idPrivilegio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysAccesoPrivilegio)) {
            return false;
        }
        SysAccesoPrivilegio other = (SysAccesoPrivilegio) object;
        if ((this.idPrivilegio == null && other.idPrivilegio != null) || (this.idPrivilegio != null && !this.idPrivilegio.equals(other.idPrivilegio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.SysAccesoPrivilegio[ idPrivilegio=" + idPrivilegio + " ]";
    }
    
}
