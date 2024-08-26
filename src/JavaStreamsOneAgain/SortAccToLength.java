package JavaStreamsOneAgain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortAccToLength {
    public static void main(String[] args) {
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");

        strings.stream().sorted((s1, s2) -> {
            if (s1.length() > s2.length())
                return 1;
            return -1;
        }).forEach(System.out::println);
    }
}
