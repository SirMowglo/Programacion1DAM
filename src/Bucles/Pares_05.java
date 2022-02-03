package Bucles;
import java.util.Scanner;

public class Pares_05 {
    //Se le pide al usuario 2 numeros, y tiene que imprimir en pantalla todos los pares entre esos dos numero
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Se introducen los dos numeros que el usuario tiene que introducir
        System.out.println("Introduce tu primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce tu segundo numero");
        int num2 = sc.nextInt();

        //Aqui se comprueba cual es el numero menor de los que ha introducido el usuario
        if(num1 < num2){
            //En este caso si num1 es menor, se usara este como la variable para el for, y el limite/condicion del bucle sera cuando alcance el otro numero
            for(int i=num1;i<=num2; i++){
                //Aqui hacemos que solo imprima si se cumple la condicion de que sea par el numero
                if((i%2) ==0){
                    System.out.println(i);
                }
            }
        }else if(num2 < num1){
            //En este caso si num2 es menor, se usara este como la variable para el for, y el limite/condicion del bucle sera cuando alcance el otro numero
            for(int i=num2;i<=num1; i++){
                //Aqui hacemos que solo imprima si se cumple la condicion de que sea par el numero
                if((i%2) ==0){
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("O tus numeros son iguales, o esto esta mal colega");
        }
    }
}
