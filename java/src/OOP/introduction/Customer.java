package OOP.introduction;

public class Customer {
    private CreditCard creditCard;
    private final String name;

    public Customer(String name, long ccNumber) {
        this.creditCard = new CreditCard(ccNumber);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "creditCard=" + creditCard.toString() +
                ", name='" + name + '\'' +
                '}';
    }
}
