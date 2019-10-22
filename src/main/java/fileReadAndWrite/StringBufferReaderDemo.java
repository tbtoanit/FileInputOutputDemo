package fileReadAndWrite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringBufferReaderDemo {
    public static void main(String[] args) {
        String path = "D:\\Personal\\IMIC\\Java_Core\\Java C3\\Practice_Java\\buoi13\\fileInput2.txt";
        try{
            FileReader f = new FileReader(path);
            BufferedReader bfr = new BufferedReader(f);

            String line;
            StringBuffer sb = new StringBuffer();

            while((line = bfr.readLine()) != null){
                sb.append(line);
                sb.append("\n");
            }

            System.out.println(sb.toString());

        }catch (FileNotFoundException e){
            System.err.println("Duong dan bi sai");
        }catch (IOException e1){
            System.err.println("Khong doc duoc du lieu");
        }


    }
}
