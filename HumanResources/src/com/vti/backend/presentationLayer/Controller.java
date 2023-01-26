package com.vti.backend.presentationLayer;

import com.vti.backend.businessLayer.Service;
import com.vti.entity.Account;

import java.util.List;

public class Controller {

    private Service service;

    public Controller() {
        service = new Service();
    }

    public List<Account> displayListOfExistingStaff() {
        return service.displayListOfExistingStaff();
    }
}
