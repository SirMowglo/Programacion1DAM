package Herencias.Ajedrez;

import java.util.ArrayList;

public class Tablero {
    private ArrayList<ArrayList<Casilla>> tablero;
    public Tablero() {
        tablero= new ArrayList<ArrayList<Casilla>>();
        for(int letra=1; letra<=8;letra++){
            this.tablero.add(letra-1,new ArrayList<Casilla>());
            for(int numero=1; numero<=8; numero++ ){
                this.tablero.get(letra-1).add(numero-1,new Casilla(numero,letra));
            }
        }
    }

    @Override
    public String toString() {
        String res="";
        for(int letra = 0; letra<=7;letra++){
            for(int numero=0; numero<=7;numero++){
                if(numero==7){
                    res += this.tablero.get(letra).get(numero) +"\n";
                }else{
                    res+= this.tablero.get(letra).get(numero);
                }
            }
        }
        return res;
    }
}
