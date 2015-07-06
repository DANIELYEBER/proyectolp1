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
@Table(name = "glo_actividad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GloActividad.findAll", query = "SELECT g FROM GloActividad g")})
public class GloActividad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_actividad")
    private Integer idActividad;
    @Basic(optional = false)
    @Column(name = "numero")
    private int numero;
    @Basic(optional = false)
    @Column(name = "iniciativaaccion")
    private String iniciativaaccion;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "enero")
    private int enero;
    @Basic(optional = false)
    @Column(name = "febrero")
    private int febrero;
    @Basic(optional = false)
    @Column(name = "marzo")
    private int marzo;
    @Basic(optional = false)
    @Column(name = "abril")
    private int abril;
    @Basic(optional = false)
    @Column(name = "mayo")
    private int mayo;
    @Basic(optional = false)
    @Column(name = "junio")
    private int junio;
    @Basic(optional = false)
    @Column(name = "julio")
    private int julio;
    @Basic(optional = false)
    @Column(name = "agosto")
    private int agosto;
    @Basic(optional = false)
    @Column(name = "setiembre")
    private int setiembre;
    @Basic(optional = false)
    @Column(name = "octubre")
    private int octubre;
    @Basic(optional = false)
    @Column(name = "noviembre")
    private int noviembre;
    @Basic(optional = false)
    @Column(name = "diciembre")
    private int diciembre;
    @Basic(optional = false)
    @Column(name = "prifechainicio")
    @Temporal(TemporalType.DATE)
    private Date prifechainicio;
    @Basic(optional = false)
    @Column(name = "prifechafin")
    @Temporal(TemporalType.DATE)
    private Date prifechafin;
    @Basic(optional = false)
    @Column(name = "secfechainicio")
    @Temporal(TemporalType.DATE)
    private Date secfechainicio;
    @Basic(optional = false)
    @Column(name = "secfechafin")
    @Temporal(TemporalType.DATE)
    private Date secfechafin;
    @Basic(optional = false)
    @Column(name = "id_usuarioresponsable")
    private int idUsuarioresponsable;
    @Basic(optional = false)
    @Column(name = "estadoactividad")
    private String estadoactividad;
    @Basic(optional = false)
    @Column(name = "montooperativo")
    private double montooperativo;
    @Basic(optional = false)
    @Column(name = "montofondopropio")
    private double montofondopropio;
    @Basic(optional = false)
    @Column(name = "montoautofinanciado")
    private double montoautofinanciado;
    @JoinColumn(name = "id_usuario_filial", referencedColumnName = "id_usuario_filial")
    @ManyToOne(optional = false)
    private GloUsuarioFilial idUsuarioFilial;
    @JoinColumn(name = "id_meta", referencedColumnName = "id_meta")
    @ManyToOne(optional = false)
    private GloMeta idMeta;
    @JoinColumn(name = "id_nivelfinanciero", referencedColumnName = "id_nivelfinanciero")
    @ManyToOne(optional = false)
    private FinNivelfinanciero idNivelfinanciero;
    @JoinColumn(name = "id_cuenta", referencedColumnName = "id_cuenta")
    @ManyToOne(optional = false)
    private FinCuenta idCuenta;

    public GloActividad() {
    }

    public GloActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public GloActividad(Integer idActividad, int numero, String iniciativaaccion, int cantidad, int enero, int febrero, int marzo, int abril, int mayo, int junio, int julio, int agosto, int setiembre, int octubre, int noviembre, int diciembre, Date prifechainicio, Date prifechafin, Date secfechainicio, Date secfechafin, int idUsuarioresponsable, String estadoactividad, double montooperativo, double montofondopropio, double montoautofinanciado) {
        this.idActividad = idActividad;
        this.numero = numero;
        this.iniciativaaccion = iniciativaaccion;
        this.cantidad = cantidad;
        this.enero = enero;
        this.febrero = febrero;
        this.marzo = marzo;
        this.abril = abril;
        this.mayo = mayo;
        this.junio = junio;
        this.julio = julio;
        this.agosto = agosto;
        this.setiembre = setiembre;
        this.octubre = octubre;
        this.noviembre = noviembre;
        this.diciembre = diciembre;
        this.prifechainicio = prifechainicio;
        this.prifechafin = prifechafin;
        this.secfechainicio = secfechainicio;
        this.secfechafin = secfechafin;
        this.idUsuarioresponsable = idUsuarioresponsable;
        this.estadoactividad = estadoactividad;
        this.montooperativo = montooperativo;
        this.montofondopropio = montofondopropio;
        this.montoautofinanciado = montoautofinanciado;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getIniciativaaccion() {
        return iniciativaaccion;
    }

    public void setIniciativaaccion(String iniciativaaccion) {
        this.iniciativaaccion = iniciativaaccion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getEnero() {
        return enero;
    }

    public void setEnero(int enero) {
        this.enero = enero;
    }

    public int getFebrero() {
        return febrero;
    }

    public void setFebrero(int febrero) {
        this.febrero = febrero;
    }

    public int getMarzo() {
        return marzo;
    }

    public void setMarzo(int marzo) {
        this.marzo = marzo;
    }

    public int getAbril() {
        return abril;
    }

    public void setAbril(int abril) {
        this.abril = abril;
    }

    public int getMayo() {
        return mayo;
    }

    public void setMayo(int mayo) {
        this.mayo = mayo;
    }

    public int getJunio() {
        return junio;
    }

    public void setJunio(int junio) {
        this.junio = junio;
    }

    public int getJulio() {
        return julio;
    }

    public void setJulio(int julio) {
        this.julio = julio;
    }

    public int getAgosto() {
        return agosto;
    }

    public void setAgosto(int agosto) {
        this.agosto = agosto;
    }

    public int getSetiembre() {
        return setiembre;
    }

    public void setSetiembre(int setiembre) {
        this.setiembre = setiembre;
    }

    public int getOctubre() {
        return octubre;
    }

    public void setOctubre(int octubre) {
        this.octubre = octubre;
    }

    public int getNoviembre() {
        return noviembre;
    }

    public void setNoviembre(int noviembre) {
        this.noviembre = noviembre;
    }

    public int getDiciembre() {
        return diciembre;
    }

    public void setDiciembre(int diciembre) {
        this.diciembre = diciembre;
    }

    public Date getPrifechainicio() {
        return prifechainicio;
    }

    public void setPrifechainicio(Date prifechainicio) {
        this.prifechainicio = prifechainicio;
    }

    public Date getPrifechafin() {
        return prifechafin;
    }

    public void setPrifechafin(Date prifechafin) {
        this.prifechafin = prifechafin;
    }

    public Date getSecfechainicio() {
        return secfechainicio;
    }

    public void setSecfechainicio(Date secfechainicio) {
        this.secfechainicio = secfechainicio;
    }

    public Date getSecfechafin() {
        return secfechafin;
    }

    public void setSecfechafin(Date secfechafin) {
        this.secfechafin = secfechafin;
    }

    public int getIdUsuarioresponsable() {
        return idUsuarioresponsable;
    }

    public void setIdUsuarioresponsable(int idUsuarioresponsable) {
        this.idUsuarioresponsable = idUsuarioresponsable;
    }

    public String getEstadoactividad() {
        return estadoactividad;
    }

    public void setEstadoactividad(String estadoactividad) {
        this.estadoactividad = estadoactividad;
    }

    public double getMontooperativo() {
        return montooperativo;
    }

    public void setMontooperativo(double montooperativo) {
        this.montooperativo = montooperativo;
    }

    public double getMontofondopropio() {
        return montofondopropio;
    }

    public void setMontofondopropio(double montofondopropio) {
        this.montofondopropio = montofondopropio;
    }

    public double getMontoautofinanciado() {
        return montoautofinanciado;
    }

    public void setMontoautofinanciado(double montoautofinanciado) {
        this.montoautofinanciado = montoautofinanciado;
    }

    public GloUsuarioFilial getIdUsuarioFilial() {
        return idUsuarioFilial;
    }

    public void setIdUsuarioFilial(GloUsuarioFilial idUsuarioFilial) {
        this.idUsuarioFilial = idUsuarioFilial;
    }

    public GloMeta getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(GloMeta idMeta) {
        this.idMeta = idMeta;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActividad != null ? idActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GloActividad)) {
            return false;
        }
        GloActividad other = (GloActividad) object;
        if ((this.idActividad == null && other.idActividad != null) || (this.idActividad != null && !this.idActividad.equals(other.idActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.edu.upeu.modelo.GloActividad[ idActividad=" + idActividad + " ]";
    }
    
}
