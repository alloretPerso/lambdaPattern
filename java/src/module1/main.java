package module1;

public class main {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
        Predicate<String> p1 = s -> s != null;
        Predicate<String> p2 = s -> !s.isEmpty();
        Predicate<String> p3 = p2.and(p1.negate());
    }

    private static void example3() {
        Predicate<String> p1 = s -> s != null;
        Predicate<String> p2 = s -> !s.isEmpty();
        Predicate<String> p3 = p1.and(p2);
        System.out.println(p3.test(null));
    }

    private static void example2() {
        Consumer<String> c1 = s -> System.out.println("c1 = " + s);
        Consumer<String> c2 = s -> System.out.println("c2 = " + s);
        Consumer<String> c3 = c1.andThen(c2);
        c3.accept("\"Hello World\"");
    }

    private static void example1() {
        Consumer<String> c1 = s -> System.out.println("c1 = " + s);
        Consumer<String> c2 = s -> System.out.println("c2 = " + s);
        Consumer<String> c3 = s -> {
            c1.accept(s);
            c2.accept(s);
        };
        c3.accept("\"Hello World\"");
    }
}
