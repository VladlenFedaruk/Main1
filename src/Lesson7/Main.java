package Lesson7;

public class Main {
    public static void main(String[] args) {
        Payment[] payments = new Payment[4];
        payments[0] = new CreditCardPayment("100", "USD", 4235325654L, 1234);
        payments[1] = new CreditCardPayment("100000", "GBP", 132154654L, 4321);
        payments[2] = new PayPalPayment("10", "RUB", "Sobaka@.mail.ru", 4444);
        payments[3] = new PayPalPayment("100", "RMB", "Li@.gmail.com", 0000);
        for (int i = 0; i < payments.length; i++) {
            payments[i].processPayment();
            payments[i].amount = "10";
        }
    }

}
