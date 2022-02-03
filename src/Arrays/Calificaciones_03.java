package Arrays;
import java.util.Scanner;

public class Calificaciones_03 {
    public static void main(String[] args) {
        //Crea un programa que calcule la media de una serie de numeros alistados, y que te diga cual de esos numeros superan la media (supuestamente los numeros son notas de clase)
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas notas hay?");
        int nNotas = sc.nextInt();

        double notas[]= new double[nNotas];
        double media = 0;

        for(int pos = 0; pos<nNotas; pos++){
            System.out.println("Introduce la nota numero " + (pos+1)+ ":");
            notas[pos]= sc.nextDouble();
        }
        for (int pos = 0; pos<notas.length; pos++){
            media = media + notas[pos];
        }
        media = media/nNotas;
        System.out.println("Tu media es de: "+ media);

        System.out.println("Tus notas que superan la media son:");
        for(int pos = 0; pos<notas.length; pos++){
            if(notas[pos]>media){
                System.out.print(notas[pos]+"\n");
            }
        }
    }
}
