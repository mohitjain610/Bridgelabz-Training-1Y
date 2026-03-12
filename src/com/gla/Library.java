package com.gla;

import java.util.ArrayList;

class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void registerStudent(Student s) {
        students.add(s);
    }

    void showAllBooks() {
        for (Book b : books) {
            b.displayBook();
        }
    }
}