package Lesson7;

class CreditCardPayment extends Payment {
    long number;
    int pin;

    CreditCardPayment(String amount, String currency, long number, int pin) {
        super(amount, currency);
        this.number = number;
        this.pin = pin;
    }


    @Override
    public void processPayment() {
        System.out.println("производится платеж по карте номер " + number);
        System.out.println("сумма покупки составит " + amount + " " + currency);
        System.out.println("платеж прошел успешно");

    }
}
