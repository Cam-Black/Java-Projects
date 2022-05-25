package com.qa.strings;

public class Runner {
    public static void main(String[] args) {
        ManipulateString str1 = new ManipulateString();
        System.out.println(str1.uppercaseMessage());
        System.out.println(str1.justToday());

        ManipulateString str2 = new ManipulateString();
        System.out.println(str2.wordCount("This is 4 words"));
        System.out.println(str2.wordCount("I have many words but how many are there?"));
        str2.verticalLine("My string but vertical");
        str2.verticalLineReverse("My string but vertical");
        System.out.println(str2.findMyWord("This is my message", "this"));
        System.out.println(str2.findMyWord("What if it isn't in the word?", "blue"));
    }
}
