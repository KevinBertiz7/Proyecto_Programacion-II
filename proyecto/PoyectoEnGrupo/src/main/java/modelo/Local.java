/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author leoda
 */
public class Local {
    private String nombre;
    private Direccion direcciones;

    public Local(String nombre, Direccion direcciones) {
        this.nombre = nombre;
        this.direcciones = direcciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(Direccion direcciones) {
        this.direcciones = direcciones;
    }
@Override
    public String toString() {
        return "Local{" + "nombre=" + nombre+ ", direcciones=" + direcciones + '}';
    }
}