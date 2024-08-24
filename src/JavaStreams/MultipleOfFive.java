package JavaStreams;

import java.util.List;
import java.util.stream.Collectors;

public class MultipleOfFive {
    public static void main(String[] args) {
        List<Integer> ls = List.of(4,52,85,20,89,30,45);
        System.out.println(ls.stream().filter(integer -> integer % 5 == 0).collect(Collectors.toList()));

        System.out.println(ls.stream().max(Integer::compareTo).get());
        System.out.println(ls.stream().min(Integer::compareTo).get());
    }
}
