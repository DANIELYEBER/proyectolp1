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
@Table(name = "glo_estado_departamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloEstadoDepartamento.findAll", query = "SELECT g FROM GloEstadoDepartamento g")})
public class GloEstadoDepartamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estadodepartamento")
    private Integer idEstadodepartamento;
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
    @JoinColumn(name = "id_departamento_filial", referencedColumnName = "id_departamento_filial")
    @ManyToOne(optional = false)
    private GloDepartamentosFilial idDepartamentoFilial;
    @JoinColumn(name = "id_periodo", referencedColumnName = "id_periodo")
    @ManyToOne(optional = false)
    private ConfPeriodo idPeriodo;

    public GloEstadoDepartamento() {
    }

    public GloEstadoDepartamento(Integer idEstadodepartamento) {
        this.idEstadodepartamento = idEstadodepartamento;
    }

    public GloEstadoDepartamento(Integer idEstadodepartamento, int estadometa, int estadoavance, int estadopoa, int estadopm) {
        this.idEstadodepartamento = idEstadodepartamento;
        this.estadometa = estadometa;
        this.estadoavance = estadoavance;
        this.estadopoa = estadopoa;
        this.estadopm = estadopm;
    }

    public Integer getIdEstadodepartamento() {
        return idEstadodepartamento;
    }

    public void setIdEstadodepartamento(Integer idEstadodepartamento) {
        this.idEstadodepartamento = idEstadodepartamento;
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

    public GloDepartamentosFilial getIdDepartamentoFilial() {
        return idDepartamentoFilial;
    }

    public void setIdDepartamentoFilial(GloDepartamentosFilial idDepartamentoFilial) {
        this.idDepartamentoFilial = idDepartamentoFilial;
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
        hash += (idEstadodepartamento != null ? idEstadodepartamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloEstadoDepartamento)) {
            return false;
        }
        GloEstadoDepartamento other = (GloEstadoDepartamento) object;
        if ((this.idEstadodepartamento == null && other.idEstadodepartamento != null) || (this.idEstadodepartamento != null && !this.idEstadodepartamento.equals(other.idEstadodepartamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloEstadoDepartamento[ idEstadodepartamento=" + idEstadodepartamento + " ]";
    }
    
}
