package Lesson15;


import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    private final ReentrantLock lock = new ReentrantLock();

    private String name;
    private int cache;

    public SharedResource(String name, int cache) {
        this.name = name;
        this.cache = cache;
    }

    public void setCache(int diff) {
        if (lock.tryLock()){
            cache -= diff;
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            lock.unlock();
        }else System.out.println("занято");

    }

    public int getCache() {
        return cache;
    }
}
