package Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UsingMap {

    public static void main(String[] args) {
        
        List<String> fruits= Arrays.asList("Banana","Apple","Mango");
        Stream<String> stream=fruits.stream();
List<String> fruitList= stream.map((fruitss) ->fruitss.toUpperCase()).toList();
        System.out.println(fruitList);
    }
}
