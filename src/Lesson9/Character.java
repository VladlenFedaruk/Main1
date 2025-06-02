package Lesson9;
public abstract class Character {
     String name;
     int weapon;
     int armor;
     int baseHealth;

    public Character(String name, int weapon, int armor, int baseHealth) {
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
        this.baseHealth = baseHealth;
    }


    public Character() {

    }
}
