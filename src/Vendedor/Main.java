/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vendedor;

import java.util.Scanner;

/**
 *
 * @author UNICESAR-401
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        
        Vendedor v[] = new Vendedor[100];
        int pos = 0;
        char op ;
        
        do
        {
            
            v[pos] = leerVendedor();
            pos++;
            
            op = Leer("Desea Registrar otro(S/N): ").toUpperCase().charAt(0);
        }while(op == 'S' && pos <= v.length);
        System.out.println("---------------------------------");
        System.out.println("Total ventas Registradas: "+
               totalizarVentas(v,pos));
        
        System.out.println("Numero de vendedores: "+pos);
        
        
        
    }
    
    public static String Leer(String dato)
    {
        Scanner cin = new Scanner(System.in);
        System.out.print(dato+": ");
        return cin.next();
    }
    
    public static Vendedor leerVendedor()
    {
        String nombre = Leer("Nombre");
        double ventas[] = new double[12];
      
        for (int i = 0; i<ventas.length; i++) {
           
            ventas[i] = Double.valueOf( Leer("Mes "+(i+1)+": "));
        }
        
        return new Vendedor(nombre,ventas);
    }
    
    public static double totalizarVentas(Vendedor[] v,int r)
    {
        double total=0;
        
        for (int i = 0; i <r; i++) {
            
            total += v[i].totalVentas();
        }
        
        return total;
    }
    
    
}
