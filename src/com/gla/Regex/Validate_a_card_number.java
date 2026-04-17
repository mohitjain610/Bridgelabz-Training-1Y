package com.gla.Regex;

public class Validate_a_card_number {
    static void main() {
        String regex="^[4-5]\\d{15}$";
        String[] usernames = {"5503293207233020", "3843982387205383", "4688370589714398"};

        for (String username : usernames) {
            if (username.matches(regex)) {
                System.out.println(username + " → Valid");
            } else {
                System.out.println(username + " → Invalid");
            }
        }
    }
}
