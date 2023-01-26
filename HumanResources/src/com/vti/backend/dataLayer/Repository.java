package com.vti.backend.dataLayer;

import com.vti.entity.Account;
import com.vti.entity.Role;
import com.vti.ultis.jdbcUltis;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Repository implements IRepository{

    private jdbcUltis jdbc;
    private Account account;

    public Repository() throws IOException {
        jdbc = new jdbcUltis();
        account = new Account();
    }

    @Override
    public List<Account> displayListOfExistingStaff() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM projectmanagement.account;";
        ResultSet resultSet = jdbc.executeQuery(sql);
        while (resultSet.next()){
            account.setId(resultSet.getInt("id"));
            account.setName(resultSet.getString("FullName"));
            account.setDepartment_id(resultSet.getInt("department_id"));
            account.setEmail(resultSet.getString("Email"));
            account.setPassword(resultSet.getString("Password"));
            account.setRole(Role.valueOf(resultSet.getString("Role")));
        }
        return null;
    }
}
