package LambdaDemo;


import java.util.PriorityQueue;
import java.util.function.*;

public class Client {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (x) -> {
            System.out.println(x);
        };

        consumer.accept(1);

        Consumer<Integer> consumer1 = (x) -> System.out.println(x);
        consumer1.accept(1);

        // Way 1
        Function<Integer, Integer> predicate = (x) -> {
            return x*10;
        };

        System.out.println(predicate.apply(10));

        // Way 2
        Function<Integer, Integer> func = (x) -> x*10;

        System.out.println(func.apply(10));

        BiFunction<Integer, String, Boolean> booleanBiFunction
                = (x,y) -> x == y.length();


        PriorityQueue<Integer> priorityQueue =
                new PriorityQueue<>((a,b) -> b-a);
    }
}
