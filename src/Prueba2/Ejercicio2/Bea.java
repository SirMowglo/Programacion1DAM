package Prueba2.Ejercicio2;

import java.util.Random;

public class Bea extends Profesor {
    //==============================CONSTRUCTOR====================================
    public Bea() {
        super("Sara", 26, "Lenguaje de Marcas");
    }

    //================================METHODS======================================
    @Override
    public String fraseCaracteristica() {
        return "Niiiiiños portense bien :c";
    }

    @Override
    public String horaDeLlegada(String dia) {
        String res ="";
        if(dia.equals("Lunes") ||dia.equals("Martes")){
            res = "13:00";
        }else{
            res = "k dise tio XD";
        }
        return res;
    }

    @Override
    public boolean descansito() {
        boolean res =false;
        Random rand =new Random();
        int posibilidad = 20;
        //Si se dan las posibilidades es verdadero
        if(posibilidad>= rand.nextInt(100)){
            res=true;
        }
        return res;
    }
}
