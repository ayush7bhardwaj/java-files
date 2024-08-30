package JavaStreamsOneAgain;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapex {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Geeks", "For"),
                Arrays.asList("GeeksForGeeks", "A computer portal"),
                Arrays.asList("Java", "Programming")
        );

        listOfLists.stream().flatMap(strings -> strings.stream()).forEach(System.out::println);

        List<String> list = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");

        list.stream().flatMap(string -> Stream.of(string.charAt(2))).forEach(System.out::println);

        list.stream().map(string -> new StringBuffer(string).append("1")).forEach(System.out::println);

        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);
        // Creating a list of odd numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
        // Creating a list of even numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        // Combining the above lists into a list of lists
        List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        listOfListofInts.stream().flatMap(integers -> integers.stream()).forEach(System.out::println);

        List<String> phrases = Arrays.asList(
                "sporadic perjury",
                "confounded skimming",
                "incumbent jailer",
                "confounded jailer");

        phrases.stream().flatMap(string -> Stream.of(string.split("\\s"))).distinct().forEach(System.out::println);

        phrases.stream().flatMap(string -> Stream.of(string.split(""))).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<List<Integer>> listOfLists1 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        listOfLists1.stream().flatMap(List::stream).forEach(System.out::println);
        listOfLists1.stream().flatMap(List::stream).mapToInt(Integer::intValue).sum();
        listOfLists1.stream().flatMap(List::stream).collect(Collectors.summarizingInt(Integer::intValue)).getSum();

        Order order1 = new Order("123", Arrays.asList(
                new Product("Apple", 1),
                new Product("Orange", 2),
                new Product("Banana", 3)));

        Order order2 = new Order("456", Arrays.asList(
                new Product("Apple", 4),
                new Product("Grape", 5),
                new Product("Banana", 6)));

        List<Order> orders = Arrays.asList(order1, order2);

        orders.stream().flatMap(order -> order.getProducts().stream()).forEach(System.out::println);

        orders.stream().flatMap(order -> Stream.of(Integer.parseInt(order.getOrderId()))).collect(Collectors.summarizingInt(Integer::intValue)).getSum();

        orders.stream().flatMap(order -> order.getProducts()
                .stream()).map(product -> product.getId()).collect(Collectors.summarizingInt(Integer::intValue)).getSum();

        orders.stream().flatMap(order -> order.getProducts()
                .stream()).map(product -> product.getId()).collect(Collectors.summarizingInt(Integer::intValue)).getAverage();


        List<List<List<Integer>>> threeList = Arrays.asList(
                Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6), Arrays.asList(7,8,9)),
                Arrays.asList(Arrays.asList(10,11,12), Arrays.asList(13,14,15), Arrays.asList(16,17,18)),
                Arrays.asList(Arrays.asList(19,20,21), Arrays.asList(22,23,24), Arrays.asList(25,26,27))
        );

        threeList.stream().flatMap(lists -> lists.stream())
                .flatMap(li -> li.stream()).collect(Collectors.summarizingInt(Integer::intValue)).getAverage();

        threeList.stream().flatMap(List::stream).flatMapToInt(l -> l.stream().mapToInt(Integer::intValue)).sum();

        List<String> list1 = Arrays.asList("1", "2", "3",
                "4", "5");

        list1.stream().flatMap(string -> Stream.of(Integer.parseInt(string))).collect(Collectors.summarizingInt(Integer::intValue)).getAverage();

    }
}
