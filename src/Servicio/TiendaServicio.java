
package Servicio;

import Entidades.Tienda;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class TiendaServicio {
    
    public void CrearProducto(HashMap<String,Double> producto){
        Tienda tienda=new Tienda();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un articulo: ");
        tienda.setArticulo(leer.next());
        System.out.println("Ingrese el precio del mismo: ");
        tienda.setPrecio(leer.nextDouble());
        
        producto.put(tienda.getArticulo(), tienda.getPrecio());
    }
    
    public void ModificarPrecio(HashMap<String , Double> producto){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el producto a cambiar el precio: ");
        String p1= leer.next();
        if(producto.containsKey(p1)){
            System.out.println("Ingrese el precio actual: ");
          Double pre1 = leer.nextDouble();
          producto.put(p1, pre1);
        }else{
            System.out.println("el producto ingresado es inexistente ");
        }
  }
    
    public void EliminarProducto(HashMap<String,Double> producto){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el producto a eliminar: ");
        String p1 = leer.next();
        if(producto.containsKey(p1)){
            producto.remove(p1);
        }else{
            System.out.println("Producto inexistente");
        }
   }
    
    public void MostrarProductos(HashMap<String,Double> producto){
       for  (String aux : producto.keySet()){
           System.out.println(aux+" precio: $"+ producto.get(aux));
           
       }
    }
    
    
}
