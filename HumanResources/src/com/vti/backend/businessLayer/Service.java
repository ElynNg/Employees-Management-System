package com.vti.backend.businessLayer;

import com.vti.backend.dataLayer.Repository;
import com.vti.entity.Account;

import java.util.List;

public class Service implements IService{

    private Repository repository;

    public Service() {
        repository = new Repository();
    }

    @Override
    public List<Account> displayListOfExistingStaff() {
        return repository.displayListOfExistingStaff();
    }
}
