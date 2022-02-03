package Clases.Dni;

public class Dni {
    private int numero;
    private char letra;
    private String nombre;
    private String apellido1;
    private String apellido2;
    //=================================CONSTRUCTOR======================================

    public Dni() {
        this.numero = 0;
        this.nombre="";
        this.apellido1= "";
        this.apellido2 = "";
        this.calculaDni();
    }

    public Dni(int numero, String nombre, String apellido1, String apellido2) {
        this.numero = numero;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.calculaDni();
    }

    //===============================GETTER Y SETTER====================================
    public char getLetra() {
        return letra;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
        this.calculaDni();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    //=======================================METHODS=======================================
    public void calculaDni(){
        final String dniFormula = "TRWAGMYFPDXBNJZSQVHLCKE";
        this.letra = dniFormula.charAt(this.numero%23);
    }

    @Override
    public String toString() {
        return "[Dni:" +
                "\nnumero=" + numero +
                "\nletra=" + letra +
                "\nnombre=" + nombre +
                "\napellidos=" + apellido1 +" " + apellido2+"]";
    }
}
