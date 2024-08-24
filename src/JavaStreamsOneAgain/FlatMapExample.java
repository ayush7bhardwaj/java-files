package JavaStreamsOneAgain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Geeks", "For"),
                Arrays.asList("GeeksForGeeks", "A computer portal"),
                Arrays.asList("Java", "Programming")
        );

        System.out.println(listOfLists.stream().flatMap(list -> list.stream()).collect(Collectors.toList()));

        List<String> list = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");

        System.out.println(list.stream().flatMap(string -> Stream.of(string.charAt(2))).collect(Collectors.toList()));

        System.out.println(list.stream().map(string -> new StringBuffer(string).append("1")).collect(Collectors.toList()));

        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);
        // Creating a list of odd numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
        // Creating a list of even numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        // Combining the above lists into a list of lists
        List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        // Printing the structure before flattening
        System.out.println("The Structure before flattening is : " + listOfListofInts);
        System.out.println(listOfListofInts.stream().flatMap(list1 -> list1.stream()).collect(Collectors.toList()));

        Stream<Integer> st = Stream.of(1,2,3,4);
        List<Integer> li = List.of(1,2,3);


        List<String> phrases = Arrays.asList(
                "sporadic perjury",
                "confounded skimming",
                "incumbent jailer",
                "confounded jailer");

        System.out.println(phrases.stream().flatMap(phrase -> Stream.of(phrase.split("\\s+"))).distinct().collect(Collectors.toList()));

        List<List<Integer>> listOfLists1 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        System.out.println(listOfLists1.stream().flatMap(List::stream).collect(Collectors.summarizingInt(Integer::intValue)).getSum());
        System.out.println(listOfLists1.stream().flatMap(List::stream).mapToInt(Integer::intValue).sum());

        Order order1 = new Order("123", Arrays.asList(
                new Product("Apple", 1),
                new Product("Orange", 2),
                new Product("Banana", 3)));

        Order order2 = new Order("456", Arrays.asList(
                new Product("Apple", 4),
                new Product("Grape", 5),
                new Product("Banana", 6)));

        List<Order> orders = Arrays.asList(order1, order2);

        System.out.println(orders.stream().flatMap(order -> order.getProducts().stream()).collect(Collectors.toList()));

        List<List<List<Integer>>> threeList = Arrays.asList(
                Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6), Arrays.asList(7,8,9)),
                Arrays.asList(Arrays.asList(10,11,12), Arrays.asList(13,14,15), Arrays.asList(16,17,18)),
                Arrays.asList(Arrays.asList(19,20,21), Arrays.asList(22,23,24), Arrays.asList(25,26,27))
        );

        System.out.println(threeList.stream().flatMap(List::stream).flatMap(List::stream).collect(Collectors.toList()));
        threeList.stream().flatMap(List::stream).flatMap(List::stream).collect(Collectors.summarizingInt(Integer::intValue)).getSum();
        IntStream intStream = threeList.stream().flatMap(List::stream).flatMapToInt(l -> l.stream().mapToInt(Integer::intValue));

        List<String> list1 = Arrays.asList("1", "2", "3",
                "4", "5");

        System.out.println(list1.stream().flatMapToInt(string -> IntStream.of(Integer.parseInt(string))).sum());
        System.out.println(list1.stream().flatMap(string -> Stream.of(Integer.parseInt(string))).mapToInt(Integer::intValue).sum());


        List<String> list2 = Arrays.asList("Geeks", "GFG",
                "GeeksforGeeks", "gfg");

        System.out.println(list2.stream().flatMap(string -> Stream.of(string.length())).mapToInt(Integer::intValue).sum());
        System.out.println(list2.stream()
                .flatMap(string -> Stream.of(string.length())).collect(Collectors.summarizingInt(Integer::intValue)).getSum());

        System.out.println(list2.stream().flatMapToInt(string -> IntStream.of(string.length())).sum());

        List<String> list3 = Arrays.asList("1.5", "2.7", "3",
                "4", "5.6");

        list3.stream().flatMapToDouble(string -> DoubleStream.of(string.length())).forEach(System.out::println);



    }


}
