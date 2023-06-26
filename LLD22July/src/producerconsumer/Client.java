package producerconsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) {
        int maxSize = 3;
        Queue<Object> shirts =
                new ConcurrentLinkedQueue<>();
        Lock lock = new ReentrantLock();

        Producer p1 = new Producer("P1", shirts, maxSize, lock);
        Producer p2 = new Producer("P2", shirts, maxSize, lock);
        Producer p3 = new Producer("P3", shirts, maxSize, lock);
        Producer p4 = new Producer("P4", shirts, maxSize, lock);
        Producer p5 = new Producer("P5", shirts, maxSize, lock);
        Producer p6 = new Producer("P6", shirts, maxSize, lock);

        Consumer c1 = new Consumer("C1", shirts, maxSize, lock);
        Consumer c2 = new Consumer("C2", shirts, maxSize, lock);
        Consumer c3 = new Consumer("C3", shirts, maxSize, lock);

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
