/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Stilo
 */
public class AlumnoServicio {
    
    Scanner leer = new Scanner(System.in);
 
    ArrayList<Integer> nota = new ArrayList();
    
    public void CrearAlumno(ArrayList<Alumno> alumno) {
        boolean resp;
        do {
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = (leer.next());
                for (int i = 0; i < 3; i++) {
                    System.out.println("Ingrese las notas ");
                    nota.add(leer.nextInt());
                    
            }
                System.out.println("Quiere ingresar otro alumno? ingrese (s/n) ");
                resp = leer.next().equalsIgnoreCase("s");
                Alumno alumnos = new Alumno( nombre, nota);
                alumno.add(alumnos);
            
        } while(resp);
    }
    
    public void notaFinal(ArrayList<Alumno> alumno) {
        System.out.println("alumno promedio");
        System.out.println("ingrese el nombre del alumno ");
        String nombre = leer.next();
        for (Alumno alumno1 : alumno) {
            if (alumno1.getNombre().equals(nombre)) {
                ArrayList<Integer> nota = alumno1.getNota();
                double promedio = ((nota.get(0) + nota.get(1) + nota.get(2)) / 3.0);
                System.out.println("El promedio del alumno " + nombre + "es :" + promedio);
 
            }
        }
    
    
    
    
    }}
