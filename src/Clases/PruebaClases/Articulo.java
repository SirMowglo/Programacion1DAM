package Clases.PruebaClases;

public class Articulo {
    private String nombreArticulo;
    private double precio;
    private int stock;

    //=================================CONSTRUCTOR====================================
    public Articulo() {
        this.nombreArticulo = "";
        this.precio =0;
        this.stock = 0;
    }

    public Articulo(String nombreArticulo, double precio, int stock) {
        this.nombreArticulo = nombreArticulo;
        this.precio = precio;
        this.stock = stock;
    }

    public Articulo(String nombreArticulo, double precio) {

        this.nombreArticulo = nombreArticulo;
        this.precio = precio;
    }

    //===============================GETTER Y SETTER==================================

    //Nombre
    public String getNombreArticulo() {
        return nombreArticulo;
    }
    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }
    //Precio
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //Stock
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    //==================================METHODS=======================================

    @Override
    public String toString() {
        return "Articulo ["+
                "Nombre= " + nombreArticulo +
                ", Precio= " + precio +
                ", Stock= " + stock +"]";
    }
    public void aumentaStock(int cantidad){
        stock += cantidad;
    }
    public void disminuyeStock(int cantidad){
        stock -= cantidad;
    }
    public void aumentaPrecio(double cantidad){
        precio += cantidad;
    }
    public void disminuyePrecio(double cantidad){
        precio -= cantidad;
    }
}
