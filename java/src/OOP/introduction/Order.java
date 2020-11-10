package OOP.introduction;

public class Order {
    private Customer customer;
    private ShoppingCard card;
    private Payment payment;

    public Order(Customer customer, ShoppingCard card, Payment payment) {
        this.customer = customer;
        this.card = card;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer.toString() +
                ", card=" + card.toString() +
                ", payment=" + payment.toString() +
                '}';
    }
}
