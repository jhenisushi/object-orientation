package a.unidirectionalassociations.test;
import a.unidirectionalassociations.domain.Team;
import a.unidirectionalassociations.domain.Player;

public class PlayerTest {
    // Unidirectional association (Player -> Team)
    public static void main(String[] args) {
        Team team = new Team("Team A");
        Player player = new Player("John Doe", team);
        player.showPlayerInfo();

        Team newTeam = new Team("Team B");
        player.setTeam(newTeam);
        player.showPlayerInfo();
    }
}
