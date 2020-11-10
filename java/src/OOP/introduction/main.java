package OOP.introduction;

import java.util.Optional;

public class main {
    public static void main(String[] args) {
        ShoppingCard cart = new ShoppingCard();
        Product product = Catalogue.getProduct("item1");
        Product product2 = Catalogue.getProduct("item2");
        Product product3 = Catalogue.getProduct("item3");
        Product product4 =  Catalogue.getProduct("item4");
        cart.addLineItem(new LineItem(product,3));
        cart.addLineItem(new LineItem(product2,33));
        cart.addLineItem(new LineItem(product3,34));
        cart.addLineItem(new LineItem(product4,35));
        System.out.println(cart);
        System.out.println(cart.totalCost());
        Customer john = new Customer("John", 124536789L);
        Optional<Order> order = john.checkout(cart);
        System.out.println(order);

    }
}
