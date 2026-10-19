package Map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class  Product {

    private String name;
    private double price;
    private String category;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }


}

    public class FilterExample2 {

        public static void main(String[] args) {

            List<Product> products = new ArrayList<>();
            products.add(new Product ("Blender",129.90,"Kitchen"));
            products.add(new Product ("Trimmer",229.0,"Blushing"));
            products.add(new Product ("Cream",19.0,"Refreshing"));

            Stream<Product> productStream= products.stream();
            List<Product> resultOfExpected= productStream.filter(render -> render.getCategory().equals("Blushing")).toList();
            resultOfExpected.forEach(System.out::println);

            System.out.println("Filtering by price");
            Stream<Product> productPriceComparision=products.stream();
            List<Product> filterPrice=productPriceComparision.filter(renfer -> renfer.getPrice()>200).toList();
            filterPrice.forEach(System.out::println);

        }    }

