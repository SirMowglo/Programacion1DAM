package Clases.JuegoCartas;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> cards = new ArrayList<Carta>();
    private int numberOfCards;

    //----------------------------------------CONSTRUCTOR----------------------------------------------

    public Mazo() {
        //Filling the arraylist "cards" with cards
        for(int cardSymbol =1; cardSymbol<=4;cardSymbol++){
            for(int cardNumber =1; cardNumber<=13; cardNumber++){
                cards.add(new Carta(cardSymbol,cardNumber));
            }
        }
        //Number of cards of every deck
        this.numberOfCards = cards.size();
    }
    //-------------------------------------GETTER AND SETTER--------------------------------------------

    public ArrayList<Carta> getCards() {
        return cards;
    }
    public void setCards(ArrayList<Carta> cards) {
        this.cards = cards;
        this.numberOfCards = cards.size();
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }
    //----------------------------------------METHODS---------------------------------------------------

    @Override
    public String toString() {
        return "Mazo{" +
                "\ncards=" + cards +
                "\nnumberOfCards=" + numberOfCards +
                '}';
    }

    public void shuffleCards(){
        Collections.shuffle(cards);
    }

    public Carta takeCard(){
        Carta c1 = cards.get(0);
        this.removeCard(c1);
        return c1;
    }

    public void removeCard(Carta c1){
        cards.remove(c1);
    }
}
