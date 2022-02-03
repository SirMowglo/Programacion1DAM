package Clases;
import java.util.Random;
public class Dado {
    //=========================================VARIABLES=========================================
    private int ncaras;
    private int valor;
    Random rand = new Random();

    //CONSTRUCTOR
    public Dado(int ncaras) {
        this.ncaras = ncaras;
    }

    //==========================================METODOS==========================================
    //GETTER
    public int getNcaras() {
        return ncaras;
    }
    public int getValor() {
        return valor;
    }

    //SETTER
    public void setNcaras(int ncarasUser) {
        this.ncaras = ncarasUser;
    }

    //Tirada
    public void tirar(){
        valor = rand.nextInt(ncaras)+1;
    }
}
