package ProdConsSema;

import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable{

    Queue<Object> shirts;
    int maxSize;
    String name;

    Semaphore p;
    Semaphore c;

    public Producer(String name, Queue<Object> shirts, int maxSize,
                    Semaphore p, Semaphore c) {
        this.shirts = shirts;
        this.maxSize = maxSize;
        this.name = name;
        this.p = p;
        this.c = c;
    }

    @Override
    public void run() {
        while(true) {
            try {
                p.acquire();

                if (shirts.size() < maxSize) {
                    System.out.println(name + " is adding the object, size = " + shirts.size());
                    shirts.add(new Object());
                }
                c.release();
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
