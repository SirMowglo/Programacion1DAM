package Herencias.Ajedrez;

public class Torre extends Figura{
    public Torre(boolean isWhite) {
        super(isWhite,'T');
    }

    @Override
    public boolean canMove(Tablero tablero, int inicioNum, int inicioLetra, int destinoNum, int destinoLetra) {
        boolean res =true;
        return res;
    }
}
