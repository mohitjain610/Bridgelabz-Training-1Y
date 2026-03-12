package com.gla;

class Student extends Person {
    private int rollNumber;
    private int year;
    private Branch branch;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getIssuedBook() {
        return issuedBook;
    }

    public void setIssuedBook(Book issuedBook) {
        this.issuedBook = issuedBook;
    }

    int studentId;
    String name;
    Book issuedBook;

    Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    void issueBook(Book b) {
        if (!b.isIssued) {
            issuedBook = b;
            b.issueBook();
            System.out.println(name + " issued " + b.title);
        } else {
            System.out.println("Book already issued");
        }
    }

    void returnBook() {
        if (issuedBook != null) {
            issuedBook.returnBook();
            System.out.println(name + " returned " + issuedBook.title);
            issuedBook = null;
        }
    }
}