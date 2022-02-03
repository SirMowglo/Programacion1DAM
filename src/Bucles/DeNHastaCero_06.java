package Bucles;
import java.util.Scanner;

public class DeNHastaCero_06 {
    public static void main(String[] args) {
        //Hay que imprimir desde un numero N hasta 0 (a la inversa)
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = sc.nextInt();

        if (num > 0) {
            for(;num>=0; num--){
                System.out.println(num);
            }
        }else{
            for(;num<=0; num++){
                System.out.println(num);
            }
        }

    }
}
