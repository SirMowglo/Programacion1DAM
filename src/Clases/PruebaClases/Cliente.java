package Clases.PruebaClases;

import java.util.ArrayList;

public class Cliente {
    private String nombreCliente;
    private double saldoCliente;
    private ArrayList<Articulo> carritoCliente;
    private ArrayList<Articulo> propiedadCliente;

    //=================================CONSTRUCTOR===================================

    public Cliente() {
        this.nombreCliente="";
        this.saldoCliente=0;
        this.propiedadCliente= new ArrayList<Articulo>();
        this.carritoCliente =new ArrayList<Articulo>();
    }

    public Cliente(String nombreCliente, double saldoCliente) {
        this.nombreCliente = nombreCliente;
        this.saldoCliente = saldoCliente;
        this.propiedadCliente= new ArrayList<Articulo>();
        this.carritoCliente =new ArrayList<Articulo>();
    }

    public Cliente(String nombreCliente, double saldoCliente, ArrayList<Articulo> propiedadCliente) {
        this.nombreCliente = nombreCliente;
        this.saldoCliente = saldoCliente;
        this.propiedadCliente = propiedadCliente;
        this.carritoCliente =new ArrayList<Articulo>();
    }

    //==============================GETTER Y SETTER==================================
    //Nombre
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    //Saldo
    public double getSaldoCliente() {
        return saldoCliente;
    }
    public void setSaldoCliente(double saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

    //Carrito
    public ArrayList<Articulo> getCarritoCliente() {
        return carritoCliente;
    }

    //Propiedad
    public ArrayList<Articulo> getPropiedadCliente() {
        return propiedadCliente;
    }
    public void setPropiedadCliente(ArrayList<Articulo> propiedadCliente) {
        this.propiedadCliente = propiedadCliente;
    }

    //================================METHODS========================================

    @Override
    public String toString() {
        return "Cliente" +
                "\nNombre cliente= " + nombreCliente +
                "\nSaldo cliente= " + saldoCliente +
                "\nCarrito cliente= " + carritoCliente +
                "\nPropiedad cliente= " + propiedadCliente;
    }

    //Llama a venta de producto, para añadir un producto al carrito del cliente y reducir su stock en tienda
    public void anadirProducto(int nProducto, int cantidad, Tienda tienda){
        tienda.ventaProducto(nProducto,cantidad,this);
    }
    //Checkea si tienes saldo suficiente, y en caso de ser asi, añade todo el carrito a tu propiedad y te resta el saldo
    public void compraProducto(){
        double precioCompra=0;
        for (int i =0; i<carritoCliente.size();i++){
           precioCompra+= carritoCliente.get(i).getPrecio() *carritoCliente.get(i).getStock();
        }
        if(saldoCliente >= precioCompra) {
            this.propiedadCliente.addAll(carritoCliente);
            this.carritoCliente.clear();
            this.saldoCliente-=precioCompra;
        }
    }
    //Checkea cual es el producto que quieres devolver en la tienda (segun el nombre) y lo devuelve, devolviendo al cliente el saldo correspondiente
    public void devolverProducto(int nProducto,int cantidad, Tienda tienda){
        if(cantidad<=this.propiedadCliente.get(nProducto).getStock()){
            for (int i = 0; i < tienda.getArticulosTienda().size(); i++) {
                if (tienda.getArticulosTienda().get(i).getNombreArticulo().equals(propiedadCliente.get(nProducto).getNombreArticulo())) {
                    tienda.reponerStock(i, cantidad);
                    this.aumentarSaldo(propiedadCliente.get(nProducto).getPrecio() * cantidad);
                    this.propiedadCliente.get(nProducto).disminuyeStock(cantidad);
                }
            }
        }
    }
    //Incrementa el saldo en una cantidad
    public void aumentarSaldo(double cantidad){
        this.saldoCliente+= cantidad;
    }
}
