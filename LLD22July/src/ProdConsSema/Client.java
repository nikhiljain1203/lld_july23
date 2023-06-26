package ProdConsSema;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) {
        int maxSize = 3;
        Queue<Object> shirts =
                new ConcurrentLinkedQueue<>();

        Semaphore p = new Semaphore(maxSize);
        Semaphore c = new Semaphore(0);

        Producer p1 = new Producer("P1", shirts, maxSize, p, c);
        Producer p2 = new Producer("P2", shirts, maxSize, p, c);
        Producer p3 = new Producer("P3", shirts, maxSize, p, c);

        Consumer c1 = new Consumer("C1", shirts, maxSize, p, c);
        Consumer c2 = new Consumer("C2", shirts, maxSize, p, c);
        Consumer c3 = new Consumer("C3", shirts, maxSize, p, c);

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();
        Thread t4 = new Thread(c1);
        t4.start();
        Thread t5 = new Thread(c2);
        t5.start();
        Thread t6 = new Thread(c3);
        t6.start();


    }
}
