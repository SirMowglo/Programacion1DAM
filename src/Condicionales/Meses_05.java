package Condicionales;

import java.util.Scanner;

public class Meses_05 {
    public static void main(String[] args) {
        //el usuario mete un numero en pantalla, y devuelve el mes del año
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero correspondiente a un mes del año");
        int mes = sc.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Tu mes es Enero");
                break;
            case 2:
                System.out.println("Tu mes es Febrero");
                break;
            case 3:
                System.out.println("Tu mes es Marzo");
                break;
            case 4:
                System.out.println("Tu mes es Abril");
                break;
            case 5:
                System.out.println("Tu mes es Mayo");
                break;
            case 6:
                System.out.println("Tu mes es Junio");
                break;
            case 7:
                System.out.println("Tu mes es Julio");
                break;
            case 8:
                System.out.println("Tu mes es Agosto");
                break;
            case 9:
                System.out.println("Tu mes es Septiembre");
                break;
            case 10:
                System.out.println("Tu mes es Octubre");
                break;
            case 11:
                System.out.println("Tu mes es Noviembre");
                break;
            case 12:
                System.out.println("Tu mes es Diciembre");
                break;

            default:
                System.out.println("Revisate los meses del año crack");
        }
    }
}
