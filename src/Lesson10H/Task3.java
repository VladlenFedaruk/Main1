package Lesson10H;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("введите текст");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        try {
            textLenght(text);
        } catch (IllegalArgumentException e) {
            System.out.println("строка не должна быть пустой");
        }

    }

    public static void textLenght(String text) throws IllegalArgumentException {
        if (text.isEmpty()) {
            throw new IllegalArgumentException("error");
        } else {
            System.out.println("вы молодец");
        }

    }
}
