package Herencias.Escuela;

import java.util.ArrayList;

public class Asignatura {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;
    private Profesor profesor;

    //=======================================CONSTRUCTOR===============================================

    public Asignatura() {
        this.nombre ="";
        this.estudiantes =new ArrayList<Estudiante>();
        this.profesor = new Profesor();
    }

    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.estudiantes=new ArrayList<Estudiante>();
        this.profesor = new Profesor();
    }

    public Asignatura(String nombre, ArrayList<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
        this.profesor = new Profesor();
    }

    public Asignatura(String nombre, ArrayList<Estudiante> estudiantes, Profesor profesor) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
        this.profesor = profesor;
    }

    public Asignatura(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    //=====================================GETTER Y SETTER=============================================
    //Nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Lista estudiantes
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    //Profesor
    public Profesor getProfesor() {
        return this.profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    //==========================================METHODS================================================

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre= '" + this.nombre + '\'' +
                '}';
    }

    public boolean matricular(Estudiante e1){
        boolean matriculado = false;
        if(!this.estudiantes.contains(e1)) {
            this.estudiantes.add(e1);
            e1.getAsignaturas().add(this);
            matriculado = true;
        }
        return matriculado;
    }
    public boolean baja(Estudiante e1){
        boolean baja = false;
        if(this.estudiantes.contains(e1)) {
            this.estudiantes.remove(e1);
            e1.getAsignaturas().remove(this);
            baja = true;
        }
        return baja;
    }
    public void listarEstudiantes(){
        String listado = "";
        for(int i = 0; i<this.estudiantes.size(); i++){
            listado += this.estudiantes.get(i).getNombre() +"\n";
        }
        System.out.println(listado);
    }
}
