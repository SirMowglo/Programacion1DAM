package Prueba2.Ejercicio1;

public class MainTarjeta {
    public static void main(String[] args) {
        Tarjeta t = new Tarjeta("1","2123234Y",1234,260);

        //Solo la ultima opcion comprara
        t.comprar(300,"2123234Y");
        t.comprar(30,"2123234");
        t.comprar(30,"2123234Y");

        //Solo la ultima opcion retirara del Cajero
        t.retirarCajero(300,1234);
        t.retirarCajero(30,1235);
        t.retirarCajero(30,1234);

        System.out.println(t);
    }
}
