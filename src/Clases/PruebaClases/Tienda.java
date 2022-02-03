package Clases.PruebaClases;

import com.sun.security.ntlm.Client;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Articulo> articulosTienda;
    private String nombreTienda;
    private String direccionTienda;

    //================================CONSTRUCTOR====================================

    public Tienda() {
        this.articulosTienda = new ArrayList<Articulo>();
        this.nombreTienda = "";
        this.direccionTienda = "";
    }

    public Tienda(ArrayList<Articulo> articulosTienda, String nombreTienda) {
        this.articulosTienda = articulosTienda;
        this.nombreTienda = nombreTienda;
    }

    public Tienda(ArrayList<Articulo> articulosTienda, String nombreTienda, String direccionTienda) {
        this.articulosTienda = articulosTienda;
        this.nombreTienda = nombreTienda;
        this.direccionTienda = direccionTienda;
    }
    //============================GETTER Y SETTER====================================

    //Articulos
    public ArrayList<Articulo> getArticulosTienda() {
        return articulosTienda;
    }
    public void setArticulosTienda(ArrayList<Articulo> articulosTienda) {
        this.articulosTienda = articulosTienda;
    }
    //Nombre
    public String getNombreTienda() {
        return nombreTienda;
    }
    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }
    //Direccion
    public String getDireccionTienda() {
        return direccionTienda;
    }
    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    //===============================METHODS==========================================

    @Override
    public String toString() {
        return "Tienda" +
                "\nArticulos tienda= " + articulosTienda +
                "\nNombre tienda= " + nombreTienda +
                "\nDireccion tienda= " + direccionTienda;
    }

    //Aumenta el stock de un producto una cantidad dada
    public void reponerStock(int nProducto, int cantidad){
        articulosTienda.get(nProducto).aumentaStock(cantidad);
    }
    //Reduce el stock de un producto una cantidad dada
    public void reducirStock(int nProducto, int cantidad){
        articulosTienda.get(nProducto).disminuyeStock(cantidad);
    }
    //Añade un objeto "Articulo" a la lista de la tienda
    public void anadirProductoNuevo(Articulo articulo){
        this.articulosTienda.add(articulo);
    }
    //Elimina un objeto "Articulo" de la lista de la tienda
    public void retirarProducto(int nProducto){
        this.articulosTienda.remove(nProducto);
    }
    //Cambia el precio de un producto segun una tasa/porcentaje
    public void ofertarProducto(int nProducto, double descuento){
        double precio = this.articulosTienda.get(nProducto).getPrecio();
        this.articulosTienda.get(nProducto).setPrecio(precio*descuento);
    }
    //Cambia el precio de todos los productos segun un porcentaje
    public void ofertar(double descuento){
        double precio;
        for(int i = 0; i<this.articulosTienda.size();i++){
            this.ofertarProducto(i,descuento);
        }
    }
    //Añade un objeto al carrito del cliente, y reduce el stock
    public void ventaProducto(int nProducto, int cantidad, Cliente cliente){
        Articulo aux =new Articulo(this.getArticulosTienda().get(nProducto).getNombreArticulo(),this.getArticulosTienda().get(nProducto).getPrecio(),cantidad);
        cliente.getCarritoCliente().add(aux);
        this.reducirStock(nProducto,cantidad);
    }
}
