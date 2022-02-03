package Bucles;
import java.util.Scanner;

public class VueltaNumero_17 {
    public static void main(String[] args) {
        //Introduce un numero de varias cifras y le da la vuelta EJ 32516 -- 61523
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero largo");
        int num = sc.nextInt();
        int inverso = 0;
        int modulo;

        do {
            modulo= num%10;
            num = num/10;
            inverso = inverso*10 +modulo;
        }while(num!=0);

        System.out.println(inverso);
    }
}
