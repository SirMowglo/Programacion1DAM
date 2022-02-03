package Ficheros;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        //------------------------------------------------VARIABLES-----------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del archivo");

        String nombreArchivo = sc.nextLine();   //Variable para el nombre del archivo
        String escribir= "";                    //Variable en la que se guardara lo escrito
        String aux;                             //Variable auxiliar, que se reseteara cada vez que pregunte

        boolean quiereParar = false;            //Booleana para comprobar que
        File archivo;
        FileWriter escritura;

        //------------------------------------CREACION Y ESCRITURA DEL ARCHIVO------------------------------------------
        try{
            archivo = new File ("C:\\Users\\DAM\\Desktop\\Programacion\\Carpeta\\" + nombreArchivo + ".txt");           //Asignacion del objeto para manejar los archivos
            archivo.createNewFile();                                                                                             //Creacion del archivo

            //Mientras quiereParar sea falso te permitira escribir algo, y añadirlo al archivo final
            while(quiereParar == false){
                System.out.println("Escribe algo: ");
                aux=sc.nextLine();
                escribir += aux + "\n";
                if(aux.equals("")){                                                                                              //Si no se introduce nada, se para
                    quiereParar = true;
                }
            }

            //Se crea un objeto para la escritura, y escribe lo introducido en la variable escribir
            escritura = new FileWriter("C:\\Users\\DAM\\Desktop\\Programacion\\Carpeta\\" + nombreArchivo + ".txt");
            escritura.write(escribir.toUpperCase());
            escritura.close();
        }catch(IOException error){
            System.out.println(error);
        }

        //------------------------------------------------LECTURA-------------------------------------------------------
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
