package lesson2.demo9_staticinnerclass;

public class Main {
    public static void main(String[] args) {
//        Wrap wrap = new Wrap(0);
//        Wrap.AddOperation addOperation = wrap.new AddOperation();
//        addOperation.addOne();
//        addOperation.addTwo();
//
//        System.out.println(wrap.getX());
//
//        Wrap.RemoveOperation removeOperation = wrap.new RemoveOperation();
//        removeOperation.removeOne();
//        removeOperation.removeTwo();
//        System.out.println(wrap.getX());
        System.out.println(Wrap.x);
        Wrap.AddOperation addOperation = new Wrap.AddOperation();
        addOperation.addOne();
        addOperation.addOne();
        addOperation.addOne();
        System.out.println(Wrap.x);
        Wrap.RemoveOperation removeOperation = new Wrap.RemoveOperation();
        removeOperation.removeOne();
        System.out.println(Wrap.x);
    }
}
