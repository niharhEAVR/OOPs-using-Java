import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class Stream7 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println(list);

        Stream<Integer> s1 = list.stream(); // its returning the whole array collections
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0); // filters outs the even numbers and returning
        Stream<Integer> s3 = s2.map(n -> n * 2); // mapping the even numbers and returning

        s3.forEach(n -> System.out.println(n)); // one thing about stream is that we can reuse a stream after its used means we cannot access s1 because its has been already used

        
        // another approach of using stream is:
        int result = list.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .reduce(1, (a, d) -> a * d);
        System.out.println(result);

    }
}
