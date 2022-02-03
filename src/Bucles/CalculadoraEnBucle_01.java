package Bucles;
import java.util.Scanner;

public class CalculadoraEnBucle_01 {
    public static void main(String[] args) {
        //El usuario introduce un par de numeros, y otro numero para decidir que operacio. Ademas se declara la variable que almacenara el resultado
        Scanner sc = new Scanner(System.in);

        System.out.println("quieres usar la calculadora?(si o no)");
        char respuesta = sc.next().charAt(0);
        boolean cond = false;

        if((respuesta == 's') || (respuesta == 'S')){
            cond = true;
        }else if ((respuesta == 'n')|| (respuesta == 'N')){
            cond = false;
        }else{
            System.out.println("Tu respuesta no es valida");
        }


        while(cond == true){
            System.out.println("introduce un numero entero");
            int num1 = sc.nextInt();
            System.out.println("introduce otro numero entero");
            int num2 = sc.nextInt();
            System.out.println("Introduce uno de los siguientes numeros, segun la operacion que quieras realizar \nSumar = 1 \nRestar = 2 \nMultiplicar = 3\nDividir = 4");
            int op = sc.nextInt();
            double result;

            switch(op){
                case 1:
                    result = (double) num1 + num2;
                    System.out.println("Tu resultado es: " + result);
                    break; //Todos los casos deben de cerrarse con break

                case 2:
                    result = (double) num1 - num2;
                    System.out.println("Tu resultado es: " + result);
                    break;

                case 3:
                    result = (double) num1 * num2;
                    System.out.println("Tu resultado es: " + result);
                    break;

                case 4:
                    result = (double) num1 / num2;
                    System.out.println("Tu resultado es: " + result);
                    break;

                default:System.out.println("Tu operacion no es valida");
                    break;
            }
            System.out.println("quieres seguir usando la calculadora?(si o no)");
            respuesta = sc.next().charAt(0);

            if((respuesta == 's') || (respuesta == 'S')){
                cond = true;
            }else if ((respuesta == 'n')|| (respuesta == 'N')){
                cond = false;
            }else{
                System.out.println("Tu respuesta no es valida. El programa se cerrara");
                cond = false;
            }
        }
    }
}
