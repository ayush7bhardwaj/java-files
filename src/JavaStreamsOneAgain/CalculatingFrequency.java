package JavaStreamsOneAgain;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CalculatingFrequency {
    public static void main(String[] args) {
        String str = "Knowledge of Spring Framework has a huge demand in the enterprise market, and Spring Framework developers are paid handsomely.\n" +
                "Having Spring Framework on your resume will highlight you among other Java developers.";
        Optional<Map.Entry<String, Long>> entry = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(entry.get());

        Map<String, Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        Map<Boolean, List<String>> map1 = Arrays.stream(str.split(" ")).collect(Collectors.partitioningBy(string -> Character.isUpperCase(string.charAt(0))));
        System.out.println(map1);

    }
}
