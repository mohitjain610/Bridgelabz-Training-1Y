package com.gla.LibraryManagementSystem;

class Student extends Person {
    private int maxBooks = 3;

    public Student(String name, int id, Branch branch) {
        super(name, id, branch);
    }

    public int getMaxBooks() { return maxBooks; }

    @Override
    public void role() {
        System.out.println("Role: Student");
    }

}

