import java.util.*;
import java.util.stream.Stream;

public class WithList {

    public static void main(String[] args) {

        List<String> fruitList= Arrays.asList("Banana", "Apple", "Mango", "Grapes");
        Stream<String> stream=fruitList.stream();
stream.forEach((System.out::println));

        System.out.println("---------------------");

        Set<String> fruitset=new HashSet<>(fruitList);
        Stream<String> stream1=fruitset.stream();
        stream1.forEach(System.out::println);

        System.out.println("---------MAP GAARU--------");

        Map<String , Integer> fruitMap=new HashMap<>();
        fruitMap.put("Apple",10);
        fruitMap.put("Banana",20);

        Stream<Map.Entry<String,Integer>> stream2=fruitMap.entrySet().stream();
        stream2.forEach(System.out::println);


        // Create Keyset to display values

Stream<String> stream3=fruitMap.keySet().stream();
stream3.forEach(System.out::println);

        System.out.println("print values from map");
        Stream<Integer> stream4=fruitMap.values().stream();
        stream4.forEach(System.out::println);


        String[] fruitArray={"Banana", "Apple", "Mango", "Grapes"};
        Stream<String> stream5=Arrays.stream(fruitArray);
        stream5.forEach(System.out::println);
        System.out.println(" ");
        System.out.println("print the stream of method");
    Stream<String> stream6=Stream.of("Banana", "Apple", "Mango", "Grapes");
    stream6.forEach(System.out::println);


    }
}
