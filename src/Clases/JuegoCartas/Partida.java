package Clases.JuegoCartas;

import java.util.ArrayList;

public class Partida {
    private String id_game;
    private ArrayList<Jugador> players = new ArrayList<Jugador>();
    private Mazo m1;
    private Jugador winner;
    private boolean endGame=false;
    private int nPlayers;

    //----------------------------------------CONSTRUCTOR-----------------------------------------------

    public Partida(String id_partida, ArrayList<Jugador> jugadores, Mazo m1) {
        this.id_game = id_partida;
        this.players = jugadores;
        this.m1 = m1;
    }

    public Partida(String id_partida, Mazo m1, int nPlayers) {
        this.id_game = id_partida;
        this.nPlayers = nPlayers;
        this.m1 = m1;

        for(int i=1; i<=nPlayers;i++){
            String name = "j"+i;
            this.players.add(new Jugador(name));
        }
    }
    //--------------------------------------GETTER Y SETTTER--------------------------------------------

    public String getId_game() {
        return id_game;
    }
    public void setId_game(String id_game) {
        this.id_game = id_game;
    }

    public ArrayList<Jugador> getPlayers() {
        return players;
    }
    public void setPlayers(ArrayList<Jugador> players) {
        this.players = players;
        this.nPlayers =players.size();
    }

    public Mazo getM1() {
        return m1;
    }
    public void setM1(Mazo m1) {
        this.m1 = m1;
    }

    public Jugador getWinner() {
        return winner;
    }
    public void setWinner(Jugador winner) {
        this.winner = winner;
    }

    public int getnPlayers() {
        return nPlayers;
    }

    public boolean isEndGame() {
        return this.endGame;
    }
    public void setEndGame(boolean endGame) {
        this.endGame = endGame;
    }
//-------------------------------------------METHODS------------------------------------------------

    @Override
    public String toString() {
        String res;
        if(endGame==true){
            res= "Partida{" +
                    "ID= " + id_game +
                    "\nplayers=" + players +
                    "\nganador=" + winner.getPlayerName() +
                    '}';
        }else{
            res="Partida{" +
                    "ID= " + id_game +
                    "\nplayers=" + "\n"+players +
                    '}';
        }
        return res;
    }

    public void round(String answer,int playerPosition){
        if (answer.charAt(0) == 'Y') {
            players.get(playerPosition).stick();
        }else{
            players.get(playerPosition).draw(m1);
        }
    }
    public void endGame(){
        this.endGame =true;
        for(int i=0; i<this.nPlayers;i++){
            if(!this.players.get(i).isSticked()){
                this.endGame=false;
            }
        }
    }
    //Comprobacion de que jugador gana, si llega a 21 es el ganador, si lo pasa pierde,
    //y si nadie llega gana el que mas se acerque
    public void checkWinner(){
        Jugador winnerAux = players.get(0);
        int winnerNum=0;
        for(int i = 0; i<nPlayers; i++){
            if(players.get(i).getHandValue() <=21 && players.get(i).getHandValue() > winnerNum){
                winnerAux = players.get(i);
                winnerNum = players.get(i).getHandValue();
            }
        }
        this.winner= winnerAux;
    }
}
