package Bucles;
import java.util.Scanner;

public class Primos_10 {
    //El usuario da un numero N y devuelve si es primo o no
    //El usuario da un numero N y devuelve cuales numeros son primos desde N hasta 1
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*System.out.println("Introduce un numero");
        int num1 = sc.nextInt();
        int modNum1;

       for(int i=num1-1; i>=1;i--){
            modNum1 = num1%i;
            if((modNum1==0) && !(i==1)){
                System.out.println("No es primo");
                break;
            }else if((modNum1==0) && (i==1)){
                System.out.println("Es primo");
            }
        }*/
        System.out.println("Introduce un numero");
        int num2 = sc.nextInt();
        boolean primoTest=true;

        for(; num2>=1; num2--) {

            for (int i=num2 -1; i>=1; i--){
                int modulo = num2%i;

                if((modulo== 0) && (i>1)){
                    primoTest = false;
                    break;
                }else if(i==0){
                    primoTest = true;
                    break;
                }
            }

            if(primoTest==false){
                System.out.println(num2 + " no es primo");
            }else if(primoTest == true){
                System.out.println(num2 + " es primo");
            }
        }
    }
}
