package Prueba2.Ejercicio2;

public abstract class Profesor {
    private String nombre;
    private int edad;
    private String asignatura;

    //=================================CONSTRUCTOR=================================
    public Profesor() {
        this.nombre="";
        this.edad =0;
        this.asignatura="";
    }

    public Profesor(String nombre, int edad, String asignatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.asignatura = asignatura;
    }
    //===============================GETTER Y SETTER===============================

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getAsignatura() {
        return asignatura;
    }
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    //==================================METHODS====================================

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", asignatura='" + asignatura + '\'' +
                '}';
    }

    public abstract String fraseCaracteristica();
    public abstract String horaDeLlegada(String dia);

    //El profesor generico devolvera siempre false, no hay descansito :c
    public boolean descansito(){
        return false;
    }
}
