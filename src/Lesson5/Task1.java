package Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        mode2();
    }

    public static void mode1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число элементов массива");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int[] numbersSor = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            j = i + 1;
            System.out.println("введите " + j + " элемент массива");
            numbers[i] = scanner.nextInt();
        }

        System.arraycopy(numbers, 0, numbersSor, 0, n);
        Arrays.sort(numbersSor);
        int numMin = numbersSor[0];
        int numMax = numbersSor[n - 1];
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < n; i++) {
            if (numbers[i] == numMin) {
                indexMin = i;
            }
            if (numbers[i] == numMax) {
                indexMax = i;
            }
        }

        System.out.println("Минимальный элемент массива " + numMin + " c индексом " + indexMin);
        System.out.println("Максимальноый элемент массива " + numMax + " c индексом " + indexMax);
    }

    public static void mode2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число элементов массива");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            j = i + 1;
            System.out.println("введите " + j + " элемент массива");
            numbers[i] = scanner.nextInt();
        }
        int numMin = numbers[0];
        int numMax = numbers[0];
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < n; i++) {
            if (numbers[i] >= numMax) {
                numMax = numbers[i];
                indexMax = i;
            }
            if (numbers[i] <= numMin) {
                numMin = numbers[i];
                indexMin = i;
            }
        }

        System.out.println("Минимальный элемент массива " + numMin + " c индексом " + indexMin);
        System.out.println("Максимальноый элемент массива " + numMax + " c индексом " + indexMax);
        System.out.println(Arrays.toString(numbers));
    }

}
