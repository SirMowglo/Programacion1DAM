package ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopiarArray_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> array1 = new ArrayList<>();
        List<String> array2 = new ArrayList<>();
        //----------------------------------------RELLENO DEL PRIMER ARRAY----------------------------------------------
        for(int pos=0; pos< 5; pos++){
            System.out.println("Introduce el elemento de la posicion " + (pos+1));
            array1.add(sc.next());
        }

        //----------------------------------COPIA DEL PRIMER ARRAY, EN EL SEGUNDO---------------------------------------
        for (int pos=0; pos<array1.size(); pos++){
            array2.add(array1.get(pos));
        }
        System.out.println("Array 1: "+ array1);
        System.out.println("Array 2: "+ array2);

        //-----------------------------CREACION DE TERCER ARRAYLIST Y COPIA CON ADDALL----------------------------------
        List<String> array3 = new ArrayList<>();
        array3.addAll(array1);
        System.out.println("Array 3: "+ array3);
    }
}
