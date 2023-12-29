/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Julio
 */
public class EmpleadoPorHoras extends Empleado {
    
    private double sueldo; //sueldo por hora
    private double horas; //horas trabajadas
    
    public EmpleadoPorHoras (String nombre, String apellido, String nss, double salarioPorHoras, double horasTrabajadas){
        super(nombre, apellido, nss);
        
        establecerSueldo(salarioPorHoras);
        establecerHoras(horasTrabajadas);
    }
    
    public double obtenerSueldo(){
        return sueldo;
    }
    
    public void establecerSueldo(double su) {
        // si sueldo es menor que 0 el valor será 0
        if(su < 0.0){
            sueldo = 0;
        } else{
            sueldo = su;
        }
    }
    
    public double obtenerHoras(){
        return horas;
    }
    
    public void establecerHoras(double h){
        // no puede trabajar menos de 0 horas y más de 168 horas a la semana
        if((h >= 0) && (h <= 168)){
            horas = h;
        } else{
            horas = 0;
        }
    }
    // Devuelve presentacion string de un objeto empleado por horas
    @Override
    public String toString(){
        return String.format("Empleado por horas: %s\n%s: $%,.2f; %s: %,.2f", super.toString(),"sueldo por hora" , obtenerSueldo(), "horas trabajadas", obtenerHoras());
    }
    
    @Override
    public double ingresos(){
        if (obtenerHoras() <= 40) {
            return obtenerSueldo() * obtenerHoras();
        } else{
            return 40 * obtenerSueldo() + (obtenerHoras() - 40) * obtenerSueldo() * 1.5;
        }
    }
    
}
