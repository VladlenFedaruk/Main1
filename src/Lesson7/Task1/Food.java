package Lesson7.Task1;

public class Food implements Product {
    public double price;
    public int discount;
    String name;

    Food(String name, double price, int discount) {
        this.price = price;
        this.discount = discount;
        this.name = name;
    }

    double resum = 0;

    @Override
    public String getFinalPrice() {
        String resum = String.format("%.2f", price - price / 100 * discount);
        return resum;
    }
}
