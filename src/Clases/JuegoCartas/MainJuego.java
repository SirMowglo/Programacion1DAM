package Clases.JuegoCartas;
import java.util.Scanner;
public class MainJuego {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String respuesta ="";
        Mazo m1 = new Mazo();
        Partida g1= new Partida("Partidita", m1,4);
        m1.shuffleCards();
        System.out.println("hola");
        while(!g1.isEndGame()){
            for (int i = 0; i < g1.getnPlayers(); i++) {
                respuesta = "";
                if(!g1.getPlayers().get(i).isSticked()){
                    System.out.println("Valor de tu mano: "+ g1.getPlayers().get(i).getHandValue());
                    System.out.println("Quieres plantarte " + g1.getPlayers().get(i).getPlayerName() + "?");
                    respuesta = sc.nextLine().toUpperCase();
                    g1.round(respuesta, i);
                }
            }
            g1.endGame();
        }
        g1.checkWinner();
        System.out.println(g1);
    }
}
