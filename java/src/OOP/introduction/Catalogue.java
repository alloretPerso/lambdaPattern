package OOP.introduction;

import java.util.Map;

public class Catalogue {

    private static Map<String,Product> productMap =
            Map.of("item4",new Product("item4",45));

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
