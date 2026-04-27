package com.gla.LibraryManagementSystem;

class Book {
    private String title;
    private String author;
    private Category category;
    private int totalStock;
    private int availableStock;

    public Book(String title, String author, Category category, int stock) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.totalStock = stock;
        this.availableStock = stock;
    }

    public String getTitle() { return title; }

    public int getAvailableStock() { return availableStock; }

    public void issueBook() {
        if (availableStock > 0) {
            availableStock--;
        }
    }

    public void returnBook() {
        if (availableStock < totalStock) {
            availableStock++;
        }
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + category + ") | Available: "
                + availableStock + "/" + totalStock;
    }
}

