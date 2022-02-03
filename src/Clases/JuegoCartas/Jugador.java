package Clases.JuegoCartas;

import java.util.ArrayList;

public class Jugador {
    private String playerName;
    private ArrayList<Carta> playerHand = new ArrayList<Carta>();
    private int handValue =0;
    private boolean sticked = false;

    //-----------------------------------------CONSTRUCTOR----------------------------------------------

    public Jugador(String playerName) {
        this.playerName = playerName;
        for(int i =0; i<playerHand.size();i++){
            this.handValue = this.handValue + this.playerHand.get(i).getValue();
        }
    }

    public Jugador(String playerName, boolean sticked) {
        this.playerName = playerName;
        this.sticked = sticked;
        for(int i =0; i<playerHand.size();i++){
            this.handValue = this.handValue + this.playerHand.get(i).getValue();
        }
    }

    public Jugador(String playerName, ArrayList<Carta> playerHand, boolean sticked) {
        this.playerName = playerName;
        this.playerHand = playerHand;
        this.sticked = sticked;
    }

    public Jugador(String playerName, ArrayList<Carta> playerHand) {
        this.playerName = playerName;
        this.playerHand = playerHand;
    }
    //--------------------------------------GETTER Y SETTER---------------------------------------------

    public int getHandValue() {
        return handValue;
    }

    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public ArrayList<Carta> getPlayerHand() {
        return playerHand;
    }
    public void setPlayerHand(ArrayList<Carta> playerHand) {
        this.playerHand = playerHand;
        for(int i =0; i<playerHand.size();i++){
            this.handValue = this.handValue + this.playerHand.get(i).getValue();
        }
    }

    public boolean isSticked() {
        return sticked;
    }
    public void setSticked(boolean sticked) {
        this.sticked = sticked;
    }
    //------------------------------------------METHODS-------------------------------------------------
    public void draw(Mazo m1){
        Carta draw =m1.takeCard();
        this.playerHand.add(draw);
        this.handValue += draw.getValue();
    }
    public void stick(){
        this.sticked =true;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "playerName='" + playerName + '\'' +
                ", playerHand=" + playerHand +
                ", handValue=" + handValue +
                ", sticked=" + sticked +
                '}';
    }
}
