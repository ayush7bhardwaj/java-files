package JavaStreams;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringsAccToLength {
    public static void main(String[] args) {
        List<String> ls = List.of("Apple", "Samsung", "Meta", "Microsoft","Google","Amazon", "Goldman Sachs", "J P Morgan Chase");
        List<String> sorted = ls.stream().sorted((s1, s2) -> {
            if(s1.length() > s2.length())
                return 1;
            return -1;
        }).collect(Collectors.toList());
        System.out.println(sorted);
     }
}
