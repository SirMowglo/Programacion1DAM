package Clases.CuentaBancaria;
//Cuenta bancaria:
//atributos: titular y saldo
//
//el titular es obligatorio, pero saldo no
//Si no se indica el saldo, sera 0
//
//getters y setters
//
//Sobrecargar toString
//
//Operaciones:
//Ingresar dinero
//Retirar dinero
//Y hacer transferencia a otra cuenta
public class Cuenta {
    //===============================VARIABLES=============================
    private String titular="";
    private double saldo=0;
    //=============================CONSTRUCTORES===========================

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    //==========================GETTERS Y SETTERS==========================

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    //===============================METHODS================================
    public void ingresar(int ingreso){
        this.saldo+=ingreso;
    }
    public void retirar(int retirada){
        if(retirada<=saldo){
            this.saldo -= retirada;
        }else{
            System.out.println("Tu cuenta no tiene suficiente dinero");
        }
    }
    public void transferir(int transferencia,Cuenta destinatario){
        if(transferencia<=this.saldo){
            this.saldo -= transferencia;
            destinatario.saldo += transferencia;
        }else{
            System.out.println("Tu cuenta no tiene suficiente dinero");
        }
    }
    //=============================OVERRIDES================================

    @Override
    public String toString() {
        return "Cuenta: " +
                "\nTitular: '" + titular + '\'' +
                "\nSaldo: " + saldo;
    }
}
