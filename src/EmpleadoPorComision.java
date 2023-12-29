/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Julio
 */
public class EmpleadoPorComision extends Empleado {

    private double ventasBrutas;
    private double tarifaComision;
    
    public EmpleadoPorComision (String nombre, String apellido, String nss, double ventas, double tarifa) {
        super(nombre, apellido, nss);
        
        setVentasBrutas(ventas);
        setTarifaComision(tarifa);
        
    }
    // getters y setters
    public void setTarifaComision(double tarifa) {
        // que la tarifa sea mayor que 0 y menor que el procentaje dado (1%)
        if (tarifa > 0.1 && tarifa < 1.0) {
            tarifaComision = tarifa;
        }else {
            tarifa = 0.0;
        }
        
    }
    
    public double getTarifaComision() {
        return tarifaComision;
    }
    
    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventas) {
        if (ventas < 0.0) {
            ventasBrutas = 0.0;
        }else {
            ventasBrutas = ventas;
        }
    }

    @Override
    public double ingresos(){
        return getTarifaComision() * getVentasBrutas();
    }
    
    // Devuelve presentacion string de un objeto empleado por comision
    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f","Empleado por comisión", super.toString(),"ventas brutas" , getVentasBrutas(), "tarifa de comisión", getTarifaComision());
    }

}
