package Herencias.Ajedrez;

public class Peon extends Figura {
    public Peon(boolean isWhite) {
        super(isWhite,'P');
    }

    @Override
    public boolean canMove(Tablero tablero, int inicioNum, int inicioLetra, int destinoNum, int destinoLetra) {
        boolean res =true;
        return res;
    }
}
