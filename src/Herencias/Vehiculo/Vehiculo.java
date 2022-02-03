package Herencias.Vehiculo;

public class Vehiculo {
    protected int nruedas;
    protected int npuertas;
    protected int nasientos;

    //========================================CONSTRUCTOR==============================================

    public Vehiculo() {
        this.nruedas = 0;
        this.npuertas = 0;
        this.nasientos = 0;
    }

    public Vehiculo(int nruedas, int npuertas, int nasientos) {
        this.nruedas = nruedas;
        this.npuertas = npuertas;
        this.nasientos = nasientos;
    }
    //=========================================METHODS=================================================
    public void pitar(){
        System.out.println("pitaso");
    }
}
