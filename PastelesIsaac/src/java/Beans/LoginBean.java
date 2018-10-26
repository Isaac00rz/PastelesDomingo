/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Datos.ConeccionBD;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Grapha
 */
@Named(value = "loginBean")
@RequestScoped
public class LoginBean {

    /**
     * Creates a new instance of LoginBean
     */
    private String nombre,clave;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public String login(){
        String pagina = "";
        Object[] datos;
        ConeccionBD.iniciarConexion();
        datos = ConeccionBD.consultaCompleta("Select nombre,contraseña,rol from Usuario where nombre = '"+nombre+"' and contraseña = '"+clave+"'", 3);
        ConeccionBD.cerrarConexion();
        try{
            if(datos[2].toString().equals("Admin")){
                pagina = "Administrador?faces-redirect=true&usuario="+nombre;
            }
        }catch(Exception e){
            pagina = "Usuario";
        }      
        return pagina;
    }
}
