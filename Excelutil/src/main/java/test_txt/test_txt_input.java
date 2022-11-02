package test_txt;

import java.io.*;

public class test_txt_input {
    public static void main(String[] args) {

//        InputStream is = null;
//        OutputStream os = null;
//
//        try {
//            is = new FileInputStream("E:\\Excelutil\\b.txt");
//            os = new FileOutputStream(("E:\\Excelutil\\a.txt"));
//            byte[] bytes = new byte[1024];
//            int len = 0 ;
//            while (true){
//                try {
//                    if (!((len = is.read(bytes,0,bytes.length))!=-1)) break;
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                try {
//                    os.write(bytes,0,len);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                try {
//                    os.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        InputStream is = null;
        OutputStream os = null;

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            is = new FileInputStream("E:\\Excelutil\\b.txt");
            os = new FileOutputStream("E:\\Excelutil\\a.txt");

            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(os);

            byte[] bytes = new byte[1024];
            int len = -1;

            while((len = bis.read(bytes,0, bytes.length))!=-1){
                bos.write(bytes,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
