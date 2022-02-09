package Herencias.Ajedrez;

public class Caballo extends Figura{
    public Caballo(boolean isWhite) {
        super(isWhite,'C');
    }

    @Override
    public boolean canMove(Tablero tablero, int inicioNum, int inicioLetra, int destinoNum, int destinoLetra) {
        boolean res =true;
        return res;
    }
}
