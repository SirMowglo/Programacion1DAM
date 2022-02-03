package ArrayList;
import java.util.*;

public class Maps_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> mapa = new HashMap<>();

        mapa.put("Buen dia", "Buenos dias amigo mio que tal esta usted");
        mapa.put("Mal dia", "Me cago en tus muertos yo solo quiero dormir :c");
        mapa.put("Regular dia", "Güeno po no esta mal, pero no se tampoco es que pase na");

        System.out.println("Introduce un tipo de dia");
        String respuesta = sc.nextLine();
        System.out.println("Respuesta: " +mapa.get(respuesta));

        Iterator it = mapa.entrySet().iterator();
        while (it.hasNext()){                                                                                   //Siempre que tenga un siguiente valor

            Map.Entry<String, String> entrada = (Map.Entry) it.next();                                          //Se crea una entrada para poder acceder al Map
            System.out.println("La clave es: " + entrada.getKey() + " y el valor es " + entrada.getValue());    //Se usa getKey, y getValue para acceder a la clave y al valor de la clave
        }
    }
}
