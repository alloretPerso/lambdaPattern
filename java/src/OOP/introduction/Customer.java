package OOP.introduction;

import java.util.Optional;

public class Customer {
    private CreditCard creditCard;
    private final String name;

    public Customer(String name, long ccNumber) {
        this.creditCard = new CreditCard(ccNumber);
        this.name = name;
    }
    public Optional<Order> checkout(ShoppingCard shoppingCard){
        Optional<Payment> payment = creditCard.mkPayment(shoppingCard.totalCost());
        return payment.map(value -> new Order(this, shoppingCard, value));
    }

    @Override
    public String toString() {
        return "Customer{" +
                "creditCard=" + creditCard.toString() +
                ", name='" + name + '\'' +
                '}';
    }
}
