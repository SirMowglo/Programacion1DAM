package Ficheros;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //--------------------------------------------PREGUNTAS AL USUARIO----------------------------------------------
        System.out.println("Introduce nombre del fichero");
        String nombreArchivo = sc.nextLine();
        String escribir;
        System.out.println("Que quieres que se escriba en el archivo?");
        escribir = sc.nextLine();

        //--------------------------------------------CREACION Y ESCRITURA-----------------------------------------------
        //Creacion de un objeto que cree, y escriba en el archivo
        FileWriter escritura;
        File archivo;
        try{
            //asignacion de los objetos de escritura y lectura
            archivo = new File("C:\\Users\\DAM\\Desktop\\Programacion\\Carpeta\\" + nombreArchivo + ".txt");
            escritura = new FileWriter("C:\\Users\\DAM\\Desktop\\Programacion\\Carpeta\\" + nombreArchivo +".txt");

            archivo.createNewFile();                                                                                            //creacion del archivo
            escritura.write(escribir);                                                                                          //Se escribe el archivo
            escritura.close();                                                                                                  //se cierra la escritura
        } catch(IOException error){
            System.out.println(error);
        }


        //-------------------------------------------------LECTURA------------------------------------------------------
        FileReader lector;                                                                                                  //Creacion del objeto para lectura
        int valorAscii;                                                                                                     //Recipiente para el valor que de el objeto
        try{
            lector = new FileReader("C:\\Users\\DAM\\Desktop\\Programacion\\Carpeta\\" + nombreArchivo +".txt");    //asignacion del lector
            valorAscii = lector.read();                                                                                     //relleno del valor en Ascii
            //Siempre que el valor en ascii sea distinto a -1, seguira imprimiendo
            while (valorAscii!=-1){
                System.out.print((char)valorAscii);                                                                         //Se imprime el valor ascii en forma de caracter
                valorAscii = lector.read();                                                                                 //Se resetea el valor del contenedor para que avance
            }
            lector.close();                                                                                                 //se cierra le lector
        }catch (IOException error){
            System.out.println(error);
        }


    }
}
