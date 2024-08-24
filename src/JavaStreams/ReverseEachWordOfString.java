package JavaStreams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
        String stmt = "java is OOP language";
        String reverse = Arrays.stream(stmt.split(" ")).map(s -> new StringBuffer(s).reverse()).collect(Collectors.joining(" "));
        System.out.println(reverse);
    }
}
