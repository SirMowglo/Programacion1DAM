package Arrays;
import java.util.Scanner;

public class Invertir_02 {
    public static void main(String[] args) {
        //Pedir al usuario cuantos numeros va a tener el array, e invertira las posiciones

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int nPos=sc.nextInt();
        int[] numA = new int[nPos];
        int num = 1;

        for(int i = nPos-1; i>=0; i--){
            numA[i] = num++;
        }

        for(int i =0; i<nPos;i++){
            System.out.println(numA[i]);
        }
    }
}
