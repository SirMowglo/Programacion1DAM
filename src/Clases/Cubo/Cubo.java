package Clases.Cubo;
import java.util.Random;

//Los atributos van a ser los que consideremos
//Los gets y sets seran los que consideremos
//Metodos: Llenar, beber y vaciar

public class Cubo {
    private Random rand = new Random();
    private final int capacidadMax = 10;
    private int cantidadActual =0;
    private int hielo;
    private String bebidaActual;
    //===============================CONSTRUCTOR====================================
    public Cubo(String bebidaActual, int hielo) {
        this.cantidadActual = capacidadMax;
        this.hielo = hielo;
        this.bebidaActual = bebidaActual;
    }
    //=============================GETTER Y SETTER==================================
    //CAPACIDAD ACTUAL
    public int getCantidadActual() {
        return cantidadActual;
    }
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    //BEBIDA ACTUAL
    public String getBebidaActual() {
        return bebidaActual;
    }
    public void setBebidaActual(String bebidaActual) {
        this.bebidaActual = bebidaActual;
    }
    //===================================METODOS=====================================

    public void llenar(String bebida){
        cantidadActual = capacidadMax;
        if(cantidadActual ==0){
            bebidaActual = bebida;
        }
    }

    public void beber(){
        cantidadActual -= rand.nextInt(5-2)+2;
        if(cantidadActual <0){
            cantidadActual =0;
        }
    }

    public void vaciar(){
        cantidadActual =0;
        bebidaActual = "Vacio";
    }

    @Override
    public String toString() {
        return "Cubo:" +
                "\nCantidad maxima = " + capacidadMax +
                "\nCantidad actual = " + cantidadActual +
                "\nNumero de hielos = " + hielo +
                "\nBebida actual = '" + bebidaActual + '\'';
    }
}
