package m11;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskFirstAndSecond {
    public static void main(String[] args) {
        List<String> name = List.of("Max", "Ivan", "Ira", "Petro", "Julia", "Bobo");

        System.out.println("Task first\n" + sortNames(name));
        System.out.println("Task Second\n" + outputNamesThroughComa(name));
    }

    public static String sortNames(List<String> names) {
        return names.stream()
                .filter(name -> names.indexOf(name) % 2 != 0)
                .map(name -> names.indexOf(name) + "." + name)
                .collect(Collectors.joining(" "));
    }

    public static String outputNamesThroughComa(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(", "));
    }
}
