package Herencias.Ajedrez;

public class Alfil extends Figura{
    public Alfil(boolean isWhite) {
        super(isWhite, 'A');
    }

    @Override
    public boolean canMove(Casilla start, Casilla end) {
        boolean res =true;
        return res;
    }
}
