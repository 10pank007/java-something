package lesson2.demo8_innerclass;

public class Main {
    public static void main(String[] args) {
        Wrap wrap = new Wrap(0);
        Wrap.AddOperation addOperation = wrap.new AddOperation();
        addOperation.addOne();
        addOperation.addTwo();
        System.out.println(wrap.getX());

        Wrap.RemoveOperation removeOperation = wrap.new RemoveOperation();
        removeOperation.removeOne();
        removeOperation.removeTwo();
        System.out.println(wrap.getX());
    }
}
