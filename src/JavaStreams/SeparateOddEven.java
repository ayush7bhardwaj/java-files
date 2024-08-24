package JavaStreams;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.List.of;

public class SeparateOddEven {
    public static void main(String[] args) {
        List<Integer> oneToTen = of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> odd = oneToTen.stream().filter(integer -> integer % 2 !=0).collect(Collectors.toList());
        List<Integer> even = oneToTen.stream().filter(integer -> integer % 2 ==0).collect(Collectors.toList());
        System.out.println(odd);
        System.out.println(even);
    }
}
