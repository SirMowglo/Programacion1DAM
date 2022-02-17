package Prueba2.Ejercicio2;

import java.util.Random;

public class Galisteo extends Profesor{
    //==============================CONSTRUCTOR====================================
    public Galisteo() {
        super("Antonio Galisteo Galistei", 386, "Entornos, o eso creo");
    }

    //================================METHODS======================================
    @Override
    public String fraseCaracteristica() {
        return "Hoy no he podido porque tenia prisa, pero para el proximo dia compro churros";
    }

    @Override
    public String horaDeLlegada(String dia) {
        String res ="";
        if(dia.equals("Miercoles")){
            res = "9:15";
        }else if(dia.equals("Jueves")){
            res = "12:30";
        }else{
            res = "*Fue a por churros*";
        }
        return res;
    }

    @Override
    public boolean descansito() {
        boolean hayChurros=false;
        boolean res =false;
        Random rand =new Random();
        int posibilidad = 95;
        int posibilidadChurros= 20;

        //Calculamos la posibilidad de que haya churros
        if(posibilidadChurros>= rand.nextInt(100)){
            hayChurros = true;
        }
        //Si hay churros o es posible sera true
        if(posibilidad>= rand.nextInt(100) || hayChurros){
            res=true;
        }
        return res;
    }
}
