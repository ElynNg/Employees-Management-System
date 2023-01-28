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
                case 6:
                    functions.displaySalary();
                    break;
                case 7:
                    functions.displaySalaryASC();
                    break;
                case 8:
                    functions.displaySalaryDESC();
                    break;
                case 9:
                    ScannerUltis.nextLine();
                    exit = true;
                    break;
                default:
                    System.err.println("Your choice is not exist in the menu. Try again");
                    break;
            }
        }
    }
}
