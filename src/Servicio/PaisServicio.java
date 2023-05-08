/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Pais;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Stilo
 */
public class PaisServicio {
      Pais p = new Pais();

    public void crearPais() {
        Scanner leer = new Scanner(System.in);
        do {

            System.out.println("Ingrese nombre del país");
            p.getPaises().add(leer.nextLine());
            System.out.println("Desea ingresar otro país? s/n");
        } while (leer.nextLine().equalsIgnoreCase("s"));
        System.out.println(p.getPaises());
       
    }
     
    public void BorrarPais(){
    
    Scanner leer = new Scanner(System.in);
        System.out.println("");
        System.out.println("País a borrar:");
        String perro = leer.nextLine();
        Iterator ite = p.getPaises().iterator();
        while (ite.hasNext()) {
            if (ite.next().equals(perro)) {
                ite.remove();
            }
        }
        System.out.println("");
        System.out.println("País eliminado: " + perro);
        System.out.println(p.getPaises());
}
    
}
