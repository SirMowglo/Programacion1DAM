package Arrays;
import java.util.Scanner;

public class Normalizar_04 {
    public static void main(String[] args) {
        //Implementar un array, buscar cual de los numeros de dentro del array es el mayor y el menor, y normalizar ese array

        Scanner sc = new Scanner(System.in);
        System.out.println("Numeros hay en el array?");
        int tamArray = sc.nextInt();
        int num[]= new int[tamArray];

        //INTRODUCE TODOS LOS VALORES EN EL ARRAY
        for(int pos = 0; pos<tamArray; pos++){
            System.out.println("Introduce el " + (pos+1)+ "º numero:");
            num[pos]= sc.nextInt();
        }

        //CALCULA EL MAXIMO Y EL MINIMO
        int maximo = num[0];
        int minimo = num[0];
        for(int pos = 0; pos<(tamArray) ; pos++){
            if(num[pos]> maximo){
                maximo = num[pos];
            }
            if(num[pos]< minimo){
                minimo = num[pos];
            }
        }

        //SE CREA UN ARRAY Y SE NORMALIZA
        double normArray []= new double[tamArray];
        for (int pos = 0; pos <tamArray; pos++){
            normArray[pos] = (double) (num[pos] - minimo)/(maximo-minimo);
        }

        //SE IMPRIME EL ARRAY NORMALIZADO, EL NUMERO MAXIMO Y EL MINIMO
        for(int pos = 0; pos<tamArray; pos++){
            System.out.println(normArray[pos]);
        }
        System.out.println("Minimo: " + minimo);
        System.out.println("Maximo: " + maximo);
    }
}
