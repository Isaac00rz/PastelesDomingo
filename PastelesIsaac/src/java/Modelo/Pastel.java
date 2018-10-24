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
public class Pastel {
    private int id_pastel;
    private String nombre;
    private String descripcion;
    private double precio, costo;

    public Pastel(int id_pastel, String nombre, String descripcion, double precio, double costo) {
        this.id_pastel = id_pastel;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.costo = costo;
    }

    public int getId_pastel() {
        return id_pastel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public double getCosto() {
        return costo;
    }

    public void setId_pastel(int id_pastel) {
        this.id_pastel = id_pastel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
    
}
