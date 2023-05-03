/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10;

import Servicio.MascotaService;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Stilo
 */
public class Guia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
ArrayList<String> perro = new ArrayList();
         MascotaService ms = new MascotaService();
         ms.cargarRaza(perro);
         ms.mostrarRaza(perro);
         ms.eliminarperro(perro);
         ms.mostrarRaza(perro);
         Collections.sort(perro);
         ms.mostrarRaza(perro);
    }
    
}
