package Lesson9;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

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
        Player player = new Player(playerName);
        playerName = scanner.nextLine();
        return player;
    }
    public Player getBonus(){
        Player player = new Player(name,weapon,armor,baseHealth);
        System.out.println("Нажмите интер чтобы бросить кубик и расчитать бонус на урон");
        Scanner scanner = new Scanner(System.in);
        String  ch= scanner.nextLine();
        int randomNum = ThreadLocalRandom.current().nextInt(1, 7);
        weapon=weapon+randomNum*10;
        System.out.println("Оружие получает + "+ randomNum*10 + " к урону");
        ch= scanner.nextLine();
        System.out.println("Нажмите интер чтобы бросить кубик и расчитать бонус к броне");
        ch= scanner.nextLine();
        randomNum = ThreadLocalRandom.current().nextInt(1, 7);
        armor=armor+randomNum*10;
        System.out.println("Броня получает + "+ randomNum*10 + " к защите");
        ch= scanner.nextLine();
        System.out.println("Нажмите интер чтобы бросить кубик и расчитать бонус к здоровью");
        ch= scanner.nextLine();
        randomNum = ThreadLocalRandom.current().nextInt(1, 7);
       baseHealth=baseHealth+randomNum*10;
        System.out.println("Броня получает + "+ randomNum*10 + " к защите");
        ch= scanner.nextLine();
        return player;
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






