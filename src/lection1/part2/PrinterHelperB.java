package lection1.part2;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class PrinterHelperB implements PrintHelper {

    public String reverse(String data) {
//        byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
//        byte [] res = new byte[data.length()];
//        for (int i = bytes.length - 1, j = 0; i >= 0; i--, j++) {
//            res[j] = bytes[i];
//        }
//        return Arrays.toString(res);
        String string = new StringBuilder(data).reverse().toString();
        byte[] bytes = string.getBytes();
        return Arrays.toString(bytes);
    }

    @Override
    public void print(String data) {
        System.out.println(reverse(data));
    }

   
}
