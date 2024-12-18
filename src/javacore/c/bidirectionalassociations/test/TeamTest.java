package javacore.c.bidirectionalassociations.test;
import javacore.c.bidirectionalassociations.domain.Player;
import javacore.c.bidirectionalassociations.domain.Team;

public class TeamTest {
    // Bidirectional association (Player <-> Team)
    public static void main(String[] args) {
        Team team = new Team("Flamengo");
        Player player = new Player("Jhennifer");

        Team newTeam = new Team("Corinthians");
        Player newPlayer = new Player("Thomaz");

        Player[] players = {player, newPlayer};
        player.setTeam(team);
        newPlayer.setTeam(newTeam);
        for (Player p : players) {
            p.showPlayerInfo();
        }


        team.setPlayers(players);
        team.showTeamInfo();

        player.showPlayerInfo();
    }
}
