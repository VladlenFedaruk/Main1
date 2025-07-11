package Lesson7;

class PayPalPayment extends Payment {
    String mail;
    int pin;

    PayPalPayment(String amount, String currency, String mail, int pin) {
        super(amount, currency);
        this.mail = mail;
        this.pin = pin;
    }

    @Override
    public void processPayment() {
        System.out.println("ваша почта " + mail);
        System.out.println("вы желаете оплатить покупку на сумму" + amount);
        System.out.println("оплата прошла сумму " + amount+ " " + currency + " прощла успешно");
    }
}
