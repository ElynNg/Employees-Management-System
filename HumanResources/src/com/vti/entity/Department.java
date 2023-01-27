package com.vti.entity;

public class Department {
    private int id;
    private DepartmentE name;

    public Department() {
    }

    public Department(int id, DepartmentE name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DepartmentE getName() {
        return name;
    }

    public void setName(DepartmentE name) {
        this.name = name;
    }
}
