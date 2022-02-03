package Herencias.Animales;

public abstract class Animales {
    private String reino;
    private String familia;

    //CONSTRUCTOR
    public Animales(String reino, String familia) {
        this.reino = reino;
        this.familia = familia;
    }

    //GETTER Y SETTER
    public String getReino() {
        return reino;
    }
    public void setReino(String reino) {
        this.reino = reino;
    }
    public String getFamilia() {
        return familia;
    }
    public void setFamilia(String familia) {
        this.familia = familia;
    }

    //METHODS
    public abstract void emitirSonido();
    public void morirse(){
        System.out.println("me he muerto :(");
    }
}
