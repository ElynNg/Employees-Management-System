package com.vti.frontend;

import com.vti.backend.presentationLayer.Controller;
import com.vti.entity.Account;
import com.vti.ultis.ScannerUltis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Functions {
    private List<Account> listAccount;
    private Controller controller;

    public Functions() {
        listAccount= new ArrayList<Account>();
        controller = new Controller();
    }

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

    public void displayListOfExistingStaff() {
        List<Account> account = controller.displayListOfExistingStaff();
        System.out.println("+----+------------------------+------------------------+------------------------+------------------------+--------+");
        System.out.println("| ID |        FullName        |      DepartmentID      |          Email         |        password        |  Role  |");
        System.out.println("+----+------------------------+------------------------+------------------------+------------------------+--------+");
        for (Account a:account) {
            System.out.format("| %-2d | %-22s | %-22s | %-22s | %-6s |%n", a.getId(), a.getName(), a.getEmail(), a.getPassword(), a.getRole());
        }
        System.out.println("+----+------------------------+------------------------+------------------------+--------+%n");
    }
}
