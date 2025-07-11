package Lesson14;

public class Counter {
    public int counter;
    public void incr(){
        counter++;
    }

    @Override
    public String toString() {
        return "Counter{"  + counter +
                '}';
    }
}
