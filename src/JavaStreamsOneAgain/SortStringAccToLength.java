package JavaStreamsOneAgain;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortStringAccToLength {
    public static void main(String[] args) {
        List<String> ls = List.of("Apple", "Samsung", "Meta", "Microsoft","Google","Amazon", "Goldman Sachs", "J P Morgan Chase");
        String str = "J P Morgan Chase";
        List<String> ls1 = ls.stream().sorted((s1,s2) -> {
            if(s1.length() > s2.length())
                return 1;
            return -1;
        }).collect(Collectors.toList());
        System.out.println(ls1);

        Map<String, Long> mp = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mp);

        Map.Entry<Boolean, List<String>> map =  Arrays.stream(str.split(""))
                .collect(Collectors.partitioningBy(string -> Character.isUpperCase(string.charAt(0))))
                        .entrySet().stream().max((o1, o2) -> {
                            if (o1.getValue().size() < o2.getValue().size())
                                return 1;
                            return -1;
                 }).get();
        System.out.println(map);



    }
}
