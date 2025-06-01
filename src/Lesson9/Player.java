package Lesson9;

import java.util.Scanner;

public class Player extends Character {
    String playerName;

    public Player(String name, int weapon, int armor, int baseHealth) {
        super(name, weapon, armor, baseHealth);
        }

    public Player(String playerName) {
        super();
        this.playerName = playerName;
    }

    public Player getPlayerName() {
        System.out.println("Введите имя игрока");
        Scanner scanner = new Scanner(System.in);
        Player playerI = new Player(playerName);
        playerName = scanner.nextLine();
        return playerI;
    }

    @Override
    public String toString() {
        return "Player " + playerName+
                ", '" + name +
                ", weapon=" + weapon +
                ", armor=" + armor +
                ", baseHealth=" + baseHealth  ;
    }
}





