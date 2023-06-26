package ProdConsSema;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable {
    Queue<Object> shirts;
    int maxSize;
    String name;
    Semaphore p;
    Semaphore c;

    public Consumer(String name, Queue<Object> shirts, int maxSize,
                    Semaphore p, Semaphore c) {
        this.shirts = shirts;
        this.maxSize = maxSize;
        this.name = name;
        this.p = p;
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            try {
                c.acquire();
                if (shirts.size() > 0) {
                    System.out.println(name + " is removing the object, size = " + shirts.size());
                    shirts.remove();
                }
                p.release();
            }  catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
