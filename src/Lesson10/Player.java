package Lesson10;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Player extends Character implements Cloneable {
    public String playerName;
    public int playerDamage;

    public Player(String playerName, String name, Weapon weapon, Armor armor, int baseHealth) {
        super(playerName, name, weapon, armor, baseHealth);
    }

    public Player(String playerName, int playerDamage) {
        super(playerName);
        this.playerDamage = playerDamage;
    }

    Weapon bonusMase = new Weapon("ЛЕГЕНДАРНАЯ БУЛАВА из драконего ел...ка", 350);
    Weapon bonusDagger = new Weapon("ЛЕГЕНДАРНЫЙ нож нимфоманки", 410);
    Weapon bonusBow = new Weapon("ЛЕГЕНДАРНЫЙ самопередергивающий арбалет", 450);
    Weapon brassKnuckles = new Weapon("Чудо костет", 250);

    @Override
    public Player clone() throws CloneNotSupportedException {
        this.armor =  armor.clone();
        this.weapon = weapon.clone();
        return (Player) super.clone();
    }

    public String getPlayerName() {
        System.out.println("Введите имя игрока");
        Scanner scanner = new Scanner(System.in);
        playerName = scanner.nextLine();
        return playerName;
    }

    public Player getBonusWeapon(Player player) {

        int randomNum = ThreadLocalRandom.current().nextInt(1, 4);
        if (randomNum == 1) {
            weapon = brassKnuckles;
            System.out.println("Игрок " + playerName + " ты неудачник и сломал свое оружие, damage = " + brassKnuckles.baseWeaponDamage);
        }
        if (randomNum == 2) {
            if (weapon.baseWeaponDamage == 400) {
                System.out.println("Игрок " + playerName + " тебе повезло, ты нашел " + bonusBow);
                weapon = bonusBow;

            }
            if (weapon.baseWeaponDamage == 360) {
                System.out.println("Игрок " + playerName + " тебе повезло, ты нашел " + bonusDagger);
                weapon = bonusDagger;
            }
            if (weapon.baseWeaponDamage == 300) {
                System.out.println("Игрок " + playerName + " тебе повезло, ты нашел " + bonusMase);
                weapon = bonusMase;
            }
        }
        if (randomNum == 3) {
            System.out.println("Игрок " + playerName + " ты ничего не нашел");

        }

        return player;
    }

    public Player getBonus(Player player) {

        Scanner scanner = new Scanner(System.in);
        String ch = scanner.nextLine();
        System.out.println("Игрок " + playerName + " нажмите интер чтобы бросить кубик и расчитать бонус на урон");
        ch = scanner.nextLine();
        int randomNum = ThreadLocalRandom.current().nextInt(1, 7);
        weapon.baseWeaponDamage += (randomNum * 20);
        System.out.println("Оружие получает + " + randomNum * 20 + " к урону");
        ch = scanner.nextLine();
        System.out.println("Игрок " + playerName + " нажмите интер чтобы бросить кубик и расчитать бонус к броне");
        ch = scanner.nextLine();
        randomNum = ThreadLocalRandom.current().nextInt(1, 7);
        armor.baseArmor += randomNum * 10;
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

    public int getDamage() {
        int damage = 0;
        System.out.println("Игрок " + playerName + " нажмите интер чтобы бросить кубик и расчитать бонус на урон");
        Scanner scanner = new Scanner(System.in);
        String ch = scanner.nextLine();
        int randomNum = ThreadLocalRandom.current().nextInt(1, 7);
        if (randomNum < 2) {
            playerDamage = weapon.baseWeaponDamage;
        } else playerDamage = weapon.baseWeaponDamage + 10 * randomNum;
        System.out.println("Игрок " + playerName + " наносит " + playerDamage + " урона, " + weapon.baseWeaponDamage + " урона от оружия и " + (playerDamage - weapon.baseWeaponDamage) + " критического урона");
        return playerDamage;
    }

    public void setDamage(int playerDam) {
        if (playerDam > armor.baseArmor) {
            System.out.println("Игрок " + playerName + "  теряет " + (playerDam - armor.baseArmor) + " здоровья " + armor.baseArmor + " урона заблокировано броней");
            baseHealth -= (playerDam - armor.baseArmor);
        } else {
            System.out.println("весь урон заблокирован броней");
        }
        Scanner scanner = new Scanner(System.in);
        String ch = scanner.nextLine();
    }


    @Override
    public String toString() {
        return "Класс - '" + name + '\'' +
                ", Оружие - " + weapon +
                ", Броня - " + armor +
                ", Здоровье - " + baseHealth;
    }
}


