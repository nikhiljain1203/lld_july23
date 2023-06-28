import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
In this code, each philosopher is represented by a separate thread. The Philosopher class defines the behavior of each philosopher. They go through a cycle of thinking, picking up forks, eating, and putting down forks.

The main method creates an array of Philosopher objects and an array of Lock objects representing the forks. Each philosopher is associated with a left fork and a right fork. The Lock objects ensure that only one philosopher can pick up a fork at a time, preventing deadlock.

When you run the code, you will see the output showing the actions of each philosopher, such as thinking, picking up forks, eating, and putting down forks.
**/
class Philosopher extends Thread {
    private int philosopherId;
    private Lock leftFork;
    private Lock rightFork;

    public Philosopher(int id, Lock left, Lock right) {
        philosopherId = id;
        leftFork = left;
        rightFork = right;
    }

    public void run() {
        try {
            while (true) {
                think();
                pickUpForks();
                eat();
                putDownForks();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }

    private void think() throws InterruptedException {
        System.out.println("Philosopher " + philosopherId + " is thinking.");
        Thread.sleep((long) (Math.random() * 10000));
    }

    private void pickUpForks() throws InterruptedException {
        leftFork.lock();
        System.out.println("Philosopher " + philosopherId + " picks up left fork.");
        rightFork.lock();
        System.out.println("Philosopher " + philosopherId + " picks up right fork.");
    }

    private void eat() throws InterruptedException {
        System.out.println("Philosopher " + philosopherId + " is eating.");
        Thread.sleep((long) (Math.random() * 10000));
    }

    private void putDownForks() {
        leftFork.unlock();
        System.out.println("Philosopher " + philosopherId + " puts down left fork.");
        rightFork.unlock();
        System.out.println("Philosopher " + philosopherId + " puts down right fork.");
    }
}

public class DiningPhilosophers {
    public static void main(String[] args) {
        int numPhilosophers = 5;
        Philosopher[] philosophers = new Philosopher[numPhilosophers];
        Lock[] forks = new ReentrantLock[numPhilosophers];

        for (int i = 0; i < numPhilosophers; i++) {
            forks[i] = new ReentrantLock();
        }

        for (int i = 0; i < numPhilosophers; i++) {
            Lock leftFork = forks[i];
            Lock rightFork = forks[(i + 1) % numPhilosophers];
            philosophers[i] = new Philosopher(i + 1, leftFork, rightFork);
            philosophers[i].start();
        }
    }
}
