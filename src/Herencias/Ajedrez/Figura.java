package Herencias.Ajedrez;

public abstract class Figura {
    private String color;
    private boolean isAlive;
    private char representacion;

    public Figura(String color,char representacion) {
        this.color = color;
        this.representacion =representacion;
        this.isAlive=true;
    }

    //=================================GETTER Y SETTER=======================================
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
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
    public abstract void mover();
    public void morir(){
        this.isAlive = false;
    }

    @Override
    public String toString() {
        return this.representacion +"";
    }
}
