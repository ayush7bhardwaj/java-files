package JavaStreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        Integer[] arr1 = {456,45,20,98,1,35,65,4789, 45,20, 14,29,97};
        List<Integer> ls = Arrays.stream(arr1).collect(Collectors.collectingAndThen(Collectors.toList(), l -> {Collections.reverse(l); return l;}));
        System.out.println(ls);

        // Second Way

        List<Integer> ls1 =Arrays.stream(arr1).collect(Collectors.toList());
        Collections.reverse(ls1);
        System.out.println(ls1);

    }
}
