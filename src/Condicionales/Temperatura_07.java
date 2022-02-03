package Condicionales;
//se importa el scanner dentro del archivo
import java.util.Scanner;

//El usuario va a introducir los grados que hace en grados celsios, y dira si hace frio o no
public class Temperatura_07 {
    public static void main(String[] args) {
        //se crea una variable de scanner para que detecte el teclado
        Scanner sc = new Scanner(System.in);

        //se pregunta al usuario cuantos grados hace, y se mete en una variable su input gracias al scanner
        System.out.println("Cuantos grados hace?");
        double temp = sc.nextDouble();

        //se crean todas las condiciones segun la variable que ha creado el usuario con su input
        if (temp < 10) {
            System.out.println("Eu toi passando moito fresquinho");
        } else if ((temp >= 10) && (temp < 20))
        {
            System.out.println("Nao e tao frio assim");
        } else if ((temp >= 20) && (temp < 30))
        {
            System.out.println("E uma temperatura tremendissima");
        } else
        {
            System.out.println("Que putisimo calor illo");
        }
    }
}
