package Herencias.Lista;

public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();

        cola.push("hola");
        cola.push("buena tarde");
        cola.push("buena tarde");
        cola.push("buena tarde");
        cola.push("buena tarde");
        cola.push("buena tarde");
        cola.push("buena tarde");
        cola.push("adio");

        cola.pop();
        System.out.println(cola);
    }
}
