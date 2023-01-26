package com.vti.entity;

public class Manager extends Account{
    private int id;
    private int expInYear;

    public Manager() {
    }

    public Manager(int id, String name, int department_id, String email, String password, Role role) {
        super(id, name, department_id, email, password, role);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }
}
