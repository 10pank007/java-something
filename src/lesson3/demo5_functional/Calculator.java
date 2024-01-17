package lesson3.demo5_functional;

@FunctionalInterface
public interface Calculator {
    int calculate(int a, int b);
    default void qwe() {

    }
}
