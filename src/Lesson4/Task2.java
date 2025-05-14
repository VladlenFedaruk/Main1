package Lesson4;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку");
        String text = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        StringBuilder result3 = new StringBuilder();

        int countSymbol = text.length();
        for (int i = 0; i < countSymbol; i++) {
            char symbol = text.charAt(i);
            int code = symbol;
            result.append(code);
            result.append(" ");
        }

        int countSymbol2 = result.length();
        for (int i = 0; i < countSymbol2; i++) {
            char symbol = result.charAt(i);
            if (symbol != 32) {
                result2.append(symbol);
            } else {
               int number = Integer.valueOf(result2.toString());
                char resultNumber = (char) number;
                result3.append(resultNumber);
                result2.delete(0, countSymbol);
            }
        }

        System.out.println(result);
        System.out.println(result3);
    }

}