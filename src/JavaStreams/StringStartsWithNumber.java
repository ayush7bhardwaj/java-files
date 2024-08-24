package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStartsWithNumber {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("rohit","foo","nemo","target1","12Target","2robot");
        List<String> ls = list.stream().filter(string -> Character.isDigit(string.charAt(0))).collect(Collectors.toList());
        System.out.println(ls);
    }
}
