package Condicionales;
import java.util.Scanner;

public class Calculadora_03 {
    public static void main(String[] args) {
        //Crear una calculadora, que te pida dos numero, y que cuando introduzcas 1,2,3 o 4 sumara, restara, multiplicara o dividira
        Scanner sc = new Scanner (System.in);

        //El usuario introduce un par de numeros, y otro numero para decidir que operacio. Ademas se declara la variable que almacenara el resultado
        System.out.println("introduce un numero entero");
        int num1 = sc.nextInt();
        System.out.println("introduce otro numero entero");
        int num2 = sc.nextInt();
        System.out.println("Introduce uno de los siguientes numeros, segun la operacion que quieras realizar \nSumar = 1 \nRestar = 2 \nMultiplicar = 3\nDividir = 4");
        int op = sc.nextInt();
        int result;

        //Marca cada opcion posible para la operacion, y resuelve correspondientemente dando resultado a result
        if (op == 1){
            result = num1 + num2;
            System.out.println("Tu resultado es: " + result);
        }else if(op == 2){
            result = num1 - num2;
            System.out.println("Tu resultado es: " + result);
        }else if(op == 3){
            result = num1 * num2;
            System.out.println("Tu resultado es: " + result);
        }else if(op == 4){
            result = num1 / num2;
            System.out.println("Tu resultado es: " + result);
        }else{
            System.out.println("Tu operacion no es valida");
        }
    }
}
