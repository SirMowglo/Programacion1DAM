package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class MultiplicarArrays_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica el numero de columnas y filas");
        int fyc = sc.nextInt();

        int arraymulti1[][] = new int[fyc][fyc];
        int arraymulti2[][] = new int[fyc][fyc];
        int arrayMultiplicacion[][] = new int[fyc][fyc];

        for(int pos =0; pos<arraymulti1.length; pos++){
            for(int pos2 = 0; pos2<arraymulti1[pos].length; pos2++){
                System.out.println("Introduce valor para tu array 1");
                arraymulti1[pos][pos2] = sc.nextInt();
            }
        }
        for(int pos =0; pos<arraymulti2.length; pos++){
            for(int pos2 = 0; pos2<arraymulti2[pos].length; pos2++){
                System.out.println("Introduce valor para tu array 2");
                arraymulti2[pos][pos2] = sc.nextInt();
            }
        }
        for(int pos =0; pos<arrayMultiplicacion.length; pos++){
            for(int pos2 = 0; pos2<arrayMultiplicacion[pos].length; pos2++){
                arrayMultiplicacion[pos][pos2] = arraymulti1[pos2][pos] * arraymulti2[pos][pos2];
            }
        }
        System.out.println(Arrays.deepToString(arrayMultiplicacion));

    }
}
