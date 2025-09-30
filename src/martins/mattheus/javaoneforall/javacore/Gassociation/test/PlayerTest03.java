package martins.mattheus.javaoneforall.javacore.Gassociation.test;

import martins.mattheus.javaoneforall.javacore.Gassociation.domain.Player;
import martins.mattheus.javaoneforall.javacore.Gassociation.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Player player2 = new Player("Messi");
        Team team1 = new Team("Corintihans");
        Player[] players = {player1, player2};

        player1.setTeam(team1);
        player2.setTeam(team1);
        team1.setPlayers(players);

        System.out.println("------ Jogador 1 ------");

        player1.print();

        System.out.println("------ Jogador 2 ------");

        player2.print();

        System.out.println("\n------ Time ------");

        team1.print();

        Team[] teams = {team1};


    }
}
