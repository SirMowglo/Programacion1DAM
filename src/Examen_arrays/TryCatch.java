package Examen_arrays;

public class TryCatch {
    public static void main(String[] args) {
        int array[] = new int[5];

        try{
            System.out.println(array[5]);
        }catch(ArrayIndexOutOfBoundsException var){
            System.out.println("No se tio solucionalo o algo");
        }

    }
}
