package Servicio;

import Entidades.Pelicula;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;

public class PeliculaService {

    ArrayList<Pelicula> peliculas = new ArrayList();

    public void CrearPelicula() {
        Pelicula pelicula = new Pelicula();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre de la pelicula: ");
        pelicula.setTitulo(leer.nextLine());
        System.out.println("Ingrese el director");
        pelicula.setDirector(leer.nextLine());
        System.out.println("Ingrese la duracion");
        pelicula.setDuracion(leer.nextDouble());

        peliculas.add(pelicula);

    }

    public void CargarPelicula() {
        Scanner leer = new Scanner(System.in);
        boolean resp;

        do {
            CrearPelicula();

            System.out.println("Desea crear otra pelicula? (s/n)");
            resp = leer.next().equalsIgnoreCase("s");

        } while (resp);
    }

    public void Mostrar() {
        System.out.println(peliculas.size());
        System.out.println("Las peliculas son: ");
        for (Pelicula aux : peliculas) {
            System.out.println("* "+aux.getTitulo());
        }

    }

    public void Mayor() {

        System.out.println("Las peliculas con una duracion de mas de 1 hora son");

        for (Pelicula aux : peliculas) {
            if (aux.getDuracion() >= 1) {
                System.out.println(aux.toString());
            }
        }

    }

    public void OrdenDesendiente() {   
        
        Collections.sort(peliculas,new Comparator <Pelicula>(){
            public int compare (Pelicula p1,Pelicula p2){
                return Double.compare(p2.getDuracion() , p1.getDuracion() );
            }
       } );
    
         Mostrar();
    }

}
