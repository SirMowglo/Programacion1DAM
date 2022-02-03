package Arrays;
import java.util.Scanner;

public class CaidaObjetos_14 {
    public static void main(String[] args) {
        //El usuario introduce unas velocidades segun cada objeto, y te los ordena
        Scanner sc = new Scanner(System.in);
        int velocidades[] = new int[5];
        int numeroIni = 0;
        //RELLENO DEL ARRAY
        for(int pos =0; pos<5; pos++){
            System.out.println("Introduce la velocidad numero " + (pos+1));
            velocidades[pos] = sc.nextInt();
                numeroIni = velocidades[0];
            }

        //RESTA DEL NUMERO INICIAL
        for(int pos = 0; pos<5; pos++){
            velocidades[pos] -= numeroIni;
        }
        //IMPRESION DEL ARRAY
        for(int pos =0; pos<5; pos++){
            System.out.println(velocidades[pos]);
        }
    }
}
