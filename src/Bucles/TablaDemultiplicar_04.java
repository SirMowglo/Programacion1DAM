package Bucles;
import java.util.Scanner;

public class TablaDemultiplicar_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime para que numero hago la tabla de multiplicar");
        int numTabla = sc.nextInt();

        for(int i=1; i<=10 ; i++){
            System.out.println(numTabla + "*" + i +" = " + (numTabla*i));
        }
    }
}
