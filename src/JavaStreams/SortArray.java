package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = { 99, 55, 203, 99, 4, 91 };
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(i -> System.out.println(i));
        
       List<String> name = Arrays.asList("Java", "is", "best", "programming", "language");
        System.out.println(name.stream().map(String::toUpperCase).collect(Collectors.toList()));

        HyundaiVerna verna = new HyundaiVerna();
        verna.carStarts();
        final String typeOfEngine = HyundaiVerna.typeOfEngine;
        System.out.println(typeOfEngine);


    }
}
