package Lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число элементов массива");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int[] numbersRev = new int[n];
        int j = 0;
        int k = n - 1;

        for (int i = 0; i < n; i++) {
            j = i + 1;
            System.out.println("введите " + j + " элемент массива");
            numbers[i] = scanner.nextInt();
            numbersRev[k] = numbers[i];
            k--;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbersRev));
        if (Arrays.toString(numbers).equals(Arrays.toString(numbersRev))) {
            System.out.println("массив палиндром");
        } else {
            System.out.println("массив не палиндром");

        }
    }
}
