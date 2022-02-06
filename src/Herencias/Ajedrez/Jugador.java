package Herencias.Ajedrez;

public class Jugador {
    //TODO -Declaracion de movimientos
    private boolean isWhite;
    //=====================================CONSTRUCTOR==========================================
    public Jugador(boolean isWhite) {
        this.isWhite = isWhite;
    }

    //====================================GETTER Y SETTER======================================
    public boolean isWhite() {
        return isWhite;
    }
    public void setWhite(boolean white) {
        isWhite = white;
    }
}
