package com.gla.LibraryManagementSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // Store users dynamically
        Map<Integer, Person> users = new HashMap<>();
        int userIdCounter = 1;

        // Store books
        List<Book> books = new ArrayList<>();

        // Preload some books
        Book b1 = new Book("Java Basics", "James Gosling", Category.TECHNOLOGY, 3);
        Book b2 = new Book("Physics", "HC Verma", Category.SCIENCE, 2);

        for (Book b : books) {
            library.addBook(b);
        }

        while (true) {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Faculty");
            System.out.println("3. Show Users");
            System.out.println("4. Show Books");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            System.out.println("8. Add Book (Admin)");
            int choice = sc.nextInt();

            switch (choice) {

                // ================= ADD STUDENT =================
                case 1:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Student Name: ");
                    String sName = sc.nextLine();

                    System.out.println("Select Branch: 1.CSE 2.ECE 3.ME 4.CE 5.EE");
                    int bChoice = sc.nextInt();

                    Branch sBranch = Branch.values()[bChoice - 1];

                    Student student = new Student(sName, userIdCounter, sBranch);
                    users.put(userIdCounter, student);

                    System.out.println("Student added with ID: " + userIdCounter);
                    userIdCounter++;
                    break;

                // ================= ADD FACULTY =================
                case 2:
                    sc.nextLine();
                    System.out.print("Enter Faculty Name: ");
                    String fName = sc.nextLine();

                    System.out.println("Select Branch: 1.CSE 2.ECE 3.ME 4.CE 5.EE");
                    int fbChoice = sc.nextInt();

                    Branch fBranch = Branch.values()[fbChoice - 1];

                    Faculty faculty = new Faculty(fName, userIdCounter, fBranch);
                    users.put(userIdCounter, faculty);

                    System.out.println("Faculty added with ID: " + userIdCounter);
                    userIdCounter++;
                    break;

                // ================= SHOW USERS =================
                case 3:
                    if (users.isEmpty()) {
                        System.out.println("No users available!");
                    } else {
                        for (Map.Entry<Integer, Person> entry : users.entrySet()) {
                            System.out.println("ID: " + entry.getKey() +
                                    ", Name: " + entry.getValue().getName() +
                                    ", Type: " + entry.getValue().getClass().getSimpleName());
                        }
                    }
                    break;

                // ================= SHOW BOOKS =================
                case 4:
                    library.showBooks();
                    break;

                // ================= ISSUE BOOK =================
                case 5:
                    if (users.isEmpty()) {
                        System.out.println("No users available!");
                        break;
                    }

                    System.out.println("Select User ID:");
                    for (Map.Entry<Integer, Person> entry : users.entrySet()) {
                        System.out.println(entry.getKey() + ". " + entry.getValue().getName());
                    }

                    int uid = sc.nextInt();
                    Person person = users.get(uid);

                    System.out.println("Select Book:");
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println((i + 1) + ". " + books.get(i));
                    }

                    int bookChoice = sc.nextInt();

                    try {
                        library.issueBook(person, books.get(bookChoice - 1));
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                // ================= RETURN BOOK =================
                case 6:
                    System.out.println("Select User ID:");
                    for (Map.Entry<Integer, Person> entry : users.entrySet()) {
                        System.out.println(entry.getKey() + ". " + entry.getValue().getName());
                    }

                    int uid2 = sc.nextInt();
                    Person person2 = users.get(uid2);

                    List<Book> issued = library.getIssuedBooks(person2);

                    if (issued.isEmpty()) {
                        System.out.println("No books issued!");
                        break;
                    }

                    System.out.println("Books issued:");
                    for (int i = 0; i < issued.size(); i++) {
                        System.out.println((i + 1) + ". " + issued.get(i));
                    }

                    System.out.print("Select book to return: ");
                    int a = sc.nextInt();

                    library.returnBook(person2, issued.get(choice - 1));

                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                case 8:
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.println("Select Category:");
                    Category[] categories = Category.values();
                    for (int i = 0; i < categories.length; i++) {
                        System.out.println((i + 1) + ". " + categories[i]);
                    }
                    int catChoice = sc.nextInt();

                    System.out.print("Enter Stock Quantity: ");
                    int stock = sc.nextInt();

                    Book newBook = new Book(
                            title,
                            author,
                            categories[catChoice - 1],
                            stock
                    );

                    books.add(newBook);
                    library.addBook(newBook);

                    System.out.println("Book added successfully!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}