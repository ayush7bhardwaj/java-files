package JavaStreamsOneAgain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAverages {
    public static void main(String[] args) {
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");
        System.out.println(strings.stream().map(String::length).mapToInt(Integer::intValue).average());

        // SEcond Way

        System.out.println(strings.stream().map(String::length).collect(Collectors.averagingInt(Integer::intValue)));

        System.out.println(strings.stream().map(string -> new StringBuffer(string).append(" is best.")).collect(Collectors.toList()));


    }
}
