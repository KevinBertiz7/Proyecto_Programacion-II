/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import modelo.Direccion;
import modelo.Local;
import modelo.Vendedor;
import modelo.Venta;
import modelo.Zapato;



/**
 *
 * @author leoda
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion dire1 = new Direccion("colombia", "cesar", "valledupar","23","mz 23 casa 9");
        Vendedor vendedor1 = new Vendedor("carlos",23,5000,5);
        Zapato zapato1 = new Zapato(42,"nike",100000, "morado", "tennis lifestyle",14);
        Local local1 = new Local("casi",dire1);
        Venta venta1= new Venta(zapato1,local1,vendedor1);
        imprimirVenta(venta1);
    }
    
    public static void imprimirVenta(Venta v){
        System.out.println("Datos del local");
        System.out.println(v);
        System.out.println("----------------------------");
    }
    
}

