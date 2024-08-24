package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Average {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,25,78,35,20,41,95,12,35,41,25,68,48, 500);
        OptionalDouble op = list.stream().mapToInt(Integer::intValue).average();
        System.out.println(op.getAsDouble());
    }
}
