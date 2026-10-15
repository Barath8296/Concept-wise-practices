package Filter;

import java.util.List;
import java.util.stream.Stream;

public class UsingFilter {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        System.out.println("Even numbers: " + numbers.stream().filter( numberss ->numberss %2 ==0).toList());
    }
}
