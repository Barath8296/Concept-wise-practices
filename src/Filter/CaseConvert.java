package Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CaseConvert {

    public static void main(String[] args) {

        List<String> names= Arrays.asList("Barath","Prathi","Bhunava");
        List<String> conversion=names.stream().map(String::toUpperCase).toList();
        System.out.println(conversion);
    }
}
