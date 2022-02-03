package Herencias.Escuela;

import java.util.ArrayList;

public class Estudiante extends Persona{
    private double nota_media;
    private ArrayList<Asignatura> asignaturas;

    //======================================CONSTRUCTOR=================================================

    public Estudiante() {
        super();
        this.nota_media=0;
        this.asignaturas= new ArrayList<Asignatura>();
    }
    public Estudiante(String nombre, String dni) {
        super(nombre, dni);
        this.nota_media=0;
        this.asignaturas= new ArrayList<Asignatura>();
    }

    public Estudiante(String nombre, String dni, double nota_media) {
        super(nombre, dni);
        this.nota_media = nota_media;
        this.asignaturas= new ArrayList<Asignatura>();
    }

    public Estudiante(String nombre, String dni, double nota_media, ArrayList<Asignatura> asignaturas) {
        super(nombre, dni);
        this.nota_media = nota_media;
        this.asignaturas = asignaturas;
    }
    //===================================GETTER Y SETTER===============================================

    public double getNota_media() {
        return nota_media;
    }
    public void setNota_media(double nota_media) {
        this.nota_media = nota_media;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }
    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    //======================================METHODS====================================================

    @Override
    public String toString() {
        return "Estudiante{" +
                "nota_media=" + nota_media +
                ", asignaturas=" + asignaturas +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    public void listarAsignaturas(){
        String listado = "";
        for(int i = 0; i<asignaturas.size(); i++){
            listado += asignaturas.get(i).getNombre() +"\n";
        }
        System.out.println(listado);
    }
}
