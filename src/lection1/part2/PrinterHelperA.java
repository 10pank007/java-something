package lection1.part2;

public class PrinterHelperA implements PrintHelper{
    public void foo(){

    }
    public void foobar() {
        System.out.println("foobar");
    }
    @Override
    public void print(String data) {
        byte[] bytes = data.getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
    }

}
