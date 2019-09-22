/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vendedor;

/**
 *
 * @author UNICESAR-401
 */
public class Vendedor {

    private String nombre;
    private double venta[];

    public Vendedor() {
        this("will");
    }
    
    public Vendedor(String nombre) {
        this(nombre,new double[12]);
    }
    
    public Vendedor(String nombre, double[] venta) {
        this.nombre = nombre;
        this.venta = venta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[] getVenta() {
        return venta;
    }

    public void setVenta(double[] venta) {
        this.venta = venta;
    }
    
    public double totalVentas()
    {
        
        double totalVentas =0;
        for(double v: venta)
          totalVentas += v;
        
        
        return totalVentas;
    }
    
    
    
    
}
