package JavaStreams;

import java.util.*;
import java.util.stream.Collectors;

public class CommonElementBWTwoArrays {
    public static void main(String[] args) {
        Integer[] arr1 = {456,45,20,98,1,35,65,4789, 45,20, 14,29,97};
        Integer[] arr2 = {25,45,32,63,14,29,97,74,55,30,72,45, 97, 14};

        List<Integer> set1 = new ArrayList<>(Arrays.asList(arr1));
        List<Integer> set2 = new ArrayList<>(Arrays.asList(arr2));

        List<Integer> ls = set1.stream().filter(s-> set2.contains(s)).collect(Collectors.toList());
        System.out.println(ls);
    }
}
