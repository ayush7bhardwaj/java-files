package JavaStreamsOneAgain;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOddAndEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        System.out.println(list.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList()));
         // Second Way

        Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(integer -> integer % 2 == 0));
        System.out.println(map);
    }
}
