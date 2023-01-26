package com.vti.entity;

public class Employee extends Account{
    private int id;
    private ProSkill proSkill;

    public Employee() {
    }

    public Employee(int id, String name, int department_id, String email, String password, Role role, int id1, ProSkill proSkill) {
        super(id, name, department_id, email, password, role);
        this.id = id1;
        this.proSkill = proSkill;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public ProSkill getProSkill() {
        return proSkill;
    }

    public void setProSkill(ProSkill proSkill) {
        this.proSkill = proSkill;
    }
}
