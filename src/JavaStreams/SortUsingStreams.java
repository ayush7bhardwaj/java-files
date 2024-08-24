package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortUsingStreams {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        List<Integer> sorted = myList.stream().sorted(((o1, o2) -> {
            if(o1 > o2)
                return 1;
            else
                return -1;
        })).collect(Collectors.toList());
        System.out.println(sorted);
        // Second Way

        myList.stream().sorted().forEach(s -> System.out.println(s));
    }


}
