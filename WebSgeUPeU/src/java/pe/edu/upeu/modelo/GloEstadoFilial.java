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
@Table(name = "glo_estado_filial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloEstadoFilial.findAll", query = "SELECT g FROM GloEstadoFilial g")})
public class GloEstadoFilial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estado_filial")
    private Integer idEstadoFilial;
    @Basic(optional = false)
    @Column(name = "estadometa")
    private int estadometa;
    @Basic(optional = false)
    @Column(name = "estadoavance")
    private int estadoavance;
    @Basic(optional = false)
    @Column(name = "estadopoa")
    private int estadopoa;
    @Basic(optional = false)
    @Column(name = "estadopm")
    private int estadopm;
    @JoinColumn(name = "id_filial", referencedColumnName = "id_filial")
    @ManyToOne(optional = false)
    private CorpFilial idFilial;
    @JoinColumn(name = "id_periodo", referencedColumnName = "id_periodo")
    @ManyToOne(optional = false)
    private ConfPeriodo idPeriodo;

    public GloEstadoFilial() {
    }

    public GloEstadoFilial(Integer idEstadoFilial) {
        this.idEstadoFilial = idEstadoFilial;
    }

    public GloEstadoFilial(Integer idEstadoFilial, int estadometa, int estadoavance, int estadopoa, int estadopm) {
        this.idEstadoFilial = idEstadoFilial;
        this.estadometa = estadometa;
        this.estadoavance = estadoavance;
        this.estadopoa = estadopoa;
        this.estadopm = estadopm;
    }

    public Integer getIdEstadoFilial() {
        return idEstadoFilial;
    }

    public void setIdEstadoFilial(Integer idEstadoFilial) {
        this.idEstadoFilial = idEstadoFilial;
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

    public int getEstadopoa() {
        return estadopoa;
    }

    public void setEstadopoa(int estadopoa) {
        this.estadopoa = estadopoa;
    }

    public int getEstadopm() {
        return estadopm;
    }

    public void setEstadopm(int estadopm) {
        this.estadopm = estadopm;
    }

    public CorpFilial getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(CorpFilial idFilial) {
        this.idFilial = idFilial;
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
        hash += (idEstadoFilial != null ? idEstadoFilial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloEstadoFilial)) {
            return false;
        }
        GloEstadoFilial other = (GloEstadoFilial) object;
        if ((this.idEstadoFilial == null && other.idEstadoFilial != null) || (this.idEstadoFilial != null && !this.idEstadoFilial.equals(other.idEstadoFilial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloEstadoFilial[ idEstadoFilial=" + idEstadoFilial + " ]";
    }
    
}
