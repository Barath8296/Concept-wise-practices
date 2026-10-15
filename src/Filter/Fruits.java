package Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fruits {

    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("Banana","Apple","Mango");

        List<String> filteredFruits=new ArrayList<>();

        for (String fruit:fruits){
            if(fruit.startsWith("A")){
                filteredFruits.add(fruit);
            }
        }
        System.out.println("Fruits starting with A: " + filteredFruits);
    }
}
