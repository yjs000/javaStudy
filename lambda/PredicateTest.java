package lambda;

import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PredicateTest {

    public static void main(String[] args) {
        //test
        Predicate<Integer> predicate = (num) -> num > 10;

        boolean result = predicate.test(100);
        System.out.println(result);    

        //and
        Predicate<Integer> predicate1 = num -> num > 10;
        Predicate<Integer> predicate2 = num -> num < 20;

        boolean result2 = predicate1.and(predicate2).test(25);
        System.out.println("25 : 10 < num < 20 ? " + result2);

        //or
        Predicate<Integer> predicate3 = num -> num > 10;
        Predicate<Integer> predicate4 = num -> num < 0;

        boolean result3 = predicate3.or(predicate3).test(5);
        System.out.println("5 : num < 0 or num > 10 ? " + result3);

        boolean result4 = predicate3.or(predicate4).test(-5);
        System.out.println("5 : num < 0 or num > 10 ? " + result4);

        //isEqual //Stream
        Stream<Integer> stream = IntStream.range(1, 10).boxed(); // Integer로 boxed된 stream을 반환
        stream.filter(Predicate.isEqual(5)).forEach(System.out::println);

        //negate
        Predicate<Integer> predicate5 = num -> num > 10;
        Predicate<Integer> negatePredicate = predicate5.negate();

        boolean result5 = predicate5.test(100);
        System.out.println("100 is greater than 10 ? " + result5);

        result5 = negatePredicate.test(100);
        System.out.println("100 is less than 10 ? " + result5);

    }
}
