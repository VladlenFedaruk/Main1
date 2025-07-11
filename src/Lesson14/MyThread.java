package Lesson14;

public class MyThread extends Thread {
    String name;


    public MyThread(String name1, Counter counter) {

        this.name = name1;

    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
        System.out.println(name +" "+i);

        }
    }
}
