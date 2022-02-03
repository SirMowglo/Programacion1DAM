package Arrays;
import java.util.Scanner;

public class BorrarElemento_07 {
    public static void main(String[] args) {
        //El usuario introduce una posicion, y borra el elemento que este en esa posicion
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de numeros que tendra el array");
        int tamArray = sc.nextInt();

        //Creacion y relleno del array
        int array[] = new int[tamArray];
        for (int pos = 0; pos<tamArray; pos++){
            System.out.println("Introduce el " + pos + "º numero del array");
            array[pos] = sc.nextInt();
        }

        System.out.println("Introduce que posicion del array quieres eliminar");
        int delPos = sc.nextInt();

        int arrayAux[] = new int[tamArray-1];
        for (int pos = 0; pos<arrayAux.length; pos++){
            if(pos != delPos){
                arrayAux[pos] = array[pos];
            }
        }

        for(int pos = 0; pos<arrayAux.length; pos++){
            System.out.println(arrayAux[pos]);
        }
    }
}
