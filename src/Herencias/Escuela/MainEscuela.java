package Herencias.Escuela;

import java.util.ArrayList;
import java.util.Collections;

public class MainEscuela {
    public static void main(String[] args) {
        ArrayList<Asignatura> asignaturas =new ArrayList<Asignatura>();
        Asignatura a1 = new Asignatura("Programacion");
        Asignatura a2 = new Asignatura("Entornos");
        Asignatura a3 = new Asignatura("Marcas");
        Asignatura a4 = new Asignatura("Base de datos");
        Collections.addAll(asignaturas,a1,a2,a3,a4);

        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        Estudiante e1 = new Estudiante("Pepe","22138883P",5.6,asignaturas);
        Estudiante e2 = new Estudiante("Clo","221321312Y",7,asignaturas);
        Estudiante e3 = new Estudiante("Mowgli","28842458K",9.8);
        Collections.addAll(estudiantes,e1,e2,e3);


        a1.matricular(e3);
        a2.matricular(e3);
        e3.listarAsignaturas();

        a2.baja(e3);
        e3.listarAsignaturas();
        a2.listarEstudiantes();

    }
}
