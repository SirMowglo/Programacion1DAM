package Clases.Cubo;
import java.util.Scanner;

public class MainCubo {
    public static void main(String[] args) {
        boolean hacer= true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que tipo de bebida quieres?");
        String bebida = sc.nextLine();
        System.out.println("Cuantos hielos quieres?");
        int hielos= sc.nextInt();

        Cubo vasito = new Cubo(bebida,hielos);

        while (hacer==true){
            System.out.println("Que quieres hacer?" +
                    "\n1.Beber" +
                    "\n2.Rellenar" +
                    "\n3.Vaciar" +
                    "\n4.Ver estado actual" +
                    "\n5.Salir");
            int opciones = sc.nextInt();
            if(opciones == 1){
                vasito.beber();
                if(vasito.getCantidadActual()==0){
                    System.out.println("Tu vaso se vació");
                }
            }else if(opciones==2){
                if(vasito.getCantidadActual()==0){
                    System.out.println("Tu vaso esta vacio, que bebida quieres para rellenar?");
                    bebida = sc.nextLine();
                }
                vasito.llenar(bebida);
            }else if(opciones==3){
                System.out.println("Se vacio tu vaso");
                vasito.vaciar();
            }else if(opciones==4){
                System.out.println(vasito.toString());
            }else if(opciones==5){
                System.out.println("Nos vemo nemo");
                hacer = false;
            }else{
                System.out.println("Tu eres tonto");
                hacer = false;
            }
        }
    }
}
