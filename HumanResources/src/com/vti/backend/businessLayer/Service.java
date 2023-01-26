package com.vti.backend.businessLayer;

import com.vti.backend.dataLayer.Repository;
import com.vti.entity.Account;

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
}
