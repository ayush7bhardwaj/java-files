package JavaStreamsOneAgain;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = { 99, 55, 203, 99, 4, 91 };
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(i -> System.out.println(i));
    }
}
