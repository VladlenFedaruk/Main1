package Lesson10;

public class Character {
    public String name;
    public Weapon weapon;
    public Armor armor;
    public int baseHealth;
    public String playerName;

    public Character(String playerName, String name, Weapon weapon, Armor armor, int baseHealth) {
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
        this.baseHealth = baseHealth;
        this.playerName=playerName;
    }
    public Character(String playerName){
        this.playerName=playerName;
    }



    public Character() {

    }
}
