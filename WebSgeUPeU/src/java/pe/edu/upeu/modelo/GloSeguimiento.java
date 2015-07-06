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
@Table(name = "glo_seguimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloSeguimiento.findAll", query = "SELECT g FROM GloSeguimiento g")})
public class GloSeguimiento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_seguimiento")
    private Integer idSeguimiento;
    @Basic(optional = false)
    @Column(name = "observacion")
    private String observacion;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "id_user_obs")
    private int idUserObs;
    @Basic(optional = false)
    @Column(name = "id_user_resp")
    private int idUserResp;
    @Basic(optional = false)
    @Column(name = "id_user_view")
    private int idUserView;
    @Basic(optional = false)
    @Column(name = "fecha_obs")
    @Temporal(TemporalType.DATE)
    private Date fechaObs;
    @Basic(optional = false)
    @Column(name = "fecha_view")
    @Temporal(TemporalType.DATE)
    private Date fechaView;
    @Basic(optional = false)
    @Column(name = "fecha_resp")
    @Temporal(TemporalType.DATE)
    private Date fechaResp;
    @JoinColumn(name = "id_tiposeguimiento", referencedColumnName = "id_tiposeguimiento")
    @ManyToOne(optional = false)
    private GloTiposeguimiento idTiposeguimiento;
    @JoinColumn(name = "id_avance", referencedColumnName = "id_avance")
    @ManyToOne(optional = false)
    private GloAvance idAvance;

    public GloSeguimiento() {
    }

    public GloSeguimiento(Integer idSeguimiento) {
        this.idSeguimiento = idSeguimiento;
    }

    public GloSeguimiento(Integer idSeguimiento, String observacion, String estado, int idUserObs, int idUserResp, int idUserView, Date fechaObs, Date fechaView, Date fechaResp) {
        this.idSeguimiento = idSeguimiento;
        this.observacion = observacion;
        this.estado = estado;
        this.idUserObs = idUserObs;
        this.idUserResp = idUserResp;
        this.idUserView = idUserView;
        this.fechaObs = fechaObs;
        this.fechaView = fechaView;
        this.fechaResp = fechaResp;
    }

    public Integer getIdSeguimiento() {
        return idSeguimiento;
    }

    public void setIdSeguimiento(Integer idSeguimiento) {
        this.idSeguimiento = idSeguimiento;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdUserObs() {
        return idUserObs;
    }

    public void setIdUserObs(int idUserObs) {
        this.idUserObs = idUserObs;
    }

    public int getIdUserResp() {
        return idUserResp;
    }

    public void setIdUserResp(int idUserResp) {
        this.idUserResp = idUserResp;
    }

    public int getIdUserView() {
        return idUserView;
    }

    public void setIdUserView(int idUserView) {
        this.idUserView = idUserView;
    }

    public Date getFechaObs() {
        return fechaObs;
    }

    public void setFechaObs(Date fechaObs) {
        this.fechaObs = fechaObs;
    }

    public Date getFechaView() {
        return fechaView;
    }

    public void setFechaView(Date fechaView) {
        this.fechaView = fechaView;
    }

    public Date getFechaResp() {
        return fechaResp;
    }

    public void setFechaResp(Date fechaResp) {
        this.fechaResp = fechaResp;
    }

    public GloTiposeguimiento getIdTiposeguimiento() {
        return idTiposeguimiento;
    }

    public void setIdTiposeguimiento(GloTiposeguimiento idTiposeguimiento) {
        this.idTiposeguimiento = idTiposeguimiento;
    }

    public GloAvance getIdAvance() {
        return idAvance;
    }

    public void setIdAvance(GloAvance idAvance) {
        this.idAvance = idAvance;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSeguimiento != null ? idSeguimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloSeguimiento)) {
            return false;
        }
        GloSeguimiento other = (GloSeguimiento) object;
        if ((this.idSeguimiento == null && other.idSeguimiento != null) || (this.idSeguimiento != null && !this.idSeguimiento.equals(other.idSeguimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloSeguimiento[ idSeguimiento=" + idSeguimiento + " ]";
    }
    
}
