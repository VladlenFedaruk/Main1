/**
 * Задача 7: Обратный порядок слов (Stack)
 * Дана строка "Hello world Java". Используйте Stack, чтобы перевернуть
 * порядок слов.
 */
package Lesson11;

import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
       //
        String text = "Hello world Java";
        String[] words = text.split("\\s+");
        for (int i=0; i<words.length; i++){


            stack.push(words[i]);

        }
        StringBuilder sb=new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
            sb.append(" ");
        }
        System.out.println(sb);
    }

}
