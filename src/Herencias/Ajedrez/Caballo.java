package Herencias.Ajedrez;

public class Caballo extends Figura{
    public Caballo(boolean isWhite) {
        super(isWhite,'C');
    }

    @Override
    public boolean canMove(Casilla start, Casilla end) {
        boolean res =true;
        return res;
    }
}
