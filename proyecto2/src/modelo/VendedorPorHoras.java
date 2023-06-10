/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leoda
 */
public class VendedorPorHoras extends Persona{
private int hora;
private double sueldoHora;

    public VendedorPorHoras(int hora, double sueldoHora, String nombre, int cedula) {
        super(nombre, cedula);
        this.hora = hora;
        this.sueldoHora = sueldoHora;
    }
    
double CalcularSueldo(){
    return hora*sueldoHora;
}    
@Override
    public String toString() {
        return "Vendedor{" + "hora trabajada=" + hora + ", sueldo en hora=" + sueldoHora + ", nombre=" + nombre +", cedula=" + cedula +'}';
    }

}
