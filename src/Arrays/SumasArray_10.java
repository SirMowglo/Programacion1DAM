package Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumasArray_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creacion de arrays
        int arraymulti1[][] = new int[2][3];
        for (int pos = 0; pos<arraymulti1.length; pos++){
            for (int pos2 = 0; pos2<arraymulti1[pos].length; pos2++){
                System.out.println("Introduce un valor para tu array 1");
                arraymulti1[pos][pos2]= sc.nextInt();
            }
        }
        int arraymulti2[][] = new int[2][3];
        for (int pos = 0; pos<arraymulti2.length; pos++){
            for (int pos2 = 0; pos2<arraymulti2[pos].length; pos2++){
                System.out.println("Introduce un valor para tu array 2");
                arraymulti2[pos][pos2]= sc.nextInt();
            }
        }

        //Suma de arrays
        int sumaArrays[][] = new int[2][3];
        for (int pos = 0; pos<arraymulti2.length; pos++){
            for (int pos2 = 0; pos2<arraymulti2[pos].length; pos2++){
                sumaArrays[pos][pos2]= arraymulti1[pos][pos2] + arraymulti2[pos][pos2];
            }
        }

        //Impresion de los arrays y del array suma
        System.out.println((Arrays.deepToString(arraymulti1))+ " + " + Arrays.deepToString(arraymulti2) + "=");
        System.out.println(Arrays.deepToString(sumaArrays));

    }
}
