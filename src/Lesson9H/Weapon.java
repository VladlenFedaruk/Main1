package Lesson9H;

public class Weapon implements Cloneable{
    public String nameWeapon;
    public int baseWeaponDamage;

    public Weapon(String nameWeapon, int baseWeaponDamage) {
        this.nameWeapon = nameWeapon;
        this.baseWeaponDamage = baseWeaponDamage;
    }
    @Override
    protected Weapon clone() throws CloneNotSupportedException {
        return (Weapon) super.clone();
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
