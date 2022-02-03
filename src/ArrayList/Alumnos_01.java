package ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Alumnos_01 {
    public static void main(String[] args) {
        //El usuario introduce alumnos hasta que escriba "ya"
        //Imprime la lista
        //Dar la vuelta a la lista
        //Imprimir otra vez

        Scanner sc = new Scanner(System.in);
        boolean usuarioQuiere = true;
        List<String> alumnos = new ArrayList<>();   //Creacion de un arraylist para alumnos
        int contador = 0;                           //Contador para contar las iteraciones en el while
        String aux = " ";                           //auxiliar para no perder informacion a la hora de invertir el arraylist

        //-----------------------------------------RELLENO DEL ARRAYLIST------------------------------------------------
        //Pregunta al usuario que introduzca un nombre, y lo añade a la lista.
        //Si el usuario escribe "ya", borra el ya y cierra el ciclo.
        while (usuarioQuiere == true){
            System.out.println("Introduce un usuario");
            alumnos.add(sc.next());
            if(alumnos.get(contador).equals("ya") || alumnos.get(contador).equals("Ya")){
                alumnos.remove("ya");
                alumnos.remove("Ya");
                usuarioQuiere =false;
            }else{
                System.out.println("pito");
            }
            contador++;
        }
        System.out.println(alumnos);

        //----------------------------------------INVERSION DEL ARRAYLIST-----------------------------------------------
        //Un for que recorrera el bucle hasta la mitad de la longitud del Arraylist
        //No hace falta que recorra mas, ya que el ultimo numero tambien se sustituye en cada iteracion
        for(int pos = 0; pos<(alumnos.size()/2);pos++){
            aux = alumnos.get(pos);                                 //Grabo el numero que hay en la posicion actual en un auxiliar
            alumnos.set(pos,alumnos.get(alumnos.size()-(pos+1)));   //Cambio el numero de la posicion actual, por el de la posicion ultima - la posicion actual
            alumnos.set(alumnos.size()-(pos+1), aux);               //Cambio el numero de la ultima posicion por el de la primera (con el auxiliar)
        }
        System.out.println(alumnos);
    }
}
