package JavaStreams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoUnsortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {456,45,20,98,1,35,65,4789};
        int[] arr2 = {25,45,32,63,14,29,97,74,55,30,72,45};
        Stream<Integer> st1 =  Arrays.stream(arr1).boxed();
        Stream<Integer> st2 =  Arrays.stream(arr2).boxed();

        System.out.println(Stream.concat(st1, st2).sorted().collect(Collectors.toList()));


    }
}
