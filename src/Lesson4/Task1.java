package Lesson4;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку");
        String text = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int countSymbol = text.length();
        int k = 0;
        for (int i = 0; i < countSymbol; i++) {
            char symbol = text.charAt(i);
            if (symbol != 32) {
                int j = i - k;
                result.insert(j, symbol);
            } else {
                k = i + 1;
                result.insert(0, symbol);
            }
        }

        System.out.println(result);
    }

}
