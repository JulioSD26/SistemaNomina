/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Julio
 */
public class PruebaSistemaNomina {
    public static void main(String[] args) {
        // Argumentos: nombre, apellido, nss y salario
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Julio", "Sanchez", "12345", 800.00);
        
        // Argumentos: nombre, apellido, nss, sueldo por hora, horas trabajadas
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Dua", "Lipa", "54321", 16.75, 40);
        
        // Argumentos: nombre, apellido, nss, ventas, tarifa de comisión
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("John", "Cena", "56789", 10000, .06);
        
        // Argumentos: nombre, apellido, nss, ventas, tarifa, salario
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Leonardo", "Dicaprio", "98765", 5000, .04, 300);
        
        System.out.println("Empleados procesados por separado:\n");
        
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoAsalariado, "ingesos", empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoPorHoras, "ingesos", empleadoPorHoras.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoPorComision, "ingesos", empleadoPorComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoBaseMasComision, "ingesos", empleadoBaseMasComision.ingresos());
    }
}
