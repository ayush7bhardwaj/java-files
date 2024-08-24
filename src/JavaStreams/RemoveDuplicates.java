package JavaStreams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        Set<Integer> set = new HashSet<>();
        List<Integer> list = numbersWithDuplicates.stream().filter(integer -> set.add(integer)).collect(Collectors.toList());
        System.out.println(list);

        // Second Way

        System.out.println(numbersWithDuplicates.stream().distinct().collect(Collectors.toList()));
    }
}
