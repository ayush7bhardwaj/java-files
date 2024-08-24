package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStreams {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");

        Stream<String> concat = Stream.concat(list1.stream(), list2.stream());
        List<String> list = concat.collect(Collectors.toList());
        System.out.println(list);
    }
}
