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
@Named(value = "altaUsuarioBean")
@RequestScoped
public class AltaUsuarioBean {

    private String nombre,rol,contraseña;
    /**
     * Creates a new instance of AltaUsuarioBean
     */
    public AltaUsuarioBean() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void save() {
        String consulta;
        consulta = "Insert into Usuario values(null,'"+nombre+"','"+rol+"','"+contraseña+"');";
        ConeccionBD.iniciarConexion();
        if(ConeccionBD.insertar(consulta)){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuario Guardado"));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Ocurrio un error"));
        }
        ConeccionBD.cerrarConexion();
        
    }
}
