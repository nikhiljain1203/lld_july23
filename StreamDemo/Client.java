package StreamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        // How to create Streams
        Integer[] arr = {10, 20, 30, 40, 50};
        Stream<Integer> integerStream = Stream.of(arr);

        Stream<Integer> integerStream1 =
                Stream.of(10, 20, 30, 40);

        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        Stream<Integer> listStream = list.stream();

        Stream.Builder<Integer> sb = Stream.builder();
        sb.add(10);
        sb.add(20);
        sb.add(30);
        sb.add(40);
        Stream<Integer> stream = sb.build();
    }
}
