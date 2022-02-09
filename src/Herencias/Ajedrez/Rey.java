package Herencias.Ajedrez;

public class Rey extends Figura{
    public Rey(boolean isWhite) {
        super(isWhite,'K');
    }

    @Override
    public boolean canMove(Tablero tablero, int inicioNum, int inicioLetra, int destinoNum, int destinoLetra) {
        boolean res =true;
        return res;
    }
}
