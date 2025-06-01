package Lesson9;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Armor plateArmor = new Armor("Plate Armor", 300);
        Armor robberJacket = new Armor("Robber Jacket", 200);
        Armor huntsmanClothes = new Armor("Huntsman Clothes'", 100);

        Weapon bastardSword = new Weapon("Bastard Sword", 50);
        Weapon doubleDagger = new Weapon("Double Dagger", 75);
        Weapon compoundBow = new Weapon("Compound Bow", 100);

        Player paladin = new Player("Paladin", bastardSword.baseWeaponDamage, plateArmor.baseArmor, 300);
        Player archer = new Player("Archer", compoundBow.baseWeaponDamage, huntsmanClothes.baseArmor, 100);
        Player robber = new Player("Robber", doubleDagger.baseWeaponDamage, robberJacket.baseArmor, 100);
        Player[] players = new Player[2];

        int j = 1;
        for (int i = 0; i <= 1; i++) {
            System.out.println("Игрок " + j + " выберете игрового персонажа  - Paladin, 2 - Archer, 3- Robber");
            Scanner scanner = new Scanner(System.in);
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
            System.out.println(players[i]);
            j++;
        }
        for (int i = 0; i <= 10; i++){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 7);
        System.out.println(randomNum);}
    }
}
