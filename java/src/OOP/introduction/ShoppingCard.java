package OOP.introduction;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {
    List<LineItem> lineItems = new ArrayList<>();


    public void addLineItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }

    public int totalCost() {
        return lineItems
                .stream()
                .mapToInt(LineItem::getPrice)
                .sum();
    }

    @Override
    public String toString() {
        return "ShoppingCard{" +
                "products=" + lineItems.toString() +
                '}';
    }
}
