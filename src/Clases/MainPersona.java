package Clases;

public class MainPersona {
    public static void main(String[] args) {

        Persona enrique = new Persona("Enrique","Casanova", 34,"27729389K");
        Dado dado = new Dado(6);
        dado.tirar();
        System.out.println(dado.getValor());
        System.out.println();
    }
}
