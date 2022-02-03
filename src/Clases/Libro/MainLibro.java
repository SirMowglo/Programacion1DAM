package Clases.Libro;

public class MainLibro {
    public static void main(String[] args) {
        Libro libroRandom= new Libro("El señor de los anillos","Tolkien",1000);
        Libro libro2 = new Libro("1273217894","Libro amigo","Mowglo","Editorial Misco",500);
        System.out.println(libroRandom.toString());
        System.out.println("El que tiene mas paginas es: "+libroRandom.comparePagMayor(libro2));

        libroRandom.prestar();
        System.out.println(libroRandom.isPrestado());
        libroRandom.devolver();
        System.out.println(libroRandom.isPrestado());
    }
}
