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
@Table(name = "glo_area_eje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloAreaEje.findAll", query = "SELECT g FROM GloAreaEje g")})
public class GloAreaEje implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_area_eje")
    private Integer idAreaEje;
    @JoinColumn(name = "id_temp_ejeestrategico", referencedColumnName = "id_temp_ejeestrategico")
    @ManyToOne(optional = false)
    private GloTemporadaejeestrategico idTempEjeestrategico;
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @ManyToOne(optional = false)
    private GloPersona idPersona;
    @JoinColumn(name = "id_depart_area", referencedColumnName = "id_depart_area")
    @ManyToOne(optional = false)
    private GloDepartArea idDepartArea;
    @JoinColumn(name = "id_periodo", referencedColumnName = "id_periodo")
    @ManyToOne(optional = false)
    private ConfPeriodo idPeriodo;

    public GloAreaEje() {
    }

    public GloAreaEje(Integer idAreaEje) {
        this.idAreaEje = idAreaEje;
    }

    public Integer getIdAreaEje() {
        return idAreaEje;
    }

    public void setIdAreaEje(Integer idAreaEje) {
        this.idAreaEje = idAreaEje;
    }

    public GloTemporadaejeestrategico getIdTempEjeestrategico() {
        return idTempEjeestrategico;
    }

    public void setIdTempEjeestrategico(GloTemporadaejeestrategico idTempEjeestrategico) {
        this.idTempEjeestrategico = idTempEjeestrategico;
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
        hash += (idAreaEje != null ? idAreaEje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloAreaEje)) {
            return false;
        }
        GloAreaEje other = (GloAreaEje) object;
        if ((this.idAreaEje == null && other.idAreaEje != null) || (this.idAreaEje != null && !this.idAreaEje.equals(other.idAreaEje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloAreaEje[ idAreaEje=" + idAreaEje + " ]";
    }
    
}
