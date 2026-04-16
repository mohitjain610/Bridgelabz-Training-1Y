package com.gla.Regex;

public class ReplaceAndModify {
    static void main() {
            String text="This is an example  with multiple   spaces.";
            String regex="\\s+";
            String result=text.replaceAll(regex," ");
            System.out.println(result);
    }
}
