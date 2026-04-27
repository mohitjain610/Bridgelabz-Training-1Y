package com.gla.LibraryManagementSystem;

abstract class Person {
    private String name;
    private int id;
    private Branch branch;

    public Person(String name, int id, Branch branch) {
        this.name = name;
        this.id = id;
        this.branch = branch;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public Branch getBranch() { return branch; }

    public abstract void role();

}

