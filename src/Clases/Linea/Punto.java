package Clases.Linea;

import java.awt.*;

public class Punto {
    private double coordX;
    private double coordY;
    //==================================CONSTRUCTOR=================================
    public Punto() {
        this.coordX =0;
        this.coordY =0;
    }

    public Punto(double coordX) {
        this.coordX = coordX;
    }

    public Punto(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }
    //================================GETTER Y SETTER=================================

    public double getCoordX() {
        return coordX;
    }
    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }
    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    //===================================METHODS======================================
    public void displaceX(double amount){
        this.coordX += amount;
    }
    public void displaceY(double amount){
        this.coordY += amount;
    }
    public void displaceCoord(double amount){
        this.coordX += amount;
        this.coordY += amount;
    }
    public void displaceCoord(double amountX,double amountY){
        this.coordX += amountX;
        this.coordY += amountY;
    }

    @Override
    public String toString() {
        return "("+coordX+","+coordY+")";
    }
}
