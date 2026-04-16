package com.gla.Regex;

public class ValidHexColourCode {
    static void main() {
        String regex="^#[a-fA-F0-9]{6}$";
        String[] usernames = {"#FFA500", "#ff4500", "#123"};

        for (String username : usernames) {
            if (username.matches(regex)) {
                System.out.println(username + " → Valid");
            } else {
                System.out.println(username + " → Invalid");
            }
        }
    }
}
