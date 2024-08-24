package JavaStreams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEachCharacterInString {
    public static void main(String[] args) {
        String s = "string data to count each character";
        Map<String, Long> map = Arrays.stream(s.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(str -> str, Collectors.counting()));
        System.out.println(map);
    }
}
