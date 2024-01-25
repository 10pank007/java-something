package anotation;

public class Test {
    @MethodInfo(author = "I am", dateOfCreation = 2024, purpose = "print")
    public void printHelloWorld() {
        System.out.println("Hello World");
    }
}
