package JavaStreamsOneAgain;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostRepeatedElement {
    public static void main(String[] args) {
        Integer[] elements = {2,3,1,4,4,1,4,333,3,333,2,2,2,5,222};
        List<Integer> ls = Arrays.asList(elements);
        Optional<Map.Entry<Integer, Long>> op = ls.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue());

        System.out.println(op.get());

        String str = "Diljit ne apne gaano se aur bhangre se sach me pure" +
                " India ka Dil jit liya such a nice and multi talented person who deserves to be in Bollywood";

        List<Map.Entry<String, Long>> op1 = Arrays.stream(str.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted((o1, o2) -> {
                    if (o1.getValue() < o2.getValue())
                        return 1;
                    return -1;
                }).limit(3).collect(Collectors.toList());
        System.out.println(op1);

        Map<String, Long> map = Arrays.stream(str.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        List<Map.Entry<String, Long>> integerList = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted((o1, o2) -> {
                    if (o1.getValue() > o2.getValue())
                        return 1;
                    return -1;
                }).collect(Collectors.toList());
        System.out.println(integerList);

    }
}
