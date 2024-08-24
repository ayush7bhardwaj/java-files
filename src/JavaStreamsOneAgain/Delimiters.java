package JavaStreamsOneAgain;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.List.of;

public class Delimiters {
    public static void main(String[] args) {
        List<String> languageList = of("java", "c++", "c", "C sharp", "python", "kotlin", "scala");
        System.out.println(languageList.stream().collect(Collectors.joining(",","[","]")));
    }
}
