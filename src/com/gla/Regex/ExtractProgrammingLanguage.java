package com.gla.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguage {
    static void main() {
        String text="I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String regex="(Java|Go|Python|JavaScript)";
        Pattern p=Pattern.compile(regex);
        Matcher m= p.matcher(text);
        List<String> result = new ArrayList<>();
        while(m.find()){
            result.add(m.group());
        }
        System.out.println(result);
    }
}
