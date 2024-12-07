package learningfunctions.test;

import learningfunctions.domain.Player;

public class PlayerTest {
    public static void main(String[] args) {
        Player player1 = new Player("Ronaldo", 36);
        Player player2 = new Player("Messi", 34);
        Player player3 = new Player("Neymar", 29);

        // Association is a relationship between classes
        Player[] players = {player1, player2, player3};

        for (Player player : players) {
            System.out.println("Name: " + player.getName() + ", Age: " + player.getAge());
        }
    }
}
