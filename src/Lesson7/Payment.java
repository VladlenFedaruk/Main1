package Lesson7;

/**
 * Задача 1: Разработка платежной системы
 * Создай абстрактный класс Payment с методом processPayment(). Затем
 * реализуй два подкласса: CreditCardPayment и PayPalPayment.
 * Требования:
 * • Класс Payment должен содержать общие поля (amount, currency) и
 * абстрактный метод processPayment()
 * • CreditCardPayment должен обрабатывать оплату картой
 * • PayPalPayment должен обрабатывать оплату через PayPal
 * • В main() создай список платежей и обработай их
 */
abstract class Payment {
    protected String amount;
    protected String currency;

    Payment(String amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

       public abstract void processPayment();
}
