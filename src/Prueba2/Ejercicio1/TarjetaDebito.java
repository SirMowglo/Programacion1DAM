package Prueba2.Ejercicio1;

public interface TarjetaDebito {
    public void comprar(double importe, String dni);
    public void retirarCajero(double importe, int pin);
    public String getId();
    public String getDniTitular();
    public double getSaldo();
    public void setPin(int pin);
}
