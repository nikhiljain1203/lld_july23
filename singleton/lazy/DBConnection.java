package singleton.lazy;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnection {
    private static DBConnection instance
            = null;
    private String url = null;

    private DBConnection(String url){
        this.url = url;
    }

    private static Lock lock = new ReentrantLock();

    public void foo() {

    }
    public static DBConnection getInstance(String url) {
        if(instance == null) {
            lock.lock();
            //synchronized (DBConnection.class) {
                if(instance == null) {
                    instance = new DBConnection(url);
                }
            //}
            lock.unlock();
        }
        return instance;
    }

}
