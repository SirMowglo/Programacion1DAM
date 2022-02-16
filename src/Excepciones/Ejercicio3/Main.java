package Excepciones.Ejercicio3;

public class Main {
    public static void main(String[] args){
        Persona p =new Persona();

        try {
            p.setEdad(-1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
