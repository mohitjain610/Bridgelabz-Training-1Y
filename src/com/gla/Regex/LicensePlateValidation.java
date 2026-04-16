package com.gla.Regex;

public class LicensePlateValidation {
    static void main() {
        String regex="^[A-Z]{2}[0-9]{4}$";
        String[] usernames = {"AB1234", "A12345", "A12"};

        for (String username : usernames) {
            if (username.matches(regex)) {
                System.out.println(username + " → Valid");
            } else {
                System.out.println(username + " → Invalid");
            }
        }
    }
}
