package lesson8;

public class Weapon {
    String name;
    int baseWeaponDamage;

    public Weapon(String name, int baseWeaponDamage) {
        this.name = name;
        this.baseWeaponDamage = baseWeaponDamage;
    }

    public static void rhdr() {
        Weapon bastardSword = new Weapon("Bastard Sword", 50);
        Weapon doubleDagger = new Weapon("Double Dagger", 75);
        Weapon compoundBow = new Weapon("Compound Bow", 100);
    }


}

