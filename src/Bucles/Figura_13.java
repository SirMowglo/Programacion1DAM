package Bucles;

import java.sql.SQLOutput;

public class Figura_13 {
    public static void main(String[] args) {
        //el programa solo imprime *, e imprime la figura de una S

        for(int estado =1; estado<=5; estado++){
            for(int veces =1; veces <=6; veces++){
                if((estado == 1) || (estado ==3) ||( estado ==5)){
                    System.out.print("*");
                    if (veces ==6){
                        System.out.print("\n");
                    }
                }else if((estado ==2)&& (veces<=2)){
                    System.out.println("*");
                }else if((estado ==4)&& (veces<=2)){
                    System.out.println("     " + "*");
                }
            }

        }
    }
}
