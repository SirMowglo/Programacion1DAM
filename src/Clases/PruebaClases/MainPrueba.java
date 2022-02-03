package Clases.PruebaClases;

import javax.rmi.CORBA.Tie;
import java.util.ArrayList;

public class MainPrueba {
    public static void main(String[] args) {
        Articulo a1 = new Articulo("banana",20.4,100);
        Articulo a2 = new Articulo("chocolate",12.5,100);
        Articulo a3 = new Articulo("cocaina",50.5,100);
        Cliente c1 =new Cliente("Manolo", 200);
        ArrayList<Articulo> articulosTienda= new ArrayList<Articulo>();
        articulosTienda.add(a1);
        articulosTienda.add(a2);
        articulosTienda.add(a3);
        Tienda t1 = new Tienda(articulosTienda,"Tiendita");
        System.out.println(t1);
        System.out.println(c1);
        System.out.println("==============");
        c1.anadirProducto(0,3,t1);
        c1.anadirProducto(1,2,t1);
        c1.compraProducto();
        System.out.println(t1);
        System.out.println(c1);
        System.out.println("===============");
        c1.devolverProducto(1,5,t1);
        System.out.println(t1);
        System.out.println(c1);
        System.out.println("===============");
        t1.ofertar(0.8);
        System.out.println(t1);
    }
}
