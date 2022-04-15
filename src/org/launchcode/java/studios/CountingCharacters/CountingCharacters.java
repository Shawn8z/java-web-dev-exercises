package org.launchcode.java.studios.CountingCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class CountingCharacters {

    public static void main(String[] args) {
        String originalStr = "If the product of two terms is zero" +
                " then common sense says at least one of the two terms " +
                "has to be zero to start with. So if you move all the " +
                "terms over to one side, you can put the quadratics into " +
                "a form that can be factored allowing that side of the " +
                "equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there.";
        HashMap<Character, Integer> charCount = new HashMap<>();
        char[] charArray = originalStr.toCharArray();
        Arrays.sort(charArray);

        for (char item : charArray) {
            int count = 0;

            for (char i : charArray) {
                if (i == item) {
                    count++;
                }
            }

            charCount.put(item, count);
        }

//        System.out.println(charCount);
        for (Map.Entry<Character, Integer> item : charCount.entrySet()) {
            System.out.println(item);
        }
    }
}
