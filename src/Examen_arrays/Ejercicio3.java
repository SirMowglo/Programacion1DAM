package Examen_arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        //------------------------------------------DECLARACION DE VARIABLES--------------------------------------------
        int departamentos[][] = new int[10][3]; //Array declarado de tal forma que:               "departamentos[numero de empleados][columnas]"
        int totalSalario=0;
        int totalSatisfaccion=0;
        int contador=0;

        //-------------------------------------CREACION DEL ARRAY DEPARTAMENTOS-----------------------------------------
        for(int empleado = 0; empleado<departamentos.length; empleado++){
            for(int columna=0; columna<departamentos[empleado].length;columna++){
                //Columna de Numero de departamento
                //Cada vez que sea la columna del numero de departamento generara un numero aleatorio entre 1 y 3
                if(columna ==0){
                    departamentos[empleado][columna]= rand.nextInt(3)+1;
                }
                //Columna de Salario
                //Cada vez que sea la columna de salario generara un numero aleatorio entre 2500 y 1100
                else if(columna==1){
                    departamentos[empleado][columna]= rand.nextInt(2500-1100)+1100;
                }
                //Columna de Grado de satisfaccion
                //Cada vez que sea la columna de satisfaccion, se generara un numero entre el 1 y el 5
                else if (columna ==2){
                    departamentos[empleado][columna]= rand.nextInt(5)+1;
                }
            }
        }
        //------------------------------------------IMPRESION DEL ARRAY-------------------------------------------------
        for(int empleado =0; empleado<departamentos.length;empleado++){
            System.out.println(Arrays.toString(departamentos[empleado]));
        }
        //------------------------------------------PREGUNTA DEL USUARIO------------------------------------------------
        //Se le pregunta al usuario el numero de departamento que quiere observar
        System.out.println("Introduce un departamento y te diremos la media de salario del departamento, y el grado de satisfaccion medio");
        int numDepartamento = sc.nextInt();

        //Se recorre el array principal
        for(int empleado = 0; empleado<departamentos.length; empleado++){
            //En caso de coincidir el numero de departamento que dio el usuario, con la columna de del numero de departamento pasa lo siguiente
            if(numDepartamento == departamentos[empleado][0]){
                contador++; //Se añade 1 al contador para despues hacer la media
                totalSalario+= departamentos[empleado][1]; //Se suma la columna salario de ese empleado al total del salario del departamento (con el que despues se hara la media)
                totalSatisfaccion += departamentos[empleado][2]; //Se suma la columna de satisfaccion de ese empleado al total de satisfaccion del departamento (con el que despues se hara la media)
            }
        }
        //----------------------------------------------RESPUESTA-------------------------------------------------------
        double mediaSalario = (double) totalSalario / contador; //Se realiza la media del salario
        double mediaSatisfaccion = (double) totalSatisfaccion / contador;//Se realiza la media de satisfaccion
        //Se imprimen los resultados
        System.out.println("La media de salario del departamento "+ numDepartamento + " es de: " +mediaSalario);
        System.out.println("La media de satisfaccion del departamento "+ numDepartamento + " es de: " +mediaSatisfaccion);
    }
}
