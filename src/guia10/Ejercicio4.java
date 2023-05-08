
package guia10;

import Servicio.PeliculaService;


public class Ejercicio4 {

   
    public static void main(String[] args) {
        
        
        PeliculaService peliculas = new PeliculaService();
        
        
        peliculas.CargarPelicula();
        peliculas.Mostrar();
        peliculas.Mayor();
        peliculas.OrdenDesendiente();
        
    }
    
}
