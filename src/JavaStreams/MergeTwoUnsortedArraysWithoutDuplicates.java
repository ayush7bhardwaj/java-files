package JavaStreams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoUnsortedArraysWithoutDuplicates {
    public static void main(String[] args) {

        int[] arr1 = {456,45,20,98,1,35,65,4789, 45,20};
        int[] arr2 = {25,45,32,63,14,29,97,74,55,30,72,45, 97, 14};

        Stream<Integer> st1 = Arrays.stream(arr1).boxed();
        Stream<Integer> st2 = Arrays.stream(arr2).boxed();


         Object[] integers = Stream.concat(st1, st2).sorted().distinct().toArray();

        Integer[] result = Arrays.copyOf(integers, integers.length, Integer[].class);
         for(Integer integer : result) {
             System.out.println(integer);
         }

            


    }
}
