package JavaStreams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachChar {
    public static void main(String[] args) {
        String s = "India that is Bharat, Shall be union of States";
        Map<String, Long> map = Arrays.stream(s.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
