package OOP.introduction;

import javax.xml.catalog.Catalog;

public class main {
    public static void main(String[] args) {
        ShoppingCard cart = new ShoppingCard();
        Product product = new Product("item",45);
        Product product2 = new Product("item2",45);
        Product product3 = new Product("item3",45);
        Product product4 = Catalogue.getProduct("item4");
        cart.addProduct(product);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);
        System.out.println(cart);
        System.out.println(cart.totalCost());
    }
}
