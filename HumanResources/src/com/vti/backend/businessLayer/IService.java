package com.vti.backend.businessLayer;

import com.vti.entity.Account;

import java.sql.SQLException;
import java.util.List;

public interface IService {
    List<Account> displayListOfExistingStaff() throws SQLException, ClassNotFoundException;
}
