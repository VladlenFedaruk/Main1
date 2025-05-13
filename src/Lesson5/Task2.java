package Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число элементов массива");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int j = 0;
        int chet = 0;
        int neChet = 0;

        for (int i = 0; i < n; i++) {
            j = i + 1;
            System.out.println("введите " + j + " элемент массива");
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 == 0) {
                chet += 1;
            } else
                neChet += 1;

        }

        System.out.println("четных чисел " + chet + "   нечетных чисел " + neChet);
        System.out.println(Arrays.toString(numbers));
    }

}
