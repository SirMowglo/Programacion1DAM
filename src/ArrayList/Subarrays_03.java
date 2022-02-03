package ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Subarrays_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();

        //--------------------------------------------RELLENO DEL ARRAY-------------------------------------------------
        for (int pos = 0; pos<10; pos++){
            System.out.println("Introduce un valor para la posicion: " + pos);
            array1.add(sc.nextInt());
        }

        //---------------------------------------CREACION DE LAS POSICIONES---------------------------------------------
        System.out.println("Introduce la posicion inicial");
        int posicionIni = sc.nextInt();
        System.out.println("Introduce la posicion final");
        int posicionFin = sc.nextInt();

        //Control de la posicion inicial del usuario
        if (posicionIni<0){
            posicionIni = 0;
        }
        if(posicionIni >= array1.size()){
            posicionIni = array1.size()-1;
        }

        //Control de la posicion final del usuario
        if (posicionFin>=array1.size()){
            posicionFin = array1.size()-1;
        }
        if (posicionFin<0){
            posicionFin = 0;
        }

        //-------------------------------RELLENO DEL SEGUNDO ARRAY CON LAS POSICIONES-----------------------------------
        for(int pos = posicionIni; pos<=posicionFin; pos++){
            array2.add(array1.get(pos));
        }
        System.out.println("Array 1: " +array1);
        System.out.println("Array 2: " +array2);
    }
}
