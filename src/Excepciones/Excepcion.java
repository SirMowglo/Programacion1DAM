package Excepciones;
import java.util.Scanner;
public class Excepcion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        nota = sc.nextInt();
        try{
            if(nota<0){
                throw new Exception("Error: la nota es demasiado baja");
            }else if(nota>10){
                throw new Exception("Error: la nota es demasiado alta");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Nota: " + nota);
    }
}
