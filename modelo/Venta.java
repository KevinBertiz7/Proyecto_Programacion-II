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
public class Venta {
     
    private Zapato zapatos; 
    private Local locales; 
    private Vendedor vendedores; 

    public Venta(Zapato zapatos, Local locales, Vendedor vendedores) {
        this.zapatos = zapatos;
        this.locales = locales;
        this.vendedores = vendedores;
    }

    public Zapato getZapatos() {
        return zapatos;
    }

    public void setZapatos(Zapato zapatos) {
        this.zapatos = zapatos;
    }

    public Local getLocales() {
        return locales;
    }

    public void setLocales(Local locales) {
        this.locales = locales;
    }

    public Vendedor getVendedores() {
        return vendedores;
    }

    public void setVendedores(Vendedor vendedores) {
        this.vendedores = vendedores;
    }

    
   @Override
    public String toString() {
        return "Venta{" + "zapatos=" + zapatos + ", locales=" + locales + ", vendedores=" + vendedores + '}';
    }
}
