package com.vti.frontend;

import com.vti.ultis.ScannerUltis;

import java.util.Scanner;

public class Functions {
    static int displayMenu() {
        System.out.println("1. Hiển thị danh sách nhân viên hiện có trong công ty");
        System.out.println("2. Hiển thị các bộ phận trong công ty");
        System.out.println("3. Hiển thị các nhân viên theo từng bộ phận");
        System.out.println("4. Thêm nhân viên mới vào công ty");
        System.out.println("5. Tìm kiếm thông tin nhân viên theo tên hoặc ID");
        System.out.println("6. Hiển thị bảng lương nhân viên của toàn công ty");
        System.out.println("7. Hiển thị bảng lương nhân viên theo thứ tự tăng dần");
        System.out.println("8. Hiển thị bảng lương nhân viên theo thứ tự giảm dần");
        System.out.println("9. Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
        int menuNumber = ScannerUltis.inputIntPositive();
        return menuNumber;
    }
}
