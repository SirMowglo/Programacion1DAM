package Herencias.Ajedrez;

public class Partida {
    //TODO -Iniciar partida (poner todas las fichas y tal
    // -Crear turnos (aceptando movimientos)

    private Jugador jugador1;
    private Jugador jugador2;
    private Tablero tablero;
    private boolean isWhiteTurn;
    private boolean isEnd;

    //=====================================CONSTRUCTOR=====================================
    public Partida(Jugador jugador1, Jugador jugador2, Tablero tablero) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.tablero = tablero;

        this.isEnd = false;
        this.isWhiteTurn = true;
    }

    //=======================================GETTERS========================================
    public Jugador getJugador1() {
        return jugador1;
    }
    public Jugador getJugador2() {
        return jugador2;
    }
    public Tablero getTablero() {
        return tablero;
    }
    public boolean isWhiteTurn() {
        return isWhiteTurn;
    }
    public boolean isEnd() {
        return isEnd;
    }

}
