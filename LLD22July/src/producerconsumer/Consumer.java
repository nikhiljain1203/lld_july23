package producerconsumer;

import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable {
    Queue<Object> shirts;
    int maxSize;
    String name;
    Lock lock;

    public Consumer(String name, Queue<Object> shirts, int maxSize, Lock lock) {
        this.shirts = shirts;
        this.maxSize = maxSize;
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (shirts.size() > 0) {
                shirts.remove();
                System.out.println(name + " is removing the object, size = " + shirts.size());

            }
            lock.unlock();
        }
    }
}
