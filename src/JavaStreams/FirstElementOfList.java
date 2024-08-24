package JavaStreams;

import java.util.Arrays;
import java.util.List;

public class FirstElementOfList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println(myList.stream().findFirst().get());
    }
}
