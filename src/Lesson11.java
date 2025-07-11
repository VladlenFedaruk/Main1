import javax.swing.text.html.HTMLDocument;
import java.util.LinkedList;

/**
 * Задача 2: Разворот LinkedList
 * Разверните LinkedList без использования Collections.reverse().
 */
public class Lesson11 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        LinkedList<Integer> reversNumbers = new LinkedList<>();
        numbers.add(34);
        numbers.add(12);
        numbers.add(4);
        numbers.add(66);
        numbers.add(45);
        numbers.add(1);
        numbers.add(-9);
        numbers.add(45);
        numbers.add(12);
        System.out.println(numbers);
        while (!numbers.isEmpty()) {

            reversNumbers.add(numbers.pollLast());
        }
        System.out.println(reversNumbers);
    }

}

