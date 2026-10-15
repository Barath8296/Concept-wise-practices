package Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UsingJavaEight {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango");
        Stream<String> stream = fruits.stream();
        List<String> fruitList = stream.filter(fruit -> fruit.startsWith("A")).toList();
        System.out.println("Fruits starting with A: " + fruitList);
    }
}
