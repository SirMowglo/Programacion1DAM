package Bucles;
import java.util.Scanner;

public class Fibonacci_16 {
    public static void main(String[] args) {
        //introduce un numero y te dice la posicion que tiene en la secuencia de fibonacci (0,1,1,2,3,5,8,13)
        Scanner sc = new Scanner (System.in);

        int fiboNum =1;
        int fiboNum2 =0;
        int fiboAux;

        System.out.println("Introduce un numero");
        int num = sc.nextInt();

        for(int contador = 0; contador <num;contador++){
            if(contador==0){
                System.out.println(fiboNum2);
            }else if(contador ==1){
                System.out.println(fiboNum);
            }else{
                fiboAux=fiboNum;
                fiboNum=fiboNum + fiboNum2;
                fiboNum2 = fiboAux;

                System.out.println(fiboNum);
            }


        }
    }
}
