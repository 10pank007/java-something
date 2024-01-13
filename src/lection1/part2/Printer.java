package lection1.part2;

public class Printer {
    private String data;
    public Printer() {
    }

    public Printer(String data) {
        this.data = data;
    }

    public void printSomeData(PrintHelper printHelper) {
        printHelper.print(this.data);
    }
}
