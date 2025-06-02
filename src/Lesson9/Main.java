package Lesson9;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Armor plateArmor = new Armor("Plate Armor", 300);
        Armor robberJacket = new Armor("Robber Jacket", 260);
        Armor huntsmanClothes = new Armor("Huntsman Clothes'", 200);

        Weapon bastardSword = new Weapon("Bastard Sword", 200);
        Weapon doubleDagger = new Weapon("Double Dagger", 260);
        Weapon compoundBow = new Weapon("Compound Bow", 300);

        Player paladin = new Player("Paladin", bastardSword.baseWeaponDamage, plateArmor.baseArmor, 3000);
        Player archer = new Player("Archer", compoundBow.baseWeaponDamage, huntsmanClothes.baseArmor, 1000);
        Player robber = new Player("Robber", doubleDagger.baseWeaponDamage, robberJacket.baseArmor, 2000);
        Player[] players = new Player[2];

        int j = 1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 1; i++) {
            System.out.println("Игрок " + j + " выберете игрового персонажа  - Paladin, 2 - Archer, 3- Robber");
            int num = scanner.nextInt();
            if (num == 1) {
                players[i] = paladin;
            }
            if (num == 2) {
                players[i] = archer;
            }
            if (num == 3) {
                players[i] = robber;
            }
            players[i].getPlayerName();
            String ch = scanner.nextLine();
            System.out.println("Ваши базовые характеристики " + players[i]);
            ch = scanner.nextLine();
            players[i].getBonus();
            System.out.println("Ваши характеристики после улучшения" + players[i]);
            ch = scanner.nextLine();
            j++;
        }
        System.out.println("Ну что, сразимся?");
        String ch = scanner.nextLine();
        players[0].getDamage();
        int setDam = players[0].damage;
        players[1].setDamage(setDam);
        System.out.println(players[1]);
    }
}
