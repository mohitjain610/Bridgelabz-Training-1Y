package com.gla.Regex;

public class Valid_IP_Address {
    static void main() {
        String regex="^([0-9]|(1[0-9][0-9])|([1-9][0-9])|(2[0-4][0-9])|(25[0-5])).([0-9]|(1[0-9][0-9])|([1-9][0-9])|(2[0-4][0-9])|(25[0-5])).([0-9]|(1[0-9][0-9])|([1-9][0-9])|(2[0-4][0-9])|(25[0-5])).([0-9]|(1[0-9][0-9])|([1-9][0-9])|(2[0-4][0-9])|(25[0-5]))$";
        String[] usernames = {"12.35.48.255", "A12345", "A12"};

        for (String username : usernames) {
            if (username.matches(regex)) {
                System.out.println(username + " → Valid");
            } else {
                System.out.println(username + " → Invalid");
            }
        }
    }
}
