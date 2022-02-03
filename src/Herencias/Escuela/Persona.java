package Herencias.Escuela;

public class Persona {
    protected String nombre;
    protected String dni;

    //=======================================CONSTRUCTOR===============================================

    public Persona() {
        this.nombre = "";
        this.dni = "";
    }

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    //====================================GETTER Y SETTER==============================================
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    //=========================================METHODS=================================================

    @Override
    public String toString() {
        return "Persona{" +
                "nombre= '" + nombre + '\'' +
                ", dni= '" + dni + '\'' +
                '}';
    }
}
