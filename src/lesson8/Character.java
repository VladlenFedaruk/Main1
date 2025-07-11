package lesson8;

public abstract class Character {
   public String name;
   public Weapon weapon;
   public Armor armor;
   public int baseHealth;

    public Character(String name, Weapon weapon, Armor armor, int baseHealth) {
        this.name = name;
        this.weapon = new Weapon("sfdgvesd",200);
        this.armor = armor;
        this.baseHealth = baseHealth;
    }

}
