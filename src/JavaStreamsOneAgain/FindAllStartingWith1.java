package JavaStreamsOneAgain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllStartingWith1 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        List<Integer> list = myList.stream().map(integer -> integer + "")
                .filter(string -> string.startsWith("1")).map(string -> Integer.parseInt(string)).collect(Collectors.toList());
        System.out.println(list);




    }
}
