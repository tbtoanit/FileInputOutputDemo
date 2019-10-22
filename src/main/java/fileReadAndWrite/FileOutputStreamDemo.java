package fileReadAndWrite;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String path = "D:\\Personal\\IMIC\\Java_Core\\Java C3\\Practice_Java\\buoi13\\fileOutput.txt";
        try{

            FileOutputStream fos = new FileOutputStream(path);
            Scanner sc = new Scanner(System.in);
            System.out.println("Vui long nhap du lieu can ghi vao file");
            String s = sc.nextLine();
            fos.write(s.getBytes());
            System.out.println("Ghi du lieu thanh cong!!!");
        } catch (FileNotFoundException e){
            System.err.println("Duong dan bi sai");
        }catch (IOException e1){
            System.err.println("Du lieu khong duoc ghi");
        }

    }
}
