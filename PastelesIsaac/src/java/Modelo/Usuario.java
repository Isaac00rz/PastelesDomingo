/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author IsaacUlises
 */
public class Usuario {
    private int id_usuario;
    private String nombre, apellidoP,apellidoMrol,email,
            telefono,contraseña,direccion;

    public Usuario(int id_usuario, String nombre, String apellidoP, String apellidoMrol, String email, String telefono, String contraseña, String direccion) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoMrol = apellidoMrol;
        this.email = email;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.direccion = direccion;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoMrol() {
        return apellidoMrol;
    }

    public void setApellidoMrol(String apellidoMrol) {
        this.apellidoMrol = apellidoMrol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
