package Arrays;
import java.util.Scanner;

public class Buscador_05 {
    public static void main(String[] args) {
        //Introducir un numero y decir si esta en el array o no
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numUser = sc.nextInt();

        int list[] = new int[5];

        //RELLENA EL ARRAY
        for(int pos = 0; pos<5;pos++){
            System.out.println("Introduce el "+ (pos+1) + "º numero del array");
            list[pos]= sc.nextInt();
        }

        //BUSCA EN EL ARRAY PARA VER SI UN ELEMENTO DEL ARRAY ES IGUAL AL NUMERO DADO
        for(int pos = 0; pos<5;pos++){
            if(numUser == list[pos]){
                System.out.println(numUser + " esta dentro del array en la posicion " + (pos+1));
            }else if (pos ==4){
                System.out.println("Tu numero no esta dentro del array");
            }
        }
    }
}
