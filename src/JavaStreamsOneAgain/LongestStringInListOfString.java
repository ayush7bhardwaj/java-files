package JavaStreamsOneAgain;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringInListOfString {
    public static void main(String[] args) {

        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");

        Optional<String> max = strings.stream().max(Comparator.comparingInt(String::length));
        System.out.println(max.get());
    }
}
