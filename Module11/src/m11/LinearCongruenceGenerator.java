package m11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinearCongruenceGenerator {
    public void creatingEndlessStream() {
        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);
        Stream<Long> stream = Stream.iterate(0l, x -> (a * x + c) % m);
        stream
                .limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());

    }

}
