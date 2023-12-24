/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Julio
 */

// Clase que extiende la super clase abtracta empleado
public class EmpleadoAsalariado extends Empleado{
    private double salario;
    
    // contructor
    public EmpleadoAsalariado(String nombre, String apellido, String nss){
        super(nombre, apellido, nss);
    }
    // clase abstracta que necesita ser modificada
    @Override
    public double ingresos(){
        return obtenerSalarioSemanal();
    }
    // obtener y establecer (setters y getters)
    public void establecerSalarioSemanal(double sal) {
        salario = sal;
    }

    public double obtenerSalarioSemanal() {
        return salario;
    }
    // Devuelve presentacion string de un objeto empleado
    @Override
    public String toString(){
        return String.format("Empleado asalariado: %s\n%s: $%,.2f", super.toString(),"salario semanal" , obtenerSalarioSemanal());
    }
    
}
