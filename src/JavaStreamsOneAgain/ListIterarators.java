package JavaStreamsOneAgain;

import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListIterarators {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Iterator<Integer> it = myList.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("------using forward Li");

        ListIterator<Integer> li = myList.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
            //li.add(100);

            System.out.println("next index " + li.nextIndex());
            System.out.println("previous index" + li.previousIndex());

        }

        System.out.println("-----Using Backward li-----------");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

        Spliterator<Integer> si = myList.spliterator();

        List<List<Integer>> integerLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5)
        );

        System.out.println(integerLists);

        System.out.println(integerLists.stream().flatMap(Collection::stream).collect(Collectors.toList()));

        IntStream.rangeClosed(1, 4)
                .flatMap(i -> IntStream.iterate(i, IntUnaryOperator.identity()).limit(i)).forEach(System.out::println);

    }
}
