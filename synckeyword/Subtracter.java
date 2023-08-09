package synckeyword;

import java.util.concurrent.locks.Lock;

public class Subtracter implements Runnable{
    private Count count;
    //private Lock lock;

    public Subtracter(Count count) {

        this.count = count;
        //this.lock = lock;
    }


    @Override
    public void run() {
        for(int i = 0; i < 10000; i++) {
            //lock.lock();
            count.decrementValue(i);
            //lock.unlock();
        }
    }
}
