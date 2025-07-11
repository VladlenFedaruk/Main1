package lesson8;

public class Armor {
    String name;
    int baseArmor;

    public Armor(String name, int baseArmor) {
        this.name = name;
        this.baseArmor = baseArmor;
    }

    public static void getdam(int kub, int newArmor){
    Armor plateArmor = new Armor("Plate Armor", 300);
    newArmor =kub* plateArmor.baseArmor;

}
    Armor plateArmor = new Armor("Plate Armor", 300);
    Armor robberJacket = new Armor("Robber Jacket", 200);
    Armor huntsmanClothes = new Armor("Huntsman Clothes'", 100);

}
