/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Julio
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    
    private double salarioBase;
    
    public EmpleadoBaseMasComision (String nombre, String apellido, String nss, double ventas, double tarifa, double salario) {
        super(nombre, apellido, nss, ventas, tarifa);
        
        setSalarioBase(salario);
    }
    
    public void setSalarioBase(double salario) {
        if (salario <= 0.0) {
            salarioBase = 0.0;
        }else{
            salarioBase = salario;
        }
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }
    
    @Override
    public double ingresos(){
        // salario base + (tarifa * ventas brutas) que ya se encuentra en la clase EmpleadoPorComisión
        return getSalarioBase() + super.ingresos();
    }
    
    // Devuelve presentacion string de un objeto empleado base más comision
    @Override
    public String toString(){
        return String.format("%s%s; %s: $%,.2f", "con salario base", super.toString(), "salario base", getSalarioBase());
    }
}
