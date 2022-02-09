package Herencias.Ajedrez;

public class Alfil extends Figura{
    public Alfil(boolean isWhite) {
        super(isWhite, 'A');
    }

    @Override
    public boolean canMove(Tablero tablero, int inicioNum, int inicioLetra, int destinoNum, int destinoLetra) {
        boolean res=false;

        if((destinoNum<9 && destinoNum>0) && (destinoLetra<'H' && destinoLetra>= 'A')){
            for(int i = 1; i<8;i++){
                //Hace falta implementar cuando haya una ficha de por medio en el tablero, o si la posicion esta ocupada por una ficha de su color o de otro color
                if(tablero.getTablero().get(inicioNum+i).get(inicioLetra+i)==tablero.getTablero().get(destinoNum).get(destinoLetra)){
                    res=true;
                    break;
                }
                if(tablero.getTablero().get(inicioNum-i).get(inicioLetra+i)==tablero.getTablero().get(destinoNum).get(destinoLetra)){
                    res=true;
                    break;
                }
                if(tablero.getTablero().get(inicioNum+i).get(inicioLetra-i)==tablero.getTablero().get(destinoNum).get(destinoLetra)){
                    res=true;
                    break;
                }
                if(tablero.getTablero().get(inicioNum-i).get(inicioLetra-i)==tablero.getTablero().get(destinoNum).get(destinoLetra)){
                    res=true;
                    break;
                }
            }
        }
        return res;
    }
}
