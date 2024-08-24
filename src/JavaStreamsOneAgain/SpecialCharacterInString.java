package JavaStreamsOneAgain;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SpecialCharacterInString {
    public static void main(String[] args) {
        String str = "returns an Dou7bleStream consi#sting of the @results of replacing each element of this stream with " +
                "the contents of a map1ped stream produced by applying$ * the provided mapping function to each element";

        List<String> specialCharaterString = Arrays.stream(str.split(" ")).filter(string -> {
            String[] strArray = string.split("");
            for(int i = 0; i < strArray.length; i++) {
                if (!Character.isLetterOrDigit(strArray[i].charAt(0)))
                    return true;
            }
            return false;
        }).collect(Collectors.toList());

        System.out.println(specialCharaterString);

        Map<Boolean, Long> map =  Arrays.stream(str.split(""))
                .collect(Collectors.partitioningBy(string -> !Character.isLetterOrDigit(string.charAt(0)), Collectors.counting()));
        System.out.println(map);


        Map<Boolean, Long> map1 =Arrays.stream(str.split(" ")).collect(Collectors.partitioningBy(string -> {
            String[] strArray = string.split("");
            for(int i = 0; i < strArray.length; i++) {
                if (!Character.isLetterOrDigit(strArray[i].charAt(0)))
                    return true;
            }
            return false;
        }, Collectors.counting()));

        System.out.println(map1);

        Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .stream().max(Map.Entry.comparingByValue());
    }
}
