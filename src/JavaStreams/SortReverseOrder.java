package JavaStreams;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortReverseOrder {
    public static void main(String[] args) {
        List<Integer> list = List.of(454,26,8,2,86,26,47,26,47,10,50,78,1,43,454);
        List<Integer> llis = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(llis);
    }
}
