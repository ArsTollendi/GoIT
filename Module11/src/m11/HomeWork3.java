package m11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeWork3 {
    public static void main(String[] args) {
        String[] numbers = new String[]{"1, 2, 0", "4, 5"};
        System.out.println(sortArray(numbers));
    }

    public static String sortArray(String[] numbers) {
        return Stream.of(numbers)
                .map(res -> res.split(", "))
                .flatMap(Arrays::stream)
                .sorted(Comparator.comparingInt(Integer::parseInt))
                .collect(Collectors.joining(", "));

    }
}
