package martins.mattheus.javaoneforall.javacore.Gassociation.test;

import martins.mattheus.javaoneforall.javacore.Gassociation.domain.Player;
import martins.mattheus.javaoneforall.javacore.Gassociation.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player p1 = new Player("Pelé");
        Team t1 = new Team("Corinthians");

        p1.setTeam(t1);

        p1.print();
    }
}
