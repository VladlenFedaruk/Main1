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


    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                ", armor=" + armor +
                ", baseHealth=" + baseHealth +
                '}';
    }


}
