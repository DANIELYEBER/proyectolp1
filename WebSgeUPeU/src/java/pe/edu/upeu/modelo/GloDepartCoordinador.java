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
@Table(name = "glo_depart_coordinador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloDepartCoordinador.findAll", query = "SELECT g FROM GloDepartCoordinador g")})
public class GloDepartCoordinador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_depart_coordinador")
    private Integer idDepartCoordinador;
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @ManyToOne(optional = false)
    private GloPersona idPersona;
    @JoinColumn(name = "id_departamento_filial", referencedColumnName = "id_departamento_filial")
    @ManyToOne(optional = false)
    private GloDepartamentosFilial idDepartamentoFilial;
    @JoinColumn(name = "id_periodo", referencedColumnName = "id_periodo")
    @ManyToOne(optional = false)
    private ConfPeriodo idPeriodo;

    public GloDepartCoordinador() {
    }

    public GloDepartCoordinador(Integer idDepartCoordinador) {
        this.idDepartCoordinador = idDepartCoordinador;
    }

    public Integer getIdDepartCoordinador() {
        return idDepartCoordinador;
    }

    public void setIdDepartCoordinador(Integer idDepartCoordinador) {
        this.idDepartCoordinador = idDepartCoordinador;
    }

    public GloPersona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(GloPersona idPersona) {
        this.idPersona = idPersona;
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
        hash += (idDepartCoordinador != null ? idDepartCoordinador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloDepartCoordinador)) {
            return false;
        }
        GloDepartCoordinador other = (GloDepartCoordinador) object;
        if ((this.idDepartCoordinador == null && other.idDepartCoordinador != null) || (this.idDepartCoordinador != null && !this.idDepartCoordinador.equals(other.idDepartCoordinador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloDepartCoordinador[ idDepartCoordinador=" + idDepartCoordinador + " ]";
    }
    
}
