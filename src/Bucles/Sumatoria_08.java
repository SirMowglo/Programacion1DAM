package Bucles;
import java.util.Scanner;

public class Sumatoria_08 {
    public static void main(String[] args) {
        //el usuario introduce un numero y se realiza una sumatoria hasta el 1

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        int resultSum= 0;
        double resultFact =1;

        for(;num>=1;num--){
            resultSum = resultSum + num;
            resultFact= resultFact * num;

            if(num ==1){
                System.out.println("El sumatorio es: "+resultSum);
                System.out.println("El factorial es: "+resultFact);
            }
        }
    }
}
