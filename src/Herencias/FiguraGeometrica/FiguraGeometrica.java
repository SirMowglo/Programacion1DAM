package Herencias.FiguraGeometrica;

public abstract class FiguraGeometrica {
    public abstract double area();
    public abstract double perimetro();

    public String comparaArea(FiguraGeometrica figura){
        String res = "";
        if(this.area()> figura.area()){
            res= this +" es mayor";
        }else if( this.area()< figura.area()){
            res=this + " es menor";
        }else{
            res= "Ambas figuras son iguales";
        }
        return res;
    }
}
