
package guia10;

import Entidades.Alumno;
import Servicio.AlumnoServicio;
import java.util.ArrayList;

public class Ejercicio3 {

    public static void main(String[] args) {

           ArrayList<Alumno> alumno = new ArrayList();
          AlumnoServicio alumnos = new AlumnoServicio();
          
          alumnos.CrearAlumno(alumno);
           alumnos.notaFinal(alumno);
    }

 

    
}
