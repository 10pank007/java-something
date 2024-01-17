package lesson3.demo4_default_methods_interfaces;

public class Foo implements Some{
    @Override
    public int doSome1(int x) {
        return 0;
    }

    @Override
    public int doSome2(int x) {
        return 0;
    }

    @Override
    public String doSome3() {
        return null;
    }
}
