package com.qa.strings;

public class ManipulateString {
    /*Create two Strings where one string has a value of “yesterday it was raining” and the other string with a value of “today it is sunny”
    Concatenate both values, capitalise both strings and print out the result.
    The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING*/
    
    private String yesterday = "yesterday it was raining";
    private String today = "today it is sunny";

    public String uppercaseMessage() {
        String message = today + ", " + yesterday;
        return message.toUpperCase();
    }

    // Now use the substring method to print out: `TODAY IT IS RAINING`
    public String justToday() {
        return uppercaseMessage().substring(0, 12) + uppercaseMessage().substring(36, 43);
    }

    /*For this task you are to implement 4 methods that manipulate String objects. For all parts of this section you are only allowed to use the length(), substring(), and equals() methods. Avoid using arrays or any methods you have yet to be taught as this defeats the purpose of the exercise: */

    // Method 1 - When given a String, count and return how many words there are in that String.
    public int wordCount(String str) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    // Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.
    public void verticalLine(String str) {
        String emptyStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i+1).equals(" ")) {
                System.out.println(emptyStr);
                emptyStr = "";
            }
            else {
                emptyStr += str.substring(i, (i+1));
            }
        }
        System.out.println(emptyStr);
    }

    // Method 3 - When given a String, print out this String in a vertical fashion in reverse order, each word on a different line.
    public void verticalLineReverse(String str) {
        String emptyStr = "";
        for (int i = str.length(); i > 0; i--) {
            if (str.substring(i-1, i).equals(" ")) {
                System.out.println(emptyStr);
                emptyStr = "";
            }
            else {
                emptyStr = str.substring(i-1, i) + emptyStr;
            }
        }
        System.out.println(emptyStr);
    }

    // Method 4 - A find method, which takes 2 Strings; the first is message and the second is the String you want to find in the message. A boolean value should be returned to indicate whether or not the second String has been found in the message.

    public boolean findMyWord(String message, String word) {
        message = message.toLowerCase();
        word = word.toLowerCase();
        return message.contains(word);
    } 
}