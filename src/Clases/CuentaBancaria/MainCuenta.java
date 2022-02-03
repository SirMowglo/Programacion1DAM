package Clases.CuentaBancaria;

public class MainCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Manolo");
        Cuenta cuenta2 = new Cuenta("Pepa",1200);

        cuenta1.ingresar(300);
        cuenta1.retirar(500);
        System.out.println("Saldo actual de "+ cuenta1.getTitular() +":"+cuenta1.getSaldo());
        System.out.println("==============================================================");

        cuenta2.transferir(400,cuenta1);
        System.out.println("Saldo actual de "+ cuenta1.getTitular() +":"+cuenta1.getSaldo());
        System.out.println("Saldo actual de "+ cuenta2.getTitular() +":"+cuenta2.getSaldo());


    }
}
