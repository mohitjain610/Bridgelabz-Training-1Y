package com.gla.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valid_Username {
    static void main() {
        String regex="^[a-zA-z][a-zA-Z0-9_]{4,14}$";
        String[] usernames = {"user_123", "123user", "us"};

        for (String username : usernames) {
            if (username.matches(regex)) {
                System.out.println(username + " → Valid");
            } else {
                System.out.println(username + " → Invalid");
            }
        }
    }

}
