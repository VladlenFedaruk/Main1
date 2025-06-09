package Lesson10;

public class Weapon {
   public String nameWeapon;
   public int baseWeaponDamage;

    public Weapon(String nameWeapon, int baseWeaponDamage) {
        this.nameWeapon = nameWeapon;
        this.baseWeaponDamage = baseWeaponDamage;
    }

    @Override
    public String toString() {
        return "(" +
                 nameWeapon +
                ", Урон = " + baseWeaponDamage +
                ')';
    }

    public Weapon() {

    }
}
