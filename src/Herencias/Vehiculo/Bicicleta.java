package Herencias.Vehiculo;

public class Bicicleta extends Vehiculo {
    private int nfrenos;
    private int nsillines;
    private int nmanillares;

    public Bicicleta() {
        super();
        this.nfrenos =0;
        this.nsillines =0;
        this.nmanillares =0;
    }

    public Bicicleta(int nruedas, int npuertas, int nasientos, int nfrenos, int nsillines, int nmanillares) {
        super(nruedas,npuertas,nasientos);
        this.nfrenos = nfrenos;
        this.nsillines = nsillines;
        this.nmanillares = nmanillares;
    }

    @Override
    public void pitar(){
        super.pitar();
        System.out.println("bicicleta");
    }
    @Override
    public String toString() {
        return "Soy una bici y tengo " + this.nsillines + " sillines y tambien " + this.nruedas + "lmao";
    }
}
