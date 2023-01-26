package com.vti.backend.dataLayer;

import com.vti.entity.Account;

import java.sql.SQLException;
import java.util.List;

public interface IRepository {
    List<Account> displayListOfExistingStaff() throws SQLException, ClassNotFoundException;
}
