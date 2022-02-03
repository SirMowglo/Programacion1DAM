package Arrays;
import java.util.Scanner;

public class MenorAMayor_06 {
    public static void main(String[] args) {
        //Ordenar un array de menor a mayor

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de numeros que tendra el array");
        int tamArray = sc.nextInt();

        //Creacion y relleno del array
        int array[] = new int[tamArray];
        for (int pos = 0; pos<tamArray; pos++){
            System.out.println("Introduce el " + pos + "º numero del array");
            array[pos] = sc.nextInt();
        }


        //Creo un array auxiliar, y lo voy rellenando con el numero mayor del array principal.
        int mayor = array[0];
        int menor = array[0];
        int posMayor= 0;
        int arrayAux[] = new int[tamArray];
        for (int pos= tamArray -1; pos>=0; pos--){
            //Se resetea la posicion donde esta el numero, y los auxiliares del numero mayor y menor
            posMayor=0;
            mayor = array[0];
            menor = array[0];

            //Detecta cual es el mayor, y cual es el menor, y sustituye el mayor por el menor
            for (int posArray = 0; posArray<tamArray; posArray++){
                //detecta cual es el mayor y su posicion
                if(array[posArray]> mayor){
                    mayor = array[posArray];
                    posMayor = posArray;
                }
                //detecta cual es el menor
                if(array[posArray]<menor){
                    menor = array[posArray];
                }
                //sustituye el mayor por el menor una vez haya comprobado toda la lista
                if(posArray == tamArray-1){
                    array[posMayor] = menor;
                }
            }
            arrayAux[pos] = mayor; //Coge el mayor, y le asigna ese valor a la ultima posicion del array sin asignar
        }

        //Imprime el array
        for(int pos = 0; pos<tamArray; pos++){
            System.out.println(arrayAux[pos]);
        }
    }
}
