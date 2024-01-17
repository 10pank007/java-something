package lection1.part2;

public class Main {
    public static void main(String[] args) {
        PrintHelper printHelperA = new PrinterHelperA();
        PrintHelper printHelperB = new PrinterHelperB();

        Printer printer = new Printer("lorem ipsum");


        printer.printSomeData(printHelperA);
        printer.printSomeData(printHelperB);
        printer.printSomeData(data -> data.toUpperCase());


        PrintHelper helper = new PrinterHelperTwoIml();
        printer.printSomeData(helper);




    }
}
