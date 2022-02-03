package Bucles;
import java.util.Scanner;

public class Media_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num; //numero que mete el usuario
        int resultSum = 0; //resultado de todas las sumas
        int count =0; //cuenta de todos los bucles que pasan para hacer la media
        double finalResult; //resultado de la media (no es necesario crear la variable, pero por tener los resultados de la suma aparte, y no tener la necesidad de dejarlo en double

        //El programa se ejecuta la primera vez, dandole un valor al primer numero.
        do{
            System.out.println("Introduce un numero (si es negativo el programa se termina)");
            num = sc.nextInt();
            //Si el numero es + que cero, este sumara un contador, y se sumara al groso de todos los numeros
            if(num>=0){
                count++;
                resultSum = resultSum + num;
            }else{ //en caso contrario, se creara la media, y se terminara el bucle (excluyendo gracias al if al numero negativo que se introduzca, y sin sumar ese paso por el contador)
                finalResult = (double) resultSum/count;
                System.out.println("La media de todos tus numeros es: " + finalResult);
            }
        }while(num>=0);
    }
}
