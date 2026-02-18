package com.gla.inheritance;

class Book {
    String title;
    int year;

    void displayInfo() {
        System.out.println(title + " " + year);
    }
}

class Author extends Book {
    String name;
    String bio;

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println(name + " " + bio);
    }
}
