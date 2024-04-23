package phan2;

import java.io.File;
import java.util.Scanner;

public class size {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn tới file: ");
        String filePath = scanner.nextLine();
        
        File file = new File(filePath);
        if (file.exists()) {
            long fileSize = file.length();
            System.out.println("Kích thước của file là: " + fileSize + " bytes");
        } else {
            System.out.println("File không tồn tại.");
        }
        scanner.close();
    }
}
