package Lesson11H;

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("введите колличество человек в круге");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> num = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            num.addLast(i);
        }
        int i = 1;
        while (num.size() != 1) {
            System.out.println(num);
            if (i % 2 != 0) {
                int symbol = num.pollFirst();
                num.addLast(symbol);
            } else {
                num.pollFirst();
            }
            i++;
        }

System.out.println(num);
    }
}
