package Prueba2.Ejercicio2;

import java.util.Random;

public class Enrique extends Profesor{
    //==============================CONSTRUCTOR====================================
    public Enrique() {
        super("Enrique", 5, "Crotolamo");
    }

    //================================METHODS======================================
    @Override
    public String fraseCaracteristica() {
        return "Buenos dias, que tal el dia? *Coge el flisflis*";
    }

    @Override
    public String horaDeLlegada(String dia) {
        String res ="";
        if(dia.equals("Lunes") ||dia.equals("Miercoles")){
            res = "11:00";
        }else if(dia.equals("Jueves")){
            res = "8:30 :c";
        }else{
            res = "k dise tio XD";
        }
        return res;
    }

    @Override
    public boolean descansito() {
        boolean res =false;
        Random rand =new Random();
        int posibilidad = 70;
        //Si se dan las posibilidades es verdadero
        if(posibilidad>= rand.nextInt(100)){
            res=true;
        }
        return res;
    }
}
