package OOP.introduction;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {
    List<Product> products = new ArrayList<>();


    public void addProduct(Product product) {
        products.add(product);
    }

    public int totalCost() {
        return products
                .stream()
                .mapToInt(Product::getPrice)
                .sum();
    }

    @Override
    public String toString() {
        return "ShoppingCard{" +
                "products=" + products.toString() +
                '}';
    }
}
