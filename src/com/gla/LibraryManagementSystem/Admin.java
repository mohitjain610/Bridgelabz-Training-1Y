package com.gla.LibraryManagementSystem;

class Admin extends Person {
    public Admin(String name, int id, Branch branch) {
        super(name, id, branch);
    }

    @Override
    public void role() {
        System.out.println("Role: Admin");
    }

}
