package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * ConsumerTest
 */
public class ConsumerTest {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "kiwi", "orange");

        Consumer<List<String>> addNumber = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, (i + 1) + ". " + list.get(i));
            }
        };

        Consumer<List<String>> printList = list -> {
            for (String fruit : list) {
                System.out.println(fruit);
            }
        };
        
        addNumber.andThen(printList).accept(fruits);
    }
}