package Lesson14;

/**
 Создание нескольких потоков для вывода чисел
 Создайте 5 потоков, каждый из которых будет выводить число от 1 до 100.
 */

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MyThread thread1 = new MyThread("thread1", counter);
        MyThread thread2 = new MyThread("thread2", counter);
        MyThread thread3 = new MyThread("thread3", counter);
        MyThread thread4 = new MyThread("thread4", counter);
        MyThread thread5 = new MyThread("thread5", counter);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();


        System.out.println(thread1.isAlive());
        System.out.println(thread2.isAlive());

    }
}
