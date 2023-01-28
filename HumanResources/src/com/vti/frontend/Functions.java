package com.vti.frontend;

import com.vti.backend.presentationLayer.Controller;
import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Role;
import com.vti.ultis.ScannerUltis;

import java.sql.SQLException;
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
            System.out.println("Select one of these options below: ");
            String leftAlignFormat = "| %-86s |%n";
            System.out.println("+----------------------------------------------------------------------------------------+");
            System.out.println("|                                         MENU                                           |");
            System.out.println("+----------------------------------------------------------------------------------------+");
            System.out.format(leftAlignFormat, "1. List of existing employees");
            System.out.format(leftAlignFormat, "2. List of existing department");
            System.out.format(leftAlignFormat, "3. Show employees by department");
            System.out.format(leftAlignFormat, "4. Add new employee");
            System.out.format(leftAlignFormat, "5. Search for employee by Name or ID");
            System.out.format(leftAlignFormat, "6. Display payroll of all employees");
            System.out.format(leftAlignFormat, "7. Display payroll in ascending order");
            System.out.format(leftAlignFormat, "8. Display payroll in descending order");
            System.out.format(leftAlignFormat, "9. Exit the program");
            System.out.println("+----------------------------------------------------------------------------------------+");
    }

    public void displayListOfExistingStaff () {
            List<Account> accountList = controller.displayListOfExistingStaff();
            System.out.println("+----+------------------------+------------------------+------------------------+------------------------+--------+");
            System.out.println("| ID |        FullName        |        Department      |          Email         |        Password        |  Role  |");
            System.out.println("+----+------------------------+------------------------+------------------------+------------------------+--------+");
            for (Account a : accountList) {
                String department = null;
                if (a.getDepartment_id() == 1){
                    department = "ACCOUNTING";
                } else if (a.getDepartment_id() == 2) {
                    department = "IT";
                } else if (a.getDepartment_id() == 3) {
                    department = "TECHNICAL";
                } else if (a.getDepartment_id() == 4) {
                    department = "HUMAN RESOURCES";
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
        System.out.println("| DepartmentID |     ID     |        FullName        |          Email         |        Password        |  Role  |");
        System.out.println("+--------------+------------+------------------------+------------------------+------------------------+--------+");
        for (Account a : accountList) {
            System.out.format("|   %-10d |%-12d| %-22s | %-22s | %-22s | %-6s |%n", a.getDepartment_id(), a.getId(),a.getName(), a.getEmail(), a.getPassword(), a.getRole());
        }
        System.out.println("+--------------+------------+------------------------+------------------------+------------------------+--------+");
    }

    public void addAccount() {
        ScannerUltis.nextLine();
        Account account = new Account();
        System.out.println("Employee's name: ");
        account.setName(ScannerUltis.inputName());
        System.out.println("Department: ");
        System.out.println("1. Accounting");
        System.out.println("2. IT");
        System.out.println("3. Technical");
        System.out.println("4. Human Resources");
        switch (ScannerUltis.inputIntPositive()){
            case 1:
                account.setDepartment_id(1);
                break;
            case 2:
                account.setDepartment_id(2);
                break;
            case 3:
                account.setDepartment_id(3);
                break;
            case 4:
                account.setDepartment_id(4);
                break;
            default:
                break;
        }
        System.out.println("Email: ");
        account.setEmail(ScannerUltis.inputEmail());
        System.out.println("Set new password: ");
        account.setPassword(ScannerUltis.inputPassword());
        System.out.println("Role: ");
        System.out.println("1. admin");
        System.out.println("2. user");
        switch (ScannerUltis.inputIntPositive()){
            case 1:
                account.setRole(Role.ADMIN);
                break;
            case 2:
                account.setRole(Role.USER);
                break;
            default:
                break;
        }
        try {
            if (controller.addAccount(account)){
                System.out.println("New account have been added!");
            }else System.out.println("cannot add Account!!!");
        }catch (SQLException | ClassNotFoundException e){
            System.err.println("SQLException or ClassNotFoundException occur !!!");
        }

    }

    public void searchStaffByNameOrID() throws SQLException, ClassNotFoundException {
        System.out.println("enter name or id of Staff");
        String input = ScannerUltis.inputString();
        Account account = controller.searchStaffByNameOrID(input);
        System.out.println("+----+------------------------+------------------------+------------------------+------------------------+--------+");
        System.out.println("| ID |        FullName        |        DepartmentID      |          Email         |        Password        |  Role  |");
        System.out.println("+----+------------------------+------------------------+------------------------+------------------------+--------+");
            String department = null;
            if (account.getDepartment_id() == 1){
                department = "ACCOUNTING";
            } else if (account.getDepartment_id() == 2) {
                department = "IT";
            } else if (account.getDepartment_id() == 3) {
                department = "TECHNICAL";
            } else if (account.getDepartment_id() == 4) {
                department = "HUMAN RESOURCES";
            }
            System.out.format("| %-2d | %-22s | %-22s | %-22s | %-22s | %-6s |%n", account.getId(), account.getName(), department, account.getEmail(), account.getPassword(), account.getRole());
        System.out.println("+----+------------------------+------------------------+------------------------+------------------------+--------+");
    }

    public void displaySalary() throws SQLException, ClassNotFoundException {

    }

    public void displaySalaryASC() throws SQLException, ClassNotFoundException {

    }

    public void displaySalaryDESC() throws SQLException, ClassNotFoundException {

    }
}
