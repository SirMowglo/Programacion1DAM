package Clases.Dni;
import java.util.Random;

public class Persona {
    private Dni dni;
    private double peso;
    private double altura;
    private double imc;
    private int edad;
    private String sexo;
    //===================================CONTRUCTOR========================================
    public Persona() {
        this.dni = new Dni();
        this.peso =0;
        this.altura = 0;
        this.edad = 0;
        this.sexo = "NONE";
        this.calculaIMC();
    }

    public Persona(String nombre, String apellido1,String apellido2,int numeroDni, double peso, double altura, int edad, String sexo) {
        this.dni = new Dni(numeroDni,nombre, apellido1,apellido2);
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.sexo = sexo.toUpperCase();
        this.calculaIMC();
    }

    public Persona(Dni dni, double peso, double altura, int edad, String sexo) {
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.sexo = sexo;
    }
    //================================GETTER Y SETTER======================================

    public Dni getDni() {
        return dni;
    }
    public void setDni(Dni dni) {
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
        this.calculaIMC();
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
        this.calculaIMC();
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    //=======================================METHODS======================================
    public void calculaIMC(){
        this.imc = this.peso/(this.altura*this.altura);
    }
    public String obtenerClasificacionOMS(){
        String clasificacion = "";
        if(imc<18.5){
            clasificacion = "Bajo Peso";
        }else if(imc>=18.5 && imc<25){
            clasificacion = "Adecuado";
        }else if(imc>=25 && imc<30){
            clasificacion = "Sobrepeso";
        }else if(imc>=30 && imc<35){
            clasificacion = "Obesidad G1";
        }else if(imc>=35 && imc<40){
            clasificacion = "Obesidad G2";
        }else{
            clasificacion = "Obesidad G3";
        }
        return clasificacion;
    }
    public boolean esMayorDeEdad(){
        boolean mayorDeEdad =false;
        if(this.edad >=18){
            mayorDeEdad =true;
        }
        return mayorDeEdad;
    }
    public boolean comprobarSexo(String sexoIn){
        boolean sexoVerdadero= false;
        if(this.sexo.equals(sexoIn.toUpperCase())){
            sexoVerdadero = true;
        }
        return sexoVerdadero;
    }
    public void generarDNI(){
        Random rd = new Random();
        int aux =0;
        for(int i=0; i<8;i++){
            aux =(aux*10) + rd.nextInt(9);
        }
        this.dni.setNumero(aux);
        this.dni.calculaDni();
    }

    @Override
    public String toString() {
        return "Persona:" +
                "\n" + dni +
                "\npeso=" + peso +
                "\naltura=" + altura +
                "\nimc=" + imc +
                "\nedad=" + edad +
                "\nsexo=" + sexo;
    }
}
