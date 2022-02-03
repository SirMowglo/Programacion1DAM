package Clases.Fraccion;

public class MainFraccion {
    public static void main(String[] args) {
        Fraccion fr1 = new Fraccion(2,4);
        Fraccion fr2 = new Fraccion(3,5);

        Fraccion fr3 = fr1.sum(fr2);

        System.out.println(fr3.getResult());
    }
}
