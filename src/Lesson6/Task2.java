package Lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число элементов массива");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            System.out.println("введите " + j + " элемент массива");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("было " + Arrays.toString(numbers));
        les6T2(numbers);
        System.out.println("стало " + Arrays.toString(numbers));

    }

    public static void les6T2(int[] numbers) {
        Arrays.sort(numbers);
        int[][] numbersIndex = new int[2][numbers.length];
        int j = 0;
        numbersIndex[0][0] = 1;
        numbersIndex[1][0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1]) {
                j += 1;
                numbersIndex[0][j] += 1;
                numbersIndex[1][j] = numbers[i];
            } else {
                numbersIndex[0][j] += 1;
            }
        }

        int k = 0;
        int kIndex = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (j = 0; j < numbers.length - 1; j++) {
                if (numbersIndex[0][j] < numbersIndex[0][j + 1]) {
                    k = numbersIndex[0][j];
                    kIndex = numbersIndex[1][j];
                    numbersIndex[0][j] = numbersIndex[0][j + 1];
                    numbersIndex[1][j] = numbersIndex[1][j + 1];
                    numbersIndex[0][j + 1] = k;
                    numbersIndex[1][j + 1] = kIndex;
                }
            }
        }
        int h = 0;
        int i = 0;
        for (i = 0; i < numbers.length; i++) {
            for (j = 0; j < numbersIndex[0][i]; j++) {
                numbers[h] = numbersIndex[1][i];
                h++;
            }
        }

    }
}
