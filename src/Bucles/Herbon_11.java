package Bucles;
import java.util.Scanner;
public class Herbon_11 {
    public static void main(String[] args) {
        //el usuario mete una String, y la invierte, ademas de esto te dira el numero de vocales que tiene
        Scanner sc = new Scanner(System.in);

        //El usuario introduce un texto (el nextLine es para que pille todo el codigo
        System.out.println("Mete un texto");
        String textInput = sc.nextLine();

        //Creamos variables para la longitud de la cadena, un repositorio para guardar cada caracter de la cadena, una String para la cadena final, y un contador para las vocales
        int longitud = textInput.length() -1;//La longitud de la cadena es el numero de caracteres, menos 1 (ya que el charAt empieza desde 0)
        char repositorio = 'h';
        String textFinal= "";
        int count =0;

        //Creamos un bucle con la variable de longitud de la cadena
        for (;longitud>=0; longitud--){
            //Damos el valor al repositorio con el ultimo caracter de la cadena
            repositorio = textInput.charAt(longitud);
            textFinal = textFinal + repositorio; //Aqui se suma cada caracter a la cadena final

            //Aqui se filtran todas las vocales, y añade 1 al contador cada vez que hay un caracter en el repositorio que es una
            if ((repositorio == 'a') || (repositorio== 'A') ||(repositorio == 'e') || (repositorio== 'E') ||(repositorio == 'i') || (repositorio== 'I') || (repositorio == 'o') || (repositorio== 'O') ||(repositorio == 'u') || (repositorio== 'U')){
                count++;
            }

        }
        System.out.println(textFinal + "\nTu frase tiene: " + count + " vocales");
    }
}
