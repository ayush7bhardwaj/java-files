package JavaStreams;

import java.util.*;

public class CheckNull {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3, null);
        Optional.ofNullable(integerList).get()
                .stream().filter(integer -> integer != null)
                .forEach(i -> System.out.println(i));
    }
}
