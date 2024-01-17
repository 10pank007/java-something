package lesson5.NIO_Exeption;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Path bohdanpankiv = Paths.get(System.getProperty("user.home"));
//        Stream<Path> stream = Files.list(bohdanpankiv);
//        stream.forEach(file -> System.out.println(file));


        Path oktenTXT = Path.of(System.getProperty("user.home") + File.separator + "qqq" + File.separator + "okten.txt");
//        List<String> lines = Files.readAllLines(oktenTXT);
//        lines.forEach(System.out::println);

        String message = "123456789";
        byte[] messageBytes = message.getBytes(StandardCharsets.UTF_8);
        Files.write(oktenTXT,messageBytes, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }
}
