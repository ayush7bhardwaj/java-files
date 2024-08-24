package JavaStreamsOneAgain;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Integer[] arr = {12,54,84,94,35,94,36,20};
        Set<Integer> set = new HashSet<>();
        System.out.println(myList.stream().filter(integer -> !set.add(integer)).collect(Collectors.toList()));

        // Second Way

        System.out.println(myList.stream().distinct().collect(Collectors.toList()));

        // Find the first element of stream

        System.out.println(myList.stream().findFirst().orElse(0));

        // Total number of elements presents

        System.out.println(myList.stream().count());

        // Find max element present

        Integer op = myList.stream().max((o1, o2) -> {
            if (o1 > o2)
                return 1;
            return -1;
        }).orElse(0);
        System.out.println(op);

        IntSummaryStatistics doubleSummaryStatistics = myList.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(doubleSummaryStatistics.getMax());

    }
}
