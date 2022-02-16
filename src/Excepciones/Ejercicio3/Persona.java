package Excepciones.Ejercicio3;

public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
        nombre ="";
        edad = 0;
    }
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setEdad(int edad) throws ExcepcionGeneral {
        ExcepcionEdad e= new ExcepcionEdad();
        e.comprobarEdad(edad);
        this.edad = edad;
    }
}
