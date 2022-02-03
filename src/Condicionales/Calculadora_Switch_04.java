package Condicionales;
import java.util.Scanner;

public class Calculadora_Switch_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //El usuario introduce un par de numeros, y otro numero para decidir que operacio. Ademas se declara la variable que almacenara el resultado
        System.out.println("introduce un numero entero");
        int num1 = sc.nextInt();
        System.out.println("introduce otro numero entero");
        int num2 = sc.nextInt();
        System.out.println("Introduce uno de los siguientes numeros, segun la operacion que quieras realizar \nSumar = 1 \nRestar = 2 \nMultiplicar = 3\nDividir = 4");
        int op = sc.nextInt();
        int result;

        //decide que operacion usar, segun el valor de la operacion op. Cada caso define el valor que tendria que tener op
        switch(op){
            case 1:
                result = num1 + num2;
                System.out.println("Tu resultado es: " + result);
                break; //Todos los casos deben de cerrarse con break

            case 2:
                result = num1 - num2;
                System.out.println("Tu resultado es: " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("Tu resultado es: " + result);
                break;

            case 4:
                result = num1 / num2;
                System.out.println("Tu resultado es: " + result);
                break;

            default:System.out.println("Tu operacion no es valida");
            break;
        }
    }
}
