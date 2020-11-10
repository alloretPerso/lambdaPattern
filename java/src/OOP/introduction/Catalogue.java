package OOP.introduction;

import java.util.Map;

public class Catalogue {

    private final static Map<String, Product> productMap =
            Map.of("item1", new Product("item1", 45),
                    "item2", new Product("item2", 33),
                    "item3", new Product("item3", 234),
                    "item4", new Product("item4", 234));

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
