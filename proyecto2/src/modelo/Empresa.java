/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author leoda
 */
public class Empresa {
 private String nombre;
private String Direccion;
 private ArrayList<CompraZapatos> comprasZapatos;
 private ArrayList<Detalle> detalles;

    public Empresa(String nombre, String Direccion, ArrayList<CompraZapatos> comprasZapatos, ArrayList<Detalle> detalles) {
        this.nombre = nombre;
        this.Direccion = Direccion;
        this.comprasZapatos = comprasZapatos;
        this.detalles = detalles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public ArrayList<CompraZapatos> getComprasZapatos() {
        return comprasZapatos;
    }

    public void setComprasZapatos(ArrayList<CompraZapatos> comprasZapatos) {
        this.comprasZapatos = comprasZapatos;
    }

    public ArrayList<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<Detalle> detalles) {
        this.detalles = detalles;
    }
 
}
