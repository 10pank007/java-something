package lesson3.demo1_interfaces;

public class User implements Singer {
    private String message;
    @Override
    public void sing() {
        System.out.println("atenolol" + message + this.greeting());
    }
    public String greeting() {
        return "Hello";
    }
}
