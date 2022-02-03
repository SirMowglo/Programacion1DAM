package Arrays;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Loteria_15 {
    public static void main(String[] args) {
        //Se introducen dos boletos de la loteria, uno el ganador y otro el del usuario, y ve si ha ganado
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] numGanador = new int[6];
        int numUser[] = new int[6];
        int numerosAcertados = 0;

        //Rellena el boleto ganador
        for(int pos = 0; pos<numGanador.length; pos++){
            numGanador[pos] = rand.nextInt(10);

        }
        //Rellena el boleto del usuario
        for(int pos = 0; pos<numUser.length; pos++){
            System.out.println("Introduce el valor de tu boleto en la posicion " + (pos+1));
            numUser[pos] = sc.nextInt();
        }
        //Comparacion de los boletos
        for(int pos =0; pos<numGanador.length; pos++){
            if(numGanador[pos] == numUser[pos]){
                numerosAcertados++;
            }
        }
        //Imprime el numero de aciertos y los dos boletos
        System.out.println("El numero ganador es: "+ Arrays.toString(numGanador));
        System.out.println("Tu boleto es: "+Arrays.toString(numUser));
        System.out.println("Numero de aciertos total: "+ numerosAcertados);
    }
}
