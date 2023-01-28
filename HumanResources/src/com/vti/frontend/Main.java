package com.vti.frontend;

import com.vti.entity.Account;
import com.vti.ultis.ScannerUltis;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Functions functions = new Functions();
        boolean exit = false;

        while (!exit) {
            functions.displayMenu();
            switch (ScannerUltis.inputIntPositive()) {
                case 1:
                    functions.displayListOfExistingStaff();
                    break;
                case 2:
                    functions.displayDepartment();
                    break;
                case 3:
                    functions.showEmployeeByDepartment();
                    break;
                case 4:
                    functions.addAccount();
                    break;
                case 5:
                    functions.searchStaffByNameOrID();
                    break;
                case 9:
                    ScannerUltis.nextLine();
                    exit = true;
                    break;
                default:
                    System.out.println("enter again(1->9)");
                    break;
            }
        }
    }
}
