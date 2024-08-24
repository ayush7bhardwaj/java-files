package JavaStreamsOneAgain;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachItem {
    public static void main(String[] args) {
        List<Integer> list = List.of(454,26,8,2,86,26,47,26,47,10,50,78,1,43,454);
        Map<Integer, Long> MAP =list.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(MAP);

    }
}
