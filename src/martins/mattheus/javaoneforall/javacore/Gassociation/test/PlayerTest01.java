package martins.mattheus.javaoneforall.javacore.Gassociation.test;

import martins.mattheus.javaoneforall.javacore.Gassociation.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player p1 = new Player("Pelé");
        Player p2 = new Player("Messi");
        Player p3 = new Player("Cristiano Ronaldo");

        Player[] players = {p1, p2, p3};

        for (Player player : players) {
            player.print();
        }
    }
}
