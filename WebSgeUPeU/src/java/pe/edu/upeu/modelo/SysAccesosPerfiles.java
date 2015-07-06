/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.modelo;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SistemasUpeu
 */
@Entity
@Table(name = "sys_accesos_perfiles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SysAccesosPerfiles.findAll", query = "SELECT s FROM SysAccesosPerfiles s")})
public class SysAccesosPerfiles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_acceso_perfil")
    private Integer idAccesoPerfil;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
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
    @JoinColumn(name = "id_perfiles", referencedColumnName = "id_perfiles")
    @ManyToOne(optional = false)
    private SysPerfiles idPerfiles;
    @JoinColumn(name = "id_acceso", referencedColumnName = "id_acceso")
    @ManyToOne(optional = false)
    private SysAccesos idAcceso;

    public SysAccesosPerfiles() {
    }

    public SysAccesosPerfiles(Integer idAccesoPerfil) {
        this.idAccesoPerfil = idAccesoPerfil;
    }

    public SysAccesosPerfiles(Integer idAccesoPerfil, String estado, String actionAdd, String actionEdit, String actionDelete, String actionSearch, String actionAddsearch, String actionActiv, String actionViewdetail, String actionOther) {
        this.idAccesoPerfil = idAccesoPerfil;
        this.estado = estado;
        this.actionAdd = actionAdd;
        this.actionEdit = actionEdit;
        this.actionDelete = actionDelete;
        this.actionSearch = actionSearch;
        this.actionAddsearch = actionAddsearch;
        this.actionActiv = actionActiv;
        this.actionViewdetail = actionViewdetail;
        this.actionOther = actionOther;
    }

    public Integer getIdAccesoPerfil() {
        return idAccesoPerfil;
    }

    public void setIdAccesoPerfil(Integer idAccesoPerfil) {
        this.idAccesoPerfil = idAccesoPerfil;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public SysPerfiles getIdPerfiles() {
        return idPerfiles;
    }

    public void setIdPerfiles(SysPerfiles idPerfiles) {
        this.idPerfiles = idPerfiles;
    }

    public SysAccesos getIdAcceso() {
        return idAcceso;
    }

    public void setIdAcceso(SysAccesos idAcceso) {
        this.idAcceso = idAcceso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAccesoPerfil != null ? idAccesoPerfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysAccesosPerfiles)) {
            return false;
        }
        SysAccesosPerfiles other = (SysAccesosPerfiles) object;
        if ((this.idAccesoPerfil == null && other.idAccesoPerfil != null) || (this.idAccesoPerfil != null && !this.idAccesoPerfil.equals(other.idAccesoPerfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.SysAccesosPerfiles[ idAccesoPerfil=" + idAccesoPerfil + " ]";
    }
    
}
