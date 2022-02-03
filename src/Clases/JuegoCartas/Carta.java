package Clases.JuegoCartas;

public class Carta {
    private int symbol;
    private int number;
    private int value;

    //-------------------------------------------CONSTRUCTOR-------------------------------------------------

    public Carta(int symbol, int number) {
        this.symbol = symbol;
        this.number = number;
        this.value =this.calculaValor();
        if(this.symbol<=0){
            this.symbol =1;
        }
        if(this.symbol>=5){
            this.symbol =4;
        }
        if(this.number<=0){
            this.number =1;
        }
        if(this.number>=14){
            this.number =13;
        }
    }

    //-----------------------------------------GETTER Y SETTER-----------------------------------------------

    public int getSymbol() {
        return symbol;
    }
    public void setSymbol(int symbol) {
        this.symbol = symbol;
        if(this.symbol<=0){
            this.symbol =1;
        }
        if(this.symbol>=5){
            this.symbol =4;
        }
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
        if(this.number<=0){
            this.number =1;
        }
        if(this.number>=14){
            this.number =13;
        }
        this.value = this.calculaValor();
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    //---------------------------------------------METHODS---------------------------------------------------
    public String numberToString(){
        String numberString;
        if(this.number== 1){
            numberString ="As";
        }else if(this.number == 11){
            numberString ="Jack";
        }else if(this.number == 12){
            numberString ="Queen";
        }else if(this.number == 13){
            numberString ="King";
        }else {
            numberString = this.number + "";
        }
        return numberString;
    }
    public String symbolToString(){
        String symbolString;
        if(this.symbol == 1){
            symbolString ="Diamonds";
        }else if(this.symbol == 2){
            symbolString ="Hearts";
        }else if(this.symbol == 3){
            symbolString ="Clubs";
        }else if(this.symbol == 4){
            symbolString ="Spades";
        } else{
            symbolString ="None";
        }
        return symbolString;
    }

    public int calculaValor(){
        int res= 0;
        if(this.number<10){
            res=this.number;
        }else{
            res= 10;
        }
        return res;
    }
    @Override
    public String toString() {
        return "\nCarta{" +
                "symbol=" + this.symbolToString() +
                ", number=" + this.numberToString() +
                ", value=" + value +
                "}";
    }
}
