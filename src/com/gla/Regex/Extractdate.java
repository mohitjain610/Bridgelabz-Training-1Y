package com.gla.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extractdate {
    static void main() {
        String text="The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        String regex="(0[1-9]|[1-2][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}";
        Pattern p=Pattern.compile(regex);
        Matcher m= p.matcher(text);
        List<String> result = new ArrayList<>();
        while(m.find()){
            result.add(m.group());
        }
        System.out.println(result);
    }
}
