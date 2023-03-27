/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leoda
 */
public class Direccion {
    private String pais;
    private String departamento;
    private String ciudad;
    private String calle;
    private String ubicacion;

    public Direccion(String pais, String departamento, String ciudad, String calle, String ubicacion) {
        this.pais = pais;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.calle = calle;
        this.ubicacion = ubicacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
     @Override
    public String toString() {
        return "Direccion{" + "pais=" + pais+", departamento="+departamento +", ciudad=" + ciudad + ", calle=" + calle + ", ubicacion="+ubicacion+'}';
    }
}
