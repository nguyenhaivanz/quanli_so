package Quanli_nv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Manager manager = new Manager();
    Scanner scanner = new Scanner(System.in);
    while(true){
        System.out.println("Quản lý mảng số");
        System.out.println("1.hiển thị số");
        System.out.println("2.thêm số");
        System.out.println("3.sửa số");
        System.out.println("4.xóa số");
        System.out.println("5.kết thúc");
        int choice = Integer.parseInt(scanner.nextLine());
        System.out.println("bọn đã chọn: " + choice);
        switch (choice){
            case 1:
               manager.show();
                break;
            case 2:
                manager.them();
                break;
            case 3:
                manager.sua();
                break;
            case 4:
                manager.xoa();
                break;
            case 5:
                return;
        }
    }
    }
}
