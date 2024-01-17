package lesson5.exception1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
//        try {
//            Files.list(Paths.get(System.getProperty("user.hoe")));
//        } catch (IOException | NullPointerException e) {
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//        System.out.println("end");
        try {
            calc(10,0);
        } catch (StackOverflowError | RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
    public static void calc(int a, int b) throws StackOverflowError, RuntimeException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        System.out.println(a/b);
    }
}
