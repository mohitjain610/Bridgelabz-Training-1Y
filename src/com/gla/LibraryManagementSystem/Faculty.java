package com.gla.LibraryManagementSystem;

class Faculty extends Person {
    private int maxBooks = 5;

    public Faculty(String name, int id, Branch branch) {
        super(name, id, branch);
    }

    public int getMaxBooks() { return maxBooks; }

    @Override
    public void role() {
        System.out.println("Role: Faculty");
    }
}

