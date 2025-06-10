package Lesson10;

public class Armor implements Cloneable {
    public String nameArmor;
    public int baseArmor;

    public Armor(String nameArmor, int baseArmor) {
        this.nameArmor = nameArmor;
        this.baseArmor = baseArmor;
    }

    @Override
    protected Armor clone() throws CloneNotSupportedException {
        return (Armor) super.clone();
    }

    @Override
    public String toString() {
        return "(" + nameArmor +
                ", Зашита = " + baseArmor + ")";

    }
}
