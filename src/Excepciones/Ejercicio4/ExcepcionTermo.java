package Excepciones.Ejercicio4;

public class ExcepcionTermo {
    public static void comprobarTemperatura(double temp) throws ExcepcionGeneral{
        if(temp<0 || temp >100){
            throw new ExcepcionGeneral("La temperatura esta fuera del rango");
        }
    }
}
