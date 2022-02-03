package Clases.Triangulo;
import java.util.Scanner;
public class MainTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce lado 1");
        double a = sc.nextDouble();
        System.out.println("Introduce lado 2");
        double b = sc.nextDouble();
        System.out.println("Introduce lado 3");
        double c = sc.nextDouble();

        Triangulo triangulico = new Triangulo(a,b,c);

        System.out.println("Este es el perimetro: "+ triangulico.perimetro()+" metros");
        System.out.println("Este es el area: "+ triangulico.area() +" metros cuadrados");
        System.out.println("Es isosceles?: " + triangulico.isIsosceles());
        System.out.println("Es escaleno?: " + triangulico.isEscaleno());
        System.out.println("Es equilatero?: " + triangulico.isEquilatero());
    }
}
