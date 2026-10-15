import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CaseConversion {

    public static void main(String[] args) {

        List<String> fruitss = Arrays.asList("Banana", "Apple", "Mango");
        Stream<String> stream = fruitss.stream();
        List<String> fruitList = stream.map(fruitsss -> fruitsss.toUpperCase()).toList();
        System.out.println(fruitList);
    }
}
