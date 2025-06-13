package Lesson10H;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("введите числ A");
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            System.out.println("введите числ B");
            int b = scanner.nextInt();
            int d = a / b;
            float c = (float) a / b;
            System.out.println("A / B = "+c);
        } catch (ArithmeticException e) {
            System.out.println("на ноль делить нельзя");
        } catch (InputMismatchException e) {
            System.out.println("вы должны вводить числа");
        }


    }
}
