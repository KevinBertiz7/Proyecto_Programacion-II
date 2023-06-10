/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author leoda
 */
public class Venta {
     
    private Zapato zapatos; 
    private Local locales; 
    private Vendedor vendedores;
    private LocalDate fechaVenta;
    private double costoProduccion;
    private double gastosOperativos;

    public Venta(Zapato zapatos, Local locales, Vendedor vendedores, LocalDate fechaVenta, double costoProduccion, double gastosOperativos) {
        this.zapatos = zapatos;
        this.locales = locales;
        this.vendedores = vendedores;
        this.fechaVenta = fechaVenta;
        this.costoProduccion = costoProduccion;
        this.gastosOperativos = gastosOperativos;
    }

    public Venta(Zapato zapato1, Local local1, Vendedor vendedor1, LocalDate fecha1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
   

    public double getCostoProduccion() {
        return costoProduccion;
    }

    public void setCostoProduccion(double costoProduccion) {
        this.costoProduccion = costoProduccion;
    }

    public double getGastosOperativos() {
        return gastosOperativos;
    }

    public void setGastosOperativos(double gastosOperativos) {
        this.gastosOperativos = gastosOperativos;
    }

    // Método para calcular el gasto total de la empresa
    public double calcularGastoTotal() {
        return costoProduccion + gastosOperativos;

    
    
   
}

    @Override
    public String toString() {
        return "Venta{" + "zapatos=" + zapatos + ", locales=" + locales + ", vendedores=" + vendedores + ", fechaVenta=" + fechaVenta + ", costoProduccion=" + costoProduccion + ", gastosOperativos=" + gastosOperativos + '}';
    }
}
