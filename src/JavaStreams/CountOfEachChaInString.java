package JavaStreams;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachChaInString {
    public static void main(String[] args) {
        String s = "string data to count each character";
        Optional<Map.Entry<String, Long>> op = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(op.get());

        Optional<Map.Entry<String, Long>> op1 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().min(Map.Entry.comparingByValue());
        System.out.println(op1.get());
        Map<String, Long> mp = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(mp);
    }
}
