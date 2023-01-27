package com.vti.backend.dataLayer;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.DepartmentE;
import com.vti.entity.Role;
import com.vti.ultis.jdbcUltis;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Repository implements IRepository{

    private jdbcUltis jdbc;

    public Repository() throws IOException {
        jdbc = new jdbcUltis();
    }

    @Override
    public List<Account> displayListOfExistingStaff() throws SQLException, ClassNotFoundException {
        List<Account> accountList = new ArrayList<>();
        String sql = "SELECT * FROM projectmanagement.account;";
        ResultSet resultSet = jdbc.executeQuery(sql);
        Account account;
        while (resultSet.next()){
            account = new Account();
            account.setId(resultSet.getInt("id"));
            account.setName(resultSet.getString("FullName"));
            account.setDepartment_id(resultSet.getInt("department_id"));
            account.setEmail(resultSet.getString("Email"));
            account.setPassword(resultSet.getString("Password"));
            account.setRole(Role.valueOf(resultSet.getString("Role")));
            accountList.add(account);
        }
        return accountList;
    }

    @Override
    public List<Department> displayDepartment() throws SQLException, ClassNotFoundException {
        List<Department> departmentList = new ArrayList<Department>();
        String sql = "SELECT * FROM projectmanagement.department;";
        ResultSet resultSet = jdbc.executeQuery(sql);
        Department department;
        while (resultSet.next()){
            department = new Department();
            department.setId(resultSet.getInt("department_id"));
            department.setName(DepartmentE.valueOf(resultSet.getString("name")));
            departmentList.add(department);
        }
        return departmentList;
    }

    @Override
    public List<Account> showEmployeeByDepartment() throws SQLException, ClassNotFoundException {
        List<Account> accountList = new ArrayList<>();
        String sql = "SELECT * FROM projectmanagement.account WHERE department_id IN (SELECT department_id FROM `account`) ORDER BY department_id;";
        ResultSet resultSet = jdbc.executeQuery(sql);
        Account account;
        while (resultSet.next()){
            account = new Account();
            account.setId(resultSet.getInt("id"));
            account.setName(resultSet.getString("FullName"));
            account.setDepartment_id(resultSet.getInt("department_id"));
            account.setEmail(resultSet.getString("Email"));
            account.setPassword(resultSet.getString("Password"));
            account.setRole(Role.valueOf(resultSet.getString("Role")));
            accountList.add(account);
        }
        return accountList;
    }


}
