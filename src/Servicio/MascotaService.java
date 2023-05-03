/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Stilo
 */
public class MascotaService {
        Scanner leer = new Scanner(System.in);

    public void cargarRaza(ArrayList<String> perro) {

        boolean resp;
        do {

            System.out.println("ingrese una raza");
            perro.add(leer.next());
            System.out.println("Desea ingresar otra raza S/N.?");
            resp = leer.next().equals("s");

        } while (resp);

    }

    public void mostrarRaza(ArrayList<String> perro) {
        for (String aux : perro) {
            System.out.println(aux);

        }
    }

    public void eliminarperro(ArrayList<String> perro) {

        Iterator<String> it = perro.iterator();
        System.out.println("Ingrese la raza a eliminar ");
        String raza = leer.next();
        boolean eliminar = false;
        while (it.hasNext()) {
            String aux = it.next();
        if (aux.equals(raza)){
            it.remove();
            eliminar=true;
        }if(!eliminar){
                System.out.println("No se encontro la raza ");
        }
    }
    
    }}
