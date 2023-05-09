package guia10;

import Servicio.TiendaServicio;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashMap<String, Double> producto = new HashMap();
        int resp;
      String confi="n";
        TiendaServicio t = new TiendaServicio();
        do {

            System.out.println("Ingrese la opcion deseada:");
            System.out.println("1)Agregar un producto");
            System.out.println("2)Modificar el precio de algun producto");
            System.out.println("3)Eliminar producto");
            System.out.println("4)Mostrar productos");
            System.out.println("5)Salir");
            resp = leer.nextInt();

            switch (resp) {
                case 1:
                    t.CrearProducto(producto);
                    break;
                case 2:
                    t.ModificarPrecio(producto);
                    break;
                case 3:
                    t.EliminarProducto(producto);
                    break;
                case 4:
                    t.MostrarProductos(producto);
                    break;
                case 5:
                    System.out.println("Esta seguro de salir del programa? (s/n)");
           confi = leer.next();
                       break;
            }

        } while (!confi.equalsIgnoreCase("s"));

    }

}
