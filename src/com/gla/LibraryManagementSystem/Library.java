package com.gla.LibraryManagementSystem;

import java.util.*;

class Library {
    private LibraryRepository<Book> bookRepo = new LibraryRepository<>();
    private Map<Person, List<Book>> issuedBooks = new HashMap<>();

    public void addBook(Book book) {
        bookRepo.add(book);
    }

    public void issueBook(Person person, Book book)
            throws BookNotAvailableException, UserLimitExceededException {

        if (book.getAvailableStock() == 0) {
            throw new BookNotAvailableException("No stock available!");
        }

        issuedBooks.putIfAbsent(person, new ArrayList<>());
        List<Book> userBooks = issuedBooks.get(person);

        int maxLimit = 0;

        if (person instanceof Student) {
            maxLimit = ((Student) person).getMaxBooks();
        } else if (person instanceof Faculty) {
            maxLimit = ((Faculty) person).getMaxBooks();
        }

        if (userBooks.size() >= maxLimit) {
            throw new UserLimitExceededException("User reached max limit!");
        }

        // ✅ Issue book
        userBooks.add(book);
        book.issueBook();   // decrease stock

        System.out.println(person.getName() + " issued: " + book.getTitle());
    }


        public void returnBook(Person person, Book book) {
            List<Book> userBooks = issuedBooks.get(person);

            if (userBooks != null && userBooks.contains(book)) {

                userBooks.remove(book);
                book.returnBook();

                System.out.println(person.getName() + " returned: " + book.getTitle());

            } else {
                System.out.println("This user did not issue this book!");
            }
        }



    public void showBooks() {
        for (Book b : bookRepo.getAll()) {
            System.out.println(b);
        }
    }
    public List<Book> getIssuedBooks(Person person) {
        return issuedBooks.getOrDefault(person, new ArrayList<>());
    }
}

