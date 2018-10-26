/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Datos.ConeccionBD;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author IsaacUlises
 */
@Named(value = "altaPastelBean")
@RequestScoped
public class AltaPastelBean {

    private String nombre,descripcion;
    private double precio,costo;
    
    
    /**
     * Creates a new instance of AltaPastelBean
     */
    public AltaPastelBean() {
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public void save() {
        String consulta;
        consulta = "Insert into Pasteles values(null,'"+nombre+"','"+descripcion+"',"+precio+","+costo+");";
        ConeccionBD.iniciarConexion();
        if(ConeccionBD.insertar(consulta)){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Pastel Guardado"));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Ocurrio un error"));
        }
        ConeccionBD.cerrarConexion();
        
    }
    
    
}
