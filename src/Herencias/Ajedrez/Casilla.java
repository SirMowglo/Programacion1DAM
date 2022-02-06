package Herencias.Ajedrez;

public class Casilla {
    protected char color;
    protected char letra;
    protected int num;
    protected boolean ocupada;
    private Figura pieza;

    //=========================================CONSTRUCTOR===================================================
    public Casilla(int letra, int num) {
        
        if(num%2==0){
            if(letra%2==0){
                this.color = 'N';
            }else{
                this.color = 'B';
            }
        }else{
            if(letra%2==0){
                this.color = 'B';
            }else{
                this.color = 'N';
            }
        }
        if(letra==1){
            this.letra ='A';
        }else if(letra==2){
            this.letra ='B';
        }else if(letra==3){
            this.letra ='C';
        }else if(letra==4){
            this.letra ='D';
        }else if(letra==5){
            this.letra ='E';
        }else if(letra==6){
            this.letra ='F';
        }else if(letra==7){
            this.letra ='G';
        }else if(letra==8){
            this.letra ='H';
        }
        this.pieza = null;
        this.num = num;
        this.ocupada = false;
    }
    //=======================================GETTER Y SETTER================================================
    //Color
    public char getColor() {
        return color;
    }
    //Letra
    public char getLetra() {
        return letra;
    }
    //Numero
    public int getNum() {
        return num;
    }
    //Esta ocupada
    public boolean isOcupada() {
        return ocupada;
    }
    //Pieza
    public Figura getPieza() {
        return pieza;
    }
    public void setPieza(Figura pieza) {
        this.pieza = pieza;
    }
    //===========================================METHODS====================================================

    @Override
    public String toString() {
        String res="";
        if(!this.isOcupada()){
            res = "|" + this.color + this.letra + this.num + "_|";
        }else{
            res = "|" + this.color + this.letra + this.num + this.pieza+"|";
        }
        return res;
    }
}
