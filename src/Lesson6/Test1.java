package Lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        minSwaps(arrayScanner());
    }

    public static int[] arrayScanner() {
        int arrayRange;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        arrayRange = scanner.nextInt();
        int[] sourceArray = new int[arrayRange];
        System.out.println("Введите целочисленные элементы массива");
        for (int i = 0; i < arrayRange; i++) {
            int element = scanner.nextInt();
            sourceArray[i] = element;
        }
        return sourceArray;
    }

    public static void minSwaps(int[] array) {
        int n = array.length;
        Integer[] sortedIndices = new Integer[n];
        for (int i = 0; i < n; i++) {
            sortedIndices[i] = i;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[sortedIndices[j]] > array[sortedIndices[j + 1]]) {
                    int temp = sortedIndices[j];
                    sortedIndices[j] = sortedIndices[j + 1];
                    sortedIndices[j + 1] = temp;
                }
            }
        }

        int[] pos = new int[n];
        for (int j = 0; j < n; j++) {
            int originalIndex = sortedIndices[j];
            pos[originalIndex] = j;
        }

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int cycleLength = 0;
                int current = i;
                while (!visited[current]) {
                    visited[current] = true;
                    current = pos[current];
                    cycleLength++;
                }
                swaps += (cycleLength - 1);
            }
        }
        System.out.println("Необходимо минимум " + swaps + " перестановок");
    }
}
