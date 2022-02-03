package Herencias.Animales;

public class Koala extends Animales{
    private int nhijos;

    public Koala(String reino, String familia, int nhijos) {
        super(reino, familia);
        this.nhijos = nhijos;
    }
    @Override
    public void emitirSonido(){
        System.out.println("Sonido du Koala");
    }
}
