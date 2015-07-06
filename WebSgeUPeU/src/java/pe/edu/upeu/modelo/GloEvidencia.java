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
@Table(name = "glo_evidencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloEvidencia.findAll", query = "SELECT g FROM GloEvidencia g")})
public class GloEvidencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_evidencia")
    private Integer idEvidencia;
    @Basic(optional = false)
    @Column(name = "numero")
    private int numero;
    @Basic(optional = false)
    @Column(name = "evidenciaurl")
    private String evidenciaurl;
    @Basic(optional = false)
    @Column(name = "tipofile")
    private String tipofile;
    @Basic(optional = false)
    @Column(name = "nombreevidencia")
    private String nombreevidencia;
    @Basic(optional = false)
    @Column(name = "fecha_rg")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRg;
    @JoinColumn(name = "id_usuario_filial", referencedColumnName = "id_usuario_filial")
    @ManyToOne(optional = false)
    private GloUsuarioFilial idUsuarioFilial;
    @JoinColumn(name = "id_avance", referencedColumnName = "id_avance")
    @ManyToOne(optional = false)
    private GloAvance idAvance;

    public GloEvidencia() {
    }

    public GloEvidencia(Integer idEvidencia) {
        this.idEvidencia = idEvidencia;
    }

    public GloEvidencia(Integer idEvidencia, int numero, String evidenciaurl, String tipofile, String nombreevidencia, Date fechaRg) {
        this.idEvidencia = idEvidencia;
        this.numero = numero;
        this.evidenciaurl = evidenciaurl;
        this.tipofile = tipofile;
        this.nombreevidencia = nombreevidencia;
        this.fechaRg = fechaRg;
    }

    public Integer getIdEvidencia() {
        return idEvidencia;
    }

    public void setIdEvidencia(Integer idEvidencia) {
        this.idEvidencia = idEvidencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEvidenciaurl() {
        return evidenciaurl;
    }

    public void setEvidenciaurl(String evidenciaurl) {
        this.evidenciaurl = evidenciaurl;
    }

    public String getTipofile() {
        return tipofile;
    }

    public void setTipofile(String tipofile) {
        this.tipofile = tipofile;
    }

    public String getNombreevidencia() {
        return nombreevidencia;
    }

    public void setNombreevidencia(String nombreevidencia) {
        this.nombreevidencia = nombreevidencia;
    }

    public Date getFechaRg() {
        return fechaRg;
    }

    public void setFechaRg(Date fechaRg) {
        this.fechaRg = fechaRg;
    }

    public GloUsuarioFilial getIdUsuarioFilial() {
        return idUsuarioFilial;
    }

    public void setIdUsuarioFilial(GloUsuarioFilial idUsuarioFilial) {
        this.idUsuarioFilial = idUsuarioFilial;
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
        hash += (idEvidencia != null ? idEvidencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloEvidencia)) {
            return false;
        }
        GloEvidencia other = (GloEvidencia) object;
        if ((this.idEvidencia == null && other.idEvidencia != null) || (this.idEvidencia != null && !this.idEvidencia.equals(other.idEvidencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloEvidencia[ idEvidencia=" + idEvidencia + " ]";
    }
    
}
