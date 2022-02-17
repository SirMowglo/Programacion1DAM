package Prueba2.Ejercicio1;

public class Tarjeta implements TarjetaMonedero, TarjetaDebito{
    private String id;
    private String dniTitular;
    private int pin;
    private double saldo;
    //==================================CONSTRUCTOR======================================

    public Tarjeta() {
        this.id="";
        this.dniTitular="";
        this.pin =0;
        this.saldo =0;
    }

    public Tarjeta(String id, String dniTitular, int pin, float saldo) {
        this.id = id;
        this.dniTitular = dniTitular;
        this.pin = pin;
        this.saldo = saldo;
    }

    //===============================GETTERS Y SETTERS===================================
    @Override
    public String getId() {
        return id;
    }
    @Override
    public String getDniTitular() {
        return dniTitular;
    }
    @Override
    public double getSaldo() {
        return saldo;
    }
    @Override
    public void setPin(int pin) {
        this.pin = pin;
    }
    //====================================METHODS========================================

    @Override
    public String toString() {
        return "Tarjeta{" +
                "id='" + id + '\'' +
                ", dniTitular='" + dniTitular + '\'' +
                ", pin=" + pin +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public void comprar(double importe, String dni){
        if(this.dniTitular.equals(dni)){
                this.cargo(importe);
        }
    }
    @Override
    public void retirarCajero(double importe, int pin){
        if(this.pin == pin){
            this.cargo(importe);
        }
    }

    private boolean cargo(double importe){
        boolean res;
        //Si saldo menor a importe, se hace el cargo, y devuelve verdadero
        if(saldo>=importe){
            res=true;
            this.saldo-=importe;
        }else{
            res=false;
        }
        return res;
    }
}
