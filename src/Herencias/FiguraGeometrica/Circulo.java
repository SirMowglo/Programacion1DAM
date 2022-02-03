package Herencias.FiguraGeometrica;

public class Circulo extends FiguraGeometrica{
    private double radio;

    //=====================================CONSTRUCTOR=======================================
    public Circulo(double radio) {
        this.radio = radio;
    }

    //===================================GETTER Y SETTER=====================================
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    //=======================================METHODS==========================================

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

    @Override
    public double area() {
        double area;
        area=radio * radio * Math.PI;
        return area;
    }
    @Override
    public double perimetro() {
        double perimetro;
        perimetro =2* Math.PI*radio;
        return perimetro;
    }
}
