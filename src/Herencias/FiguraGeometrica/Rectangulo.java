package Herencias.FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    //===================================CONSTRUCTOR=======================================
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    //=================================GETTER Y SETTER=====================================
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    //====================================METHODS==========================================
    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    @Override
    public double area() {
        double area;
        area= base*altura;
        return area;
    }

    @Override
    public double perimetro() {
        double perimetro;
        perimetro = base*2 + altura*2;
        return perimetro;
    }
}
