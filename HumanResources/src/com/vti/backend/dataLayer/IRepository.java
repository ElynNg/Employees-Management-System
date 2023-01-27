package com.vti.backend.dataLayer;

import com.vti.entity.Account;
import com.vti.entity.Department;

import java.sql.SQLException;
import java.util.List;

public interface IRepository {
    List<Account> displayListOfExistingStaff() throws SQLException, ClassNotFoundException;

    List<Department> displayDepartment() throws SQLException, ClassNotFoundException;

    List<Account> showEmployeeByDepartment() throws SQLException, ClassNotFoundException;

    boolean addAccount(Account account) throws SQLException, ClassNotFoundException;
}
