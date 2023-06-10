/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import modelo.*;
/**
 *
 * @author leoda
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Producto producto1 = new Producto(3874435, 20000,"nikke","deportivo","azul",42);
Producto producto2 = new Producto(3874435, 24000,"adidas","deportivo","rojo",40);
Producto producto3 = new Producto(3934215, 22000,"church's","clasico","marron",45);

Venta venta1 = new Venta("2023/01/25",35000, new ArrayList<>(Arrays.asList(producto1)),1 );
Venta venta2 = new Venta("2023/01/26",37000, new ArrayList<>(Arrays.asList(producto2)),1);
Venta venta3 = new Venta("2023/01/27",73000, new ArrayList<>(Arrays.asList(producto3)),2);

Cliente cliente1= new Cliente(new ArrayList<>(Arrays.asList(venta1)),"Carlos Gutierres",1045643);
Cliente cliente2= new Cliente(new ArrayList<>(Arrays.asList(venta2)),"Maria Gomez",1055643);
Cliente cliente3= new Cliente(new ArrayList<>(Arrays.asList(venta3)),"Daniel Correa",1065643);

VendedorPorHoras vendedorPorHoras1=new VendedorPorHoras(18,2500,"Fernando Arias",3949493);
VendedorPorHoras vendedorPorHoras2=new VendedorPorHoras(19,2500,"Camilo Hoyos",3749493);
VendedorPorHoras vendedorPorHoras3=new VendedorPorHoras(23,2500,"Daniela Meza",3449493);

// Creamos tres detalles con estas ventas y una información adicional
Detalle detalle1 = new Detalle(new ArrayList<>(Arrays.asList(venta1)),new ArrayList<>(Arrays.asList(cliente1)), new ArrayList<>(Arrays.asList(vendedorPorHoras1)));
Detalle detalle2 = new Detalle(new ArrayList<>(Arrays.asList(venta2)),new ArrayList<>(Arrays.asList(cliente2)), new ArrayList<>(Arrays.asList(vendedorPorHoras2)));
Detalle detalle3 = new Detalle(new ArrayList<>(Arrays.asList(venta3)),new ArrayList<>(Arrays.asList(cliente3)), new ArrayList<>(Arrays.asList(vendedorPorHoras3)));
  
Zapato zapato1 = new Zapato("nikke","deportivo","azul",42);
Zapato zapato2  = new Zapato("adidas","deportivo","rojo",40);
Zapato zapato3  = new Zapato("church's","clasico","marron",45);

FabricaDeZapatos fabricaDeZapatos1=new FabricaDeZapatos("Fabrica 1",1000,new ArrayList<>(Arrays.asList(zapato1)));
FabricaDeZapatos fabricaDeZapatos2=new FabricaDeZapatos("Fabrica 2",1000,new ArrayList<>(Arrays.asList(zapato2)));
FabricaDeZapatos fabricaDeZapatos3=new FabricaDeZapatos("Fabrica 3",1000,new ArrayList<>(Arrays.asList(zapato3)));
 
Proveedor proveedor1=new Proveedor(new ArrayList<>(Arrays.asList(fabricaDeZapatos1)),"Carlos Maestre",2839494 );
Proveedor proveedor2=new Proveedor(new ArrayList<>(Arrays.asList(fabricaDeZapatos2)),"Diego Alarcon",2839494 );
Proveedor proveedor3=new Proveedor(new ArrayList<>(Arrays.asList(fabricaDeZapatos3)),"Gabriel Olivella",2839494 );

CompraZapatos compraZapatos1 = new CompraZapatos(70, 1260000,new ArrayList<>(Arrays.asList(zapato1)),new ArrayList<>(Arrays.asList(proveedor1)));
  CompraZapatos compraZapatos2 = new CompraZapatos(75, 1650000,new ArrayList<>(Arrays.asList(zapato1)),new ArrayList<>(Arrays.asList(proveedor2)));
  CompraZapatos compraZapatos3 = new CompraZapatos(73, 1460000,new ArrayList<>(Arrays.asList(zapato1)),new ArrayList<>(Arrays.asList(proveedor3)));
    
  
  System.out.println(compraZapatos1);
  System.out.println(compraZapatos2);
  System.out.println(compraZapatos3);
  
   System.out.println(detalle1);
   System.out.println(detalle2);
   System.out.println(detalle3);
   
  } 
}    


    
