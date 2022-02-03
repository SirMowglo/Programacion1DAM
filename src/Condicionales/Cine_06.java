package Condicionales;

import java.util.Scanner;

public class Cine_06 {
    public static void main(String[] args) {
        //Hay un cine, y la entrada cuesta 15€. El usuario introduce su edad, y el dia de la semana (del 1 al 7) y se tiene que mostrar el precio de su entrada
        /*Menos de 4 - 60%
         * mas de 60 años - 20%
         * menos de 12 años - 40%
         * Dia del espectador - 50% */

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu edad");
        int edad = sc.nextInt();
        System.out.println("Que dia es hoy de la semana (del 1 al 7)");
        int diaS = sc.nextInt();

        double precio = 15;
        if ((diaS <= 7) && (diaS >= 1)) {
        } else {
            System.out.println("Tu dia de la semana es incorrecto");
            if (diaS == 3) {
                precio *= 0.5;
                if (edad < 4) { //tambien se podria hacer con un switch
                    precio *= 0.6;
                    System.out.println("Tendras que pagar: " + precio);
                } else if (edad > 60) {
                    precio *= 0.20;
                    System.out.println("Tendras que pagar: " + precio);
                } else if (edad < 12) {
                    precio *= 0.4;
                    System.out.println("Tendras que pagar: " + precio);
                } else {
                    System.out.println("Tendras que pagar: " + precio);
                }
            } else {
                if (edad < 4) {
                    precio *= 0.6;
                    System.out.println("Tendras que pagar: " + precio);
                } else if (edad > 60) {
                    precio *= 0.20;
                    System.out.println("Tendras que pagar: " + precio);
                } else if (edad < 12) {
                    precio *= 0.4;
                    System.out.println("Tendras que pagar: " + precio);
                } else {
                    System.out.println("Tendras que pagar: " + precio);
                }
            }
        }
    }
}
