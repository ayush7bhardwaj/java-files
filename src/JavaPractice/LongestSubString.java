package JavaPractice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

    public static void main(String[] args) {
        String s = "abcabcabcd";
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> visitedCharacter = new HashMap<>();
        for(int right = 0; right < s.length(); right++) {

            if(visitedCharacter.containsKey(s.charAt(right)) && visitedCharacter.get(s.charAt(right)) >= left) {
                left = visitedCharacter.get(s.charAt(right)) + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            visitedCharacter.put(s.charAt(right), right);
        }

        System.out.println(maxLength);
    }


}
