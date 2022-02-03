package Condicionales;
import java.util.Scanner;

public class Numero_Mayor_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Esto recoge los inputs del usuario para determinar los numeros en cuestion
        System.out.println("Introduce un numero entero");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro numero entero diferente");
        int num2 = sc.nextInt();

        //Esto marca la condicional de que en caso de que num1 sea mayor, te imprime que es el mayor, o en caso contrario imprime que num2 es el mayorsq
        if(num1 >= num2){
            System.out.println(num1 + " es el numero mayor");
        }else{
            System.out.println(num2 + " es el numero mayor");
        }
    }
}
