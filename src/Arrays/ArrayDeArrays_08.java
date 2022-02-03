package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeArrays_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arraymulti = new int[2][3];
        int contador = 1;

        //Rellena el arraymulti
        for(int pos =0; pos<arraymulti.length ; pos++){
            for(int pos2 = 0; pos2<arraymulti[pos].length; pos2++){
                arraymulti[pos][pos2]= contador++;
            }
        }
        //Imprime el array multi
        for (int pos =0; pos<arraymulti.length; pos++){
            for(int pos2 = 0; pos2< arraymulti[pos].length; pos2++){
                System.out.println(arraymulti[pos][pos2]);
            }
        }
        System.out.println(Arrays.deepToString(arraymulti));

    }
}
