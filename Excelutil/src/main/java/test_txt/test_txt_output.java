package test_txt;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class test_txt_output {
    public static void main(String[] args) {
//        String str = "在是否is的地方";
//        try {
//            FileOutputStream os = new FileOutputStream("E:\\Excelutil\\b.txt");
//            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
//            os.write(bytes);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        String str = "1223456将尽可能你看你能 ";
        try {
            FileWriter writer = new FileWriter("E:\\Excelutil\\b.txt");
            writer.write(str);
            writer.append("11111112");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}