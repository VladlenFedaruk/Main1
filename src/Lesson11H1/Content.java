package Lesson11H1;

public class Content<T> {
    private T content;

    public Content(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "(" + content+")";
    }
}

