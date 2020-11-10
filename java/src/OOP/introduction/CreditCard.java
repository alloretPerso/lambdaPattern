package OOP.introduction;

public class CreditCard {
    private final long number;

    public CreditCard(long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number=" + number +
                '}';
    }
}
