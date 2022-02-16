package Excepciones.Ejercici1;

import Excepciones.Excepcion;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;
        boolean isError;

        do{
            try {
                System.out.println("Introduce un numero");
                numero = sc.nextDouble();
                isError =false;
            } catch (Exception error) {
                System.out.println("Se ha producido un error, vuelve a intentarlo");
                isError = true;
                sc.nextLine();
            }
        }while (isError);
    }
}
