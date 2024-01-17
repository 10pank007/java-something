package lesson3.demo1_interfaces;

public class Student extends Father implements Singer {
    @Override
    public void sing() {
        System.out.println("balalaika");
    }
}
