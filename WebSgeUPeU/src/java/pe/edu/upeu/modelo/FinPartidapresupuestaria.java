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
@Table(name = "fin_partidapresupuestaria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FinPartidapresupuestaria.findAll", query = "SELECT f FROM FinPartidapresupuestaria f")})
public class FinPartidapresupuestaria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_partpresupuestaria")
    private Integer idPartpresupuestaria;
    @Basic(optional = false)
    @Column(name = "porcentaje")
    private double porcentaje;
    @Basic(optional = false)
    @Column(name = "monto")
    private double monto;
    @Basic(optional = false)
    @Column(name = "saldoactual")
    private double saldoactual;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "id_depart_area", referencedColumnName = "id_depart_area")
    @ManyToOne(optional = false)
    private GloDepartArea idDepartArea;
    @JoinColumn(name = "id_nivelfinanciero", referencedColumnName = "id_nivelfinanciero")
    @ManyToOne(optional = false)
    private FinNivelfinanciero idNivelfinanciero;
    @JoinColumn(name = "id_cuenta", referencedColumnName = "id_cuenta")
    @ManyToOne(optional = false)
    private FinCuenta idCuenta;
    @JoinColumn(name = "id_periodo", referencedColumnName = "id_periodo")
    @ManyToOne(optional = false)
    private ConfPeriodo idPeriodo;

    public FinPartidapresupuestaria() {
    }

    public FinPartidapresupuestaria(Integer idPartpresupuestaria) {
        this.idPartpresupuestaria = idPartpresupuestaria;
    }

    public FinPartidapresupuestaria(Integer idPartpresupuestaria, double porcentaje, double monto, double saldoactual, String estado) {
        this.idPartpresupuestaria = idPartpresupuestaria;
        this.porcentaje = porcentaje;
        this.monto = monto;
        this.saldoactual = saldoactual;
        this.estado = estado;
    }

    public Integer getIdPartpresupuestaria() {
        return idPartpresupuestaria;
    }

    public void setIdPartpresupuestaria(Integer idPartpresupuestaria) {
        this.idPartpresupuestaria = idPartpresupuestaria;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(double saldoactual) {
        this.saldoactual = saldoactual;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public GloDepartArea getIdDepartArea() {
        return idDepartArea;
    }

    public void setIdDepartArea(GloDepartArea idDepartArea) {
        this.idDepartArea = idDepartArea;
    }

    public FinNivelfinanciero getIdNivelfinanciero() {
        return idNivelfinanciero;
    }

    public void setIdNivelfinanciero(FinNivelfinanciero idNivelfinanciero) {
        this.idNivelfinanciero = idNivelfinanciero;
    }

    public FinCuenta getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(FinCuenta idCuenta) {
        this.idCuenta = idCuenta;
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
        hash += (idPartpresupuestaria != null ? idPartpresupuestaria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FinPartidapresupuestaria)) {
            return false;
        }
        FinPartidapresupuestaria other = (FinPartidapresupuestaria) object;
        if ((this.idPartpresupuestaria == null && other.idPartpresupuestaria != null) || (this.idPartpresupuestaria != null && !this.idPartpresupuestaria.equals(other.idPartpresupuestaria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.FinPartidapresupuestaria[ idPartpresupuestaria=" + idPartpresupuestaria + " ]";
    }
    
}
