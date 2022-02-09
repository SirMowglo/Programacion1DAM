package Herencias.Ajedrez;

public class Partida {
    // TODO -Crear turnos (aceptando movimientos)

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

    public Partida(Tablero tablero) {
        this.tablero = tablero;
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
    //========================================METHODS======================================
    public void inicializarTablero(){
        for(int letra = 0; letra<=7;letra++){
            for(int numero=0; numero<=7;numero++){
                if(numero==1){
                    tablero.getTablero().get(numero).set(letra, new CasillaOcupada(letra+1,numero+1,new Peon(true)));
                }
                if(numero==0){
                    if(letra==0 || letra==7){
                        tablero.getTablero().get(numero).set(letra, new CasillaOcupada(letra+1,numero+1,new Torre(true)));
                    }
                    if(letra==1 || letra==6){
                        tablero.getTablero().get(numero).set(letra, new CasillaOcupada(letra+1,numero+1,new Caballo(true)));
                    }
                    if(letra==2 || letra==5){
                        tablero.getTablero().get(numero).set(letra, new CasillaOcupada(letra+1,numero+1,new Alfil(true)));
                    }
                    if(letra==3){
                        tablero.getTablero().get(numero).set(letra, new CasillaOcupada(letra+1,numero+1,new Reina(true)));
                    }
                    if(letra==4){
                        tablero.getTablero().get(numero).set(letra, new CasillaOcupada(letra+1,numero+1,new Rey(true)));
                    }
                }
            }
        }
    }

}
