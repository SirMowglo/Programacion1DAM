package Herencias.Ajedrez;

import java.util.ArrayList;

public class Tablero {
    //Syntaxis del tablero --> tablero.get(numero).get(letra); (Letra,Numero)
    //EJ A4 --> tablero.get(4).get(1)
    private ArrayList<ArrayList<Casilla>> tablero;
    //===============================CONSTRUCTOR====================================
    public Tablero() {
        tablero= new ArrayList<ArrayList<Casilla>>();
        for(int numero=1; numero<=8;numero++){
            this.tablero.add(numero-1,new ArrayList<Casilla>());
            for(int letra=1; letra<=8; letra++ ){
                this.tablero.get(numero-1).add(letra-1,new Casilla(letra,numero));
            }
        }
    }
    //==============================GETTER Y SETTER==================================

    public ArrayList<ArrayList<Casilla>> getTablero() {
        return tablero;
    }
    public void setTablero(ArrayList<ArrayList<Casilla>> tablero) {
        this.tablero = tablero;
    }

    //==================================METHODS======================================
    @Override
    public String toString() {
        String res="";
        for(int letra = 7; letra>=0;letra--){
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
