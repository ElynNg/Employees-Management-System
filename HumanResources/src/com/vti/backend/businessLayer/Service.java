package com.vti.backend.businessLayer;

import com.vti.backend.dataLayer.Repository;
import com.vti.entity.Account;
import com.vti.entity.Department;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Service implements IService{

    private Repository repository;

    public Service() throws IOException {
        repository = new Repository();
    }

    @Override
    public List<Account> displayListOfExistingStaff() throws SQLException, ClassNotFoundException {
        return repository.displayListOfExistingStaff();
    }

    @Override
    public List<Department> displayDepartment() throws SQLException, ClassNotFoundException {
        return repository.displayDepartment();
    }

    @Override
    public List<Account> showEmployeeByDepartment() throws SQLException, ClassNotFoundException {
        return repository.showEmployeeByDepartment();
    }

    @Override
    public boolean addAccount(Account account) throws SQLException, ClassNotFoundException {
        return repository.addAccount(account);
    }

    @Override
    public Account searchStaffByNameOrID(String input) throws SQLException, ClassNotFoundException {
        return repository.searchStaffByNameOrID(input);
    }
}
