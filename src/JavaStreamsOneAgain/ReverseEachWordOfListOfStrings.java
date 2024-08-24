package JavaStreamsOneAgain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWordOfListOfStrings {
    public static void main(String[] args) {
        String stmt = "java is OOP language";
        String st =  Arrays.stream(stmt.split(" ")).map(string -> new StringBuffer(string).reverse()).collect(Collectors.joining(" "));
        System.out.println(st);
    }
}
