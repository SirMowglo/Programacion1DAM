package Clases.Fraccion;

public class Fraccion {
    private double numerador;
    private double denominador;
    private double result;
    //==========================================CONSTRUCTOR================================================
    public Fraccion(double numerador, double denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    //========================================GETTER Y SETTER==============================================
    public double getNumerador() {
        return numerador;
    }
    public void setNumerador(double numerador) {
        this.numerador = numerador;
        this.calculaResult();
    }

    public double getDenominador() {
        return denominador;
    }
    public void setDenominador(double denominador) {
        this.denominador = denominador;
        this.calculaResult();
    }
    public double getResult() {
        return result;
    }
    //==========================================METHODS=====================================================
    public void calculaResult(){
        this.result = this.numerador/this.denominador;
    }
    public Fraccion sum(Fraccion fraccion2){
        double numerador3= ((this.numerador*fraccion2.denominador) + (fraccion2.numerador* this.denominador));
        double denominador3 = (this.denominador * fraccion2.denominador);
        Fraccion fraccion3 = new Fraccion(numerador3,denominador3);
        fraccion3.calculaResult();
        return fraccion3;
    }
    public Fraccion rest(Fraccion fraccion2){
        double numerador3 = ((this.numerador*fraccion2.denominador) - (fraccion2.numerador* this.denominador));
        double denominador3 = (this.denominador * fraccion2.denominador);
        Fraccion fraccion3 = new Fraccion(numerador3,denominador3);
        fraccion3.calculaResult();
        return fraccion3;
    }
    public Fraccion div(Fraccion fraccion2){
        double numerador3 = (this.numerador * fraccion2.denominador);
        double denominador3= (this.denominador * fraccion2.numerador);
        Fraccion fraccion3 = new Fraccion(numerador3,denominador3);
        fraccion3.calculaResult();
        return fraccion3;
    }
    public Fraccion mult(Fraccion fraccion2){
        double numerador3 = (this.numerador * fraccion2.numerador);
        double denominador3 = (this.denominador * fraccion2.denominador);
        Fraccion fraccion3 = new Fraccion(numerador3,denominador3);
        fraccion3.calculaResult();
        return fraccion3;
    }

    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }
}
