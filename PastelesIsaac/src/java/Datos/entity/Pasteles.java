/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author IsaacUlises
 */
@Entity
@Table(name = "pasteles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pasteles.findAll", query = "SELECT p FROM Pasteles p")
    , @NamedQuery(name = "Pasteles.findByIdPastel", query = "SELECT p FROM Pasteles p WHERE p.idPastel = :idPastel")
    , @NamedQuery(name = "Pasteles.findByNombre", query = "SELECT p FROM Pasteles p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Pasteles.findByDescripcion", query = "SELECT p FROM Pasteles p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Pasteles.findByPrecio", query = "SELECT p FROM Pasteles p WHERE p.precio = :precio")
    , @NamedQuery(name = "Pasteles.findByCosto", query = "SELECT p FROM Pasteles p WHERE p.costo = :costo")})
public class Pasteles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pastel")
    private Integer idPastel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 250)
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private Double precio;
    @Column(name = "costo")
    private Double costo;

    public Pasteles() {
    }

    public Pasteles(Integer idPastel) {
        this.idPastel = idPastel;
    }

    public Pasteles(Integer idPastel, String nombre) {
        this.idPastel = idPastel;
        this.nombre = nombre;
    }

    public Integer getIdPastel() {
        return idPastel;
    }

    public void setIdPastel(Integer idPastel) {
        this.idPastel = idPastel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPastel != null ? idPastel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pasteles)) {
            return false;
        }
        Pasteles other = (Pasteles) object;
        if ((this.idPastel == null && other.idPastel != null) || (this.idPastel != null && !this.idPastel.equals(other.idPastel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Datos.entity.Pasteles[ idPastel=" + idPastel + " ]";
    }
    
}
