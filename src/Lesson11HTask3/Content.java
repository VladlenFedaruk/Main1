package Lesson11HTask3;

import java.util.Scanner;

public class Content<T> {
    public T content;


    public Content(T content) {
        this.content = (T) content;


    }

    public Content() {

    }

    public T getContent(int i) {
        return content;
    }

    public Content<String> setContent(T content) {
        Scanner scanner = new Scanner(System.in);
        this.content = content;
        System.out.println("введите элемент");
        Content<String> st1 = new Content<>(scanner.nextLine());
        return st1;
    }

    @Override
    public String toString() {
        return "Content{" +
                "content=" + content +
                '}';
    }
}
