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
@Table(name = "glo_estado_area")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloEstadoArea.findAll", query = "SELECT g FROM GloEstadoArea g")})
public class GloEstadoArea implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estado_area")
    private Integer idEstadoArea;
    @Basic(optional = false)
    @Column(name = "estadometa")
    private int estadometa;
    @Basic(optional = false)
    @Column(name = "estadoavance")
    private int estadoavance;
    @Basic(optional = false)
    @Column(name = "estadopoa")
    private String estadopoa;
    @Basic(optional = false)
    @Column(name = "estadopm")
    private int estadopm;
    @JoinColumn(name = "id_depart_area", referencedColumnName = "id_depart_area")
    @ManyToOne(optional = false)
    private GloDepartArea idDepartArea;
    @JoinColumn(name = "id_periodo", referencedColumnName = "id_periodo")
    @ManyToOne(optional = false)
    private ConfPeriodo idPeriodo;

    public GloEstadoArea() {
    }

    public GloEstadoArea(Integer idEstadoArea) {
        this.idEstadoArea = idEstadoArea;
    }

    public GloEstadoArea(Integer idEstadoArea, int estadometa, int estadoavance, String estadopoa, int estadopm) {
        this.idEstadoArea = idEstadoArea;
        this.estadometa = estadometa;
        this.estadoavance = estadoavance;
        this.estadopoa = estadopoa;
        this.estadopm = estadopm;
    }

    public Integer getIdEstadoArea() {
        return idEstadoArea;
    }

    public void setIdEstadoArea(Integer idEstadoArea) {
        this.idEstadoArea = idEstadoArea;
    }

    public int getEstadometa() {
        return estadometa;
    }

    public void setEstadometa(int estadometa) {
        this.estadometa = estadometa;
    }

    public int getEstadoavance() {
        return estadoavance;
    }

    public void setEstadoavance(int estadoavance) {
        this.estadoavance = estadoavance;
    }

    public String getEstadopoa() {
        return estadopoa;
    }

    public void setEstadopoa(String estadopoa) {
        this.estadopoa = estadopoa;
    }

    public int getEstadopm() {
        return estadopm;
    }

    public void setEstadopm(int estadopm) {
        this.estadopm = estadopm;
    }

    public GloDepartArea getIdDepartArea() {
        return idDepartArea;
    }

    public void setIdDepartArea(GloDepartArea idDepartArea) {
        this.idDepartArea = idDepartArea;
    }

    public ConfPeriodo getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(ConfPeriodo idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadoArea != null ? idEstadoArea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloEstadoArea)) {
            return false;
        }
        GloEstadoArea other = (GloEstadoArea) object;
        if ((this.idEstadoArea == null && other.idEstadoArea != null) || (this.idEstadoArea != null && !this.idEstadoArea.equals(other.idEstadoArea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloEstadoArea[ idEstadoArea=" + idEstadoArea + " ]";
    }
    
}
