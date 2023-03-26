/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leoda
 */
public class Zapato {
    private int talla;
    private String marca;
    private double precio;
    private String color;
    private String modelo;
    private int nZapato;

    public Zapato(int talla, String marca, double precio, String color, String modelo, int nZapato) {
        this.talla = talla;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.modelo = modelo;
        this.nZapato = nZapato;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getnZapato() {
        return nZapato;
    }

    public void setnZapato(int nZapato) {
        this.nZapato = nZapato;
    }

   
    @Override
    public String toString() {
        return "Zapato{" + "talla=" + talla+ ", marca=" + marca + ", precio=" + precio + ", color=" + color + ", nZapato=" + nZapato + '}';
    }
}