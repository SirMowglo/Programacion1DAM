package Ficheros;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Arrays;

public class CrearFicheros_00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file;

        System.out.println("Introduce el nombre del fichero");
        String docu = sc.next();

        //-----------------------------------------CREACION DE UN FICHERO-----------------------------------------------
        try{
            file = new File("C:\\Users\\DAM\\Desktop\\Programacion\\CarpetaFicheros\\" + docu+".txt");
            if(file.createNewFile()){
                System.out.println("El fichero se ha creado");
            }else{
                System.out.println("El fichero no se ha creado");
            }
        }catch(IOException error){
            System.out.println("Error de creacion: " +error);
        }

        //-----------------------------------------ESCRITURA DE UN FICHERO----------------------------------------------
        FileWriter escritura;
        try{
            escritura = new FileWriter("C:\\Users\\DAM\\Desktop\\Programacion\\CarpetaFicheros\\" + docu +".txt");
            escritura.write("Come pito de viejita");
            escritura.close();
        }catch(IOException error){
            System.out.println("Error de escritura: "+error);
        }

        //-------------------------------------------LECTURA DE FICHEROS------------------------------------------------
        File ficherolectura;
        Scanner sc2;
        try {
            ficherolectura = new File("C:\\Users\\DAM\\Desktop\\Programacion\\CarpetaFicheros\\" + docu +".txt");
            sc2= new Scanner(ficherolectura);
            while(sc2.hasNextLine()) {
                String datos = sc2.nextLine();
                System.out.println(datos);
            }
            sc2.close();
        }catch(IOException error){
            System.out.println("Error de lectura: " + error);
        }

        //--------------------------------------------ELIMINAR FICHEROS-------------------------------------------------
        /*File ficheroborrado = new File("C:\\Users\\DAM\\Desktop\\Programacion\\CarpetaFicheros\\" + docu +".txt");
        if (ficheroborrado.delete()) {
            System.out.println("Se ha borrado");
        } else {
            System.out.println("No se ha borrado");
        }
        */
        //-------------------------------------LISTAR CONTENIDO DEL DIRECTORIO------------------------------------------
        File dir = new File ("C:\\Users\\DAM\\Desktop\\Programacion\\CarpetaFicheros");
        String[] arraydeficheros = dir.list();
        for(String name:arraydeficheros){
            System.out.println(name);
        }
    }
}
