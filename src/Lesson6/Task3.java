package Lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
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
        System.out.println("было "+Arrays.toString(numbers));
        les6T3(numbers);
        System.out.println("стало "+Arrays.toString(numbers));

    }

    public static void les6T3(int[] numbers) {
        int[] numbersSor = new int[numbers.length];
        System.arraycopy(numbers, 0, numbersSor, 0, numbers.length);
        Arrays.sort(numbersSor);
        StringBuilder result = new StringBuilder();
        int k = 0;
        int h = 0;
        int i = 0;
        int sum = 0;
        while (k != 1) {
            for (int j = i; j < numbers.length; j++) {
                if ((numbers[j] == numbersSor[i])&&(i!=j)) {
                    h = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = h;
                    sum += 1;
                    String stSum = (" [" + numbers[i] + " " + numbers[j] + "] ");
                    result.append(stSum);
                    break;
                }
            }
            if (Arrays.toString(numbers).equals(Arrays.toString(numbersSor))) {
                k = 1;
            } else i++;
        }
        System.out.println("колличество перестановок = " + sum);
        System.out.println(result);
    }
}
