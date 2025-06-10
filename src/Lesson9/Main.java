package Lesson9;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Armor plateArmor = new Armor("Plate Armor", 300);
        Armor robberJacket = new Armor("Robber Jacket", 260);
        Armor huntsmanClothes = new Armor("Huntsman Clothes'", 200);

        Weapon bastardSword = new Weapon("Bastard Sword", 200);
        Weapon bonusMase = new Weapon("ЛЕГЕНДАРНАЯ БУЛАВА из драконего ел...ка", 250);
        Weapon doubleDagger = new Weapon("Double Dagger", 260);
        Weapon bonusDagger = new Weapon("ЛЕГЕНДАРНЫЙ нож нимфоманки", 300);
        Weapon compoundBow = new Weapon("Compound Bow", 300);
        Weapon bonusBow = new Weapon("ЛЕГЕНДАРНЫЙ самопередергивающий арбалет", 360);
        Weapon playerWewapon = new Weapon("name",50);

        Player paladin = new Player("Paladin", playerWewapon.baseWeaponDamage, plateArmor.baseArmor, 1000);
        Player archer = new Player("Archer", playerWewapon.baseWeaponDamage, huntsmanClothes.baseArmor, 800);
        Player robber = new Player("Robber", playerWewapon.baseWeaponDamage, robberJacket.baseArmor, 600);
        Player[] players = new Player[2];
        int j = 1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 1; i++) {
            System.out.println("Игрок " + j + " выберете игрового персонажа  1- Paladin, 2 - Archer, 3- Robber");
            int num = scanner.nextInt();
            if (num == 1) {
                playerWewapon=bastardSword;
                players[i] = paladin;
            }
            if (num == 2) {
                playerWewapon=doubleDagger;
                players[i] = archer;
            }
            if (num == 3) {
                playerWewapon=compoundBow;
                players[i] = robber;
            }
            players[i].getPlayerName();
            String ch = scanner.nextLine();
            System.out.println("Игрок " + players[i].playerName + " ваши базовые характеристики " + players[i]);
            ch = scanner.nextLine();
            System.out.println("Игрок " + players[i].playerName + " хочешь попытать удачу в поисках ЛЕГЕНДАРНОГО оружия, если да, нажми 1 ");
            int ch1 = scanner.nextInt();
            if (ch1 == 1) {
                players[i].getBonusWeapon();
            }
            players[i].getBonus();
            System.out.println("Игрок " + players[i].playerName + " ваши характеристики после улучшения " + players[i]);
            ch = scanner.nextLine();
            j++;
        }
        System.out.println("Ну что, сразимся?");
        String ch = scanner.nextLine();
        int i = 0;
        int l = 1;
        int k = 0;
        while ((players[i].baseHealth > 0) & (players[l].baseHealth > 0)) {
            players[i].getDamage();
            int setDam = players[i].damage;
            players[l].setDamage(setDam);
            System.out.println(players[l]);
            k = i;
            i = l;
            l = k;
        }
        System.out.println(players[i].playerName + " вы лузер))))");
        System.out.println(players[l].playerName + " вы вы ультрапобедитель))))");
        System.out.println(players[l] + " смотрите как вы хороши, еще бы раз сложили))))");
    }
}
