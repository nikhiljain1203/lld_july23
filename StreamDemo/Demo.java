package StreamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        //filter out even numbers
        List<Integer> list = Arrays.asList(10,11, 20,21, 30,31, 40,41);
        Stream<Integer> listStream = list.stream();

        System.out.println(listStream.filter(x -> x%2==0).toList());

        List<Car> cars = Arrays.asList(
                new Car(100, 500, "ABC"),
                new Car(2100, 7870, "DeF"),
                new Car(1550, 60, "ghi"),
                new Car(70, 5000, "jkl"),
                new Car(7800, 8000, "mno")
        );

        List<Integer> prices = cars.stream().map(c -> c.price).toList();

        System.out.println(prices);
    }
}
