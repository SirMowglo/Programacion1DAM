package Bucles;
import java.util.Scanner;

public class Login_02 {
    public static void main(String[] args) {
        //Login pide una contraseña (ya escrita), y comprueba si es la misma contraseña, si lo es acepta, si no vuelve a preguntar
 Scanner sc = new Scanner(System.in);

        String passwordFinal = "Durum123";
        String passwordLogin;
        System.out.println("");

        //En este caso el do siempre se ejecutara primero, y despues comprueba que sea igual la variable mediante lo que pone en while
        //(minimo se ejecuta el codigo una vez)
        do{
            System.out.println("Dime tu contraseña");
            passwordLogin = sc.next();
        }while (!passwordLogin.equals(passwordFinal));

        //Aqui dejaria de ejecutarse el do while, y se ejecutaria el resto del programa
        System.out.println("Has entrado");
    }
}
