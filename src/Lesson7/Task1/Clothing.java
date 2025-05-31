package Lesson7.Task1;

public class Clothing implements Product {
    public double price;
    public int discount;
    String name;

    Clothing(String name, double price, int discount) {
        this.price = price;
        this.discount = discount;
        this.name = name;
    }

    @Override
    public String getFinalPrice() {
        String resum = String.format("%.2f", price - price / 100 * discount);
        return resum;
    }

}
