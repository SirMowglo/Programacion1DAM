package Clases;

public class Persona {
    //=========================================VARIABLE===================================================
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;

    private int nbrazos = 2;
    private int npiernas= 2;

    //========================================CONSTRUCTOR==================================================
    public Persona(String nombre, String apellidos, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public Persona(String nombre, String apellidos, int edad, String dni, int nbrazos, int npiernas) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.dni = dni;
        this.nbrazos = nbrazos;
        this.npiernas = npiernas;
    }
    //=========================================METODOS==========================================
    //GETTER
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getDni() {
        return dni;
    }
    public int getNbrazos() {
        return nbrazos;
    }
    public int getNpiernas() {
        return npiernas;
    }

    //SETTER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setNbrazos(int nbrazos) {
        this.nbrazos = nbrazos;
    }
    public void setNpiernas(int npiernas) {
        this.npiernas = npiernas;
    }
}
