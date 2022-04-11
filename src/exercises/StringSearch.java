package exercises;

import java.util.Scanner;

public class StringSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she " +
                "had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a " +
                "book,' thought Alice 'without pictures or conversation?";
        text = text.toLowerCase();

        System.out.println("Type in a word to see if its in the text I have.");
        String targetStr = input.next();
        String matcherStr = targetStr.toLowerCase();
        boolean match = text.contains(matcherStr);


        if (match) {
            System.out.println("We found your word '" + targetStr + "' in the text.");
            int index = text.indexOf(matcherStr);
            int length = targetStr.length();
            System.out.println("The word is at index " +
                    index + ", and it has a length of " + length + ".");
            String[] strArray = text.split(matcherStr);
            String newText = strArray[0].concat(strArray[1]);
            System.out.println("My new text look like this:  " + newText);
        } else {
            System.out.println("Can't find " + targetStr);
        }
    }
}
