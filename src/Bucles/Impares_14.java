package Bucles;
import java.util.Scanner;

public class Impares_14 {
    public static void main(String[] args) {
        //Introduce dos numeros, y te imprime los numeros impares entre ellos
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce tu segundo numero");
        int num2 = sc.nextInt();

        if (num1 < num2) {
            for (; num1 < num2; num1++) {
                if (!(num1 % 2 == 0)) {
                    System.out.println(num1 + " es impar");
                }
            }
        } else {
            for (; num2 < num1; num2++) {
                if (!(num2 % 2 == 0)) {
                    System.out.println(num2 + " es impar");
                }
            }
        }
    }
}
