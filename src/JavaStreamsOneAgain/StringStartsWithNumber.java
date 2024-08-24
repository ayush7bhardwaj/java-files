package JavaStreamsOneAgain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStartsWithNumber {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("roh1it","foo","nemo","target1","12Target","2robot");
        //System.out.println(list.stream().filter(string -> Character.isDigit(string.charAt(0))).collect(Collectors.toList()));

        List<String> list1 = list.stream().filter(string -> {
            String[] str = string.split("");
            for(String s : str) {
                if(Character.isDigit(s.charAt(0)))
                    return true;
                return false;
            }
            return false;
        }).collect(Collectors.toList());

        System.out.println(list1);

        List<String> list2 = list.stream().filter(string -> {
            int length = string.length();
            String[] str = string.split("");
            if (Character.isDigit(str[length - 1].charAt(0)))
                return true;
            return false;
        }).collect(Collectors.toList());
        System.out.println(list2);
    }
}
