package com.gla.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExactAllCapitalizedWord {
    static void main() {
        String text="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        String regex="\\b[A-Z]{1}[a-z]*\\b";
        Pattern p=Pattern.compile(regex);
        Matcher m= p.matcher(text);
        List<String> result = new ArrayList<>();
        while(m.find()){
           result.add(m.group());
        }
        System.out.println(result);
    }
}
