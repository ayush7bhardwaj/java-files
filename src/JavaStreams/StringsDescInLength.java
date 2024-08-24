package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsDescInLength {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Apple", "Grapes","Guava", "Pomegranate", "BlueBerry");
        List<String> ls1 = ls.stream().sorted((s1, s2) -> {
            if(s1.length() < s2.length())
                return 1;
            return -1;
        }).collect(Collectors.toList());
        System.out.println(ls1);
    }
}
