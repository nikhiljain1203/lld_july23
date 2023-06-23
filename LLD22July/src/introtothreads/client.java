package introtothreads;

public class client {

    public static void main(String[] args) {
        PrintHelloWorld printHelloWorld = new PrintHelloWorld();

        Thread t = new Thread(printHelloWorld);
        t.start();

        Thread t1 = new Thread(new PrintHelloWorld());
        t1.start();
        //System.out.println("Hello from: " +
         //       Thread.currentThread().getName());
    }
}
