package Condicionales;
import java.util.Random;

//Simular la tiradas de dos dados de 6 caras, si los dos dados son 6, se imprime excelente, si solo 1 da 6, es bueno, y si no se imprime la suma
public class Dados_09 {
    public static void main(String[] args) {
        Random random = new Random();

        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        System.out.println("Se tiran dos dados y salen: " + dado1 + " y " + dado2 );

        if ((dado1 ==6) && (dado2 == 6) ){
            System.out.println("De locos");
            System.out.println("la suma es de : " + (dado1 + dado2));
        }else if ((dado1 ==6) || (dado2 == 6)){
            System.out.println("Casi de locos");
            System.out.println("la suma es de : " + (dado1 + dado2));
        }else{
            System.out.println("la suma es de : " + (dado1 + dado2));
        }

    }
}
