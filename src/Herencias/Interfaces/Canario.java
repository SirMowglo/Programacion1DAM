package Herencias.Interfaces;

public class Canario extends Animales implements Cantante{

    public Canario(String reino, String familia) {
        super(reino, familia);
    }

    @Override
    public void emitirSonido() {
        System.out.println("De locos");
    }

    @Override
    public void cantar() {
        System.out.println("CUANDO SARPA EL AMOR NAVEGA ACIEGAS ES QUIEN LLEVA EL TIMON");
    }
}
