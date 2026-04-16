package com.gla.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLink {
    static void main() {
            String text="Visit https://www.google.com and http://example.org for more info.";
            String regex="\\b(http|https)://[^\\s]+\\b";
            Pattern p=Pattern.compile(regex);
            Matcher m= p.matcher(text);
            List<String> result = new ArrayList<>();
            while(m.find()){
                result.add(m.group());
            }
            System.out.println(result);
    }
}
