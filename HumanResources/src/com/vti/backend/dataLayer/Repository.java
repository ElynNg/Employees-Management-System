package com.vti.backend.dataLayer;

import com.vti.entity.Account;
import com.vti.entity.Role;
import com.vti.ultis.jdbcUltis;

import java.io.IOException;
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
        List<Account> accountList = new ArrayList<Account>();
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
}
