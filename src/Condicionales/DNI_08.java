package Condicionales;
//Lo de crear el scanner
import java.util.Scanner;

public class DNI_08 {
    public static void main(String[] args) {
        //introduce tu dni sin letra y la letra aparte, y te compara la letra que diste, con la que realmente tendria que ser

        //se crea el scanner y se introduce como una constante la formula del dni
        Scanner sc = new Scanner(System.in);
        final String dniFormula = "TRWAGMYFPDXBNJZSQVHLCKE";

        //Se le pide al usuario el dni, sin la letra, y la letra y se guardan en variables (la de la letra al ser un char,
        // tienes que especificar que sera el primer input de la cadena de letras que se ponga (con el charAt(0)
        System.out.println("Introduce tu dni sin letra");
        int dniUser = sc.nextInt();
        System.out.println("Introduce la letra de tu en mayusculas");
        char letraUser = sc.next().charAt(0);

        //se recoge en una variable la letra final, que sera la que este en la posicion dni%23 (igual que antes con el charAt
        char letraFinal = dniFormula.charAt(dniUser%23);
        System.out.println(letraFinal);

        //las comparaciones
        if(letraFinal == letraUser){
            System.out.println("Tu letra esta bien, y es la letra: " + letraFinal);
        } else{
            System.out.println("Tu letra es incorrecta, y deberia de ser la letra: " + letraFinal);
        }
    }
}
