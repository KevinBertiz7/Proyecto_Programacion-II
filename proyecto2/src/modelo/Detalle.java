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
public class Detalle {
    private ArrayList<Venta> ventas;
    private ArrayList<Cliente> Clientes;
    private ArrayList<VendedorPorHoras> VendedoresPorHoras;
    /*private ArrayList<VendedorComision> VendedoresComision;*/

    public Detalle(ArrayList<Venta> ventas, ArrayList<Cliente> Clientes, ArrayList<VendedorPorHoras> VendedoresPorHoras) {
        this.ventas = new ArrayList<Venta>();
        this.Clientes = Clientes;
        this.VendedoresPorHoras = new ArrayList<VendedorPorHoras>();
    }

public void agregarVentas(Venta venta) {
        this.ventas.add(venta);
    }
 public void agregarVendedores(VendedorPorHoras vendedorPorHoras) {
        this.VendedoresPorHoras.add(vendedorPorHoras);
    }
 public void agregarClientes(Cliente cliente) {
        this.Clientes.add(cliente);
    }
 
 
 
 public double calcularPagaTrabajadores() {
        double calcularSueldo = 0;
        for (VendedorPorHoras vendedorPorHoras : this.VendedoresPorHoras) {
            calcularSueldo += vendedorPorHoras.CalcularSueldo();
        }
        return calcularSueldo;
    }
 
    public double calcularGananciaTotal() {
        double ventaTotal = 0;
        for (Venta venta : this.ventas) {
            ventaTotal += venta.getVentaTotal();
        }
        return ventaTotal - calcularPagaTrabajadores();
    }
    

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(ArrayList<Cliente> Clientes) {
        this.Clientes = Clientes;
    }

    public ArrayList<VendedorPorHoras> getVendedoresPorHoras() {
        return VendedoresPorHoras;
    }

    public void setVendedoresPorHoras(ArrayList<VendedorPorHoras> VendedoresPorHoras) {
        this.VendedoresPorHoras = VendedoresPorHoras;
    }

    /*public ArrayList<VendedorComision> getVendedoresComision() {
        return VendedoresComision;
    }

    public void setVendedoresComision(ArrayList<VendedorComision> VendedoresComision) {
        this.VendedoresComision = VendedoresComision;
    }*/
    
    @Override
    public String toString() {
        return "Detalle{" + "venta=" + ventas + ", cliente=" + Clientes + ", vendedor=" + VendedoresPorHoras +'}';
    }
}
