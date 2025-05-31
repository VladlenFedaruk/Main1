package Lesson7.Task1;

public class Main {
    public static void main(String[] args) {
        Clothing dress = new Clothing("Formal", 200.1, 5);
        Electronics dryer = new Electronics("Xiaomi Water Ionic", 120.75, 10);
        Food meat = new Food("beef",9.10, 30);

        System.out.println(dress.name + " " +dress.getFinalPrice() + " rub");
        System.out.println(dryer.name + " " +dryer.getFinalPrice()+ " rub");
        System.out.println(meat.name + " " +meat.getFinalPrice()+ " rub");


    }
}




