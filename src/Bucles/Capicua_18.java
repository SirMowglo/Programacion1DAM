package Bucles;
import java.util.Scanner;

public class Capicua_18 {
    public static void main(String[] args) {
        //Introduce un numero y te dice si es o no capicua

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        int numCopia =num;
        int inverso = 0;
        int modulo;

        while(numCopia!=0){
            modulo = numCopia%10;
            numCopia = numCopia/10;
            inverso = inverso*10 +modulo;
        }
        if(inverso==num){
            System.out.println(num +" es capicua");
        }else{
            System.out.println(num +" no es capicua");
        }
    }
}
