package lesson2.demo9_staticinnerclass;

public class Wrap {
    public static int x;

//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        Wrap.x = x;
//    }

    public Wrap(int x) {
        Wrap.x = x;
    }

    static class AddOperation {
        public void addOne() {
            x = x + 1;
        }

        public void addTwo() {
            x = x + 2;
        }
    }
    static class RemoveOperation {
        public void removeOne() {
            x = x - 1;
        }

        public void removeTwo() {
            x = x - 2;
        }
    }
}
