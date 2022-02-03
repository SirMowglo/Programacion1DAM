package Herencias.Ajedrez;

import java.util.ArrayList;

public class Tablero {
    private ArrayList<Casilla> tablero;

    public ArrayList<Casilla> getTablero() {
        return tablero;
    }

    public Tablero() {
        tablero= new ArrayList<Casilla>();
        for(int numero=1; numero<=8;numero++){
            for(int letra=1; letra<=8; letra++ ){
                    this.tablero.add(new Casilla(letra, numero));
            }
        }
    }

    @Override
    public String toString() {
        String res="";
        for(int i = 0; i<=63;i++){
            if(i==7 || i==15|| i==23||i==31||i==39||i==47||i==55){
                res += tablero.get(i).toString() +'\n';
            }else{
                res += tablero.get(i).toString();
            }
        }
        return res;
    }
}
