package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeOfNumbers {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        System.out.println(integerList.stream().map(integer -> integer*integer*integer).filter(integer -> integer > 50).collect(Collectors.toList()));
    }
}
