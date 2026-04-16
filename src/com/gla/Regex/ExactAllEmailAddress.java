package com.gla.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExactAllEmailAddress {
    static void main() {
        String text="Contact us at support@example.com and info@company.org";
        String regex="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern p=Pattern.compile(regex);
        Matcher m= p.matcher(text);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
