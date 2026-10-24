package Filter;

import java.util.Arrays;
import java.util.List;

public class LowerCaseConvert {

    public static void main(String[] args) {

        List<String> names= Arrays.asList("Vanishh","Ahmnet","Prathi");
        List<String> convertLow=names.stream().map(String::toLowerCase).toList(); // Using method reference to update convert the list of names using map function
        System.out.println(convertLow);

    }
}
