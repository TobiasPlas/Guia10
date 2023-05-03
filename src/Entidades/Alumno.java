
package Entidades;

import java.util.ArrayList;
import java.util.List;


public class Alumno {
    
    private String nombre;
    private ArrayList<Integer> nota;

    public Alumno(String nombre, ArrayList<Integer> nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public Alumno() {
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }

    
    
    
    
    
    
}
