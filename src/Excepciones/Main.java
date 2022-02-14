package Excepciones;

public class Main {
    public static int numerador = 10;
    public static Integer denominador = 1;
    public static float division;

    public static void main(String[] args) {
        try{
            System.out.println("Antes");
            division = numerador / denominador;
            System.out.println(division);
            System.out.println("Despues");
            division = numerador / 0;
            System.out.println(division);
        }catch(ArithmeticException error){
            System.out.println(error + "\n- Error Aritmetico y tal");
        }finally{
            System.out.println("Esto se ejecuta siempre");
        }
    }
}
