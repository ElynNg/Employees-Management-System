package com.vti.frontend;

import com.vti.backend.presentationLayer.Controller;
import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.ultis.ScannerUltis;

import java.util.ArrayList;
import java.util.List;

public class Functions {
    private List<Account> listAccount;
    private Controller controller;

    public Functions() {
        listAccount = new ArrayList<Account>();
        controller = new Controller();
    }

    public void displayMenu() {
            System.out.println("please select options");
            String leftAlignFormat = "| %-86s |%n";
            System.out.println("+----------------------------------------------------------------------------------------+");
            System.out.println("|                                      Choose please                                     |");
            System.out.println("+----------------------------------------------------------------------------------------+");
            System.out.format(leftAlignFormat, "1. List user in system");
            System.out.format(leftAlignFormat, "2. Show existing department");
            System.out.format(leftAlignFormat, "3. Show employees by department");
            System.out.format(leftAlignFormat, "4. add account");
            System.out.println("+----------------------------------------------------------------------------------------+");
    }

    public void displayListOfExistingStaff () {
            List<Account> accountList = controller.displayListOfExistingStaff();
            System.out.println("+----+------------------------+------------------------+------------------------+------------------------+--------+");
            System.out.println("| ID |        FullName        |        Department      |          Email         |        password        |  Role  |");
            System.out.println("+----+------------------------+------------------------+------------------------+------------------------+--------+");
            for (Account a : accountList) {
                String department = null;
                if (a.getDepartment_id() == 1){
                    department = "COUNTER";
                } else if (a.getDepartment_id() == 2) {
                    department = "IT";
                } else if (a.getDepartment_id() == 3) {
                    department = "TECHNICAL";
                } else if (a.getDepartment_id() == 4) {
                    department = "HUMANRESOURCES";
                }
                System.out.format("| %-2d | %-22s | %-22s | %-22s | %-22s | %-6s |%n", a.getId(), a.getName(), department, a.getEmail(), a.getPassword(), a.getRole());
            }
            System.out.println("+----+------------------------+------------------------+------------------------+------------------------+--------+");
    }


    public void displayDepartment() {
        List<Department> departmentList = controller.displayDepartment();
        System.out.println("+------+---------------+");
        System.out.println("|  ID  |      Name     |");
        System.out.println("+------+---------------+");
        for (Department d : departmentList) {
            System.out.format("|   %-3d|%-15s|%n", d.getId(), d.getName());
            System.out.println("+------+---------------+");
        }
    }

    public void showEmployeeByDepartment() {
        List<Account> accountList = controller.showEmployeeByDepartment();
        System.out.println("+--------------+------------+------------------------+------------------------+------------------------+--------+");
        System.out.println("| DepartmentID |     ID     |        FullName        |          Email         |        password        |  Role  |");
        System.out.println("+--------------+------------+------------------------+------------------------+------------------------+--------+");
        for (Account a : accountList) {
            System.out.format("|   %-10d |%-12d| %-22s | %-22s | %-22s | %-6s |%n", a.getDepartment_id(), a.getId(),a.getName(), a.getEmail(), a.getPassword(), a.getRole());
        }
        System.out.println("+--------------+------------+------------------------+------------------------+------------------------+--------+");
    }

    public void addAccount() {
        System.out.println("enter id");
        int id = ScannerUltis.inputIntPositive();
        System.out.println("enter name:");
        String name = ScannerUltis.inputString();

    }
}
