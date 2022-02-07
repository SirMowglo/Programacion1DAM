package Herencias.Ajedrez;

public class Torre extends Figura{
    public Torre(boolean isWhite) {
        super(isWhite,'T');
    }

    @Override
    public boolean canMove(Casilla start, Casilla end) {
        boolean res =true;
        return res;
    }
}
