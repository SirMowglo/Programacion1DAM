package Bucles;
import java.util.Scanner;

public class Ahorcado_15 {
    public static void main(String[] args) {
        //--------------------------------------------VARIABLES---------------------------------------------------------

        Scanner sc = new Scanner(System.in);
        int vidas = 5;
        int victoria = 0;
        //Creo la palabra o frase a adivinar
        System.out.println("Introduce la frase a adivinar");
        String palabra= sc.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); //Salto de linea que simula un reset de la consola

        //Miro la longitud de la palabra que se introduce, y creo un stringBuffer para la palabra en cuestion
        StringBuffer palabraOculta = new StringBuffer(palabra);
        char intento; //Caracter con el que el jugador intenta acertar la palabra
        boolean fallo = true; //Booleano que indica si ha fallado la palabra o no

        //Sustituyo cada parte de la palabra oculta por # y añado 1 a la variable para la victoria
        //en caso de ser un espacio se rellena el espacio con otro espacio
        for(int pos =0; pos<palabra.length(); pos++){
            if(palabra.charAt(pos) == ' '){
                palabraOculta.setCharAt(pos,' ');
            }else{
            palabraOculta.setCharAt(pos,'#');
            victoria++;
            }
        }

        //------------------------------------COMPORTAMIENTO JUGADOR----------------------------------------------------

        //Siempre que tengas vidas, y que tu condicion de victoria no haya llegado al final, pasa lo siguiente:
        do {
            //Se le muestra la palabra clave al jugador y se le pide que introduzca una letra
            System.out.println("Tienes que adivinar: " +palabraOculta);
            System.out.println("Elige una letra que creas que esta en la palabra oculta (todas en minuscula)");
            intento = sc.next().charAt(0);

            //Comprueba todas las posiciones de la palabra por adivinar
            for(int pos = 0; pos<palabra.length();pos++){

                //Si el intento del jugador corresponde con el caracter actual de la palabra y no ha sido escogido ya:
                if(intento == palabra.charAt(pos) && palabraOculta.charAt(pos)=='#'){
                    palabraOculta.setCharAt(pos,intento); //sustituye el # correspondiente por la letra
                    victoria--; //Baja 1 la posicion de victoria
                    fallo = false; //No ha sido fallo
                }
                //Si ha fallado y es la ultima posicion: resta 1 vida y te dice que has fallado
                else if((fallo ==true) && (pos == palabra.length()-1)){
                    vidas--;
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Fallaste! Te quedan "+ vidas + " vidas");
                }
                //Si no ha sido fallo y esta en la ultima posicion de la palabra, te dice que has acertado y finaliza el bucle
                if(pos == palabra.length()-1 && fallo==false){
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Acertaste!");
                }
            }
            fallo = true; //Reset del fallo
        }while(vidas!=0 && victoria != 0);

        //--------------------------------MENSAJE PARA FINALIZAR PROGRAMA-----------------------------------------------

        //Si la condicion de victoria llego al final, te dice que has ganado junto a la palabra final
        if(victoria == 0){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Oleee! Has ganado! La palabra era: " + palabra);
        }
        //Si las vidas se han agotado, te dice que has perdido junto a la palabra final
        if(vidas == 0){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Has perdido!! La palabra era: " + palabra);
        }
    }
}
