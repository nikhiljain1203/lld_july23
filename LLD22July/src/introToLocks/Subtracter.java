package introToLocks;

import java.util.concurrent.locks.Lock;

public class Subtracter implements Runnable{
    private Count count;
    private Lock lock;

    public Subtracter(Count count, Lock lock) {

        this.count = count;
        this.lock = lock;
    }


    @Override
    public void run() {
        for(int i = 0; i < 10000; i++) {
            lock.lock();
            count.value -= i;
            lock.unlock();
        }
    }
}
