package com.vti.backend.presentationLayer;

import com.vti.backend.businessLayer.Service;
import com.vti.entity.Account;
import com.vti.entity.Department;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Controller {

    private Service service;

    public Controller() {
        try{
            service = new Service();
        }catch (IOException e){
            System.out.println("IOException occur");
        }
    }

    public List<Account> displayListOfExistingStaff() {
        try{
            return service.displayListOfExistingStaff();
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("ClassNotFound or SQL Exception occur");
            return null;
        }
    }

    public List<Department> displayDepartment() {
        try{
            return service.displayDepartment();
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("ClassNotFound or SQL Exception occur");
            return null;
        }
    }

    public List<Account> showEmployeeByDepartment(){
        try{
            return service.showEmployeeByDepartment();
        }catch (ClassNotFoundException e){
            System.out.println("ClassNotFound occur");
            return null;
        }catch (SQLException e){
            System.out.println("SQL Exception occur");
            return null;
        }
    }

    public boolean addAccount(Account account) throws SQLException, ClassNotFoundException {
        return service.addAccount(account);
    }
}
