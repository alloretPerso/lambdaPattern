package module1;

import java.util.Objects;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);

    default Predicate<T> and(Predicate<T> other){
        Objects.requireNonNull(other);
        return (T t) -> {
            return this.test(t) && other.test(t);
        };
    }

    /*default Predicate<T> andThen(Predicate<T> other) {
        Objects.requireNonNull(other);
        return (T t) -> {
            this.test(t) && other.test(t);
        };
    }*/
}
