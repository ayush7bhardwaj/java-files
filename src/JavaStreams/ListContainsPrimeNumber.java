package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListContainsPrimeNumber {
    public static boolean isPrime(Integer n ) {
        if(n <= 1)
            return false;
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0)
                count++;

        }
        if(count == 2)
            return true;
        return false;
    }
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
        List<Integer> list = numbers.stream().filter(ListContainsPrimeNumber::isPrime).collect(Collectors.toList());
        System.out.println(list);

    }
}
