package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,25,78,35,20,41,95,12,35,41,25,68,48, 500);
        Optional<Integer> optionalI =  list.stream().max(Integer::compareTo);
        System.out.println(optionalI.get());
    }
}
