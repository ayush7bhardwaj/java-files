package JavaStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxValuePresent {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println(myList.stream().max(((o1, o2) -> {
            if(o1 > o2) {
                return 1;
            } else
                return -1;
        })).get());

        // Second Way

        System.out.println(myList.stream().max(Integer::compare).get());
    }
}
