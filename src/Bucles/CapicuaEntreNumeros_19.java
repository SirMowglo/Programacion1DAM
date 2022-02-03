package Bucles;
import java.util.Scanner;

public class CapicuaEntreNumeros_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        System.out.println("Introduce otro numero");
        int num2 = sc.nextInt();

        int numAux;
        int inverso;
        int modulo;

        if(num<num2) {
            for (int i = num; i < num2; i++) {
                numAux = i;
                inverso = 0;
                while (numAux != 0) {
                    modulo = numAux % 10;
                    numAux = numAux / 10;
                    inverso = inverso * 10 + modulo;
                }
                if (inverso == i) {
                    System.out.println(i + " es capicua");
                }
            }
        }else if(num2<num){
            for (int i = num2; i < num; i++) {
                numAux = i;
                inverso = 0;
                while (numAux != 0) {
                    modulo = numAux % 10;
                    numAux = numAux / 10;
                    inverso = inverso * 10 + modulo;
                }
                if (inverso == i) {
                    System.out.println(i + " es capicua");
                }
            }
        }
    }
}
