package Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Butacas_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //Creacion de las variables que se usaran
        boolean sillas[][] = new boolean[14][12];
        boolean quiereCompra = true;
        String respuestaCompra;
        int columna;
        int fila;

        //Rellena la posicion de cada silla con verdadero o falso
        for (int pos = 0; pos<sillas.length; pos++){
            for(int pos2 = 0; pos2<sillas[pos].length; pos2++){
                sillas[pos][pos2] = rand.nextBoolean();
                if(pos2 == 5 || pos2 == 6){
                    sillas[pos][pos2]=true;
                }
            }
        }


        System.out.println(Arrays.deepToString(sillas)); //Impresion para comprobar que sillas estan vacias y cuales no
        do{
            //Pregunta al usuario si quiere comprar asiento o no
            System.out.println("Quieres comprar un asiento?");
            respuestaCompra = sc.next();
            if(respuestaCompra.charAt(0)== 's' || respuestaCompra.charAt(0)== 'S'){
                quiereCompra = true;
            }else{
                quiereCompra = false;
            }

            //Pide al usuario que introduzca la posicion de la butaca que quiere
            System.out.println("Que butaca quieres comprar? Introduce columna y fila (desde columna 0 a 13, y fila 0 a 11");
            columna = sc.nextInt();
            fila = sc.nextInt();

            //Te dice si la butaca esta ocupada o si esta disponible
            if(sillas[columna][fila] == true){
                System.out.println(sillas[columna][fila]);
                System.out.println("Esa silla esta ocupada, vuelve a intentarlo.");
            }else if(sillas[columna][fila] == false){
                System.out.println(sillas[columna][fila]);
                System.out.println("Tu asiento ha sido comprado ;)");
                quiereCompra = false;
            }
        }while(quiereCompra == true);

    }
}
