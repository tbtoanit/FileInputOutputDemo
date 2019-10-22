package fileReadAndWrite;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        String path = "D:\\Personal\\IMIC\\Java_Core\\Java C3\\Practice_Java\\buoi13\\fileInput.txt";
        try {
            FileInputStream fis = new FileInputStream(path);
            int i;
            while ((i = fis.read()) != -1){
                System.out.print((char)i);
            }

        } catch (Exception e) {
            System.err.println("Duong dan khong ton tai");
        }

    }
}
