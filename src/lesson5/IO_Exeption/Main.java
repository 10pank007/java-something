package lesson5.IO_Exeption;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        //        Properties properties = System.getProperties();
//        for(Object o: properties.keySet()) {
//            System.out.println(o + " - " + System.getProperty(o.toString()));
//        }


//        File oktenTXT_File = new File(System.getProperty("user.home") + File.separator + "qqq" + File.separator + "okten.txt");
//        FileInputStream fileOutputStream = new FileInputStream(oktenTXT_File);
//        byte [] bytes = new byte[fileOutputStream.available()];
//        fileOutputStream.read(bytes);
//        String s = new String(bytes);
//        System.out.println(s);
//        fileOutputStream.close();


//        File bohdanpank = new File(System.getProperty("user.home"));
//        if (bohdanpank.isDirectory()) {
//            File[] files = bohdanpank.listFiles();
//            for (File file : files) {
//                System.out.println(file.getName());
//            }
//        }


        File oktenTXT_File = new File(System.getProperty("user.home") + File.separator + "qqq" + File.separator + "okten.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(oktenTXT_File, true);
        fileOutputStream.write("from Mate".getBytes(StandardCharsets.UTF_8));

        fileOutputStream.close();
    }
}
