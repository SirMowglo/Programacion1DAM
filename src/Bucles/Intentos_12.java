package Bucles;
import java.util.Random;
import java.util.Scanner;

public class Intentos_12 {
    //se genera un numero aleatorio entre el 1 y el 9. El usuario tiene que adivinar ese numero. Tiene 3 intentos y si no acierta tiene que decir si el numero es mayor o menor
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numAleatorio =1+ random.nextInt(9);
        int numIntentos = 3;
        System.out.println(numAleatorio);

        do{
            System.out.println("Que numero estoy pensando? (del 1 al 9)");
            int intento = sc.nextInt();

            if(numAleatorio < intento){
                System.out.println("Tu numero es mayor al mio");
            }else if (numAleatorio> intento){
                System.out.println("Tu numero es menor al mio");
            }else{
                System.out.println("Has acertado!");
                numIntentos = 0;
            }
            numIntentos--;
        }while(numIntentos>0);

        if(numIntentos == 0){
            System.out.println("Te has quedado sin intentos");
        }





    }
}
