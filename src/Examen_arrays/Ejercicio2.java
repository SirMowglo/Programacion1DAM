package Examen_arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //--------------------------------------------DECLARACION DE VARIABLES------------------------------------------
        Scanner sc = new Scanner(System.in);
        int cola[] = new int[10];
        boolean usuarioQuiere= true; //Booleana que se usara para decidir si el usuario quiere seguir avanzando
        char respuesta;

        //-------------------------------------------RELLENO DEL ARRAY "COLA"-------------------------------------------
        for(int pos = 0; pos<cola.length; pos++){
            cola[pos] = pos+1; //Se le suma 1 a la posicion actual (asi nunca empieza de 0)
        }
        //---------------------------------------PREGUNTA AL USUARIO Y RESPUESTA----------------------------------------
        //Se imprime el array, y se le pregunta al usuario si quiere avanzar en la cola
        System.out.println("Tu cola es: "+ Arrays.toString(cola));
        do{
            System.out.println("Quieres avanzar en la cola?");//Se le pregunta al usuario si quiere avanzar en la cola y se guarda la respuesta
            respuesta = sc.next().charAt(0);
            if(respuesta== 's' || respuesta == 'S'){ //En caso de que la respuesta sea si se sumara 1 a todas las posiciones de la cola
                for(int pos = 0;pos<cola.length;pos++){
                    cola[pos]++;
                }
                System.out.println("Tu cola es: "+ Arrays.toString(cola));
            }else{
                System.out.println("Po venga colega, nos vemo"); //En cualquier otro caso, se le sacara del programa
                usuarioQuiere=false;
            }
        }while(usuarioQuiere==true);
    }
}
