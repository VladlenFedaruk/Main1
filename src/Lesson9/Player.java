package Lesson9;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Player extends Character {
    String playerName;
    int damage;

    public Player(String name, int weapon, int armor, int baseHealth) {
        super(name, weapon, armor, baseHealth);
    }

    public Player(String playerName, int damage) {
        super();
        this.playerName = playerName;
        this.damage = damage;


    }

    public Player getPlayerName() {
        System.out.println("Введите имя игрока");
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(playerName, damage);
        playerName = scanner.nextLine();
        return player;
    }

    public Player getBonus() {
        Player player = new Player(name, weapon, armor, baseHealth);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок " + playerName + " нажмите интер чтобы бросить кубик и расчитать бонус на урон");
        String ch = scanner.nextLine();
        int randomNum = ThreadLocalRandom.current().nextInt(1, 7);
        weapon = weapon + randomNum * 20;
        System.out.println("Оружие получает + " + randomNum * 10 + " к урону");
        ch = scanner.nextLine();
        System.out.println("Игрок " + playerName + " нажмите интер чтобы бросить кубик и расчитать бонус к броне");
        ch = scanner.nextLine();
        randomNum = ThreadLocalRandom.current().nextInt(1, 7);
        armor = armor + randomNum * 10;
        System.out.println("Броня получает + " + randomNum * 10 + " к защите");
        ch = scanner.nextLine();
        System.out.println("Игрок " + playerName + " нажмите интер чтобы бросить кубик и расчитать бонус к здоровью");
        ch = scanner.nextLine();
        randomNum = ThreadLocalRandom.current().nextInt(1, 7);
        baseHealth = baseHealth + randomNum * 10;
        System.out.println("Вы получаете + " + randomNum * 10 + " к здоровью");
        ch = scanner.nextLine();
        return player;
    }

    public void setDamage(int setDam) {
        if (setDam - armor > 0) {
            baseHealth = baseHealth - (setDam - armor);
        }

        System.out.println("Игрок " + playerName + "  теряет " + (setDam - armor) + " здоровья " + armor + " урона заблокировано броней");
        Scanner scanner = new Scanner(System.in);
        String ch = scanner.nextLine();
    }

    public int getDamage() {
        System.out.println("Игрок " + playerName + " нажмите интер чтобы бросить кубик и расчитать бонус на урон");
        Scanner scanner = new Scanner(System.in);
        String ch = scanner.nextLine();
        int randomNum = ThreadLocalRandom.current().nextInt(1, 7);
        if (randomNum < 2) {
            damage = weapon;
        } else damage = weapon + 10 * randomNum;
        System.out.println("Игрок " + playerName + " наносит " + damage + " урона " + weapon + " урона от оружия " + (damage - weapon) + " критического урона");
        ch = scanner.nextLine();
        return damage;
    }

    @Override
    public String toString() {
        return "Player " + playerName +
                ", '" + name +
                ", weapon=" + weapon +
                ", armor=" + armor +
                ", baseHealth=" + baseHealth;
    }

}






