package Filter;

import java.util.Arrays;
import java.util.List;

public class Aggregate {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 3, 5, 7, 8);
        double avergae = values.stream()  // converted the list to Stream
                .mapToInt(num -> num.intValue()) // implemented the mapToInt function to convert the non primitive datatype to prinitive datatype
                .average().getAsDouble();
        System.out.println(avergae);


    }
}
