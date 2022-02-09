package Herencias.Ajedrez;

public class Reina extends Figura{
    public Reina(boolean isWhite) {
        super(isWhite,'Q');
    }

    @Override
    public boolean canMove(Tablero tablero, int inicioNum, int inicioLetra, int destinoNum, int destinoLetra) {
        boolean res =true;
        return res;
    }
}
