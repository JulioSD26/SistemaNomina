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
        
        // Polimorfismo
        // Agregar a todos los empleados en un arreglo
        Empleado [] empleados = new Empleado[4];
        
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;
        
        
        System.out.println("Empleados procesados en forma polimórfica:\n");
        
        // procesa en forma genérica a cada elemento en el arreglo de empleados
        for (Empleado empleadoActual: empleados) {
            System.out.println(empleadoActual); // invoca a toString
            
            if (empleadoActual instanceof EmpleadoBaseMasComision) {
                
                // conversión descendente de la referencia de Empleado
                // a una referencia EmpleadoBaseMasComision
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
                
                double salarioBaseAnterior = empleado.getSalarioBase();
                empleado.setSalarioBase(1.10 * salarioBaseAnterior);
                
                System.out.printf("El nuevo salario base con 10%% de aumento es: $%,.2f\n", empleado.getSalarioBase());
            }
            System.out.printf("ingresos $%,.2f\n\n", empleadoActual.ingresos());
        }
        
        // obtiene el nombre del tipo de cada objeto en el arreglo de empleados
        for (int i = 0; i < empleados.length; i++) {
            System.out.printf("El empleado %d es un %s\n", i, empleados[i].getClass().getName());
            
        }
    }
}
