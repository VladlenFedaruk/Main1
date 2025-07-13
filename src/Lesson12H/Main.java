package Lesson12H;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("какую задачу вы хотите запустить 1 или 2?");
        int numberTask = scanner.nextInt();
        if (numberTask == 1) {
            String text1 = "ststss yu uy fdg dfg gfd uy r t uy g ds h dfg fdg gfd dfg gfd 1 1 1 fggd dffg";
            String[] text11 = text1.split("\\s+");
            Task1.sortArray(text11);
        }
        if (numberTask == 2) {
            Map<Integer, Integer> ch = new HashMap<>();
            System.out.println("введите кол-во чисел");
            int n = scanner.nextInt();
            int res=0;
            int index = 0;
            int i = 1;
            for (int j = 0; j < n; j++) {
                System.out.println("введите " + i + " число");
                int num = scanner.nextInt();
                while (index != 1) {
                    if (!ch.containsKey(num)) {
                        ch.put(num, 1);
                        break;
                    } else {
                        res = num;
                        index=1;
                    }
                }
                i++;
            }
            if (index==1)
                System.out.println("первое повторяющееся число "+res);
            else System.out.println("числа не повторяются");
        }
    }
}

