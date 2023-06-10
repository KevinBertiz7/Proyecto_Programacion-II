/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leoda
 */
public class Producto extends Zapato {
    private int codigo;
    private double precioReferencia;

    public Producto(int codigo, double precioReferencia, String marca, String modelo, String color, int talla) {
        super(marca, modelo, color, talla);
        this.codigo = codigo;
        this.precioReferencia = precioReferencia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecioReferencia() {
        return precioReferencia;
    }

    public void setPrecioReferencia(double precioReferencia) {
        this.precioReferencia = precioReferencia;
    }
@Override
    public String toString() {
        return "Producto{" + "Codigo=" + codigo + ", precio=" + precioReferencia + ", marca=" + marca +", modelo=" + modelo+'}';
    }
}
