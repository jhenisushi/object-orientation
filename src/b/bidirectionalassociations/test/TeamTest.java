package b.bidirectionalassociations.test;
import b.bidirectionalassociations.domain.Player;
import b.bidirectionalassociations.domain.Team;

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

        team.setPlayers(players);
        players[0].showPlayerInfo();
        team.showTeamInfo();

        player.showPlayerInfo();
    }
}
