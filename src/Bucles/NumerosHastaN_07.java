package Bucles;
import java.util.Scanner;

public class NumerosHastaN_07 {
    //imprimir todos los numeros desde 0 hasta N, N esta dicho por el usuario
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = sc.nextInt();

        for (int i=0; i<=num; i++){
            System.out.println(i);
        }
    }
}
