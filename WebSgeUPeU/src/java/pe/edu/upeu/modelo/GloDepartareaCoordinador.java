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
@Table(name = "glo_departarea_coordinador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloDepartareaCoordinador.findAll", query = "SELECT g FROM GloDepartareaCoordinador g")})
public class GloDepartareaCoordinador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_departarea_coordinador")
    private Integer idDepartareaCoordinador;
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @ManyToOne(optional = false)
    private GloPersona idPersona;
    @JoinColumn(name = "id_depart_area", referencedColumnName = "id_depart_area")
    @ManyToOne(optional = false)
    private GloDepartArea idDepartArea;
    @JoinColumn(name = "id_periodo", referencedColumnName = "id_periodo")
    @ManyToOne(optional = false)
    private ConfPeriodo idPeriodo;

    public GloDepartareaCoordinador() {
    }

    public GloDepartareaCoordinador(Integer idDepartareaCoordinador) {
        this.idDepartareaCoordinador = idDepartareaCoordinador;
    }

    public Integer getIdDepartareaCoordinador() {
        return idDepartareaCoordinador;
    }

    public void setIdDepartareaCoordinador(Integer idDepartareaCoordinador) {
        this.idDepartareaCoordinador = idDepartareaCoordinador;
    }

    public GloPersona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(GloPersona idPersona) {
        this.idPersona = idPersona;
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
        hash += (idDepartareaCoordinador != null ? idDepartareaCoordinador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloDepartareaCoordinador)) {
            return false;
        }
        GloDepartareaCoordinador other = (GloDepartareaCoordinador) object;
        if ((this.idDepartareaCoordinador == null && other.idDepartareaCoordinador != null) || (this.idDepartareaCoordinador != null && !this.idDepartareaCoordinador.equals(other.idDepartareaCoordinador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloDepartareaCoordinador[ idDepartareaCoordinador=" + idDepartareaCoordinador + " ]";
    }
    
}
