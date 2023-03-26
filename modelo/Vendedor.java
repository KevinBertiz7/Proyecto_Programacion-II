/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leoda
 */
public class Vendedor {
    private String nombre;
    private int edad;
    private double comision;
    private int numeroVenta;

    public Vendedor(String nombre, int edad, double comision, int nVenta) {
        this.nombre = nombre;
        this.edad = edad;
        this.comision = comision;
        this.numeroVenta = nVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public int getnVenta() {
        return numeroVenta;
    }

    public void setnVenta(int nVenta) {
        this.numeroVenta = nVenta;
    }
    
    @Override
    public String toString() {
        return "Vendedor{" + " nombre=" + nombre + ", edad=" + edad + ", comision=" + comision + ", nVenta=" + numeroVenta + '}';
    }
}
