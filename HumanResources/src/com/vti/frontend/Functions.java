package com.vti.frontend;

import com.vti.backend.presentationLayer.Controller;
import com.vti.entity.Account;

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
            System.out.format(leftAlignFormat, "2. Search by ID");
            System.out.format(leftAlignFormat, "3. Exit");
            System.out.println("+----------------------------------------------------------------------------------------+");
    }

    public void displayListOfExistingStaff () {
            List<Account> accountList = controller.displayListOfExistingStaff();
            System.out.println("+----+------------------------+------------------------+------------------------+------------------------+--------+");
            System.out.println("| ID |        FullName        |      DepartmentID      |          Email         |        password        |  Role  |");
            System.out.println("+----+------------------------+------------------------+------------------------+------------------------+--------+");
            for (Account a : accountList) {
                System.out.format("| %-2d | %-22s | %-22s | %-22s | %-22s | %-6s |%n", a.getId(), a.getName(), a.getDepartment_id(), a.getEmail(), a.getPassword(), a.getRole());
            }
            System.out.println("+----+------------------------+------------------------+------------------------+------------------------+--------+");
    }


    }
