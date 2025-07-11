package Lesson11H;

import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();

        System.out.println("введите колличество элементов в LinkedList 1");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        for (int i = 1; i <= n1; i++) {
            System.out.println("введите " + i + " элемент");
            int elenent = scanner.nextInt();
            list1.addLast(elenent);
        }
        System.out.println("введите колличество элементов в LinkedList 2");
        scanner = new Scanner(System.in);
        int n2 = scanner.nextInt();
        for (int i = 1; i <= n2; i++) {
            System.out.println("введите " + i + " элемент");
            int elenent = scanner.nextInt();
            list2.addLast(elenent);
        }
        System.out.println("LinkedList1 " + list1);
        System.out.println("LinkedList1 " + list2);

        while ((list1.size() != 0) && (list2.size() != 0)) {
            if ((list1.peekFirst() < list2.peekFirst())) {
                list3.addLast(list1.pollFirst());
            } else {
                list3.addLast(list2.pollFirst());
            }
        }
        while (list1.size() != 0) {
            list3.addLast(list1.pollFirst());
        }
        while (list2.size() != 0) {
            list3.addLast(list2.pollFirst());
        }


        System.out.println("LinkedList3 " + list3);
    }
}
