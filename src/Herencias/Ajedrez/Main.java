package Herencias.Ajedrez;

public class Main {
    public static void main(String[] args) {
        Tablero tablerillo = new Tablero();
        System.out.println(tablerillo);
        Partida p1 = new Partida(tablerillo);
        p1.inicializarTablero();
        System.out.println(tablerillo);
    }
}
