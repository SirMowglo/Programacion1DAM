package Herencias.Animales;

import Herencias.Interfaces.Canario;

public class Main {
    public static void main(String[] args) {
        Koala koala =new Koala("reino","familia", 5);

        koala.emitirSonido();
        koala.morirse();

        Canario canario =new Canario("pollo","Pollardo");
        canario.cantar();
    }
}
