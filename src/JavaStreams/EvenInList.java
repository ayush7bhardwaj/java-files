package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        List<Integer> integerList = list.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
