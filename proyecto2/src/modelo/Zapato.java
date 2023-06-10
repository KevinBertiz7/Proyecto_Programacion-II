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
    protected String marca;
    protected String modelo;
    protected String color;
    protected int talla;

    public Zapato(String marca, String modelo, String color, int talla) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
    
    @Override
    public String toString() {
        return "Zapato{" + ", marca=" + marca+", modelo=" + modelo+"color=" + color+ "talla=" + talla + '}';
    }
}
