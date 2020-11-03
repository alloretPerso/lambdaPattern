package module1;

public class main {
    public static void main(String[] args) {
        example1();
    }

    private static void example1() {
        Consumer<String> c1 = s -> System.out.println("c1 = "+ s);
        Consumer<String> c2 = s -> System.out.println("c2 = "+ s);
        Consumer<String> c3 = s -> {
            c1.accept(s);
            c2.accept(s);
        };
        c3.accept("\"Hello World\"");
    }
}
