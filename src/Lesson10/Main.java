package Lesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Armor plateArmor = new Armor("Plate Armor", 250);
        Armor robberJacket = new Armor("Robber Jacket", 210);
        Armor huntsmanClothes = new Armor("Huntsman Clothes", 150);

        Weapon bastardSword = new Weapon("Bastard Sword", 300);
        Weapon doubleDagger = new Weapon("Double Dagger", 360);
        Weapon compoundBow = new Weapon("Compound Bow", 400);
        Weapon playerWeapon = new Weapon("name", 50);


        Player paladin = new Player("Player","Паладин", playerWeapon, plateArmor, 1000);
        Player robber = new Player("Player","Разбойник", playerWeapon, robberJacket, 900);
        Player archer = new Player("Player","Лучник", playerWeapon, huntsmanClothes, 800);

        Player[] players = new Player[2];
        int j = 1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 1; i++) {
            System.out.println("Игрок " + j + " выберете игрового персонажа  1- Паладин, 2 - Разбойник, 3- Лучник");
            int num = scanner.nextInt();
            if (num == 1) {
                players[i] = paladin.clone();
                playerWeapon = bastardSword;
                players[i].weapon = playerWeapon;
            }
            if (num == 2) {
                players[i] = robber.clone();
                playerWeapon = doubleDagger;
                players[i].weapon = playerWeapon;
            }
            if (num == 3) {
                players[i] = archer.clone();
                playerWeapon = compoundBow;
                players[i].weapon = playerWeapon;
            }

            players[i].getPlayerName();
            String ch = scanner.nextLine();
            System.out.println("Игрок " + players[i].playerName + " ваши базовые характеристики " + players[i]);
            ch = scanner.nextLine();
            System.out.println("Игрок " + players[i].playerName + " хочешь попытать удачу в поисках ЛЕГЕНДАРНОГО оружия, если да, нажми 1, если нет - 2");
            int ch1 = scanner.nextInt();
            if (ch1 == 1) {
                players[i].getBonusWeapon(players[i]);
            }
            players[i].getBonus(players[i]);
            System.out.println("Игрок " + players[i].playerName + " ваши характеристики после улучшения " + players[i]);
            ch = scanner.nextLine();
            j++;

        }
        System.out.println("Ну что, сразимся?");
        String ch = scanner.nextLine();
        int i = 0;
        int l = 1;
        int k = 0;
        while (true) {
            if ((players[i].baseHealth > 0) & (players[l].baseHealth > 0)) {
                players[i].getDamage();
                int playerDam = players[i].playerDamage;
                players[l].setDamage(playerDam);
                k = i;
                i = l;
                l = k;
            } else {
                players[i].baseHealth = 0;
                System.out.println("Игрок " + players[l].playerName + " " + players[l]);
                System.out.println("Игрок " + players[i].playerName + " " + players[i]);
                break;
            }
            System.out.println("Игрок " + players[l].playerName + " " + players[l]);
            System.out.println("Игрок " + players[i].playerName + " " + players[i]);
            ch = scanner.nextLine();
        }

        System.out.println(players[i].playerName + " вы лузер))))");
        System.out.println(players[l].playerName + " вы вы ультрапобедитель))))");
        System.out.println(players[l].playerName + " смотрите как вы хороши, еще бы раз сложили))))");

    }
}
