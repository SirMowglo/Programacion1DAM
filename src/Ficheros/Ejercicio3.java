package Ficheros;
import java.util.Scanner;
import java.io.File;


public class Ejercicio3 {
    public static void main(String[] args) {
        //-----------------------------------------------VARIABLES------------------------------------------------------
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la Direccion: ");
        String direccion = sc.nextLine();                               //Direccion que da el usuario para listar

        System.out.println("Introduce el tipo de archivo a listar");
        String extUser = sc.nextLine();                                 //Extension del tipo de archivos que se quiere listar
        String ext ="";                                                 //Almacenaje para mas adelante almacenar la extension de cada archivo

        //------------------------------------------LISTADO DE ARCHIVOS-------------------------------------------------
        File archivo = new File(direccion);                             //Creacion de un objeto file, con la direccion especificada
        String listaArchivos[] = archivo.list();                        //Creacion de un listado de todos los archivos que hay en la direccion

        for(int pos=0; pos<listaArchivos.length; pos++) {               //Se recorre toda la lista creada
            int index = listaArchivos[pos].lastIndexOf('.');        //Recoge la posicion del ultimo caracter que sea "."
            if(index > 0) {
                ext = listaArchivos[pos].substring(index+1);            //En caso de que tenga extension guarda la extension en una variable
            }else{
                ext ="";                                                //En caso contrario resetea la variable
            }
            if(ext.equals(extUser)){                                    //Si la extension es igual a la extension dada por el usuario, imprime el archivo en pantalla
                System.out.println(listaArchivos[pos]);
            }

        }
    }
}
