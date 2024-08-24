package JavaStreamsOneAgain;

import java.util.Arrays;
import java.util.List;

public class MaxValuePresent {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Integer in = myList.stream().max((o1, o2) -> {
            if (o1 > o2)
                return 1;
            return -1;
        }).orElse(0);

        System.out.println(in);

        // SEcond Way

        System.out.println(myList.stream().max(Integer::max).orElse(0));
    }
}
