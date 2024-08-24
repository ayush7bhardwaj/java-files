package JavaStreams;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondLargestInArray {
    public static void main(String[] args) {
        List<Integer> ls = List.of(4,52,85,20,89,30,45);
        Optional<Integer> op =  ls.stream().sorted(Collections.reverseOrder()).skip(1).max(Integer::compareTo);
        System.out.println(op.get());
    }
}
