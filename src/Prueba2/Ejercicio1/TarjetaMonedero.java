package Prueba2.Ejercicio1;

public interface TarjetaMonedero{
    public void comprar(double importe, String dni);
    public String getId();
    public String getDniTitular();
    public double getSaldo();
    public void setPin(int pin);
}
