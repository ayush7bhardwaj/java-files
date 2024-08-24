package JavaStreamsOneAgain;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionOfList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Map<Boolean, List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(integer -> integer % 2 == 0));
        List<Integer> evenNumber = map.get(true);
        List<Integer> oddNumber = map.get(false);
        System.out.println(evenNumber);
        System.out.println(oddNumber);

        Double map1 = numbers.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(map1);
        System.out.println(numbers.stream().mapToInt(Integer::intValue).average().orElse(0));
    }
}
