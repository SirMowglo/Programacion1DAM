package Herencias.Ajedrez;

public class Rey extends Figura{
    public Rey(boolean isWhite) {
        super(isWhite,'K');
    }

    @Override
    public boolean canMove(Casilla start, Casilla end) {
        boolean res =true;
        return res;
    }
}
