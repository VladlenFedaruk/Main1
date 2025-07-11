package Lesson15;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Задача 3: защита ресурса
 * Создай класс SharedResource, к которому могут обращаться несколько потоков.
 * Используй ReentrantLock, чтобы предотвратить одновременный доступ.
 *
 * Задача 4: попытка захвата блокировки
 * Напиши программу, где два потока пытаются одновременно захватить ReentrantLock.
 * Один поток использует tryLock() и, если не может захватить, выполняет другую работу.
 */

public class Test1 {
    public static void main(String[] args) {
        SharedResource phone = new SharedResource("samsung", 1500);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                for (int j = 1; j < 20; j++) {

                    phone.setCache(2);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });

        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(phone.getCache());
    }
}
