package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_00 {
    public static void main(String[] args) {
        List<String> colores = new ArrayList<>();

        colores.add("Rojo");
        colores.add("Azul");

        colores.add(1,"Color de locos nena"); //Guarda en la posicion 1 el elemento añadido

        System.out.println("Accedo a la posicion 2" + colores.get(2)); //Accede a la posicion mencionada por el get
        System.out.println(colores);

        colores.set(1, "ahora no soy de locos"); //Accede a la posicion 1, y cambia su valor al especificado
        System.out.println(colores);
    }
}
