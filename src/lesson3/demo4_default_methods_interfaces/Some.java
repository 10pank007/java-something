package lesson3.demo4_default_methods_interfaces;

public interface Some {
    /*public static final*/ int x = 0;

    /*public*/ int doSome1(int x);

    int doSome2(int x);

    String doSome3();
    default void asd() {
        System.out.println("dfkdjkdsj");
        System.out.println(x);
    }
    static void qwe() {

    }
}
