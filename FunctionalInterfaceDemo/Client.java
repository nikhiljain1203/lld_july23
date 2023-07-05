package FunctionalInterfaceDemo;

import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Client {
    public static void main(String[] args) {
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Value: " + integer);
            }
        };

        consumer.accept(10);

        BiPredicate<Integer, String> biPredicate = new BiPredicate<Integer, String>() {
            @Override
            public boolean test(Integer integer, String s) {
                return s.length() == integer;
            }
        };

        System.out.println(biPredicate.test(1, "A"));

        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        System.out.println(binaryOperator.apply(1, 2));

    }
}
