package com.gla.inheritance;

class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println(name + " " + id + " " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team size: " + teamSize);
    }
}

class Developer extends Employee {
    String language;

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + language);
    }
}

class Intern extends Employee {
    int duration;

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Duration: " + duration);
    }
}
