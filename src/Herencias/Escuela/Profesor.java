package Herencias.Escuela;

import java.util.ArrayList;

public class Profesor extends Persona{
    private double sueldo;
    private ArrayList<Asignatura> asignaturasImpartidas;

    //========================================CONSTRUCTOR==============================================

    public Profesor() {
        super();
        this.sueldo =0;
        this.asignaturasImpartidas = new ArrayList<Asignatura>();
    }

    public Profesor(String nombre, String dni, double sueldo, ArrayList<Asignatura> asignaturasImpartidas) {
        super(nombre, dni);
        this.sueldo = sueldo;
        this.asignaturasImpartidas = asignaturasImpartidas;
    }
    //=====================================GETTER Y SETTER=============================================
    //Sueldo
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Asignaturas que imparte
    public ArrayList<Asignatura> getAsignaturasImpartidas() {
        return asignaturasImpartidas;
    }
    public void setAsignaturasImpartidas(ArrayList<Asignatura> asignaturasImpartidas) {
        this.asignaturasImpartidas = asignaturasImpartidas;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", sueldo=" + sueldo +
                ", asignaturasImpartidas=" + asignaturasImpartidas +
                '}';
    }
}
