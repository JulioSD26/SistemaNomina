/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Julio
 */
public abstract class Empleado {
    // Variables del empleado
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    
    // constructor
    public Empleado(String nombre, String apellido, String nss){
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
    }
    // Getters y setters 
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
    // Devuelve presentacion string de un objeto empleado
    @Override
    public String toString(){
        return String.format("%s %s\nnumero de seguro social: %s", getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial());
    }
    
    // método abstracto que debe ser sobrescrito por las subclases
    public abstract double ingresos();
}
