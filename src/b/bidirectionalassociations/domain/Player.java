package b.bidirectionalassociations.domain;

// many-to-one association (bidirectional)
public class Player {
    private String name;
    private Team team;

    public void showPlayerInfo() {
        System.out.println("Player name: " + name);
        if (team != null) {
            System.out.println("Team name: " + team.getName());
        } else {
            System.out.println("Player is not assigned to any team.");
        }
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, Team team) {
        this.name = name;
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
