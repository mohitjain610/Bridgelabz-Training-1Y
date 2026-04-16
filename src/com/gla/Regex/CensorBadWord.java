package com.gla.Regex;

public class CensorBadWord {
    static void main() {
        String text="This is a damn bad example with some stupid words.";
        String regex="(damn|stupid)";
        String result=text.replaceAll(regex,"****");
        System.out.println(result);
    }
}
