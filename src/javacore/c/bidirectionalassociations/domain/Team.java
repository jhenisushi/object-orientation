package java.core.c.bidirectionalassociations.domain;

// one-to-many association (bidirectional)
public class Team {
    private String name;
    private Player[] players;

    public Team(String teamA) {
        this.name = teamA;
    }

    public Team(String name, Player[] players) {
        this.players = players;
        this.name = name;
    }

    public void showTeamInfo() {
        System.out.println("Team name: " + name);
        if (players == null) {
            System.out.println("Team has no players.");
            return;
        }
        for (Player player : players) {
            System.out.println("Player name: " + player.getName());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}
