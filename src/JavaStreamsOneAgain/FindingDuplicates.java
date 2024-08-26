package JavaStreamsOneAgain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingDuplicates {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        Set<Integer> set = new HashSet<>();
        myList.stream().filter(integer -> !set.add(integer)).forEach(System.out::println);

        // Second Way

        myList.stream().distinct().forEach(System.out::println);


    }
}
