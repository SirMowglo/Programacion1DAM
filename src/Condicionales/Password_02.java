package Condicionales;
import java.util.Objects;
import java.util.Scanner;

public class Password_02 {
    public static void main(String[] args) {
        //Metemos el valor de una contraseña y si el usuario mete esa contraseña, "accede" a lo que sea
        Scanner sc = new Scanner (System.in);

        final String password = "Banana03";

        System.out.println("Introduce la contraseña");
        String loginPassword = sc.next();

        if(loginPassword.equals(password)){
            System.out.println("Illo me has hackeao :_(");
        }else{
            System.out.println("Buen intento colega XD");
        }
    }
}
