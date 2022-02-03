package Herencias.Ajedrez;

public class CasillaOcupada extends Casilla {
    private Figura pieza;

    //=========================================CONSTRUCTOR====================================================
    public CasillaOcupada(int letra, int num, Figura pieza) {
        super(letra, num);
        this.pieza = pieza;
    }

    //=======================================GETTER Y SETTER==================================================

    public Figura getPieza() {
        return pieza;
    }

    public void setPieza(Figura pieza) {
        this.pieza = pieza;
    }

    //===========================================METHODS======================================================
    @Override
    public String toString() {
        String res="";
        res="|" +color+ letra + num + pieza+"|";
        return res;
    }
}
