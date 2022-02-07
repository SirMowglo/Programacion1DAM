package Herencias.Ajedrez;

public class Peon extends Figura {
    public Peon(boolean isWhite) {
        super(isWhite,'P');
    }

    @Override
    public boolean canMove(Casilla start, Casilla end) {
        boolean res =true;
        return res;
    }
}
