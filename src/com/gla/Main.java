package com.gla;

public class Main {
    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book(1, "Java", "James");
        Book b2 = new Book(2, "Python", "Guido");

        lib.addBook(b1);
        lib.addBook(b2);

        Student s1 = new Student(101, "Mohit");
        lib.registerStudent(s1);

        lib.showAllBooks();

        s1.issueBook(b1);
        s1.returnBook();
    }
}