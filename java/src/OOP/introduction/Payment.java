package OOP.introduction;

import java.util.UUID;

public class Payment {
    private final CreditCard creditCard;
    private final int value;
    private final UUID randomUUID;

    public Payment(CreditCard creditCard, int value, UUID randomUUID) {
        this.creditCard = creditCard;
        this.value = value;
        this.randomUUID = randomUUID;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "creditCard=" + creditCard.toString() +
                ", value=" + value +
                ", randomUUID=" + randomUUID +
                '}';
    }
}
