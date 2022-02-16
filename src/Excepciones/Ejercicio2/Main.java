package Excepciones.Ejercicio2;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception{
        Random rand = new Random();
        int numero = rand.nextInt(100);
        System.out.println(numero);
        if(numero%2 == 0){
            throw new Exception("El numero es par");
        }else{
            throw new Exception("El numero es impar");
        }
    }
}
