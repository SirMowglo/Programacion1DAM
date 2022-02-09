package Herencias.Ajedrez;

public abstract class Figura {
    //TODO -Comprobacion de movimiento de cada figura metiendole por parametro dos posiciones
    private boolean isWhite;
    private boolean isAlive;
    private char representacion;

    //===================================CONSTRUCTOR=========================================
    public Figura(boolean isWhite,char representacion) {
        this.isWhite = isWhite;
        this.representacion =representacion;
        this.isAlive=true;
    }

    //=================================GETTER Y SETTER=======================================
    public Boolean getWhite() {
        return isWhite;
    }
    public void setWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public char getRepresentacion() {
        return representacion;
    }

    public boolean isAlive() {
        return isAlive;
    }
    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    //=====================================METHODS===========================================
    public abstract boolean canMove(Tablero tablero, int inicioNum, int inicioLetra, int destinoNum, int destinoLetra);
    public void morir(){
        this.isAlive = false;
    }

    @Override
    public String toString() {
        return this.representacion +"";
    }
}
