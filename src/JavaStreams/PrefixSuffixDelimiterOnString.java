package JavaStreams;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.List.of;

public class PrefixSuffixDelimiterOnString {
    public static void main(String[] args) {
        List<String> languageList = of("java", "c++", "c", "C sharp", "python", "kotlin", "scala");
        String str = languageList.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(str);
    }
}
