package Executor;

import numberPrinter.NumberPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService executorService
                = Executors.newFixedThreadPool(10);
        for(int i = 0; i< 100; i++) {
            if(i == 20 || i == 80) {
                System.out.println("Debug");
            }
            NumberPrinter numberPrinter
                    = new NumberPrinter(i);
            executorService.execute(numberPrinter);
        }

        executorService.shutdown();

    }
}
