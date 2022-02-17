package Excepciones.Ejercicio3;

public class ExcepcionPersona {
    public void comprobarEdad(int num) throws ExcepcionGeneral{
        if(num<0){
            throw new ExcepcionGeneral("La edad es menor a 0");
        }
    }
}
