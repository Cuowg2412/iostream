package phan2;

import java.io.File;
import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn tới thư mục hoặc file: ");
        String path = scanner.nextLine();

        File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()) {
                deleteFolder(file);
            } else {
                file.delete();
                System.out.println("File đã được xóa thành công.");
            }
        } else {
            System.out.println("Đường dẫn không tồn tại.");
        }
        scanner.close();
    }

    private static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
        System.out.println("Thư mục đã được xóa thành công.");
    }
}

