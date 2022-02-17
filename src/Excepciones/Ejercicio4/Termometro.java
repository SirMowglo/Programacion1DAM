package Excepciones.Ejercicio4;

public class Termometro {
    private double temperatura;

    public Termometro(double temperatura) {
        try{
            ExcepcionTermo.comprobarTemperatura(temperatura);
            this.temperatura = temperatura;
        }catch (ExcepcionGeneral e){
            System.out.println(e);
        }

    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemp(double temp){
        try{
            ExcepcionTermo.comprobarTemperatura(temp);
        }catch (ExcepcionGeneral e){
            System.out.println(e);
        }
        this.temperatura = temp;
    }

}
