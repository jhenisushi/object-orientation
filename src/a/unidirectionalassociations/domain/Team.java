package associations.domain;

import learningfunctions.domain.Player;

public class Team {
    private String name;

    public Team(String teamA) {
    }

    public void showTeamName() {
        System.out.println("Team name: " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
