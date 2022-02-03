package Clases.Triangulo;

//Metodo para perimetro
//Metodo para area
//Metodo booleano equilatero,isosceles, escaleno

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    private double area;
    private double perimetro;

    private boolean isEquilatero= false;
    private boolean isIsosceles= false;
    private boolean isEscaleno= false;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double perimetro(){
        this.perimetro=this.lado1 +this.lado2+this.lado3;
        return this.perimetro;
    }
    public double area(){
        this.perimetro();
        this.area= Math.sqrt((perimetro/2)*(((perimetro/2)-lado1)*((perimetro/2)-lado2)*((perimetro/2)-lado3)));
        return this.area;
    }
    public boolean isEquilatero(){
        if(lado1==lado2&& lado2==lado3){
            isEquilatero=true;
        }
        return this.isEquilatero;
    }

    public boolean isEscaleno() {
        if(lado1!=lado2&& lado2!=lado3){
            isEscaleno=true;
        }
        return isEscaleno;
    }

    public boolean isIsosceles() {
        if((lado1==lado2 && lado2!=lado3)||(lado2==lado3 && lado1!=lado2)||(lado1==lado3 && lado3!=lado2)){
            isIsosceles=true;
        }
        return isIsosceles;
    }
}
