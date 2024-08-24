package JavaStreamsOneAgain;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageLengthofInteger {
    public static void main(String[] args) {
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");

        OptionalDouble avg = strings.stream().map(String::length).mapToInt(Integer::intValue).average();
        System.out.println(avg.orElse(0));
    }
}
