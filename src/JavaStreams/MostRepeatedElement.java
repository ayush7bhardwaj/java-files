package JavaStreams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElement {
    public static void main(String[] args) {
        Integer[] elements = {2,3,1,4,4,1,4,333,3,333,2,2,2,5,222};
        List<Integer> ls = Arrays.asList(elements);
        Optional<Map.Entry<Integer, Long>> op = ls.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println(op.get());

        Optional<Map.Entry<Integer, Long>> op1 = ls.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().min(Map.Entry.comparingByValue());
        System.out.println(op1.get());
    }
}
