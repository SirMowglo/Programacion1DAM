package Examen_arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        //--------------------------------------------DECLARACION DE VARIABLES------------------------------------------
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        char canicas[] = new char[28]; //Se introduce el array vacio con 28 posiciones
        int color=0; //Variable para crear aleatoriamente el color

        //------------------------------------------CREACION DEL ARRAY PRINCIPAL----------------------------------------
        for(int pos = 0; pos<canicas.length; pos++){ //Bucle for para que pase por cada posicion del array, y se rellene con una canica aleatoria
            color= rand.nextInt(7); //Se le da un valor aleatorio del 0 al 6 con el cual se elegira el color de la canica
            //Condiciones para que se seleccione el color
            if(color==0){
                canicas[pos]= 'r';
            }
            else if(color==1){
                canicas[pos]= 'v';
            }
            else if(color==2){
                canicas[pos]= 'c';
            }
            else if(color==3){
                canicas[pos]= 's';
            }
            else if(color==4){
                canicas[pos]= 'o';
            }
            else if(color==5){
                canicas[pos]= 'd';
            }
            else if(color==6){
                canicas[pos]= 'p';
            }else{
                canicas[pos]='o'; //En caso de que se genere algo extraño, se le considerara que esa canica es de color oro (claramente el mejor juego de pokemon)
            }
        }

        //------------------------------------------COMPROBACION DEL USUARIO--------------------------------------------
        System.out.println(Arrays.toString(canicas));//Impresion del array creado, para facilitar la comprobacion
        System.out.println("Introduce un color para la canica"); //Se le pide al usuario un color
        //Se coge la primera letra de la respuesta del usuario, y en caso de ser mayuscula, la convierte en minuscula para que no ocasione problemas
        char respuesta = sc.next().charAt(0);
        if(respuesta == 'R'){
            respuesta ='r';
        }else if(respuesta == 'V'){
            respuesta ='v';
        }else if(respuesta == 'C'){
            respuesta ='c';
        }else if(respuesta == 'S'){
            respuesta ='s';
        }else if(respuesta == 'O'){
            respuesta ='o';
        }else if(respuesta == 'D'){
            respuesta ='d';
        }else if(respuesta == 'P'){
            respuesta ='p';
        }
        //Se inicializa contador, que compruebe segun la respuesta el numero de iguales que hay en el array
        int contador = 0;
        for(int pos=0; pos<canicas.length; pos++){
            if(respuesta == canicas[pos]){
                contador++;
            }
        }

        //---------------------------------------IMPRESION DE LA RESPUESTA----------------------------------------------
        //Segun la respuesta que dio el usuario, se imprimira el numero de canicas que sean de ese mismo color
        if(respuesta == 'r'){
            System.out.println("Hay " + contador + " canicas de color Rojo fuego");
        }else if(respuesta == 'v'){
            System.out.println("Hay " + contador + " canicas de color Verde hoja");
        }else if(respuesta == 'c'){
            System.out.println("Hay " + contador + " canicas de color Cristal");
        }else if(respuesta == 's'){
            System.out.println("Hay " + contador + " canicas de color Plata");
        }else if(respuesta == 'o'){
            System.out.println("Hay " + contador + " canicas de color Oro");
        }else if(respuesta == 'd'){
            System.out.println("Hay " + contador + " canicas de color Diamante");
        }else if(respuesta == 'p'){
            System.out.println("Hay " + contador + " canicas de color Perla");
        }else{
            System.out.println("No se ha entendido que color querias");
        }
    }
}
